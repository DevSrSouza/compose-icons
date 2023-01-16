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

public val MaterialDesignIcons.PhoneClock: ImageVector
    get() {
        if (_phoneClock != null) {
            return _phoneClock!!
        }
        _phoneClock = Builder(name = "PhoneClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9f, 1.0f)
                curveTo(12.1f, 1.1f, 9.0f, 4.2f, 9.0f, 8.0f)
                curveTo(9.0f, 11.9f, 12.1f, 15.0f, 16.0f, 15.0f)
                reflectiveCurveTo(23.0f, 11.9f, 23.0f, 8.0f)
                reflectiveCurveTo(19.9f, 1.0f, 15.9f, 1.0f)
                curveTo(16.0f, 1.0f, 15.9f, 1.0f, 15.9f, 1.0f)
                moveTo(16.0f, 3.0f)
                curveTo(18.8f, 3.0f, 21.0f, 5.2f, 21.0f, 8.0f)
                reflectiveCurveTo(18.8f, 13.0f, 16.0f, 13.0f)
                reflectiveCurveTo(11.0f, 10.8f, 11.0f, 8.0f)
                reflectiveCurveTo(13.2f, 3.0f, 16.0f, 3.0f)
                moveTo(15.0f, 4.0f)
                verticalLineTo(9.0f)
                lineTo(18.6f, 11.2f)
                lineTo(19.4f, 10.0f)
                lineTo(16.5f, 8.3f)
                verticalLineTo(4.0f)
                horizontalLineTo(15.0f)
                moveTo(4.6f, 12.8f)
                curveTo(6.0f, 15.6f, 8.4f, 18.0f, 11.2f, 19.4f)
                lineTo(13.4f, 17.2f)
                curveTo(13.7f, 16.9f, 14.1f, 16.8f, 14.4f, 17.0f)
                curveTo(15.5f, 17.4f, 16.7f, 17.6f, 18.0f, 17.6f)
                curveTo(18.5f, 17.6f, 19.0f, 18.1f, 19.0f, 18.6f)
                verticalLineTo(22.0f)
                curveTo(19.0f, 22.5f, 18.5f, 23.0f, 18.0f, 23.0f)
                curveTo(8.6f, 23.0f, 1.0f, 15.4f, 1.0f, 6.0f)
                curveTo(1.0f, 5.4f, 1.5f, 5.0f, 2.0f, 5.0f)
                horizontalLineTo(5.5f)
                curveTo(6.1f, 5.0f, 6.5f, 5.4f, 6.5f, 6.0f)
                curveTo(6.5f, 7.2f, 6.7f, 8.4f, 7.1f, 9.6f)
                curveTo(7.2f, 10.0f, 7.1f, 10.3f, 6.9f, 10.6f)
                lineTo(4.6f, 12.8f)
            }
        }
        .build()
        return _phoneClock!!
    }

private var _phoneClock: ImageVector? = null
