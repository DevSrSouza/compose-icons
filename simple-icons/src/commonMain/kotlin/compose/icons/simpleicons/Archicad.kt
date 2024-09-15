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

public val SimpleIcons.Archicad: ImageVector
    get() {
        if (_archicad != null) {
            return _archicad!!
        }
        _archicad = Builder(name = "Archicad", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.59f, 16.322f)
                curveToRelative(-0.779f, 0.0f, -1.41f, -0.632f, -1.41f, -1.411f)
                curveToRelative(0.0f, -0.779f, 0.631f, -1.41f, 1.41f, -1.41f)
                reflectiveCurveTo(24.0f, 14.133f, 24.0f, 14.912f)
                curveToRelative(0.0f, 0.779f, -0.632f, 1.411f, -1.41f, 1.411f)
                close()
                moveTo(0.151f, 19.827f)
                curveToRelative(-0.35f, 0.696f, -0.07f, 1.544f, 0.626f, 1.894f)
                curveToRelative(0.696f, 0.35f, 1.544f, 0.069f, 1.894f, -0.626f)
                curveToRelative(0.0f, 0.0f, 7.849f, -16.011f, 14.255f, -16.149f)
                curveToRelative(4.23f, -0.091f, 4.231f, 5.642f, 4.231f, 5.642f)
                curveToRelative(0.0f, 0.779f, 0.631f, 1.41f, 1.41f, 1.41f)
                reflectiveCurveToRelative(1.41f, -0.631f, 1.41f, -1.41f)
                curveToRelative(0.0f, 0.0f, 0.057f, -8.381f, -7.02f, -8.457f)
                curveTo(8.763f, 1.871f, 0.151f, 19.827f, 0.151f, 19.827f)
                close()
            }
        }
        .build()
        return _archicad!!
    }

private var _archicad: ImageVector? = null
