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

public val MaterialDesignIcons.BatteryPositive: ImageVector
    get() {
        if (_batteryPositive != null) {
            return _batteryPositive!!
        }
        _batteryPositive = Builder(name = "BatteryPositive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.67f, 4.0f)
                arcTo(1.33f, 1.33f, 0.0f, false, true, 13.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(13.0f, 21.4f, 12.4f, 22.0f, 11.67f, 22.0f)
                horizontalLineTo(2.33f)
                curveTo(1.6f, 22.0f, 1.0f, 21.4f, 1.0f, 20.67f)
                verticalLineTo(5.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, true, 2.33f, 4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.67f)
                moveTo(23.0f, 14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _batteryPositive!!
    }

private var _batteryPositive: ImageVector? = null
