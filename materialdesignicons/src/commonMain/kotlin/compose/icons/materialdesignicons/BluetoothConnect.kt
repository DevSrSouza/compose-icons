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

public val MaterialDesignIcons.BluetoothConnect: ImageVector
    get() {
        if (_bluetoothConnect != null) {
            return _bluetoothConnect!!
        }
        _bluetoothConnect = Builder(name = "BluetoothConnect", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(19.0f, 14.0f)
                lineTo(21.0f, 12.0f)
                moveTo(14.88f, 16.29f)
                lineTo(13.0f, 18.17f)
                verticalLineTo(14.41f)
                moveTo(13.0f, 5.83f)
                lineTo(14.88f, 7.71f)
                lineTo(13.0f, 9.58f)
                moveTo(17.71f, 7.71f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.58f)
                lineTo(6.41f, 5.0f)
                lineTo(5.0f, 6.41f)
                lineTo(10.59f, 12.0f)
                lineTo(5.0f, 17.58f)
                lineTo(6.41f, 19.0f)
                lineTo(11.0f, 14.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(12.0f)
                lineTo(17.71f, 16.29f)
                lineTo(13.41f, 12.0f)
                moveTo(7.0f, 12.0f)
                lineTo(5.0f, 10.0f)
                lineTo(3.0f, 12.0f)
                lineTo(5.0f, 14.0f)
                lineTo(7.0f, 12.0f)
                close()
            }
        }
        .build()
        return _bluetoothConnect!!
    }

private var _bluetoothConnect: ImageVector? = null
