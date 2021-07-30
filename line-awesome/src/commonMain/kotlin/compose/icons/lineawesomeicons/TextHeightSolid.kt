package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.TextHeightSolid: ImageVector
    get() {
        if (_textHeightSolid != null) {
            return _textHeightSolid!!
        }
        _textHeightSolid = Builder(name = "TextHeightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 8.0f)
                lineTo(11.0f, 8.0f)
                lineTo(11.0f, 26.0f)
                lineTo(13.0f, 26.0f)
                lineTo(13.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 6.0f)
                close()
                moveTo(25.0f, 6.625f)
                lineTo(21.5f, 11.0f)
                lineTo(24.0f, 11.0f)
                lineTo(24.0f, 21.0f)
                lineTo(21.5f, 21.0f)
                lineTo(25.0f, 25.375f)
                lineTo(28.5f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 11.0f)
                lineTo(28.5f, 11.0f)
                close()
            }
        }
        .build()
        return _textHeightSolid!!
    }

private var _textHeightSolid: ImageVector? = null
