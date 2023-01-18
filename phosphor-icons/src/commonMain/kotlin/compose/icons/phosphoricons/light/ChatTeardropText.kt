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

public val LightGroup.ChatTeardropText: ImageVector
    get() {
        if (_chatTeardropText != null) {
            return _chatTeardropText!!
        }
        _chatTeardropText = Builder(name = "ChatTeardropText", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.0f, 26.0f)
                arcToRelative(98.2f, 98.2f, 0.0f, false, false, -98.0f, 98.0f)
                verticalLineToRelative(84.3f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 47.7f, 222.0f)
                lineTo(132.0f, 222.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, 0.0f, -196.0f)
                close()
                moveTo(132.0f, 210.0f)
                lineTo(47.7f, 210.0f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.7f, -1.7f)
                lineTo(46.0f, 124.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, true, true, 86.0f, 86.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(100.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(60.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 112.0f)
                close()
                moveTo(166.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(100.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(60.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 144.0f)
                close()
            }
        }
        .build()
        return _chatTeardropText!!
    }

private var _chatTeardropText: ImageVector? = null
