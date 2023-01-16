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

public val MaterialDesignIcons.SunClock: ImageVector
    get() {
        if (_sunClock != null) {
            return _sunClock!!
        }
        _sunClock = Builder(name = "SunClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.1f, 9.3f)
                lineTo(19.6f, 6.0f)
                lineTo(15.5f, 5.6f)
                curveTo(16.1f, 6.1f, 16.6f, 6.7f, 17.0f, 7.5f)
                curveTo(17.3f, 8.1f, 17.5f, 8.6f, 17.7f, 9.2f)
                curveTo(17.2f, 9.1f, 16.6f, 9.0f, 16.0f, 9.0f)
                horizontalLineTo(15.6f)
                curveTo(14.8f, 7.2f, 13.1f, 6.0f, 11.0f, 6.0f)
                curveTo(8.2f, 6.0f, 6.0f, 8.2f, 6.0f, 11.0f)
                curveTo(6.0f, 13.1f, 7.2f, 14.8f, 9.0f, 15.6f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 19.9f, 12.1f, 23.0f, 16.0f, 23.0f)
                reflectiveCurveTo(23.0f, 19.9f, 23.0f, 16.0f)
                curveTo(23.0f, 12.9f, 20.9f, 10.2f, 18.1f, 9.3f)
                moveTo(16.0f, 21.0f)
                curveTo(13.2f, 21.0f, 11.0f, 18.8f, 11.0f, 16.0f)
                reflectiveCurveTo(13.2f, 11.0f, 16.0f, 11.0f)
                reflectiveCurveTo(21.0f, 13.2f, 21.0f, 16.0f)
                reflectiveCurveTo(18.8f, 21.0f, 16.0f, 21.0f)
                moveTo(16.5f, 16.2f)
                lineTo(19.4f, 17.9f)
                lineTo(18.6f, 19.1f)
                lineTo(15.0f, 17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(16.2f)
                moveTo(11.0f, 4.0f)
                curveTo(10.2f, 4.0f, 9.4f, 4.2f, 8.6f, 4.4f)
                lineTo(11.0f, 1.0f)
                lineTo(13.4f, 4.4f)
                curveTo(12.6f, 4.2f, 11.8f, 4.0f, 11.0f, 4.0f)
                moveTo(4.9f, 14.5f)
                curveTo(5.3f, 15.2f, 5.9f, 15.9f, 6.5f, 16.4f)
                lineTo(2.4f, 16.0f)
                lineTo(4.2f, 12.2f)
                curveTo(4.3f, 13.0f, 4.5f, 13.8f, 4.9f, 14.5f)
                moveTo(4.1f, 9.8f)
                lineTo(2.3f, 6.0f)
                lineTo(6.5f, 5.7f)
                curveTo(5.9f, 6.2f, 5.4f, 6.8f, 4.9f, 7.5f)
                curveTo(4.5f, 8.2f, 4.2f, 9.0f, 4.1f, 9.8f)
                close()
            }
        }
        .build()
        return _sunClock!!
    }

private var _sunClock: ImageVector? = null
