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

public val LineAwesomeIcons.AngleLeftSolid: ImageVector
    get() {
        if (_angleLeftSolid != null) {
            return _angleLeftSolid!!
        }
        _angleLeftSolid = Builder(name = "AngleLeftSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0313f, 4.2813f)
                lineTo(8.0313f, 15.2813f)
                lineTo(7.3438f, 16.0f)
                lineTo(8.0313f, 16.7188f)
                lineTo(19.0313f, 27.7188f)
                lineTo(20.4688f, 26.2813f)
                lineTo(10.1875f, 16.0f)
                lineTo(20.4688f, 5.7188f)
                close()
            }
        }
        .build()
        return _angleLeftSolid!!
    }

private var _angleLeftSolid: ImageVector? = null
