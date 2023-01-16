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

public val MaterialDesignIcons.BatteryOffOutline: ImageVector
    get() {
        if (_batteryOffOutline != null) {
            return _batteryOffOutline!!
        }
        _batteryOffOutline = Builder(name = "BatteryOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 17.35f)
                lineTo(3.38f, 2.73f)
                lineTo(2.11f, 4.0f)
                lineTo(6.0f, 7.89f)
                verticalLineTo(20.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 7.33f, 22.0f)
                horizontalLineTo(16.67f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 18.0f, 20.67f)
                verticalLineTo(19.89f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(16.0f, 20.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.89f)
                lineTo(16.0f, 17.89f)
                moveTo(16.0f, 6.0f)
                verticalLineTo(12.8f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(5.33f)
                arcTo(1.34f, 1.34f, 0.0f, false, false, 16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.21f)
                lineTo(9.21f, 6.0f)
                close()
            }
        }
        .build()
        return _batteryOffOutline!!
    }

private var _batteryOffOutline: ImageVector? = null
