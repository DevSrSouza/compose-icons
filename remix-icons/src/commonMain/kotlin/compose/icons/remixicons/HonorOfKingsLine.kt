package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.HonorOfKingsLine: ImageVector
    get() {
        if (_honorOfKingsLine != null) {
            return _honorOfKingsLine!!
        }
        _honorOfKingsLine = Builder(name = "HonorOfKingsLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.328f, 4.256f)
                lineToRelative(-1.423f, 1.423f)
                curveToRelative(-3.138f, -2.442f, -7.677f, -2.22f, -10.562f, 0.664f)
                curveToRelative(-2.374f, 2.374f, -2.944f, 5.868f, -1.71f, 8.78f)
                lineToRelative(2.417f, -2.417f)
                curveToRelative(-0.213f, -1.503f, 0.258f, -3.085f, 1.414f, -4.242f)
                curveToRelative(1.71f, -1.71f, 4.352f, -1.922f, 6.293f, -0.636f)
                lineToRelative(-1.464f, 1.464f)
                curveToRelative(-1.115f, -0.532f, -2.49f, -0.337f, -3.414f, 0.587f)
                curveToRelative(-0.924f, 0.923f, -1.12f, 2.299f, -0.587f, 3.414f)
                lineToRelative(-6.45f, 6.45f)
                curveToRelative(-0.034f, -3.5f, -0.591f, -4.812f, -0.788f, -6.702f)
                curveToRelative(-0.301f, -2.894f, 0.657f, -5.894f, 2.875f, -8.112f)
                curveToRelative(3.666f, -3.666f, 9.471f, -3.89f, 13.4f, -0.673f)
                close()
                moveTo(21.158f, 4.258f)
                curveToRelative(0.034f, 3.5f, 0.591f, 4.811f, 0.788f, 6.701f)
                curveToRelative(0.301f, 2.894f, -0.657f, 5.894f, -2.875f, 8.112f)
                curveToRelative(-3.666f, 3.666f, -9.471f, 3.89f, -13.4f, 0.673f)
                lineToRelative(1.424f, -1.423f)
                curveToRelative(3.138f, 2.442f, 7.677f, 2.22f, 10.562f, -0.664f)
                curveToRelative(2.374f, -2.374f, 2.944f, -5.868f, 1.71f, -8.78f)
                lineToRelative(-2.417f, 2.417f)
                curveToRelative(0.213f, 1.503f, -0.258f, 3.085f, -1.414f, 4.242f)
                curveToRelative(-1.71f, 1.71f, -4.352f, 1.922f, -6.293f, 0.636f)
                lineToRelative(1.464f, -1.464f)
                curveToRelative(1.115f, 0.532f, 2.49f, 0.337f, 3.414f, -0.587f)
                curveToRelative(0.924f, -0.923f, 1.12f, -2.299f, 0.587f, -3.414f)
                lineToRelative(6.45f, -6.45f)
                close()
            }
        }
        .build()
        return _honorOfKingsLine!!
    }

private var _honorOfKingsLine: ImageVector? = null
