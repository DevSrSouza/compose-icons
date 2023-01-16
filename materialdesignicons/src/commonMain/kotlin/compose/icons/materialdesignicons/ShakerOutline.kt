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

public val MaterialDesignIcons.ShakerOutline: ImageVector
    get() {
        if (_shakerOutline != null) {
            return _shakerOutline!!
        }
        _shakerOutline = Builder(name = "ShakerOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.88f, 4.0f)
                lineTo(16.88f, 4.0f)
                lineTo(19.03f, 6.1f)
                lineTo(13.5f, 10.5f)
                lineTo(12.5f, 9.5f)
                lineTo(16.87f, 4.0f)
                lineTo(16.88f, 4.0f)
                moveTo(16.88f, 2.0f)
                curveTo(16.3f, 2.0f, 15.73f, 2.24f, 15.33f, 2.72f)
                lineTo(9.8f, 9.65f)
                lineTo(13.34f, 13.19f)
                lineTo(20.28f, 7.67f)
                curveTo(21.18f, 6.91f, 21.25f, 5.54f, 20.41f, 4.7f)
                lineTo(18.3f, 2.59f)
                curveTo(17.9f, 2.19f, 17.39f, 2.0f, 16.88f, 2.0f)
                moveTo(9.1f, 10.36f)
                lineTo(8.39f, 11.07f)
                curveTo(8.0f, 11.46f, 8.0f, 12.09f, 8.39f, 12.5f)
                lineTo(10.5f, 14.6f)
                curveTo(10.71f, 14.8f, 10.96f, 14.89f, 11.22f, 14.89f)
                reflectiveCurveTo(11.73f, 14.8f, 11.93f, 14.6f)
                lineTo(12.63f, 13.9f)
                lineTo(9.1f, 10.36f)
                moveTo(6.0f, 15.0f)
                curveTo(5.45f, 15.0f, 5.0f, 15.45f, 5.0f, 16.0f)
                curveTo(5.0f, 16.55f, 5.45f, 17.0f, 6.0f, 17.0f)
                curveTo(6.55f, 17.0f, 7.0f, 16.55f, 7.0f, 16.0f)
                curveTo(7.0f, 15.45f, 6.55f, 15.0f, 6.0f, 15.0f)
                moveTo(9.0f, 16.0f)
                curveTo(8.45f, 16.0f, 8.0f, 16.45f, 8.0f, 17.0f)
                reflectiveCurveTo(8.45f, 18.0f, 9.0f, 18.0f)
                curveTo(9.55f, 18.0f, 10.0f, 17.55f, 10.0f, 17.0f)
                reflectiveCurveTo(9.55f, 16.0f, 9.0f, 16.0f)
                moveTo(4.0f, 18.0f)
                curveTo(3.45f, 18.0f, 3.0f, 18.45f, 3.0f, 19.0f)
                reflectiveCurveTo(3.45f, 20.0f, 4.0f, 20.0f)
                curveTo(4.55f, 20.0f, 5.0f, 19.55f, 5.0f, 19.0f)
                reflectiveCurveTo(4.55f, 18.0f, 4.0f, 18.0f)
                moveTo(7.0f, 19.0f)
                curveTo(6.45f, 19.0f, 6.0f, 19.45f, 6.0f, 20.0f)
                reflectiveCurveTo(6.45f, 21.0f, 7.0f, 21.0f)
                curveTo(7.55f, 21.0f, 8.0f, 20.55f, 8.0f, 20.0f)
                reflectiveCurveTo(7.55f, 19.0f, 7.0f, 19.0f)
                close()
            }
        }
        .build()
        return _shakerOutline!!
    }

private var _shakerOutline: ImageVector? = null
