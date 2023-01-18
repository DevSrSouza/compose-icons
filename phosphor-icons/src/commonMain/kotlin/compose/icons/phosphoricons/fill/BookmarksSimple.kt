package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.BookmarksSimple: ImageVector
    get() {
        if (_bookmarksSimple != null) {
            return _bookmarksSimple!!
        }
        _bookmarksSimple = Builder(name = "BookmarksSimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 72.0f)
                lineTo(176.0f, 224.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -4.3f, 7.1f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -8.3f, -0.6f)
                lineTo(112.0f, 193.8f)
                lineTo(60.7f, 230.5f)
                arcTo(8.2f, 8.2f, 0.0f, false, true, 56.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(48.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 64.0f, 56.0f)
                horizontalLineToRelative(96.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 176.0f, 72.0f)
                close()
                moveTo(192.0f, 24.0f)
                lineTo(88.0f, 24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(192.0f, 40.0f)
                lineTo(192.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(208.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 24.0f)
                close()
            }
        }
        .build()
        return _bookmarksSimple!!
    }

private var _bookmarksSimple: ImageVector? = null
