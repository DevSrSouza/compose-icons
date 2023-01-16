package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.PeanutOutline: ImageVector
    get() {
        if (_peanutOutline != null) {
            return _peanutOutline!!
        }
        _peanutOutline = Builder(name = "PeanutOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 23.0f)
                curveTo(11.53f, 23.0f, 11.07f, 22.95f, 10.61f, 22.85f)
                curveTo(7.1f, 22.1f, 4.87f, 18.64f, 5.62f, 15.13f)
                curveTo(5.87f, 13.95f, 6.45f, 12.87f, 7.28f, 12.0f)
                curveTo(7.62f, 11.64f, 7.62f, 11.08f, 7.28f, 10.72f)
                curveTo(5.2f, 8.14f, 5.6f, 4.36f, 8.18f, 2.28f)
                reflectiveCurveTo(14.54f, 0.607f, 16.62f, 3.19f)
                curveTo(18.39f, 5.38f, 18.39f, 8.5f, 16.62f, 10.72f)
                curveTo(16.33f, 11.13f, 16.37f, 11.7f, 16.72f, 12.06f)
                curveTo(19.17f, 14.68f, 19.04f, 18.8f, 16.41f, 21.25f)
                curveTo(15.22f, 22.37f, 13.64f, 23.0f, 12.0f, 23.0f)
                moveTo(12.0f, 3.0f)
                curveTo(11.09f, 3.0f, 10.2f, 3.31f, 9.5f, 3.89f)
                curveTo(8.55f, 4.65f, 8.0f, 5.79f, 8.0f, 7.0f)
                curveTo(8.0f, 7.91f, 8.31f, 8.79f, 8.88f, 9.5f)
                curveTo(9.84f, 10.64f, 9.77f, 12.33f, 8.73f, 13.41f)
                curveTo(7.03f, 15.22f, 7.13f, 18.07f, 8.94f, 19.77f)
                reflectiveCurveTo(13.6f, 21.38f, 15.3f, 19.56f)
                curveTo(16.92f, 17.83f, 16.92f, 15.14f, 15.3f, 13.41f)
                curveTo(14.23f, 12.32f, 14.15f, 10.6f, 15.12f, 9.41f)
                curveTo(16.5f, 7.69f, 16.22f, 5.17f, 14.5f, 3.79f)
                curveTo(14.0f, 3.41f, 13.47f, 3.14f, 12.88f, 3.0f)
                curveTo(12.59f, 3.0f, 12.29f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 6.0f)
                curveTo(12.0f, 6.55f, 12.45f, 7.0f, 13.0f, 7.0f)
                reflectiveCurveTo(14.0f, 6.55f, 14.0f, 6.0f)
                reflectiveCurveTo(13.55f, 5.0f, 13.0f, 5.0f)
                reflectiveCurveTo(12.0f, 5.45f, 12.0f, 6.0f)
                moveTo(14.0f, 19.0f)
                curveTo(14.55f, 19.0f, 15.0f, 18.55f, 15.0f, 18.0f)
                reflectiveCurveTo(14.55f, 17.0f, 14.0f, 17.0f)
                reflectiveCurveTo(13.0f, 17.45f, 13.0f, 18.0f)
                reflectiveCurveTo(13.45f, 19.0f, 14.0f, 19.0f)
                moveTo(13.0f, 16.0f)
                curveTo(13.55f, 16.0f, 14.0f, 15.55f, 14.0f, 15.0f)
                reflectiveCurveTo(13.55f, 14.0f, 13.0f, 14.0f)
                reflectiveCurveTo(12.0f, 14.45f, 12.0f, 15.0f)
                reflectiveCurveTo(12.45f, 16.0f, 13.0f, 16.0f)
                moveTo(11.0f, 18.0f)
                curveTo(11.55f, 18.0f, 12.0f, 17.55f, 12.0f, 17.0f)
                reflectiveCurveTo(11.55f, 16.0f, 11.0f, 16.0f)
                reflectiveCurveTo(10.0f, 16.45f, 10.0f, 17.0f)
                reflectiveCurveTo(10.45f, 18.0f, 11.0f, 18.0f)
                close()
            }
        }
        .build()
        return _peanutOutline!!
    }

private var _peanutOutline: ImageVector? = null
