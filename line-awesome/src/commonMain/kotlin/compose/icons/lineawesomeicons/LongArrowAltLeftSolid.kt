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

public val LineAwesomeIcons.LongArrowAltLeftSolid: ImageVector
    get() {
        if (_longArrowAltLeftSolid != null) {
            return _longArrowAltLeftSolid!!
        }
        _longArrowAltLeftSolid = Builder(name = "LongArrowAltLeftSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.8125f, 9.2813f)
                lineTo(4.0938f, 16.0f)
                lineTo(10.8125f, 22.7188f)
                lineTo(12.2188f, 21.2813f)
                lineTo(7.9375f, 17.0f)
                lineTo(28.0f, 17.0f)
                lineTo(28.0f, 15.0f)
                lineTo(7.9375f, 15.0f)
                lineTo(12.2188f, 10.7188f)
                close()
            }
        }
        .build()
        return _longArrowAltLeftSolid!!
    }

private var _longArrowAltLeftSolid: ImageVector? = null
