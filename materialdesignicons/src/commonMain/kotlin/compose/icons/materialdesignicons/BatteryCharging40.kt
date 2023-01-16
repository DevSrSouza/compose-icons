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

public val MaterialDesignIcons.BatteryCharging40: ImageVector
    get() {
        if (_batteryCharging40 != null) {
            return _batteryCharging40!!
        }
        _batteryCharging40 = Builder(name = "BatteryCharging40", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 4.0f, 2.0f, 4.4f, 2.0f, 5.0f)
                verticalLineTo(21.0f)
                curveTo(2.0f, 21.6f, 2.4f, 22.0f, 3.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(13.6f, 22.0f, 14.0f, 21.6f, 14.0f, 21.0f)
                verticalLineTo(5.0f)
                curveTo(14.0f, 4.4f, 13.6f, 4.0f, 13.0f, 4.0f)
                moveTo(12.0f, 14.5f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.5f)
                moveTo(23.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                lineTo(15.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
            }
        }
        .build()
        return _batteryCharging40!!
    }

private var _batteryCharging40: ImageVector? = null
