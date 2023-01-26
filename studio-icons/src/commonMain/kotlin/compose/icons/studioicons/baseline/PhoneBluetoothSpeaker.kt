package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.PhoneBluetoothSpeaker: ImageVector
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
                moveTo(20.0f, 15.5f)
                curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f)
                curveToRelative(-0.35f, -0.11f, -0.74f, -0.03f, -1.02f, 0.24f)
                lineToRelative(-2.2f, 2.2f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(2.2f, -2.21f)
                curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f)
                curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                lineTo(4.0f, 3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
            }
        }
        .build()
        return _phoneBluetoothSpeaker!!
    }

private var _phoneBluetoothSpeaker: ImageVector? = null
