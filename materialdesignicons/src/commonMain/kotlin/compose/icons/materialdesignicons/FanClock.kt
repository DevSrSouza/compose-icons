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

public val MaterialDesignIcons.FanClock: ImageVector
    get() {
        if (_fanClock != null) {
            return _fanClock!!
        }
        _fanClock = Builder(name = "FanClock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(16.8f)
                lineTo(19.9f, 18.2f)
                lineTo(19.1f, 19.5f)
                lineTo(16.0f, 17.7f)
                verticalLineTo(14.0f)
                moveTo(21.0f, 11.3f)
                curveTo(20.8f, 7.9f, 17.0f, 7.2f, 13.3f, 9.2f)
                curveTo(13.0f, 8.8f, 12.6f, 8.5f, 12.1f, 8.3f)
                curveTo(12.3f, 7.4f, 12.7f, 6.3f, 13.7f, 5.8f)
                curveTo(16.1f, 4.6f, 16.0f, 1.0f, 11.5f, 1.0f)
                curveTo(7.9f, 1.0f, 7.2f, 5.0f, 9.1f, 8.7f)
                curveTo(8.7f, 9.0f, 8.4f, 9.4f, 8.2f, 9.9f)
                curveTo(7.3f, 9.7f, 6.2f, 9.3f, 5.7f, 8.3f)
                curveTo(4.6f, 5.9f, 1.0f, 6.0f, 1.0f, 10.5f)
                curveTo(1.0f, 14.1f, 5.0f, 14.8f, 8.7f, 12.9f)
                curveTo(9.0f, 13.3f, 9.5f, 13.6f, 9.9f, 13.8f)
                curveTo(9.7f, 14.7f, 9.3f, 15.8f, 8.3f, 16.3f)
                curveTo(5.9f, 17.4f, 6.0f, 21.0f, 10.5f, 21.0f)
                curveTo(10.8f, 21.0f, 11.0f, 21.0f, 11.2f, 20.9f)
                curveTo(12.5f, 22.8f, 14.6f, 24.0f, 17.0f, 24.0f)
                curveTo(20.9f, 24.0f, 24.0f, 20.9f, 24.0f, 17.0f)
                curveTo(24.0f, 14.6f, 22.8f, 12.5f, 21.0f, 11.3f)
                moveTo(11.0f, 10.0f)
                curveTo(11.6f, 10.0f, 12.0f, 10.4f, 12.0f, 11.0f)
                reflectiveCurveTo(11.6f, 12.0f, 11.0f, 12.0f)
                reflectiveCurveTo(10.0f, 11.6f, 10.0f, 11.0f)
                reflectiveCurveTo(10.4f, 10.0f, 11.0f, 10.0f)
                moveTo(17.0f, 22.0f)
                curveTo(14.2f, 22.0f, 12.0f, 19.8f, 12.0f, 17.0f)
                reflectiveCurveTo(14.2f, 12.0f, 17.0f, 12.0f)
                reflectiveCurveTo(22.0f, 14.2f, 22.0f, 17.0f)
                reflectiveCurveTo(19.8f, 22.0f, 17.0f, 22.0f)
                close()
            }
        }
        .build()
        return _fanClock!!
    }

private var _fanClock: ImageVector? = null
