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

public val LineAwesomeIcons.RulerSolid: ImageVector
    get() {
        if (_rulerSolid != null) {
            return _rulerSolid!!
        }
        _rulerSolid = Builder(name = "RulerSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.531f, 3.594f)
                lineTo(3.594f, 20.531f)
                lineTo(11.469f, 28.406f)
                lineTo(28.406f, 11.469f)
                close()
                moveTo(20.531f, 6.438f)
                lineTo(25.563f, 11.469f)
                lineTo(11.469f, 25.563f)
                lineTo(6.438f, 20.531f)
                lineTo(7.594f, 19.375f)
                lineTo(9.75f, 21.531f)
                lineTo(11.188f, 20.125f)
                lineTo(9.0f, 17.938f)
                lineTo(10.188f, 16.781f)
                lineTo(11.063f, 17.656f)
                lineTo(12.469f, 16.219f)
                lineTo(11.594f, 15.375f)
                lineTo(12.781f, 14.188f)
                lineTo(14.938f, 16.344f)
                lineTo(16.344f, 14.938f)
                lineTo(14.188f, 12.781f)
                lineTo(15.375f, 11.594f)
                lineTo(16.219f, 12.469f)
                lineTo(17.656f, 11.063f)
                lineTo(16.781f, 10.188f)
                lineTo(17.938f, 9.0f)
                lineTo(20.125f, 11.188f)
                lineTo(21.531f, 9.75f)
                lineTo(19.375f, 7.594f)
                close()
            }
        }
        .build()
        return _rulerSolid!!
    }

private var _rulerSolid: ImageVector? = null
