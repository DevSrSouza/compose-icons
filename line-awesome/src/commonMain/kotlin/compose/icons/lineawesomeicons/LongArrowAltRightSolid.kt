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
                moveTo(21.188f, 9.281f)
                lineTo(19.781f, 10.719f)
                lineTo(24.063f, 15.0f)
                lineTo(4.0f, 15.0f)
                lineTo(4.0f, 17.0f)
                lineTo(24.063f, 17.0f)
                lineTo(19.781f, 21.281f)
                lineTo(21.188f, 22.719f)
                lineTo(27.906f, 16.0f)
                close()
            }
        }
        .build()
        return _longArrowAltRightSolid!!
    }

private var _longArrowAltRightSolid: ImageVector? = null
