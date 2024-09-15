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

public val SimpleIcons.Jcb: ImageVector
    get() {
        if (_jcb != null) {
            return _jcb!!
        }
        _jcb = Builder(name = "Jcb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 9.864f)
                curveToRelative(0.972f, 0.074f, 1.726f, 0.367f, 2.355f, 0.684f)
                verticalLineToRelative(-1.31f)
                reflectiveCurveToRelative(-1.258f, -0.316f, -2.441f, -0.368f)
                curveToRelative(-4.126f, -0.185f, -5.295f, 1.434f, -5.295f, 3.129f)
                curveToRelative(0.0f, 1.695f, 1.169f, 3.315f, 5.295f, 3.13f)
                curveToRelative(1.183f, -0.054f, 2.441f, -0.369f, 2.441f, -0.369f)
                verticalLineToRelative(-1.309f)
                curveToRelative(-0.619f, 0.308f, -1.383f, 0.611f, -2.355f, 0.683f)
                curveToRelative(-1.679f, 0.127f, -2.69f, -0.691f, -2.69f, -2.134f)
                curveToRelative(0.0f, -1.445f, 1.01f, -2.261f, 2.69f, -2.135f)
                moveToRelative(7.685f, 4.122f)
                curveToRelative(-0.051f, 0.01f, -0.158f, 0.02f, -0.215f, 0.02f)
                horizontalLineToRelative(-1.801f)
                lineTo(18.719f, 12.376f)
                lineTo(20.52f, 12.376f)
                curveToRelative(0.057f, 0.0f, 0.164f, 0.01f, 0.215f, 0.02f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, true, 0.632f, 0.795f)
                curveToRelative(0.0f, 0.416f, -0.287f, 0.721f, -0.632f, 0.796f)
                close()
                moveTo(18.72f, 9.95f)
                horizontalLineToRelative(1.633f)
                curveToRelative(0.059f, 0.0f, 0.145f, 0.008f, 0.177f, 0.014f)
                curveToRelative(0.338f, 0.057f, 0.626f, 0.331f, 0.626f, 0.739f)
                curveToRelative(0.0f, 0.409f, -0.288f, 0.682f, -0.626f, 0.739f)
                arcToRelative(1.571f, 1.571f, 0.0f, false, true, -0.177f, 0.014f)
                horizontalLineToRelative(-1.631f)
                lineTo(18.72f, 9.951f)
                close()
                moveTo(22.219f, 11.935f)
                verticalLineToRelative(-0.036f)
                curveToRelative(0.913f, -0.133f, 1.415f, -0.726f, 1.415f, -1.42f)
                curveToRelative(0.0f, -0.883f, -0.734f, -1.392f, -1.729f, -1.442f)
                curveToRelative(-0.077f, -0.003f, -0.203f, -0.011f, -0.304f, -0.011f)
                horizontalLineToRelative(-5.332f)
                verticalLineToRelative(5.947f)
                horizontalLineToRelative(5.755f)
                curveToRelative(1.13f, 0.0f, 1.977f, -0.604f, 1.977f, -1.547f)
                curveToRelative(0.0f, -0.87f, -0.772f, -1.422f, -1.781f, -1.492f)
                close()
                moveTo(4.354f, 12.614f)
                curveToRelative(0.0f, 0.879f, -0.591f, 1.531f, -1.666f, 1.531f)
                curveToRelative(-0.917f, 0.0f, -1.817f, -0.273f, -2.689f, -0.694f)
                lineTo(0.0f, 14.76f)
                reflectiveCurveToRelative(1.402f, 0.383f, 3.191f, 0.383f)
                curveToRelative(2.971f, 0.0f, 3.837f, -1.125f, 3.837f, -2.529f)
                lineTo(7.028f, 9.027f)
                lineTo(4.354f, 9.027f)
                verticalLineToRelative(3.588f)
                close()
            }
        }
        .build()
        return _jcb!!
    }

private var _jcb: ImageVector? = null
