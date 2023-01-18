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

public val LightGroup.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) {
            return _speakerHigh!!
        }
        _speakerHigh = Builder(name = "SpeakerHigh", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(246.0f, 128.0f)
                arcToRelative(77.5f, 77.5f, 0.0f, false, true, -22.9f, 55.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.4f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, -8.5f)
                arcToRelative(66.1f, 66.1f, 0.0f, false, false, 0.0f, -93.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.4f, -8.5f)
                arcTo(77.5f, 77.5f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(158.0f, 32.0f)
                lineTo(158.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, 5.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.6f, 0.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.7f, -1.3f)
                lineTo(77.9f, 174.0f)
                lineTo(32.0f, 174.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 82.0f)
                lineTo(77.9f, 82.0f)
                lineToRelative(70.4f, -54.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 158.0f, 32.0f)
                close()
                moveTo(32.0f, 162.0f)
                lineTo(74.0f, 162.0f)
                lineTo(74.0f, 94.0f)
                lineTo(32.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(64.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 32.0f, 162.0f)
                close()
                moveTo(146.0f, 44.3f)
                lineTo(86.0f, 90.9f)
                verticalLineToRelative(74.2f)
                lineToRelative(60.0f, 46.6f)
                close()
                moveTo(186.4f, 101.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, 0.0f, 36.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.2f, 1.7f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 4.3f, -1.7f)
                arcToRelative(38.1f, 38.1f, 0.0f, false, false, 0.0f, -53.8f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 186.4f, 101.1f)
                close()
            }
        }
        .build()
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
