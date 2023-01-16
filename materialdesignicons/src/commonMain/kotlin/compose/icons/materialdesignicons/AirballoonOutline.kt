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

public val MaterialDesignIcons.AirballoonOutline: ImageVector
    get() {
        if (_airballoonOutline != null) {
            return _airballoonOutline!!
        }
        _airballoonOutline = Builder(name = "AirballoonOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 23.0f)
                curveTo(9.9f, 23.0f, 9.0f, 22.1f, 9.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(21.0f)
                curveTo(15.0f, 22.1f, 14.1f, 23.0f, 13.0f, 23.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 3.0f)
                curveTo(12.28f, 3.0f, 12.55f, 3.0f, 12.81f, 3.05f)
                curveTo(13.42f, 4.22f, 14.0f, 6.26f, 14.0f, 9.0f)
                curveTo(14.0f, 11.1f, 13.0f, 16.0f, 13.0f, 16.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 16.0f, 10.0f, 11.1f, 10.0f, 9.0f)
                curveTo(10.0f, 6.26f, 10.58f, 4.22f, 11.19f, 3.05f)
                curveTo(11.45f, 3.0f, 11.72f, 3.0f, 12.0f, 3.0f)
                moveTo(12.0f, 1.0f)
                curveTo(11.29f, 1.0f, 10.61f, 1.09f, 9.95f, 1.26f)
                curveTo(8.78f, 2.83f, 8.0f, 5.71f, 8.0f, 9.0f)
                curveTo(8.0f, 11.28f, 8.38f, 13.37f, 9.0f, 16.0f)
                curveTo(9.0f, 17.1f, 9.9f, 18.0f, 11.0f, 18.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 18.0f, 15.0f, 17.1f, 15.0f, 16.0f)
                curveTo(15.62f, 13.37f, 16.0f, 11.28f, 16.0f, 9.0f)
                curveTo(16.0f, 5.71f, 15.22f, 2.83f, 14.05f, 1.26f)
                curveTo(13.39f, 1.09f, 12.71f, 1.0f, 12.0f, 1.0f)
                moveTo(4.0f, 8.0f)
                curveTo(4.0f, 11.18f, 5.85f, 15.92f, 8.54f, 17.21f)
                curveTo(8.0f, 16.21f, 7.61f, 14.67f, 7.34f, 13.0f)
                curveTo(6.55f, 11.53f, 6.0f, 9.62f, 6.0f, 8.0f)
                curveTo(6.0f, 6.66f, 6.44f, 5.67f, 7.47f, 4.8f)
                curveTo(7.73f, 3.67f, 8.09f, 2.65f, 8.54f, 1.79f)
                curveTo(5.85f, 3.08f, 4.0f, 4.82f, 4.0f, 8.0f)
                moveTo(15.46f, 1.79f)
                curveTo(15.91f, 2.65f, 16.27f, 3.67f, 16.53f, 4.8f)
                curveTo(17.56f, 5.67f, 18.0f, 6.66f, 18.0f, 8.0f)
                curveTo(18.0f, 9.62f, 17.45f, 11.53f, 16.66f, 13.0f)
                curveTo(16.39f, 14.67f, 16.0f, 16.21f, 15.46f, 17.21f)
                curveTo(18.15f, 15.92f, 20.0f, 11.18f, 20.0f, 8.0f)
                reflectiveCurveTo(18.15f, 3.08f, 15.46f, 1.79f)
                close()
            }
        }
        .build()
        return _airballoonOutline!!
    }

private var _airballoonOutline: ImageVector? = null
