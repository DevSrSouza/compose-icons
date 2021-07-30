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

public val LineAwesomeIcons.PaintRollerSolid: ImageVector
    get() {
        if (_paintRollerSolid != null) {
            return _paintRollerSolid!!
        }
        _paintRollerSolid = Builder(name = "PaintRollerSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineTo(5.0f, 12.0f)
                lineTo(23.0f, 12.0f)
                lineTo(23.0f, 4.0f)
                close()
                moveTo(7.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 10.0f)
                lineTo(7.0f, 10.0f)
                close()
                moveTo(24.0f, 7.0f)
                lineTo(24.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                lineTo(25.0f, 13.25f)
                lineTo(15.7188f, 16.0313f)
                lineTo(15.0f, 16.25f)
                lineTo(15.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 17.75f)
                lineTo(26.2813f, 14.9688f)
                lineTo(27.0f, 14.75f)
                lineTo(27.0f, 7.0f)
                close()
                moveTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                close()
            }
        }
        .build()
        return _paintRollerSolid!!
    }

private var _paintRollerSolid: ImageVector? = null
