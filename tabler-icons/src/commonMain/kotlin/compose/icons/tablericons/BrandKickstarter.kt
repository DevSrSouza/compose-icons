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

public val TablerIcons.BrandKickstarter: ImageVector
    get() {
        if (_brandKickstarter != null) {
            return _brandKickstarter!!
        }
        _brandKickstarter = Builder(name = "BrandKickstarter", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 9.0f)
                lineToRelative(2.975f, -4.65f)
                curveToRelative(0.615f, -0.9f, 1.405f, -1.35f, 2.377f, -1.35f)
                curveToRelative(0.79f, 0.0f, 1.474f, 0.286f, 2.054f, 0.858f)
                curveToRelative(0.576f, 0.574f, 0.866f, 1.256f, 0.866f, 2.054f)
                curveToRelative(0.0f, 0.588f, -0.153f, 1.109f, -0.46f, 1.559f)
                lineToRelative(-2.812f, 4.029f)
                lineToRelative(3.465f, 4.912f)
                curveToRelative(0.356f, 0.46f, 0.535f, 1.0f, 0.535f, 1.613f)
                arcToRelative(2.92f, 2.92f, 0.0f, false, true, -0.843f, 2.098f)
                curveToRelative(-0.561f, 0.584f, -1.242f, 0.877f, -2.04f, 0.877f)
                curveToRelative(-0.876f, 0.0f, -1.545f, -0.29f, -2.0f, -0.87f)
                lineToRelative(-4.112f, -5.697f)
                verticalLineToRelative(3.067f)
                curveToRelative(0.0f, 0.876f, -0.313f, 1.69f, -0.611f, 2.175f)
                curveToRelative(-0.543f, 0.883f, -1.35f, 1.325f, -2.389f, 1.325f)
                curveToRelative(-0.944f, 0.0f, -1.753f, -0.327f, -2.271f, -0.974f)
                curveToRelative(-0.486f, -0.6f, -0.729f, -1.392f, -0.729f, -2.38f)
                verticalLineToRelative(-11.371f)
                curveToRelative(0.0f, -0.934f, 0.247f, -1.706f, 0.74f, -2.313f)
                curveToRelative(0.512f, -0.641f, 1.347f, -0.962f, 2.26f, -0.962f)
                curveToRelative(0.868f, 0.0f, 1.821f, 0.321f, 2.4f, 0.962f)
                curveToRelative(0.323f, 0.356f, 0.515f, 0.714f, 0.6f, 1.08f)
                curveToRelative(0.052f, 0.224f, 0.0f, 0.643f, 0.0f, 1.26f)
                verticalLineToRelative(2.698f)
                close()
            }
        }
        .build()
        return _brandKickstarter!!
    }

private var _brandKickstarter: ImageVector? = null
