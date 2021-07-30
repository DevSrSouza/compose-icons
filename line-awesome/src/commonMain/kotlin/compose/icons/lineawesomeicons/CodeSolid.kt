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

public val LineAwesomeIcons.CodeSolid: ImageVector
    get() {
        if (_codeSolid != null) {
            return _codeSolid!!
        }
        _codeSolid = Builder(name = "CodeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 5.0f)
                lineTo(12.0f, 27.0f)
                lineTo(14.0f, 27.0f)
                lineTo(20.0f, 5.0f)
                close()
                moveTo(7.9375f, 6.4063f)
                lineTo(1.1875f, 15.4063f)
                lineTo(0.75f, 16.0f)
                lineTo(1.1875f, 16.5938f)
                lineTo(7.9375f, 25.5938f)
                lineTo(9.5625f, 24.4063f)
                lineTo(3.25f, 16.0f)
                lineTo(9.5625f, 7.5938f)
                close()
                moveTo(24.0625f, 6.4063f)
                lineTo(22.4375f, 7.5938f)
                lineTo(28.75f, 16.0f)
                lineTo(22.4375f, 24.4063f)
                lineTo(24.0625f, 25.5938f)
                lineTo(30.8125f, 16.5938f)
                lineTo(31.25f, 16.0f)
                lineTo(30.8125f, 15.4063f)
                close()
            }
        }
        .build()
        return _codeSolid!!
    }

private var _codeSolid: ImageVector? = null
