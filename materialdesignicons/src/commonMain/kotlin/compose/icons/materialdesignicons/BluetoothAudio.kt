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

public val MaterialDesignIcons.BluetoothAudio: ImageVector
    get() {
        if (_bluetoothAudio != null) {
            return _bluetoothAudio!!
        }
        _bluetoothAudio = Builder(name = "BluetoothAudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.88f, 16.29f)
                lineTo(11.0f, 18.17f)
                verticalLineTo(14.41f)
                moveTo(11.0f, 5.83f)
                lineTo(12.88f, 7.71f)
                lineTo(11.0f, 9.58f)
                moveTo(15.71f, 7.71f)
                lineTo(10.0f, 2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.58f)
                lineTo(4.41f, 5.0f)
                lineTo(3.0f, 6.41f)
                lineTo(8.59f, 12.0f)
                lineTo(3.0f, 17.58f)
                lineTo(4.41f, 19.0f)
                lineTo(9.0f, 14.41f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.0f)
                lineTo(15.71f, 16.29f)
                lineTo(11.41f, 12.0f)
                moveTo(19.53f, 6.71f)
                lineTo(18.26f, 8.0f)
                curveTo(18.89f, 9.18f, 19.25f, 10.55f, 19.25f, 12.0f)
                curveTo(19.25f, 13.45f, 18.89f, 14.82f, 18.26f, 16.0f)
                lineTo(19.46f, 17.22f)
                curveTo(20.43f, 15.68f, 21.0f, 13.87f, 21.0f, 11.91f)
                curveTo(21.0f, 10.0f, 20.46f, 8.23f, 19.53f, 6.71f)
                moveTo(14.24f, 12.0f)
                lineTo(16.56f, 14.33f)
                curveTo(16.84f, 13.6f, 17.0f, 12.82f, 17.0f, 12.0f)
                curveTo(17.0f, 11.18f, 16.84f, 10.4f, 16.57f, 9.68f)
                lineTo(14.24f, 12.0f)
                close()
            }
        }
        .build()
        return _bluetoothAudio!!
    }

private var _bluetoothAudio: ImageVector? = null
