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

public val LineAwesomeIcons.LongArrowAltRightSolid: ImageVector
    get() {
        if (_longArrowAltRightSolid != null) {
            return _longArrowAltRightSolid!!
        }
        _longArrowAltRightSolid = Builder(name = "LongArrowAltRightSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1875f, 9.2813f)
                lineTo(19.7813f, 10.7188f)
                lineTo(24.0625f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(24.0625f, 17.0f)
                lineTo(19.7813f, 21.2813f)
                lineTo(21.1875f, 22.7188f)
                lineTo(27.9063f, 16.0f)
                close()
            }
        }
        .build()
        return _longArrowAltRightSolid!!
    }

private var _longArrowAltRightSolid: ImageVector? = null
