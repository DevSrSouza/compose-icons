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

public val MaterialDesignIcons.BatteryBluetoothVariant: ImageVector
    get() {
        if (_batteryBluetoothVariant != null) {
            return _batteryBluetoothVariant!!
        }
        _batteryBluetoothVariant = Builder(name = "BatteryBluetoothVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 6.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6.0f, 21.4f, 6.6f, 22.0f, 7.33f, 22.0f)
                horizontalLineTo(16.67f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 18.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(18.0f, 4.6f, 17.4f, 4.0f, 16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                moveTo(11.83f, 8.0f)
                horizontalLineTo(12.33f)
                lineTo(15.18f, 10.85f)
                lineTo(13.04f, 13.0f)
                lineTo(15.17f, 15.14f)
                lineTo(12.33f, 18.0f)
                horizontalLineTo(11.83f)
                verticalLineTo(14.21f)
                lineTo(9.54f, 16.5f)
                lineTo(8.83f, 15.79f)
                lineTo(11.62f, 13.0f)
                lineTo(8.83f, 10.21f)
                lineTo(9.54f, 9.5f)
                lineTo(11.83f, 11.79f)
                verticalLineTo(8.0f)
                moveTo(12.83f, 9.91f)
                verticalLineTo(11.79f)
                lineTo(13.77f, 10.85f)
                lineTo(12.83f, 9.91f)
                moveTo(12.83f, 14.21f)
                verticalLineTo(16.08f)
                lineTo(13.77f, 15.14f)
                lineTo(12.83f, 14.21f)
                close()
            }
        }
        .build()
        return _batteryBluetoothVariant!!
    }

private var _batteryBluetoothVariant: ImageVector? = null
