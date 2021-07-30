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

public val SimpleIcons.Codeigniter: ImageVector
    get() {
        if (_codeigniter != null) {
            return _codeigniter!!
        }
        _codeigniter = Builder(name = "Codeigniter", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.466f, 0.0f)
                curveToRelative(0.88f, 1.423f, -0.28f, 3.306f, -1.207f, 4.358f)
                curveToRelative(-0.899f, 1.02f, -1.992f, 1.873f, -2.985f, 2.8f)
                curveToRelative(-1.066f, 0.996f, -2.091f, 2.044f, -2.967f, 3.213f)
                curveToRelative(-1.753f, 2.339f, -2.827f, 5.28f, -2.038f, 8.199f)
                curveToRelative(0.788f, 2.916f, 3.314f, 4.772f, 6.167f, 5.429f)
                curveToRelative(-1.44f, -0.622f, -2.786f, -2.203f, -2.79f, -3.82f)
                curveToRelative(-0.003f, -1.765f, 1.115f, -3.262f, 2.505f, -4.246f)
                curveToRelative(-0.167f, 0.632f, -0.258f, 1.21f, 0.155f, 1.774f)
                arcToRelative(1.68f, 1.68f, 0.0f, false, false, 1.696f, 0.642f)
                curveToRelative(1.487f, -0.326f, 1.556f, -1.96f, 0.674f, -2.914f)
                curveToRelative(-0.872f, -0.943f, -1.715f, -2.009f, -1.384f, -3.377f)
                curveToRelative(0.167f, -0.685f, 0.588f, -1.328f, 1.121f, -1.787f)
                curveToRelative(-0.41f, 1.078f, 0.755f, 2.14f, 1.523f, 2.67f)
                curveToRelative(1.332f, 0.918f, 2.793f, 1.612f, 4.017f, 2.688f)
                curveToRelative(1.288f, 1.132f, 2.24f, 2.661f, 2.047f, 4.435f)
                curveToRelative(-0.208f, 1.923f, -1.736f, 3.26f, -3.45f, 3.936f)
                curveToRelative(3.622f, -0.8f, 7.365f, -3.61f, 7.44f, -7.627f)
                curveToRelative(0.093f, -3.032f, -1.903f, -5.717f, -5.158f, -7.384f)
                curveToRelative(0.19f, 0.48f, 0.074f, 0.697f, -0.058f, 0.924f)
                curveToRelative(-0.55f, 0.944f, -2.082f, 1.152f, -2.835f, 0.184f)
                curveToRelative(-1.205f, -1.548f, 0.025f, -3.216f, 0.197f, -4.855f)
                curveToRelative(0.215f, -2.055f, -1.073f, -4.049f, -2.67f, -5.242f)
                close()
            }
        }
        .build()
        return _codeigniter!!
    }

private var _codeigniter: ImageVector? = null
