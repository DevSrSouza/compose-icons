package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) {
            return _textHTwo!!
        }
        _textHTwo = Builder(name = "TextHTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(240.0f, 192.0f)
                lineTo(208.0f, 192.0f)
                lineToRelative(34.3f, -45.8f)
                lineToRelative(0.2f, -0.3f)
                arcTo(31.8f, 31.8f, 0.0f, false, false, 248.0f, 128.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -61.5f, -12.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.8f, 6.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 216.0f, 112.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 13.4f, 24.8f)
                lineToRelative(-43.7f, 58.3f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 184.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 5.5f, 7.6f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, false, 2.5f, 0.4f)
                horizontalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
