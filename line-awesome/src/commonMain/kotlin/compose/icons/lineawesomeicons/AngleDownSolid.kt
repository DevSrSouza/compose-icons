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

public val LineAwesomeIcons.AngleDownSolid: ImageVector
    get() {
        if (_angleDownSolid != null) {
            return _angleDownSolid!!
        }
        _angleDownSolid = Builder(name = "AngleDownSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2188f, 10.7813f)
                lineTo(2.7813f, 12.2188f)
                lineTo(15.2813f, 24.7188f)
                lineTo(16.0f, 25.4063f)
                lineTo(16.7188f, 24.7188f)
                lineTo(29.2188f, 12.2188f)
                lineTo(27.7813f, 10.7813f)
                lineTo(16.0f, 22.5625f)
                close()
            }
        }
        .build()
        return _angleDownSolid!!
    }

private var _angleDownSolid: ImageVector? = null
