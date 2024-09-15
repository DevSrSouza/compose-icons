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

public val LineAwesomeIcons.StampSolid: ImageVector
    get() {
        if (_stampSolid != null) {
            return _stampSolid!!
        }
        _stampSolid = Builder(name = "StampSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.906f)
                curveTo(12.727f, 2.906f, 10.063f, 5.57f, 10.063f, 8.844f)
                curveTo(10.063f, 10.789f, 10.969f, 12.168f, 11.719f, 13.219f)
                curveTo(12.469f, 14.27f, 13.0f, 14.992f, 13.0f, 16.031f)
                lineTo(13.0f, 19.219f)
                lineTo(4.781f, 21.031f)
                lineTo(4.0f, 21.188f)
                lineTo(4.0f, 26.0f)
                lineTo(5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                curveTo(5.0f, 27.574f, 5.254f, 28.117f, 5.656f, 28.469f)
                curveTo(6.059f, 28.82f, 6.574f, 29.0f, 7.094f, 29.0f)
                lineTo(24.906f, 29.0f)
                curveTo(25.426f, 29.0f, 25.941f, 28.82f, 26.344f, 28.469f)
                curveTo(26.746f, 28.117f, 27.0f, 27.574f, 27.0f, 27.0f)
                lineTo(27.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 21.188f)
                lineTo(27.219f, 21.031f)
                lineTo(19.0f, 19.219f)
                lineTo(19.0f, 16.031f)
                curveTo(19.0f, 14.992f, 19.531f, 14.27f, 20.281f, 13.219f)
                curveTo(21.031f, 12.168f, 21.938f, 10.789f, 21.938f, 8.844f)
                curveTo(21.938f, 5.57f, 19.273f, 2.906f, 16.0f, 2.906f)
                close()
                moveTo(16.0f, 4.906f)
                curveTo(18.195f, 4.906f, 19.938f, 6.648f, 19.938f, 8.844f)
                curveTo(19.938f, 10.195f, 19.383f, 11.043f, 18.656f, 12.063f)
                curveTo(17.93f, 13.082f, 17.0f, 14.285f, 17.0f, 16.031f)
                lineTo(17.0f, 19.0f)
                lineTo(15.0f, 19.0f)
                lineTo(15.0f, 16.031f)
                curveTo(15.0f, 14.285f, 14.07f, 13.082f, 13.344f, 12.063f)
                curveTo(12.617f, 11.043f, 12.063f, 10.195f, 12.063f, 8.844f)
                curveTo(12.063f, 6.648f, 13.805f, 4.906f, 16.0f, 4.906f)
                close()
                moveTo(14.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(26.0f, 22.781f)
                lineTo(26.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                lineTo(6.0f, 22.781f)
                close()
                moveTo(7.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 26.969f)
                curveTo(24.988f, 26.977f, 24.973f, 27.0f, 24.906f, 27.0f)
                lineTo(7.094f, 27.0f)
                curveTo(7.027f, 27.0f, 7.012f, 26.977f, 7.0f, 26.969f)
                close()
            }
        }
        .build()
        return _stampSolid!!
    }

private var _stampSolid: ImageVector? = null
