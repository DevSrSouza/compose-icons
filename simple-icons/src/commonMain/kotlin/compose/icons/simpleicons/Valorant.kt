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

public val SimpleIcons.Valorant: ImageVector
    get() {
        if (_valorant != null) {
            return _valorant!!
        }
        _valorant = Builder(name = "Valorant", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.792f, 2.152f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, false, -0.098f, 0.083f)
                curveToRelative(-3.384f, 4.23f, -6.769f, 8.46f, -10.15f, 12.69f)
                curveToRelative(-0.107f, 0.093f, -0.025f, 0.288f, 0.119f, 0.265f)
                curveToRelative(2.439f, 0.003f, 4.877f, 0.0f, 7.316f, 0.001f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, 0.552f, -0.25f)
                curveToRelative(0.774f, -0.967f, 1.55f, -1.934f, 2.324f, -2.903f)
                arcToRelative(0.72f, 0.72f, 0.0f, false, false, 0.144f, -0.49f)
                curveToRelative(-0.002f, -3.077f, 0.0f, -6.153f, -0.003f, -9.23f)
                curveToRelative(0.016f, -0.11f, -0.1f, -0.206f, -0.204f, -0.167f)
                close()
                moveTo(0.077f, 2.166f)
                curveToRelative(-0.077f, 0.038f, -0.074f, 0.132f, -0.076f, 0.205f)
                curveToRelative(0.002f, 3.074f, 0.001f, 6.15f, 0.001f, 9.225f)
                arcToRelative(0.679f, 0.679f, 0.0f, false, false, 0.158f, 0.463f)
                lineToRelative(7.64f, 9.55f)
                curveToRelative(0.12f, 0.152f, 0.308f, 0.25f, 0.505f, 0.247f)
                curveToRelative(2.455f, 0.0f, 4.91f, 0.003f, 7.365f, 0.0f)
                curveToRelative(0.142f, 0.02f, 0.222f, -0.174f, 0.116f, -0.265f)
                curveTo(10.661f, 15.176f, 5.526f, 8.766f, 0.4f, 2.35f)
                curveToRelative(-0.08f, -0.094f, -0.174f, -0.272f, -0.322f, -0.184f)
                close()
            }
        }
        .build()
        return _valorant!!
    }

private var _valorant: ImageVector? = null
