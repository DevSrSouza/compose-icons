package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SpeakerLow: ImageVector
    get() {
        if (_speakerLow != null) {
            return _speakerLow!!
        }
        _speakerLow = Builder(name = "SpeakerLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.6f, 26.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, 0.7f)
                lineTo(77.9f, 82.0f)
                lineTo(32.0f, 82.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 18.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(77.9f, 174.0f)
                lineToRelative(70.4f, 54.7f)
                arcTo(5.8f, 5.8f, 0.0f, false, false, 152.0f, 230.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.6f, -0.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 158.0f, 224.0f)
                lineTo(158.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 154.6f, 26.6f)
                close()
                moveTo(30.0f, 160.0f)
                lineTo(30.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(74.0f, 94.0f)
                verticalLineToRelative(68.0f)
                lineTo(32.0f, 162.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 30.0f, 160.0f)
                close()
                moveTo(146.0f, 211.7f)
                lineTo(86.0f, 165.1f)
                lineTo(86.0f, 90.9f)
                lineToRelative(60.0f, -46.6f)
                close()
                moveTo(206.0f, 128.0f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, true, -11.1f, 26.9f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -4.3f, 1.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.2f, -1.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, 0.0f, -36.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 8.5f, 0.0f)
                arcTo(38.1f, 38.1f, 0.0f, false, true, 206.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerLow!!
    }

private var _speakerLow: ImageVector? = null
