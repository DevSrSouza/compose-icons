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

public val LineAwesomeIcons.Atlassian: ImageVector
    get() {
        if (_atlassian != null) {
            return _atlassian!!
        }
        _atlassian = Builder(name = "Atlassian", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.932f, 4.0f)
                curveTo(15.718f, 4.0f, 15.498f, 4.119f, 15.354f, 4.363f)
                curveTo(10.127f, 12.978f, 14.982f, 20.024f, 18.178f, 26.627f)
                curveTo(18.289f, 26.848f, 18.512f, 27.0f, 18.762f, 27.0f)
                lineTo(26.352f, 27.0f)
                curveTo(26.835f, 27.0f, 27.151f, 26.472f, 26.928f, 26.021f)
                curveTo(26.928f, 26.021f, 16.72f, 4.881f, 16.469f, 4.354f)
                curveTo(16.353f, 4.12f, 16.145f, 4.0f, 15.932f, 4.0f)
                close()
                moveTo(15.883f, 7.744f)
                curveTo(18.003f, 12.138f, 22.312f, 21.064f, 24.213f, 25.0f)
                lineTo(19.607f, 25.0f)
                curveTo(19.317f, 24.419f, 19.019f, 23.835f, 18.717f, 23.248f)
                curveTo(16.119f, 18.188f, 13.648f, 13.376f, 15.883f, 7.744f)
                close()
                moveTo(10.316f, 14.0f)
                curveTo(10.089f, 14.0f, 9.874f, 14.126f, 9.748f, 14.389f)
                lineTo(4.07f, 26.004f)
                curveTo(3.849f, 26.468f, 4.187f, 27.0f, 4.678f, 27.0f)
                lineTo(12.576f, 27.0f)
                lineTo(12.6f, 27.0f)
                curveTo(12.85f, 27.0f, 13.071f, 26.844f, 13.174f, 26.615f)
                curveTo(14.887f, 23.013f, 13.857f, 17.538f, 10.865f, 14.262f)
                curveTo(10.706f, 14.09f, 10.507f, 14.0f, 10.316f, 14.0f)
                close()
                moveTo(10.57f, 17.26f)
                curveTo(11.908f, 19.634f, 12.368f, 22.695f, 11.656f, 25.0f)
                lineTo(6.787f, 25.0f)
                lineTo(10.57f, 17.26f)
                close()
            }
        }
        .build()
        return _atlassian!!
    }

private var _atlassian: ImageVector? = null
