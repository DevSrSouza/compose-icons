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

public val LineAwesomeIcons.FontSolid: ImageVector
    get() {
        if (_fontSolid != null) {
            return _fontSolid!!
        }
        _fontSolid = Builder(name = "FontSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                lineTo(8.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(12.0938f, 20.0f)
                lineTo(19.9063f, 20.0f)
                lineTo(22.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                lineTo(17.0f, 6.0f)
                close()
                moveTo(16.0f, 8.8438f)
                lineTo(19.1875f, 18.0f)
                lineTo(12.8125f, 18.0f)
                close()
            }
        }
        .build()
        return _fontSolid!!
    }

private var _fontSolid: ImageVector? = null
