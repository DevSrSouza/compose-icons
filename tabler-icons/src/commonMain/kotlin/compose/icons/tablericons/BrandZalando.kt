package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandZalando: ImageVector
    get() {
        if (_brandZalando != null) {
            return _brandZalando!!
        }
        _brandZalando = Builder(name = "BrandZalando", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.531f, 21.0f)
                curveToRelative(-0.65f, 0.0f, -1.0f, -0.15f, -1.196f, -0.27f)
                curveToRelative(-0.266f, -0.157f, -0.753f, -0.563f, -1.197f, -1.747f)
                arcToRelative(20.583f, 20.583f, 0.0f, false, true, -1.137f, -6.983f)
                curveToRelative(0.015f, -2.745f, 0.436f, -5.07f, 1.137f, -6.975f)
                curveToRelative(0.444f, -1.2f, 0.93f, -1.605f, 1.197f, -1.763f)
                curveToRelative(0.192f, -0.103f, 0.545f, -0.262f, 1.195f, -0.262f)
                curveToRelative(0.244f, 0.0f, 0.532f, 0.022f, 0.871f, 0.075f)
                arcToRelative(19.093f, 19.093f, 0.0f, false, true, 6.425f, 2.475f)
                horizontalLineToRelative(0.007f)
                arcToRelative(19.572f, 19.572f, 0.0f, false, true, 5.287f, 4.508f)
                curveToRelative(0.783f, 0.99f, 0.879f, 1.627f, 0.879f, 1.942f)
                curveToRelative(0.0f, 0.315f, -0.096f, 0.953f, -0.879f, 1.943f)
                arcToRelative(19.571f, 19.571f, 0.0f, false, true, -5.287f, 4.5f)
                horizontalLineToRelative(-0.007f)
                arcToRelative(19.041f, 19.041f, 0.0f, false, true, -6.425f, 2.474f)
                arcToRelative(5.01f, 5.01f, 0.0f, false, true, -0.871f, 0.083f)
                close()
            }
        }
        .build()
        return _brandZalando!!
    }

private var _brandZalando: ImageVector? = null
