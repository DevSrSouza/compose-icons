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

public val SimpleIcons.Tata: ImageVector
    get() {
        if (_tata != null) {
            return _tata!!
        }
        _tata = Builder(name = "Tata", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.774f, 11.568f)
                curveToRelative(0.193f, -1.322f, 0.168f, -2.013f, -1.768f, -1.906f)
                curveToRelative(-2.223f, 0.124f, -4.476f, 0.265f, -7.849f, 1.027f)
                arcTo(5.63f, 5.63f, 0.0f, false, false, 0.0f, 12.0f)
                curveToRelative(0.0f, 1.52f, 0.618f, 2.99f, 1.787f, 4.254f)
                curveToRelative(1.06f, 1.144f, 2.556f, 2.095f, 4.326f, 2.752f)
                arcToRelative(15.48f, 15.48f, 0.0f, false, false, 2.014f, 0.588f)
                curveToRelative(0.13f, -0.527f, 0.959f, -3.907f, 1.616f, -7.823f)
                lineToRelative(0.03f, -0.202f)
                moveToRelative(14.07f, -0.88f)
                curveToRelative(-3.372f, -0.762f, -5.624f, -0.902f, -7.846f, -1.026f)
                curveToRelative(-1.937f, -0.107f, -1.962f, 0.584f, -1.768f, 1.906f)
                lineToRelative(0.046f, 0.298f)
                curveToRelative(0.65f, 3.848f, 1.458f, 7.16f, 1.598f, 7.72f)
                curveTo(20.595f, 18.508f, 24.0f, 15.516f, 24.0f, 12.0f)
                curveToRelative(0.0f, -0.443f, -0.054f, -0.88f, -0.157f, -1.311f)
                moveToRelative(-0.491f, -1.324f)
                arcToRelative(7.163f, 7.163f, 0.0f, false, false, -1.14f, -1.618f)
                curveToRelative(-1.06f, -1.144f, -2.555f, -2.095f, -4.325f, -2.752f)
                curveToRelative(-1.784f, -0.662f, -3.82f, -1.011f, -5.887f, -1.011f)
                curveToRelative(-2.068f, 0.0f, -4.103f, 0.35f, -5.887f, 1.01f)
                curveToRelative(-1.77f, 0.658f, -3.266f, 1.61f, -4.326f, 2.753f)
                arcTo(7.17f, 7.17f, 0.0f, false, false, 0.648f, 9.366f)
                curveToRelative(2.304f, -0.557f, 6.245f, -1.293f, 9.904f, -1.37f)
                curveToRelative(0.353f, -0.008f, 0.596f, 0.105f, 0.756f, 0.307f)
                curveToRelative(0.196f, 0.248f, 0.18f, 1.128f, 0.175f, 1.522f)
                lineToRelative(-0.104f, 10.18f)
                arcToRelative(18.507f, 18.507f, 0.0f, false, false, 1.244f, 0.0f)
                lineToRelative(-0.104f, -10.18f)
                curveToRelative(-0.005f, -0.394f, -0.02f, -1.274f, 0.175f, -1.522f)
                curveToRelative(0.16f, -0.202f, 0.403f, -0.315f, 0.756f, -0.308f)
                curveToRelative(3.658f, 0.078f, 7.597f, 0.813f, 9.902f, 1.37f)
                close()
            }
        }
        .build()
        return _tata!!
    }

private var _tata: ImageVector? = null
