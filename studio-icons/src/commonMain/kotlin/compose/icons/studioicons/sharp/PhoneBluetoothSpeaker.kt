package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PhoneBluetoothSpeaker: ImageVector
    get() {
        if (_phoneBluetoothSpeaker != null) {
            return _phoneBluetoothSpeaker!!
        }
        _phoneBluetoothSpeaker = Builder(name = "PhoneBluetoothSpeaker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.71f, 9.5f)
                lineTo(17.0f, 7.21f)
                lineTo(17.0f, 11.0f)
                horizontalLineToRelative(0.5f)
                lineToRelative(2.85f, -2.85f)
                lineTo(18.21f, 6.0f)
                lineToRelative(2.15f, -2.15f)
                lineTo(17.5f, 1.0f)
                lineTo(17.0f, 1.0f)
                verticalLineToRelative(3.79f)
                lineTo(14.71f, 2.5f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(16.79f, 6.0f)
                lineTo(14.0f, 8.79f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(18.0f, 2.91f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                lineTo(18.0f, 2.91f)
                close()
                moveTo(18.0f, 7.21f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                lineTo(18.0f, 7.21f)
                close()
                moveTo(21.0f, 15.46f)
                lineToRelative(-5.27f, -0.61f)
                lineToRelative(-2.52f, 2.52f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.53f, -2.53f)
                lineTo(8.54f, 3.0f)
                lineTo(3.03f, 3.0f)
                curveTo(2.45f, 13.18f, 10.82f, 21.55f, 21.0f, 20.97f)
                verticalLineToRelative(-5.51f)
                close()
            }
        }
        .build()
        return _phoneBluetoothSpeaker!!
    }

private var _phoneBluetoothSpeaker: ImageVector? = null
