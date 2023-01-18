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

public val ThinGroup.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) {
            return _bookmarksSimple!!
        }
        _bookmarksSimple = Builder(name = "BookmarksSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 60.0f)
                lineTo(64.0f, 60.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 72.0f)
                lineTo(52.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.2f, 3.6f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 4.1f, -0.3f)
                lineTo(112.0f, 188.9f)
                lineToRelative(53.7f, 38.4f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 2.3f, 0.7f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 1.8f, -0.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 172.0f, 224.0f)
                lineTo(172.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 160.0f, 60.0f)
                close()
                moveTo(164.0f, 216.2f)
                lineTo(114.3f, 180.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -4.6f, 0.0f)
                lineTo(60.0f, 216.2f)
                lineTo(60.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(204.0f, 40.0f)
                lineTo(204.0f, 192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(196.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(88.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(192.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 40.0f)
                close()
            }
        }
        .build()
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
