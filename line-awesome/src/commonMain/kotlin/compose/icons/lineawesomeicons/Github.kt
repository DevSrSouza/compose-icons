package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.0f, 4.0f)
                curveTo(9.371f, 4.0f, 4.0f, 9.371f, 4.0f, 16.0f)
                curveTo(4.0f, 21.301f, 7.438f, 25.801f, 12.207f, 27.387f)
                curveTo(12.809f, 27.496f, 13.027f, 27.129f, 13.027f, 26.809f)
                curveTo(13.027f, 26.523f, 13.016f, 25.77f, 13.012f, 24.77f)
                curveTo(9.672f, 25.492f, 8.969f, 23.16f, 8.969f, 23.16f)
                curveTo(8.422f, 21.773f, 7.637f, 21.402f, 7.637f, 21.402f)
                curveTo(6.547f, 20.66f, 7.719f, 20.676f, 7.719f, 20.676f)
                curveTo(8.922f, 20.762f, 9.555f, 21.91f, 9.555f, 21.91f)
                curveTo(10.625f, 23.746f, 12.363f, 23.215f, 13.047f, 22.91f)
                curveTo(13.156f, 22.133f, 13.469f, 21.605f, 13.809f, 21.305f)
                curveTo(11.145f, 21.004f, 8.344f, 19.973f, 8.344f, 15.375f)
                curveTo(8.344f, 14.063f, 8.813f, 12.992f, 9.578f, 12.152f)
                curveTo(9.457f, 11.852f, 9.043f, 10.629f, 9.695f, 8.977f)
                curveTo(9.695f, 8.977f, 10.703f, 8.656f, 12.996f, 10.207f)
                curveTo(13.953f, 9.941f, 14.98f, 9.809f, 16.0f, 9.805f)
                curveTo(17.02f, 9.809f, 18.047f, 9.941f, 19.004f, 10.207f)
                curveTo(21.297f, 8.656f, 22.301f, 8.977f, 22.301f, 8.977f)
                curveTo(22.957f, 10.629f, 22.547f, 11.852f, 22.422f, 12.152f)
                curveTo(23.191f, 12.992f, 23.652f, 14.063f, 23.652f, 15.375f)
                curveTo(23.652f, 19.984f, 20.848f, 20.996f, 18.176f, 21.297f)
                curveTo(18.605f, 21.664f, 18.988f, 22.398f, 18.988f, 23.516f)
                curveTo(18.988f, 25.121f, 18.977f, 26.414f, 18.977f, 26.809f)
                curveTo(18.977f, 27.129f, 19.191f, 27.504f, 19.801f, 27.387f)
                curveTo(24.566f, 25.797f, 28.0f, 21.301f, 28.0f, 16.0f)
                curveTo(28.0f, 9.371f, 22.629f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
