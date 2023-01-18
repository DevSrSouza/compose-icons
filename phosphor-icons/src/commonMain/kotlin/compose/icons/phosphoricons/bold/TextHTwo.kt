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

public val BoldGroup.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) {
            return _textHTwo!!
        }
        _textHTwo = Builder(name = "TextHTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 56.0f)
                lineTo(156.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(132.0f, 128.0f)
                lineTo(52.0f, 128.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                lineTo(132.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(240.0f, 188.0f)
                lineTo(216.0f, 188.0f)
                lineToRelative(29.5f, -39.4f)
                lineToRelative(0.3f, -0.5f)
                arcTo(35.1f, 35.1f, 0.0f, false, false, 252.0f, 128.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -69.2f, -14.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 22.1f, 9.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, -1.9f, 6.5f)
                lineToRelative(-43.6f, 58.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 5.7f, 18.8f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 3.8f, 0.6f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
