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

public val LightGroup.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 26.0f)
                lineTo(96.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 82.0f, 40.0f)
                lineTo(82.0f, 58.0f)
                lineTo(64.0f, 58.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 72.0f)
                lineTo(50.0f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.3f, 5.3f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 6.2f, -0.4f)
                lineTo(112.0f, 191.4f)
                lineToRelative(52.5f, 37.5f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 168.0f, 230.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.7f, -0.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 174.0f, 224.0f)
                lineTo(174.0f, 180.8f)
                lineToRelative(22.5f, 16.1f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 200.0f, 198.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, false, 2.7f, -0.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 206.0f, 192.0f)
                lineTo(206.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 192.0f, 26.0f)
                close()
                moveTo(162.0f, 212.3f)
                lineToRelative(-46.5f, -33.2f)
                arcTo(6.6f, 6.6f, 0.0f, false, false, 112.0f, 178.0f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, -3.5f, 1.1f)
                lineTo(62.0f, 212.3f)
                lineTo(62.0f, 72.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(194.0f, 180.3f)
                lineTo(174.0f, 166.1f)
                lineTo(174.0f, 72.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(94.0f, 58.0f)
                lineTo(94.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
