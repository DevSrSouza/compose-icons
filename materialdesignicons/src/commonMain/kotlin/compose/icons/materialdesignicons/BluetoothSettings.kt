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

public val MaterialDesignIcons.BluetoothSettings: ImageVector
    get() {
        if (_bluetoothSettings != null) {
            return _bluetoothSettings!!
        }
        _bluetoothSettings = Builder(name = "BluetoothSettings", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.88f, 14.29f)
                lineTo(13.0f, 16.17f)
                verticalLineTo(12.41f)
                lineTo(14.88f, 14.29f)
                moveTo(13.0f, 3.83f)
                lineTo(14.88f, 5.71f)
                lineTo(13.0f, 7.59f)
                moveTo(17.71f, 5.71f)
                lineTo(12.0f, 0.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.59f)
                lineTo(6.41f, 3.0f)
                lineTo(5.0f, 4.41f)
                lineTo(10.59f, 10.0f)
                lineTo(5.0f, 15.59f)
                lineTo(6.41f, 17.0f)
                lineTo(11.0f, 12.41f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                lineTo(17.71f, 14.29f)
                lineTo(13.41f, 10.0f)
                lineTo(17.71f, 5.71f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _bluetoothSettings!!
    }

private var _bluetoothSettings: ImageVector? = null
