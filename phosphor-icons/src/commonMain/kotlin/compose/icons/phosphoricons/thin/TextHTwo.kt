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

public val ThinGroup.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) {
            return _textHTwo!!
        }
        _textHTwo = Builder(name = "TextHTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 56.0f)
                lineTo(148.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 120.0f)
                lineTo(44.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(96.0f)
                lineTo(140.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(240.0f, 196.0f)
                lineTo(200.0f, 196.0f)
                lineToRelative(39.1f, -52.2f)
                horizontalLineToRelative(0.1f)
                arcTo(28.4f, 28.4f, 0.0f, false, false, 244.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -53.8f, -10.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 5.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.3f, -2.1f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 35.0f, 18.9f)
                lineToRelative(-43.7f, 58.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.9f, 2.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.7f, 3.8f)
                lineToRelative(1.3f, 0.2f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
