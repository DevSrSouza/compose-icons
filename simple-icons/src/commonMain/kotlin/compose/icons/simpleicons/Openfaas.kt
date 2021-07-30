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

public val SimpleIcons.Openfaas: ImageVector
    get() {
        if (_openfaas != null) {
            return _openfaas!!
        }
        _openfaas = Builder(name = "Openfaas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.304f, 0.0f)
                arcTo(4.31f, 4.31f, 0.0f, false, false, 0.0f, 4.304f)
                verticalLineToRelative(15.391f)
                arcTo(4.31f, 4.31f, 0.0f, false, false, 4.304f, 24.0f)
                horizontalLineToRelative(15.392f)
                arcTo(4.31f, 4.31f, 0.0f, false, false, 24.0f, 19.695f)
                lineTo(24.0f, 4.305f)
                arcTo(4.31f, 4.31f, 0.0f, false, false, 19.695f, 0.0f)
                close()
                moveTo(4.298f, 0.776f)
                horizontalLineToRelative(15.398f)
                arcToRelative(3.532f, 3.532f, 0.0f, false, true, 3.528f, 3.528f)
                verticalLineToRelative(15.391f)
                curveToRelative(0.0f, 0.205f, -0.019f, 0.409f, -0.054f, 0.61f)
                curveToRelative(-1.234f, -0.015f, -1.858f, -0.412f, -2.514f, -0.834f)
                curveToRelative(-0.708f, -0.454f, -1.51f, -0.97f, -3.04f, -0.97f)
                reflectiveCurveToRelative(-2.33f, 0.516f, -3.038f, 0.97f)
                curveToRelative(-0.17f, 0.11f, -0.338f, 0.217f, -0.514f, 0.317f)
                arcToRelative(43.042f, 43.042f, 0.0f, false, true, -0.775f, -1.907f)
                arcToRelative(0.806f, 0.806f, 0.0f, false, true, 0.01f, -0.739f)
                curveToRelative(0.3f, -0.489f, 1.23f, -0.691f, 1.572f, -0.729f)
                curveToRelative(0.361f, -0.027f, 5.97f, -0.555f, 6.306f, -7.153f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.72f, -0.317f)
                curveToRelative(-0.457f, 0.464f, -1.886f, 1.634f, -3.0f, 1.47f)
                arcToRelative(11.06f, 11.06f, 0.0f, false, true, -0.693f, -0.127f)
                curveToRelative(-1.425f, -0.293f, -3.339f, -0.685f, -4.972f, 1.72f)
                curveToRelative(-1.633f, -2.406f, -3.548f, -2.012f, -4.972f, -1.72f)
                curveToRelative(-0.248f, 0.05f, -0.48f, 0.098f, -0.697f, 0.128f)
                curveToRelative(-1.108f, 0.162f, -2.538f, -1.007f, -2.997f, -1.471f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.72f, 0.316f)
                curveToRelative(0.336f, 6.58f, 5.914f, 7.124f, 6.304f, 7.153f)
                curveToRelative(0.086f, 0.012f, 1.1f, 0.16f, 1.48f, 0.717f)
                curveToRelative(0.15f, 0.237f, 0.184f, 0.529f, 0.092f, 0.793f)
                arcToRelative(19.35f, 19.35f, 0.0f, false, true, -0.552f, 1.747f)
                curveToRelative(-0.107f, -0.065f, -0.214f, -0.13f, -0.32f, -0.198f)
                curveToRelative(-0.708f, -0.454f, -1.51f, -0.97f, -3.039f, -0.97f)
                curveToRelative(-1.53f, 0.0f, -2.332f, 0.516f, -3.04f, 0.97f)
                curveToRelative(-0.654f, 0.42f, -1.277f, 0.816f, -2.5f, 0.834f)
                arcToRelative(3.532f, 3.532f, 0.0f, false, true, -0.055f, -0.61f)
                lineTo(0.776f, 4.305f)
                arcTo(3.532f, 3.532f, 0.0f, false, true, 4.298f, 0.775f)
                close()
                moveTo(8.772f, 2.884f)
                lineToRelative(-4.74f, 1.429f)
                lineToRelative(1.293f, 4.288f)
                lineToRelative(3.165f, -0.955f)
                lineToRelative(-0.19f, 1.229f)
                lineToRelative(4.894f, 0.757f)
                lineToRelative(0.684f, -4.426f)
                lineToRelative(-4.62f, -0.715f)
                close()
                moveTo(19.266f, 3.697f)
                lineToRelative(-4.938f, 0.348f)
                lineToRelative(0.315f, 4.466f)
                lineToRelative(4.938f, -0.347f)
                close()
            }
        }
        .build()
        return _openfaas!!
    }

private var _openfaas: ImageVector? = null
