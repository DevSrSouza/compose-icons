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

public val LineAwesomeIcons.AngleUpSolid: ImageVector
    get() {
        if (_angleUpSolid != null) {
            return _angleUpSolid!!
        }
        _angleUpSolid = Builder(name = "AngleUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.5938f)
                lineTo(15.2813f, 7.2813f)
                lineTo(2.7813f, 19.7813f)
                lineTo(4.2188f, 21.2188f)
                lineTo(16.0f, 9.4375f)
                lineTo(27.7813f, 21.2188f)
                lineTo(29.2188f, 19.7813f)
                lineTo(16.7188f, 7.2813f)
                close()
            }
        }
        .build()
        return _angleUpSolid!!
    }

private var _angleUpSolid: ImageVector? = null
