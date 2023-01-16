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

public val MaterialDesignIcons.PhoneBluetoothOutline: ImageVector
    get() {
        if (_phoneBluetoothOutline != null) {
            return _phoneBluetoothOutline!!
        }
        _phoneBluetoothOutline = Builder(name = "PhoneBluetoothOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.5f)
                curveTo(18.8f, 15.5f, 17.5f, 15.3f, 16.4f, 14.9f)
                horizontalLineTo(16.1f)
                curveTo(15.8f, 14.9f, 15.6f, 15.0f, 15.4f, 15.2f)
                lineTo(13.2f, 17.4f)
                curveTo(10.4f, 15.9f, 8.0f, 13.6f, 6.6f, 10.8f)
                lineTo(8.8f, 8.6f)
                curveTo(9.1f, 8.3f, 9.2f, 7.9f, 9.0f, 7.6f)
                curveTo(8.7f, 6.5f, 8.5f, 5.2f, 8.5f, 4.0f)
                curveTo(8.5f, 3.5f, 8.0f, 3.0f, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.5f, 3.0f, 3.0f, 3.5f, 3.0f, 4.0f)
                curveTo(3.0f, 13.4f, 10.6f, 21.0f, 20.0f, 21.0f)
                curveTo(20.5f, 21.0f, 21.0f, 20.5f, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                curveTo(21.0f, 16.0f, 20.5f, 15.5f, 20.0f, 15.5f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(6.5f)
                curveTo(6.6f, 5.9f, 6.8f, 6.8f, 7.0f, 7.6f)
                lineTo(5.8f, 8.8f)
                curveTo(5.4f, 7.6f, 5.1f, 6.3f, 5.0f, 5.0f)
                moveTo(19.0f, 19.0f)
                curveTo(17.7f, 18.9f, 16.4f, 18.6f, 15.2f, 18.2f)
                lineTo(16.4f, 17.0f)
                curveTo(17.2f, 17.2f, 18.1f, 17.4f, 19.0f, 17.4f)
                verticalLineTo(19.0f)
                moveTo(18.0f, 7.21f)
                lineTo(18.94f, 8.14f)
                lineTo(18.0f, 9.08f)
                moveTo(18.0f, 2.91f)
                lineTo(18.94f, 3.85f)
                lineTo(18.0f, 4.79f)
                moveTo(14.71f, 9.5f)
                lineTo(17.0f, 7.21f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.5f)
                lineTo(20.35f, 8.14f)
                lineTo(18.21f, 6.0f)
                lineTo(20.35f, 3.85f)
                lineTo(17.5f, 1.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.79f)
                lineTo(14.71f, 2.5f)
                lineTo(14.0f, 3.21f)
                lineTo(16.79f, 6.0f)
                lineTo(14.0f, 8.79f)
                lineTo(14.71f, 9.5f)
                close()
            }
        }
        .build()
        return _phoneBluetoothOutline!!
    }

private var _phoneBluetoothOutline: ImageVector? = null
