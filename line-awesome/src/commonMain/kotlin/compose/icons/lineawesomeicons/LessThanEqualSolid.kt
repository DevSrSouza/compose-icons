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

public val LineAwesomeIcons.LessThanEqualSolid: ImageVector
    get() {
        if (_lessThanEqualSolid != null) {
            return _lessThanEqualSolid!!
        }
        _lessThanEqualSolid = Builder(name = "LessThanEqualSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(26.0f, 5.0f)
                lineTo(6.0f, 13.2188f)
                lineTo(6.0f, 14.7813f)
                lineTo(26.0f, 23.0f)
                lineTo(26.0f, 20.8438f)
                lineTo(9.4688f, 14.0f)
                lineTo(26.0f, 7.1563f)
                close()
                moveTo(6.0f, 25.0f)
                lineTo(6.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 25.0f)
                close()
            }
        }
        .build()
        return _lessThanEqualSolid!!
    }

private var _lessThanEqualSolid: ImageVector? = null
