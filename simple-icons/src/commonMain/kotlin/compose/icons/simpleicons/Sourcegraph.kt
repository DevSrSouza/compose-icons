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

public val SimpleIcons.Sourcegraph: ImageVector
    get() {
        if (_sourcegraph != null) {
            return _sourcegraph!!
        }
        _sourcegraph = Builder(name = "Sourcegraph", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4616f, 0.0014f)
                arcToRelative(2.4132f, 2.4132f, 0.0f, false, false, -0.7215f, 0.085f)
                curveTo(7.4532f, 0.4385f, 6.695f, 1.7689f, 7.0476f, 3.0567f)
                lineToRelative(1.4312f, 5.2318f)
                lineToRelative(-5.0803f, -1.681f)
                curveTo(2.131f, 6.1881f, 0.7645f, 6.8756f, 0.3454f, 8.1437f)
                curveToRelative(-0.4188f, 1.2678f, 0.269f, 2.6354f, 1.535f, 3.0546f)
                horizontalLineToRelative(4.0E-4f)
                lineToRelative(5.8776f, 1.9448f)
                lineToRelative(-4.131f, 4.6646f)
                curveToRelative(-0.8855f, 0.9996f, -0.793f, 2.5278f, 0.2057f, 3.4135f)
                curveToRelative(0.9986f, 0.8856f, 2.5257f, 0.7932f, 3.4112f, -0.206f)
                lineToRelative(3.6032f, -4.0682f)
                lineToRelative(1.4423f, 5.273f)
                curveToRelative(0.3523f, 1.2878f, 1.6817f, 2.0462f, 2.9688f, 1.6935f)
                curveToRelative(1.288f, -0.3527f, 2.0457f, -1.6823f, 1.6932f, -2.97f)
                lineToRelative(-1.4315f, -5.2324f)
                lineToRelative(5.081f, 1.6813f)
                curveToRelative(1.267f, 0.419f, 2.6337f, -0.2685f, 3.0527f, -1.5365f)
                curveToRelative(0.42f, -1.268f, -0.2675f, -2.6354f, -1.535f, -3.055f)
                lineToRelative(-5.878f, -1.9444f)
                lineToRelative(4.1306f, -4.6643f)
                curveToRelative(0.8855f, -0.9996f, 0.793f, -2.5276f, -0.2056f, -3.4135f)
                curveToRelative(-0.999f, -0.8863f, -2.5265f, -0.7937f, -3.4113f, 0.2053f)
                verticalLineToRelative(3.0E-4f)
                lineToRelative(-3.6031f, 4.069f)
                lineToRelative(-1.4427f, -5.2737f)
                curveTo(11.4225f, 0.7336f, 10.4911f, 0.0367f, 9.4616f, 0.0014f)
                close()
            }
        }
        .build()
        return _sourcegraph!!
    }

private var _sourcegraph: ImageVector? = null
