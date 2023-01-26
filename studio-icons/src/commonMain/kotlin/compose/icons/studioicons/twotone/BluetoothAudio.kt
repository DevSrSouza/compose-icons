package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.BluetoothAudio: ImageVector
    get() {
        if (_bluetoothAudio != null) {
            return _bluetoothAudio!!
        }
        _bluetoothAudio = Builder(name = "BluetoothAudio", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.24f, 12.01f)
                lineToRelative(2.32f, 2.32f)
                curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f)
                reflectiveCurveToRelative(-0.16f, -1.59f, -0.43f, -2.31f)
                lineToRelative(-2.33f, 2.32f)
                close()
                moveTo(19.53f, 6.71f)
                lineToRelative(-1.26f, 1.26f)
                curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f)
                reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f)
                lineToRelative(1.2f, 1.2f)
                curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f)
                curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f)
                close()
                moveTo(15.71f, 7.71f)
                lineTo(10.0f, 2.0f)
                lineTo(9.0f, 2.0f)
                verticalLineToRelative(7.59f)
                lineTo(4.41f, 5.0f)
                lineTo(3.0f, 6.41f)
                lineTo(8.59f, 12.0f)
                lineTo(3.0f, 17.59f)
                lineTo(4.41f, 19.0f)
                lineTo(9.0f, 14.41f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(5.71f, -5.71f)
                lineToRelative(-4.3f, -4.29f)
                lineToRelative(4.3f, -4.29f)
                close()
                moveTo(11.0f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(11.0f, 9.59f)
                lineTo(11.0f, 5.83f)
                close()
                moveTo(12.88f, 16.29f)
                lineTo(11.0f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                close()
            }
        }
        .build()
        return _bluetoothAudio!!
    }

private var _bluetoothAudio: ImageVector? = null
