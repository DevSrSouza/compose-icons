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

public val BoldGroup.Books: ImageVector
    get() {
        if (_books != null) {
            return _books!!
        }
        _books = Builder(name = "Books", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.5f, 194.5f)
                lineToRelative(-8.3f, -30.9f)
                horizontalLineToRelative(0.0f)
                lineTo(196.1f, 40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -24.5f, -14.2f)
                lineToRelative(-29.6f, 8.0f)
                arcTo(19.6f, 19.6f, 0.0f, false, false, 128.0f, 28.0f)
                lineTo(96.0f, 28.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -8.0f, 1.7f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 80.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(80.0f, 228.0f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 8.0f, -1.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 8.0f, 1.7f)
                horizontalLineToRelative(32.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(148.0f, 138.8f)
                lineToRelative(19.9f, 74.4f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 187.3f, 228.0f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, false, 5.1f, -0.7f)
                lineToRelative(30.9f, -8.3f)
                horizontalLineToRelative(0.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 237.5f, 194.5f)
                close()
                moveTo(161.1f, 94.9f)
                lineToRelative(23.2f, -6.2f)
                lineToRelative(18.6f, 69.6f)
                lineToRelative(-23.2f, 6.2f)
                close()
                moveTo(173.9f, 50.1f)
                lineTo(178.1f, 65.5f)
                lineTo(154.9f, 71.7f)
                lineTo(150.7f, 56.3f)
                close()
                moveTo(124.0f, 164.0f)
                lineTo(100.0f, 164.0f)
                lineTo(100.0f, 52.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(76.0f, 52.0f)
                lineTo(76.0f, 68.0f)
                lineTo(52.0f, 68.0f)
                lineTo(52.0f, 52.0f)
                close()
                moveTo(52.0f, 92.0f)
                lineTo(76.0f, 92.0f)
                lineTo(76.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(100.0f, 204.0f)
                lineTo(100.0f, 188.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                close()
                moveTo(190.1f, 203.1f)
                lineTo(185.9f, 187.6f)
                lineTo(209.1f, 181.4f)
                lineTo(213.3f, 196.9f)
                close()
            }
        }
        .build()
        return _books!!
    }

private var _books: ImageVector? = null
