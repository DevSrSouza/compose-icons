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

public val MaterialDesignIcons.BluetoothOff: ImageVector
    get() {
        if (_bluetoothOff != null) {
            return _bluetoothOff!!
        }
        _bluetoothOff = Builder(name = "BluetoothOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.83f)
                lineTo(14.88f, 7.71f)
                lineTo(13.28f, 9.31f)
                lineTo(14.69f, 10.72f)
                lineTo(17.71f, 7.7f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.03f)
                lineTo(13.0f, 9.03f)
                moveTo(5.41f, 4.0f)
                lineTo(4.0f, 5.41f)
                lineTo(10.59f, 12.0f)
                lineTo(5.0f, 17.59f)
                lineTo(6.41f, 19.0f)
                lineTo(11.0f, 14.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                lineTo(16.29f, 17.71f)
                lineTo(18.59f, 20.0f)
                lineTo(20.0f, 18.59f)
                moveTo(13.0f, 18.17f)
                verticalLineTo(14.41f)
                lineTo(14.88f, 16.29f)
            }
        }
        .build()
        return _bluetoothOff!!
    }

private var _bluetoothOff: ImageVector? = null
