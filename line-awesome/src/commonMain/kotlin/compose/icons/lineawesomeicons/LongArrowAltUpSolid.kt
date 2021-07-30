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

public val LineAwesomeIcons.LongArrowAltUpSolid: ImageVector
    get() {
        if (_longArrowAltUpSolid != null) {
            return _longArrowAltUpSolid!!
        }
        _longArrowAltUpSolid = Builder(name = "LongArrowAltUpSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0938f)
                lineTo(9.2813f, 10.8125f)
                lineTo(10.7188f, 12.2188f)
                lineTo(15.0f, 7.9375f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 7.9375f)
                lineTo(21.2813f, 12.2188f)
                lineTo(22.7188f, 10.8125f)
                close()
            }
        }
        .build()
        return _longArrowAltUpSolid!!
    }

private var _longArrowAltUpSolid: ImageVector? = null
