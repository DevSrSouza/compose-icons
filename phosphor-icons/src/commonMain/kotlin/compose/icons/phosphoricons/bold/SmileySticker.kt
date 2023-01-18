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

public val BoldGroup.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) {
            return _smileySticker!!
        }
        _smileySticker = Builder(name = "SmileySticker", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, true, false, 31.7f, 211.3f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 5.0f, -3.0f)
                lineToRelative(63.6f, -63.6f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.0f, -5.0f)
                arcTo(108.2f, 108.2f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(209.1f, 149.9f)
                lineTo(149.9f, 209.1f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 59.2f, -59.2f)
                close()
                moveTo(76.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 76.0f, 108.0f)
                close()
                moveTo(148.0f, 108.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 148.0f, 108.0f)
                close()
                moveTo(180.0f, 158.0f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, true, -104.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.8f, -12.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 62.4f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 180.0f, 158.0f)
                close()
            }
        }
        .build()
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
