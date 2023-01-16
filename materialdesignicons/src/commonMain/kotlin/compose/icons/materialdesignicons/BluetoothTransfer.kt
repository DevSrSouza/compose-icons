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

public val MaterialDesignIcons.BluetoothTransfer: ImageVector
    get() {
        if (_bluetoothTransfer != null) {
            return _bluetoothTransfer!!
        }
        _bluetoothTransfer = Builder(name = "BluetoothTransfer", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.71f, 7.71f)
                lineTo(10.41f, 12.0f)
                lineTo(14.71f, 16.29f)
                lineTo(9.0f, 22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.41f)
                lineTo(3.41f, 19.0f)
                lineTo(2.0f, 17.59f)
                lineTo(7.59f, 12.0f)
                lineTo(2.0f, 6.41f)
                lineTo(3.41f, 5.0f)
                lineTo(8.0f, 9.59f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                lineTo(14.71f, 7.71f)
                moveTo(10.0f, 5.83f)
                verticalLineTo(9.59f)
                lineTo(11.88f, 7.71f)
                lineTo(10.0f, 5.83f)
                moveTo(11.88f, 16.29f)
                lineTo(10.0f, 14.41f)
                verticalLineTo(18.17f)
                lineTo(11.88f, 16.29f)
                moveTo(22.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                lineTo(19.0f, 4.0f)
                lineTo(22.0f, 8.0f)
                moveTo(22.0f, 16.0f)
                lineTo(19.0f, 20.0f)
                lineTo(16.0f, 16.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _bluetoothTransfer!!
    }

private var _bluetoothTransfer: ImageVector? = null
