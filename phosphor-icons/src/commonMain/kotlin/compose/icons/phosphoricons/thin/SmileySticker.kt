package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) {
            return _smileySticker!!
        }
        _smileySticker = Builder(name = "SmileySticker", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, true, false, 29.4f, 195.6f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 1.6f, -1.0f)
                lineTo(222.6f, 159.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, 1.0f, -1.6f)
                arcTo(100.1f, 100.1f, 0.0f, false, false, 128.0f, 28.0f)
                close()
                moveTo(216.2f, 154.1f)
                lineTo(154.1f, 216.2f)
                arcToRelative(92.1f, 92.1f, 0.0f, true, true, 62.1f, -62.1f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 84.0f, 108.0f)
                close()
                moveTo(156.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 156.0f, 108.0f)
                close()
                moveTo(173.0f, 154.0f)
                arcToRelative(51.9f, 51.9f, 0.0f, false, true, -90.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.9f, -4.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 76.2f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.9f, 4.0f)
                close()
            }
        }
        .build()
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
