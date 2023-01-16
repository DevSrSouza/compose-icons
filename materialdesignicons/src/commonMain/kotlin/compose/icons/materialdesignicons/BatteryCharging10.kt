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

public val MaterialDesignIcons.BatteryCharging10: ImageVector
    get() {
        if (_batteryCharging10 != null) {
            return _batteryCharging10!!
        }
        _batteryCharging10 = Builder(name = "BatteryCharging10", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.05f, 11.0f)
                horizontalLineTo(20.05f)
                verticalLineTo(4.0f)
                lineTo(15.05f, 14.0f)
                horizontalLineTo(18.05f)
                verticalLineTo(22.0f)
                moveTo(12.0f, 18.0f)
                horizontalLineTo(4.0f)
                lineTo(4.05f, 6.0f)
                horizontalLineTo(12.05f)
                moveTo(12.72f, 4.0f)
                horizontalLineTo(11.05f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.05f)
                verticalLineTo(4.0f)
                horizontalLineTo(3.38f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 2.05f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(2.05f, 21.4f, 2.65f, 22.0f, 3.38f, 22.0f)
                horizontalLineTo(12.72f)
                curveTo(13.45f, 22.0f, 14.05f, 21.4f, 14.05f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 12.72f, 4.0f)
                close()
            }
        }
        .build()
        return _batteryCharging10!!
    }

private var _batteryCharging10: ImageVector? = null
