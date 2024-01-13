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

public val SimpleIcons.Ufc: ImageVector
    get() {
        if (_ufc != null) {
            return _ufc!!
        }
        _ufc = Builder(name = "Ufc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.308f, 7.843f)
                horizontalLineToRelative(2.797f)
                reflectiveCurveToRelative(-1.86f, 6.639f, -1.951f, 6.998f)
                curveToRelative(-0.177f, 0.69f, -0.353f, 1.316f, -2.043f, 1.316f)
                curveToRelative(-2.037f, 0.0f, -3.22f, -0.007f, -3.777f, 0.0f)
                curveToRelative(-0.698f, 0.007f, -1.521f, -0.633f, -1.296f, -1.464f)
                lineToRelative(1.91f, -6.85f)
                lineTo(4.8f, 7.843f)
                reflectiveCurveTo(3.2f, 13.553f, 3.166f, 13.7f)
                curveToRelative(-0.029f, 0.148f, -0.19f, 0.557f, 0.698f, 0.564f)
                curveToRelative(0.64f, 0.014f, 0.69f, -0.155f, 0.803f, -0.564f)
                curveToRelative(0.268f, -0.922f, 1.64f, -5.857f, 1.64f, -5.857f)
                close()
                moveTo(16.58f, 7.843f)
                lineToRelative(-0.507f, 1.824f)
                lineTo(9.986f, 9.667f)
                lineToRelative(0.507f, -1.824f)
                close()
                moveTo(8.176f, 16.157f)
                lineToRelative(1.459f, -5.244f)
                horizontalLineToRelative(6.086f)
                lineToRelative(-0.507f, 1.823f)
                horizontalLineToRelative(-3.262f)
                lineToRelative(-0.95f, 3.421f)
                close()
                moveTo(19.646f, 10.772f)
                curveToRelative(-0.26f, 0.957f, -0.493f, 1.774f, -0.754f, 2.738f)
                curveToRelative(-0.05f, 0.17f, -0.162f, 0.416f, -0.127f, 0.57f)
                curveToRelative(0.078f, 0.367f, 1.29f, 0.226f, 1.726f, 0.226f)
                horizontalLineToRelative(1.945f)
                curveToRelative(-0.155f, 0.612f, -0.33f, 1.21f, -0.5f, 1.81f)
                horizontalLineToRelative(-4.63f)
                curveToRelative(-0.676f, -0.064f, -1.557f, -0.353f, -1.472f, -1.226f)
                curveToRelative(0.028f, -0.274f, 0.156f, -0.584f, 0.24f, -0.887f)
                arcToRelative(1189.7f, 1189.7f, 0.0f, false, false, 1.24f, -4.463f)
                curveToRelative(0.176f, -0.648f, 0.317f, -1.197f, 0.83f, -1.457f)
                curveToRelative(0.333f, -0.17f, 0.861f, -0.218f, 1.255f, -0.24f)
                lineTo(24.0f, 7.843f)
                curveToRelative(-0.162f, 0.606f, -0.331f, 1.211f, -0.5f, 1.81f)
                horizontalLineToRelative(-2.643f)
                curveToRelative(-0.317f, 0.0f, -0.669f, -0.036f, -0.845f, 0.084f)
                curveToRelative(-0.19f, 0.141f, -0.295f, 0.775f, -0.366f, 1.035f)
                close()
            }
        }
        .build()
        return _ufc!!
    }

private var _ufc: ImageVector? = null
