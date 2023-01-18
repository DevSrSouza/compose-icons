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

public val ThinGroup.BookmarkSimple: ImageVector
    get() {
        if (_bookmarkSimple != null) {
            return _bookmarkSimple!!
        }
        _bookmarkSimple = Builder(name = "BookmarkSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 48.0f)
                lineTo(60.0f, 224.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 3.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 4.0f, -0.1f)
                lineTo(128.0f, 188.7f)
                lineToRelative(61.9f, 38.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 0.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.9f, -0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 196.0f, 224.0f)
                lineTo(196.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(188.0f, 216.8f)
                lineTo(130.1f, 180.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f)
                lineTo(68.0f, 216.8f)
                lineTo(68.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _bookmarkSimple!!
    }

private var _bookmarkSimple: ImageVector? = null
