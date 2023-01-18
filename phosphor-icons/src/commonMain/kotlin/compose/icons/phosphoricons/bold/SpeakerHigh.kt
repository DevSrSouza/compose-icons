package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.SpeakerHigh: ImageVector
    get() {
        if (_speakerHigh != null) {
            return _speakerHigh!!
        }
        _speakerHigh = Builder(name = "SpeakerHigh", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(83.4f, 83.4f, 0.0f, false, true, -24.6f, 59.4f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, 0.0f, -84.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcTo(83.4f, 83.4f, 0.0f, false, true, 252.0f, 128.0f)
                close()
                moveTo(164.0f, 32.0f)
                lineTo(164.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -6.7f, 10.8f)
                arcTo(12.4f, 12.4f, 0.0f, false, true, 152.0f, 236.0f)
                arcToRelative(12.7f, 12.7f, 0.0f, false, true, -7.4f, -2.5f)
                lineTo(75.9f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(12.0f, 96.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 32.0f, 76.0f)
                lineTo(75.9f, 76.0f)
                lineToRelative(68.7f, -53.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.7f, -1.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 32.0f)
                close()
                moveTo(36.0f, 156.0f)
                lineTo(68.0f, 156.0f)
                lineTo(68.0f, 100.0f)
                lineTo(36.0f, 100.0f)
                close()
                moveTo(140.0f, 56.5f)
                lineTo(92.0f, 93.9f)
                verticalLineToRelative(68.2f)
                lineToRelative(48.0f, 37.4f)
                close()
                moveTo(199.1f, 96.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.5f, 3.5f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 8.5f, -3.5f)
                arcToRelative(43.9f, 43.9f, 0.0f, false, false, 0.0f, -62.2f)
                close()
            }
        }
        .build()
        return _speakerHigh!!
    }

private var _speakerHigh: ImageVector? = null
