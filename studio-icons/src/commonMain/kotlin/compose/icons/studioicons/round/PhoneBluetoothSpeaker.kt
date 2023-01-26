package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.PhoneBluetoothSpeaker: ImageVector
    get() {
        if (_phoneBluetoothSpeaker != null) {
            return _phoneBluetoothSpeaker!!
        }
        _phoneBluetoothSpeaker = Builder(name = "PhoneBluetoothSpeaker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.23f, 15.26f)
                lineToRelative(-2.54f, -0.29f)
                curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f)
                lineToRelative(-1.84f, 1.84f)
                curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f)
                lineToRelative(1.85f, -1.85f)
                curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f)
                lineToRelative(-0.29f, -2.52f)
                curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f)
                lineTo(5.03f, 3.01f)
                curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f)
                curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f)
                curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f)
                verticalLineToRelative(-1.73f)
                curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f)
                close()
                moveTo(16.79f, 6.01f)
                lineToRelative(-2.45f, 2.45f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f)
                curveToRelative(0.2f, 0.2f, 0.52f, 0.2f, 0.71f, 0.0f)
                lineTo(17.0f, 7.23f)
                verticalLineToRelative(3.15f)
                curveToRelative(0.0f, 0.2f, 0.12f, 0.39f, 0.31f, 0.47f)
                curveToRelative(0.06f, 0.03f, 0.13f, 0.04f, 0.19f, 0.04f)
                curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.36f, -0.15f)
                lineToRelative(2.18f, -2.18f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.52f, 0.0f, -0.71f)
                lineToRelative(-1.83f, -1.83f)
                lineToRelative(1.83f, -1.83f)
                curveToRelative(0.09f, -0.09f, 0.15f, -0.22f, 0.15f, -0.36f)
                reflectiveCurveToRelative(-0.05f, -0.26f, -0.15f, -0.36f)
                lineToRelative(-2.18f, -2.18f)
                curveToRelative(-0.14f, -0.14f, -0.36f, -0.19f, -0.55f, -0.11f)
                curveToRelative(-0.19f, 0.08f, -0.31f, 0.26f, -0.31f, 0.46f)
                verticalLineToRelative(3.15f)
                lineToRelative(-1.95f, -1.95f)
                curveToRelative(-0.2f, -0.2f, -0.52f, -0.2f, -0.71f, 0.0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.52f, 0.0f, 0.71f)
                lineToRelative(2.45f, 2.46f)
                close()
                moveTo(18.01f, 2.86f)
                lineToRelative(0.96f, 0.96f)
                lineToRelative(-0.96f, 0.96f)
                lineTo(18.01f, 2.86f)
                close()
                moveTo(18.01f, 7.23f)
                lineToRelative(0.96f, 0.96f)
                lineToRelative(-0.96f, 0.96f)
                lineTo(18.01f, 7.23f)
                close()
            }
        }
        .build()
        return _phoneBluetoothSpeaker!!
    }

private var _phoneBluetoothSpeaker: ImageVector? = null
