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

public val SimpleIcons.Doi: ImageVector
    get() {
        if (_doi != null) {
            return _doi!!
        }
        _doi = Builder(name = "Doi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 12.0f)
                curveToRelative(0.0f, 6.633f, -5.367f, 12.0f, -12.0f, 12.0f)
                reflectiveCurveTo(0.0f, 18.633f, 0.0f, 12.0f)
                reflectiveCurveTo(5.367f, 0.0f, 12.0f, 0.0f)
                reflectiveCurveToRelative(12.0f, 5.367f, 12.0f, 12.0f)
                close()
                moveTo(7.588f, 6.097f)
                verticalLineToRelative(4.471f)
                curveToRelative(-0.663f, -0.925f, -1.403f, -1.373f, -2.406f, -1.373f)
                curveToRelative(-2.046f, 0.0f, -3.244f, 1.441f, -3.244f, 3.847f)
                curveToRelative(0.0f, 2.357f, 1.325f, 3.848f, 3.166f, 3.848f)
                curveToRelative(1.12f, 0.0f, 1.88f, -0.4f, 2.445f, -1.325f)
                lineToRelative(-0.039f, 1.042f)
                horizontalLineToRelative(2.045f)
                lineTo(9.555f, 6.097f)
                close()
                moveTo(5.825f, 15.039f)
                curveToRelative(-1.12f, 0.0f, -1.802f, -0.76f, -1.802f, -2.045f)
                curveToRelative(0.0f, -1.325f, 0.682f, -2.085f, 1.802f, -2.085f)
                curveToRelative(1.081f, 0.0f, 1.802f, 0.76f, 1.802f, 2.085f)
                curveToRelative(0.0f, 1.285f, -0.672f, 2.045f, -1.802f, 2.045f)
                close()
                moveTo(18.078f, 13.091f)
                curveToRelative(0.0f, -2.172f, -1.578f, -3.789f, -3.906f, -3.789f)
                curveToRelative(-2.328f, 0.0f, -3.945f, 1.695f, -3.945f, 3.789f)
                curveToRelative(0.0f, 2.133f, 1.578f, 3.789f, 3.945f, 3.789f)
                curveToRelative(2.289f, 0.0f, 3.906f, -1.656f, 3.906f, -3.789f)
                close()
                moveTo(15.984f, 13.081f)
                curveToRelative(0.0f, 1.14f, -0.711f, 1.89f, -1.851f, 1.89f)
                curveToRelative(-1.139f, 0.0f, -1.851f, -0.75f, -1.851f, -1.89f)
                curveToRelative(0.0f, -1.139f, 0.712f, -1.89f, 1.851f, -1.89f)
                curveToRelative(1.149f, 0.0f, 1.861f, 0.751f, 1.851f, 1.89f)
                close()
                moveTo(18.584f, 7.286f)
                curveToRelative(0.0f, 0.633f, 0.517f, 1.227f, 1.189f, 1.227f)
                curveToRelative(0.633f, 0.0f, 1.188f, -0.555f, 1.188f, -1.227f)
                arcToRelative(1.17f, 1.17f, 0.0f, false, false, -1.188f, -1.189f)
                curveToRelative(-0.672f, 0.0f, -1.179f, 0.556f, -1.189f, 1.189f)
                close()
                moveTo(18.75f, 16.627f)
                horizontalLineToRelative(2.055f)
                lineTo(20.805f, 9.604f)
                lineTo(18.75f, 9.604f)
                close()
            }
        }
        .build()
        return _doi!!
    }

private var _doi: ImageVector? = null
