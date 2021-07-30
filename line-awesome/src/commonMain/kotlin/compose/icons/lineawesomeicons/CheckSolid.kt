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

public val LineAwesomeIcons.CheckSolid: ImageVector
    get() {
        if (_checkSolid != null) {
            return _checkSolid!!
        }
        _checkSolid = Builder(name = "CheckSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.2813f, 6.2813f)
                lineTo(11.0f, 23.5625f)
                lineTo(3.7188f, 16.2813f)
                lineTo(2.2813f, 17.7188f)
                lineTo(10.2813f, 25.7188f)
                lineTo(11.0f, 26.4063f)
                lineTo(11.7188f, 25.7188f)
                lineTo(29.7188f, 7.7188f)
                close()
            }
        }
        .build()
        return _checkSolid!!
    }

private var _checkSolid: ImageVector? = null
