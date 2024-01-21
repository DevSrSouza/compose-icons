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

public val TablerIcons.BrandVivaldi: ImageVector
    get() {
        if (_brandVivaldi != null) {
            return _brandVivaldi!!
        }
        _brandVivaldi = Builder(name = "BrandVivaldi", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.648f, 6.808f)
                curveToRelative(-2.468f, 4.28f, -4.937f, 8.56f, -7.408f, 12.836f)
                curveToRelative(-0.397f, 0.777f, -1.366f, 1.301f, -2.24f, 1.356f)
                curveToRelative(-0.962f, 0.102f, -1.7f, -0.402f, -2.154f, -1.254f)
                curveToRelative(-1.563f, -2.684f, -3.106f, -5.374f, -4.66f, -8.064f)
                curveToRelative(-0.943f, -1.633f, -1.891f, -3.266f, -2.83f, -4.905f)
                arcToRelative(2.47f, 2.47f, 0.0f, false, true, -0.06f, -2.45f)
                arcToRelative(2.493f, 2.493f, 0.0f, false, true, 2.085f, -1.307f)
                curveToRelative(0.951f, -0.065f, 1.85f, 0.438f, 2.287f, 1.281f)
                curveToRelative(0.697f, 1.19f, 2.043f, 3.83f, 2.55f, 4.682f)
                arcToRelative(3.919f, 3.919f, 0.0f, false, false, 3.282f, 2.017f)
                curveToRelative(2.126f, 0.133f, 3.974f, -0.95f, 4.21f, -3.058f)
                curveToRelative(0.0f, -0.164f, 0.228f, -3.178f, 0.846f, -3.962f)
                curveToRelative(0.619f, -0.784f, 1.64f, -1.155f, 2.606f, -0.893f)
                arcToRelative(2.484f, 2.484f, 0.0f, false, true, 1.814f, 2.062f)
                curveToRelative(0.08f, 0.581f, -0.041f, 1.171f, -0.343f, 1.674f)
            }
        }
        .build()
        return _brandVivaldi!!
    }

private var _brandVivaldi: ImageVector? = null
