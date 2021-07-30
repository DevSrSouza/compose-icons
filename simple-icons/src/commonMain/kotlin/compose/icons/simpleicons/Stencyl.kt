package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Stencyl: ImageVector
    get() {
        if (_stencyl != null) {
            return _stencyl!!
        }
        _stencyl = Builder(name = "Stencyl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.36f, 2.675f)
                curveToRelative(-0.959f, 0.12f, -1.901f, 0.366f, -2.783f, 0.759f)
                lineTo(9.389f, 1.622f)
                lineToRelative(0.433f, 2.835f)
                curveToRelative(-0.758f, 0.567f, -1.41f, 1.25f, -1.935f, 2.038f)
                lineTo(4.982f, 6.0f)
                lineToRelative(1.951f, 2.352f)
                curveToRelative(-0.31f, 0.817f, -0.502f, 1.677f, -0.589f, 2.548f)
                lineTo(3.374f, 12.0f)
                lineToRelative(2.952f, 1.099f)
                curveToRelative(0.083f, 0.883f, 0.258f, 1.763f, 0.565f, 2.597f)
                lineToRelative(-1.894f, 2.283f)
                lineToRelative(2.819f, -0.426f)
                curveToRelative(0.541f, 0.811f, 1.229f, 1.518f, 2.025f, 2.08f)
                lineToRelative(-0.47f, 2.751f)
                lineToRelative(2.247f, -1.806f)
                curveToRelative(0.864f, 0.333f, 1.78f, 0.523f, 2.705f, 0.597f)
                lineTo(15.372f, 24.0f)
                lineToRelative(1.059f, -2.846f)
                curveToRelative(1.418f, -0.144f, 2.841f, -0.46f, 4.103f, -1.144f)
                curveToRelative(-0.229f, -1.019f, -0.468f, -2.035f, -0.692f, -3.055f)
                curveToRelative(-2.042f, 1.044f, -4.605f, 1.442f, -6.736f, 0.403f)
                curveToRelative(-1.763f, -0.896f, -2.773f, -2.842f, -2.911f, -4.785f)
                curveToRelative(-0.152f, -2.15f, 0.502f, -4.51f, 2.314f, -5.801f)
                curveToRelative(1.724f, -1.192f, 4.024f, -1.208f, 5.964f, -0.586f)
                curveToRelative(0.428f, 0.149f, 0.836f, 0.353f, 1.224f, 0.603f)
                curveToRelative(0.306f, -1.052f, 0.616f, -2.104f, 0.93f, -3.154f)
                curveToRelative(-1.32f, -0.674f, -2.811f, -0.98f, -4.291f, -1.044f)
                lineTo(15.372f, 0.0f)
                lineTo(14.36f, 2.675f)
                close()
            }
        }
        .build()
        return _stencyl!!
    }

private var _stencyl: ImageVector? = null
