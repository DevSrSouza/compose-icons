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

public val LineAwesomeIcons.TerminalSolid: ImageVector
    get() {
        if (_terminalSolid != null) {
            return _terminalSolid!!
        }
        _terminalSolid = Builder(name = "TerminalSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 5.0f)
                lineTo(4.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 5.0f)
                close()
                moveTo(6.0f, 7.0f)
                lineTo(26.0f, 7.0f)
                lineTo(26.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(26.0f, 11.0f)
                lineTo(26.0f, 25.0f)
                lineTo(6.0f, 25.0f)
                close()
                moveTo(11.2188f, 13.7813f)
                lineTo(9.7813f, 15.2188f)
                lineTo(12.5625f, 18.0f)
                lineTo(9.7813f, 20.7813f)
                lineTo(11.2188f, 22.2188f)
                lineTo(14.7188f, 18.7188f)
                lineTo(15.4063f, 18.0f)
                lineTo(14.7188f, 17.2813f)
                close()
                moveTo(16.0f, 20.0f)
                lineTo(16.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 20.0f)
                close()
            }
        }
        .build()
        return _terminalSolid!!
    }

private var _terminalSolid: ImageVector? = null
