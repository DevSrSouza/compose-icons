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

public val LightGroup.TextBolder: ImageVector
    get() {
        if (_textBolder != null) {
            return _textBolder!!
        }
        _textBolder = Builder(name = "TextBolder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.7f, 116.4f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 140.0f, 42.0f)
                lineTo(64.0f, 42.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(58.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 14.7f, -89.6f)
                close()
                moveTo(70.0f, 54.0f)
                horizontalLineToRelative(70.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, 60.0f)
                lineTo(70.0f, 114.0f)
                close()
                moveTo(152.0f, 194.0f)
                lineTo(70.0f, 194.0f)
                lineTo(70.0f, 126.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _textBolder!!
    }

private var _textBolder: ImageVector? = null
