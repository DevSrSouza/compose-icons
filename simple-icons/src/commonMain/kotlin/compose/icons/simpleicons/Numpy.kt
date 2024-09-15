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

public val SimpleIcons.Numpy: ImageVector
    get() {
        if (_numpy != null) {
            return _numpy!!
        }
        _numpy = Builder(name = "Numpy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.315f, 4.876f)
                lineTo(6.305f, 2.852f)
                lineToRelative(-4.401f, 2.197f)
                lineToRelative(4.119f, 2.068f)
                close()
                moveTo(12.153f, 5.804f)
                lineToRelative(4.205f, 2.122f)
                lineToRelative(-4.362f, 2.191f)
                lineToRelative(-4.125f, -2.072f)
                close()
                moveTo(17.768f, 2.882f)
                lineToRelative(4.319f, 2.166f)
                lineToRelative(-3.863f, 1.94f)
                lineToRelative(-4.213f, -2.125f)
                close()
                moveTo(15.909f, 1.95f)
                lineTo(12.021f, 0.0f)
                lineTo(8.174f, 1.919f)
                lineToRelative(4.007f, 2.021f)
                close()
                moveTo(12.869f, 18.694f)
                lineTo(12.869f, 24.0f)
                lineToRelative(4.711f, -2.351f)
                lineToRelative(-0.005f, -5.308f)
                close()
                moveTo(17.573f, 14.488f)
                lineToRelative(-0.005f, -5.253f)
                lineToRelative(-4.699f, 2.336f)
                verticalLineToRelative(5.255f)
                close()
                moveTo(23.228f, 13.504f)
                verticalLineToRelative(5.327f)
                lineToRelative(-4.018f, 2.005f)
                lineToRelative(-0.003f, -5.303f)
                close()
                moveTo(23.228f, 11.641f)
                lineTo(23.228f, 6.421f)
                lineToRelative(-4.025f, 2.001f)
                lineToRelative(0.003f, 5.263f)
                close()
                moveTo(11.206f, 11.571f)
                lineTo(8.033f, 9.976f)
                verticalLineToRelative(6.895f)
                reflectiveCurveToRelative(-3.88f, -8.256f, -4.24f, -8.998f)
                curveToRelative(-0.046f, -0.096f, -0.237f, -0.201f, -0.286f, -0.226f)
                curveTo(2.812f, 7.281f, 0.773f, 6.248f, 0.773f, 6.248f)
                lineTo(0.773f, 18.43f)
                lineToRelative(2.82f, 1.508f)
                verticalLineToRelative(-6.367f)
                reflectiveCurveToRelative(3.839f, 7.378f, 3.878f, 7.458f)
                curveToRelative(0.039f, 0.081f, 0.424f, 0.858f, 0.836f, 1.131f)
                curveToRelative(0.549f, 0.363f, 2.899f, 1.777f, 2.899f, 1.777f)
                close()
            }
        }
        .build()
        return _numpy!!
    }

private var _numpy: ImageVector? = null
