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

public val SimpleIcons.Unicode: ImageVector
    get() {
        if (_unicode != null) {
            return _unicode!!
        }
        _unicode = Builder(name = "Unicode", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.2f, 0.0f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.2f, 0.2f)
                verticalLineToRelative(23.6f)
                curveToRelative(0.0f, 0.11f, 0.09f, 0.2f, 0.2f, 0.2f)
                horizontalLineToRelative(23.6f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, 0.2f, -0.2f)
                lineTo(24.0f, 0.2f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, false, -0.2f, -0.2f)
                lineTo(0.2f, 0.0f)
                close()
                moveTo(19.688f, 5.27f)
                arcTo(1.312f, 1.312f, 0.0f, false, true, 21.0f, 6.582f)
                arcToRelative(1.312f, 1.312f, 0.0f, false, true, -1.313f, 1.313f)
                arcToRelative(1.312f, 1.312f, 0.0f, false, true, -1.31f, -1.313f)
                arcToRelative(1.312f, 1.312f, 0.0f, false, true, 1.31f, -1.312f)
                close()
                moveTo(3.15f, 6.05f)
                horizontalLineToRelative(1.996f)
                curveToRelative(0.102f, 0.0f, 0.153f, 0.05f, 0.153f, 0.151f)
                verticalLineToRelative(7.49f)
                curveToRelative(0.0f, 0.912f, 0.222f, 1.644f, 0.666f, 2.188f)
                curveToRelative(0.444f, 0.546f, 1.121f, 0.816f, 2.033f, 0.816f)
                curveToRelative(0.38f, 0.0f, 0.729f, -0.048f, 1.047f, -0.15f)
                curveToRelative(0.316f, -0.102f, 0.59f, -0.272f, 0.824f, -0.506f)
                curveToRelative(0.234f, -0.236f, 0.419f, -0.546f, 0.553f, -0.932f)
                curveToRelative(0.134f, -0.386f, 0.2f, -0.869f, 0.2f, -1.453f)
                lineTo(10.622f, 6.223f)
                curveToRelative(0.0f, -0.014f, 0.003f, -0.024f, 0.005f, -0.035f)
                lineToRelative(-0.006f, -0.004f)
                curveToRelative(0.0f, -0.09f, 0.045f, -0.133f, 0.133f, -0.133f)
                horizontalLineToRelative(2.682f)
                curveToRelative(0.076f, 0.0f, 0.126f, 0.01f, 0.152f, 0.027f)
                curveToRelative(0.026f, 0.018f, 0.05f, 0.054f, 0.076f, 0.104f)
                curveToRelative(0.228f, 0.418f, 0.499f, 0.906f, 0.809f, 1.464f)
                curveToRelative(0.31f, 0.558f, 0.629f, 1.14f, 0.959f, 1.749f)
                lineToRelative(0.998f, 1.843f)
                curveToRelative(0.334f, 0.62f, 0.647f, 1.206f, 0.94f, 1.758f)
                curveToRelative(0.291f, 0.552f, 0.549f, 1.045f, 0.77f, 1.475f)
                curveToRelative(0.223f, 0.432f, 0.39f, 0.768f, 0.505f, 1.008f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.0f, -0.126f, -0.005f, -0.27f, -0.01f, -0.428f)
                arcToRelative(25.728f, 25.728f, 0.0f, false, true, -0.02f, -0.57f)
                curveToRelative(-0.006f, -0.223f, -0.014f, -0.493f, -0.02f, -0.81f)
                curveToRelative(-0.008f, -0.315f, -0.01f, -0.696f, -0.01f, -1.14f)
                verticalLineToRelative(-3.21f)
                curveToRelative(0.0f, -0.103f, 0.056f, -0.153f, 0.17f, -0.153f)
                lineTo(20.6f, 9.168f)
                curveToRelative(0.114f, 0.0f, 0.171f, 0.058f, 0.171f, 0.172f)
                verticalLineToRelative(9.03f)
                curveToRelative(0.0f, 0.113f, -0.063f, 0.17f, -0.189f, 0.17f)
                horizontalLineToRelative(-2.414f)
                curveToRelative(-0.114f, 0.0f, -0.198f, -0.046f, -0.248f, -0.134f)
                arcToRelative(173.907f, 173.907f, 0.0f, false, false, -1.623f, -3.021f)
                arcToRelative(232.322f, 232.322f, 0.0f, false, true, -2.121f, -3.946f)
                arcToRelative(96.063f, 96.063f, 0.0f, false, true, -0.883f, -1.718f)
                arcToRelative(37.59f, 37.59f, 0.0f, false, true, -0.371f, -0.768f)
                verticalLineToRelative(4.815f)
                curveToRelative(0.0f, 0.888f, -0.13f, 1.643f, -0.39f, 2.271f)
                curveToRelative(-0.26f, 0.628f, -0.611f, 1.141f, -1.055f, 1.541f)
                arcToRelative(4.112f, 4.112f, 0.0f, false, true, -1.588f, 0.873f)
                arcToRelative(6.848f, 6.848f, 0.0f, false, true, -1.97f, 0.277f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, true, -2.032f, -0.304f)
                arcToRelative(4.196f, 4.196f, 0.0f, false, true, -1.559f, -0.903f)
                curveToRelative(-0.43f, -0.4f, -0.76f, -0.903f, -0.988f, -1.511f)
                curveToRelative(-0.228f, -0.608f, -0.342f, -1.325f, -0.342f, -2.149f)
                verticalLineToRelative(-7.64f)
                curveToRelative(0.0f, -0.114f, 0.05f, -0.172f, 0.152f, -0.172f)
                close()
            }
        }
        .build()
        return _unicode!!
    }

private var _unicode: ImageVector? = null
