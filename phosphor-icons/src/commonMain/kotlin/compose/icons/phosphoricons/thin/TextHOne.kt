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

public val ThinGroup.TextHOne: ImageVector
    get() {
        if (_textHOne != null) {
            return _textHOne!!
        }
        _textHOne = Builder(name = "TextHOne", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(221.9f, 104.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, 0.2f)
                lineToRelative(-24.0f, 16.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.1f, 5.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.5f, 1.1f)
                lineTo(216.0f, 115.5f)
                lineTo(216.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(224.0f, 108.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 221.9f, 104.5f)
                close()
            }
        }
        .build()
        return _textHOne!!
    }

private var _textHOne: ImageVector? = null
