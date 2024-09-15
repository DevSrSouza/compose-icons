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

public val LineAwesomeIcons.LongArrowAltDownSolid: ImageVector
    get() {
        if (_longArrowAltDownSolid != null) {
            return _longArrowAltDownSolid!!
        }
        _longArrowAltDownSolid = Builder(name = "LongArrowAltDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 24.063f)
                lineTo(10.719f, 19.781f)
                lineTo(9.281f, 21.188f)
                lineTo(16.0f, 27.906f)
                lineTo(22.719f, 21.188f)
                lineTo(21.281f, 19.781f)
                lineTo(17.0f, 24.063f)
                lineTo(17.0f, 4.0f)
                close()
            }
        }
        .build()
        return _longArrowAltDownSolid!!
    }

private var _longArrowAltDownSolid: ImageVector? = null
