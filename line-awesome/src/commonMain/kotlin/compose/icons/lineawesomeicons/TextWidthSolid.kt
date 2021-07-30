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

public val LineAwesomeIcons.TextWidthSolid: ImageVector
    get() {
        if (_textWidthSolid != null) {
            return _textWidthSolid!!
        }
        _textWidthSolid = Builder(name = "TextWidthSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                lineTo(8.0f, 8.0f)
                lineTo(15.0f, 8.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 8.0f)
                lineTo(24.0f, 8.0f)
                lineTo(24.0f, 6.0f)
                close()
                moveTo(10.0f, 21.5f)
                lineTo(5.625f, 25.0f)
                lineTo(10.0f, 28.5f)
                lineTo(10.0f, 26.0f)
                lineTo(22.0f, 26.0f)
                lineTo(22.0f, 28.5f)
                lineTo(26.375f, 25.0f)
                lineTo(22.0f, 21.5f)
                lineTo(22.0f, 24.0f)
                lineTo(10.0f, 24.0f)
                close()
            }
        }
        .build()
        return _textWidthSolid!!
    }

private var _textWidthSolid: ImageVector? = null
