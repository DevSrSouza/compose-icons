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

public val BoldGroup.SpeakerSlash: ImageVector
    get() {
        if (_speakerSlash != null) {
            return _speakerSlash!!
        }
        _speakerSlash = Builder(name = "SpeakerSlash", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.9f, 31.9f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 39.1f, 48.1f)
                lineTo(64.5f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(75.9f, 180.0f)
                lineToRelative(68.7f, 53.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 152.0f, 236.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 5.3f, -1.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 224.0f)
                lineTo(164.0f, 185.4f)
                lineToRelative(35.1f, 38.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.8f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.8f, -17.0f)
                close()
                moveTo(36.0f, 100.0f)
                lineTo(68.0f, 100.0f)
                verticalLineToRelative(56.0f)
                lineTo(36.0f, 156.0f)
                close()
                moveTo(140.0f, 199.5f)
                lineTo(92.0f, 162.1f)
                lineTo(92.0f, 106.2f)
                lineTo(140.0f, 159.0f)
                close()
                moveTo(109.0f, 65.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 2.1f, -16.8f)
                lineToRelative(33.5f, -26.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 12.7f, -1.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 164.0f, 32.0f)
                lineTo(164.0f, 94.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(140.0f, 56.5f)
                lineToRelative(-14.1f, 11.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 109.0f, 65.4f)
                close()
                moveTo(182.1f, 113.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcTo(43.8f, 43.8f, 0.0f, false, true, 212.0f, 128.0f)
                arcToRelative(45.1f, 45.1f, 0.0f, false, true, -5.3f, 21.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -10.6f, 6.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, -5.7f, -1.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -4.8f, -16.3f)
                arcTo(19.4f, 19.4f, 0.0f, false, false, 188.0f, 128.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 182.1f, 113.9f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -19.1f, 53.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -18.6f, -15.2f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -3.9f, -80.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcTo(83.9f, 83.9f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _speakerSlash!!
    }

private var _speakerSlash: ImageVector? = null
