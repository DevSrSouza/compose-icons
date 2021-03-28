package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Megaphone24: ImageVector
    get() {
        if (_megaphone24 != null) {
            return _megaphone24!!
        }
        _megaphone24 = Builder(name = "Megaphone24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(22.0f, 1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.161f, -0.627f)
                curveToRelative(-0.047f, 0.03f, -0.094f, 0.057f, -0.142f, 0.085f)
                arcToRelative(9.15f, 9.15f, 0.0f, false, true, -0.49f, 0.262f)
                curveToRelative(-0.441f, 0.22f, -1.11f, 0.519f, -2.002f, 0.82f)
                curveToRelative(-1.78f, 0.6f, -4.45f, 1.21f, -7.955f, 1.21f)
                lineTo(6.5f, 3.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 5.0f, 14.293f)
                verticalLineToRelative(0.457f)
                curveToRelative(0.0f, 3.061f, 0.684f, 5.505f, 1.061f, 6.621f)
                curveToRelative(0.24f, 0.709f, 0.904f, 1.129f, 1.6f, 1.129f)
                horizontalLineToRelative(2.013f)
                curveToRelative(1.294f, 0.0f, 2.1f, -1.322f, 1.732f, -2.453f)
                curveToRelative(-0.412f, -1.268f, -0.906f, -3.268f, -0.906f, -5.547f)
                curveToRelative(0.0f, -0.03f, -0.002f, -0.06f, -0.005f, -0.088f)
                curveToRelative(3.382f, 0.028f, 5.965f, 0.644f, 7.703f, 1.251f)
                curveToRelative(0.89f, 0.312f, 1.559f, 0.62f, 2.0f, 0.849f)
                curveToRelative(0.084f, 0.043f, 0.171f, 0.096f, 0.261f, 0.15f)
                curveToRelative(0.357f, 0.214f, 0.757f, 0.455f, 1.142f, 0.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 22.0f, 16.25f)
                lineTo(22.0f, 1.75f)
                close()
                moveTo(10.5f, 12.912f)
                curveToRelative(3.564f, 0.029f, 6.313f, 0.678f, 8.193f, 1.335f)
                curveToRelative(0.737f, 0.258f, 1.34f, 0.517f, 1.807f, 0.74f)
                lineTo(20.5f, 2.993f)
                curveToRelative(-0.467f, 0.216f, -1.073f, 0.467f, -1.815f, 0.718f)
                curveToRelative(-1.878f, 0.634f, -4.624f, 1.26f, -8.185f, 1.288f)
                verticalLineToRelative(7.913f)
                close()
                moveTo(6.5f, 14.75f)
                verticalLineToRelative(-0.25f)
                lineTo(9.0f, 14.5f)
                curveToRelative(0.0f, 2.486f, 0.537f, 4.648f, 0.98f, 6.01f)
                arcToRelative(0.398f, 0.398f, 0.0f, false, true, -0.057f, 0.343f)
                curveToRelative(-0.07f, 0.104f, -0.162f, 0.147f, -0.249f, 0.147f)
                lineTo(7.661f, 21.0f)
                curveToRelative(-0.105f, 0.0f, -0.161f, -0.058f, -0.179f, -0.109f)
                curveToRelative(-0.344f, -1.018f, -0.982f, -3.294f, -0.982f, -6.141f)
                close()
                moveTo(6.5f, 5.0f)
                lineTo(9.0f, 5.0f)
                verticalLineToRelative(8.0f)
                lineTo(6.5f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _megaphone24!!
    }

private var _megaphone24: ImageVector? = null
