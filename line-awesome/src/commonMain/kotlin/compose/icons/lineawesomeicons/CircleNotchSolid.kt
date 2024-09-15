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

public val LineAwesomeIcons.CircleNotchSolid: ImageVector
    get() {
        if (_circleNotchSolid != null) {
            return _circleNotchSolid!!
        }
        _circleNotchSolid = Builder(name = "CircleNotchSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.18f)
                lineTo(18.0f, 6.203f)
                curveTo(22.559f, 7.133f, 26.0f, 11.172f, 26.0f, 16.0f)
                curveTo(26.0f, 21.516f, 21.516f, 26.0f, 16.0f, 26.0f)
                curveTo(10.484f, 26.0f, 6.0f, 21.516f, 6.0f, 16.0f)
                curveTo(6.0f, 11.172f, 9.441f, 7.133f, 14.0f, 6.203f)
                lineTo(14.0f, 4.18f)
                curveTo(8.336f, 5.137f, 4.0f, 10.066f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 10.066f, 23.664f, 5.137f, 18.0f, 4.18f)
                close()
            }
        }
        .build()
        return _circleNotchSolid!!
    }

private var _circleNotchSolid: ImageVector? = null
