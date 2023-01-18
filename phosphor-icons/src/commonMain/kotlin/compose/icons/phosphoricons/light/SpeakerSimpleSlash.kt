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

public val LightGroup.SpeakerSimpleSlash: ImageVector
    get() {
        if (_speakerSimpleSlash != null) {
            return _speakerSimpleSlash!!
        }
        _speakerSimpleSlash = Builder(name = "SpeakerSimpleSlash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(186.0f, 152.0f)
                lineTo(186.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(224.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(230.0f, 88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 224.0f, 82.0f)
                close()
                moveTo(212.4f, 212.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -0.4f, 8.4f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -4.0f, 1.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -4.4f, -2.0f)
                lineTo(158.0f, 169.9f)
                lineTo(158.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.4f, 5.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.6f, 0.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.7f, -1.3f)
                lineTo(77.9f, 174.0f)
                lineTo(32.0f, 174.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 96.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 32.0f, 82.0f)
                lineTo(78.1f, 82.0f)
                lineTo(43.6f, 44.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.8f, -8.0f)
                close()
                moveTo(146.0f, 156.7f)
                lineTo(89.0f, 94.0f)
                lineTo(32.0f, 94.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(80.0f, 162.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 3.7f, 1.3f)
                lineTo(146.0f, 211.7f)
                close()
                moveTo(115.8f, 67.7f)
                lineTo(146.0f, 44.3f)
                verticalLineToRelative(62.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 12.0f, 0.0f)
                lineTo(158.0f, 32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -9.7f, -4.7f)
                lineToRelative(-39.8f, 31.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.1f, 8.4f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 115.8f, 67.7f)
                close()
            }
        }
        .build()
        return _speakerSimpleSlash!!
    }

private var _speakerSimpleSlash: ImageVector? = null
