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

public val MaterialDesignIcons.BatteryCharging100: ImageVector
    get() {
        if (_batteryCharging100 != null) {
            return _batteryCharging100!!
        }
        _batteryCharging100 = Builder(name = "BatteryCharging100", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                lineTo(15.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                moveTo(12.67f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 2.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2.0f, 21.4f, 2.6f, 22.0f, 3.33f, 22.0f)
                horizontalLineTo(12.67f)
                curveTo(13.4f, 22.0f, 14.0f, 21.4f, 14.0f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 12.67f, 4.0f)
                close()
            }
        }
        .build()
        return _batteryCharging100!!
    }

private var _batteryCharging100: ImageVector? = null
