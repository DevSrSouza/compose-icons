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

public val BoldGroup.Bookmarks: ImageVector
    get() {
        if (_bookmarks != null) {
            return _bookmarks!!
        }
        _bookmarks = Builder(name = "Bookmarks", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 20.0f)
                lineTo(96.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 76.0f, 40.0f)
                lineTo(76.0f, 60.0f)
                lineTo(64.0f, 60.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 44.0f, 80.0f)
                lineTo(44.0f, 224.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 6.7f, 10.8f)
                arcTo(12.4f, 12.4f, 0.0f, false, false, 56.0f, 236.0f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, false, 7.3f, -2.5f)
                lineTo(108.0f, 199.1f)
                lineToRelative(44.7f, 34.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.6f, 1.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 172.0f, 224.0f)
                lineTo(172.0f, 177.6f)
                lineToRelative(20.7f, 15.9f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 200.0f, 196.0f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 5.3f, -1.2f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 212.0f, 184.0f)
                lineTo(212.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 192.0f, 20.0f)
                close()
                moveTo(148.0f, 199.6f)
                lineToRelative(-32.7f, -25.1f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -14.6f, 0.0f)
                lineTo(68.0f, 199.6f)
                lineTo(68.0f, 84.0f)
                horizontalLineToRelative(80.0f)
                close()
                moveTo(188.0f, 159.6f)
                lineTo(172.0f, 147.3f)
                lineTo(172.0f, 80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(100.0f, 60.0f)
                lineTo(100.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                close()
            }
        }
        .build()
        return _bookmarks!!
    }

private var _bookmarks: ImageVector? = null
