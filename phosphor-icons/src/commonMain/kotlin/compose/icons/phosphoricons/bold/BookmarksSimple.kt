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

public val BoldGroup.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) {
            return _bookmarksSimple!!
        }
        _bookmarksSimple = Builder(name = "BookmarksSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 56.0f)
                lineTo(60.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 40.0f, 76.0f)
                lineTo(40.0f, 228.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.5f, 10.7f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 12.5f, -0.9f)
                lineToRelative(49.0f, -35.1f)
                lineToRelative(49.0f, 35.1f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 7.0f, 2.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 5.5f, -1.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 176.0f, 228.0f)
                lineTo(176.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 156.0f, 56.0f)
                close()
                moveTo(152.0f, 204.7f)
                lineTo(115.0f, 178.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -7.0f, -2.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -7.0f, 2.2f)
                lineTo(64.0f, 204.7f)
                lineTo(64.0f, 80.0f)
                horizontalLineToRelative(88.0f)
                close()
                moveTo(216.0f, 36.0f)
                lineTo(216.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(192.0f, 40.0f)
                lineTo(92.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                lineTo(196.0f, 16.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 216.0f, 36.0f)
                close()
            }
        }
        .build()
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
