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

public val SimpleIcons.Playstation: ImageVector
    get() {
        if (_playstation != null) {
            return _playstation!!
        }
        _playstation = Builder(name = "Playstation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.984f, 2.596f)
                verticalLineToRelative(17.547f)
                lineToRelative(3.915f, 1.261f)
                lineTo(12.899f, 6.688f)
                curveToRelative(0.0f, -0.69f, 0.304f, -1.151f, 0.794f, -0.991f)
                curveToRelative(0.636f, 0.18f, 0.76f, 0.814f, 0.76f, 1.505f)
                verticalLineToRelative(5.875f)
                curveToRelative(2.441f, 1.193f, 4.362f, -0.002f, 4.362f, -3.152f)
                curveToRelative(0.0f, -3.237f, -1.126f, -4.675f, -4.438f, -5.827f)
                curveToRelative(-1.307f, -0.448f, -3.728f, -1.186f, -5.39f, -1.502f)
                close()
                moveTo(13.64f, 18.837f)
                lineToRelative(6.296f, -2.275f)
                curveToRelative(0.715f, -0.258f, 0.826f, -0.625f, 0.246f, -0.818f)
                curveToRelative(-0.586f, -0.192f, -1.637f, -0.139f, -2.357f, 0.123f)
                lineToRelative(-4.205f, 1.5f)
                lineTo(13.62f, 14.98f)
                lineToRelative(0.24f, -0.085f)
                reflectiveCurveToRelative(1.201f, -0.42f, 2.913f, -0.615f)
                curveToRelative(1.696f, -0.18f, 3.785f, 0.03f, 5.437f, 0.661f)
                curveToRelative(1.848f, 0.601f, 2.04f, 1.472f, 1.576f, 2.072f)
                curveToRelative(-0.465f, 0.6f, -1.622f, 1.036f, -1.622f, 1.036f)
                lineToRelative(-8.544f, 3.107f)
                lineTo(13.62f, 18.86f)
                close()
                moveTo(1.807f, 18.6f)
                curveToRelative(-1.9f, -0.545f, -2.214f, -1.668f, -1.352f, -2.32f)
                curveToRelative(0.801f, -0.586f, 2.16f, -1.052f, 2.16f, -1.052f)
                lineToRelative(5.615f, -2.013f)
                verticalLineToRelative(2.313f)
                lineTo(4.205f, 17.0f)
                curveToRelative(-0.705f, 0.271f, -0.825f, 0.632f, -0.239f, 0.826f)
                curveToRelative(0.586f, 0.195f, 1.637f, 0.15f, 2.343f, -0.12f)
                lineTo(8.247f, 17.0f)
                verticalLineToRelative(2.074f)
                curveToRelative(-0.12f, 0.03f, -0.256f, 0.044f, -0.39f, 0.073f)
                curveToRelative(-1.939f, 0.331f, -3.996f, 0.196f, -6.038f, -0.479f)
                close()
            }
        }
        .build()
        return _playstation!!
    }

private var _playstation: ImageVector? = null
