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

public val SimpleIcons.Semanticui: ImageVector
    get() {
        if (_semanticui != null) {
            return _semanticui!!
        }
        _semanticui = Builder(name = "Semanticui", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(12.086f, 3.648f)
                arcToRelative(7.762f, 7.762f, 0.0f, false, true, 5.51f, 2.141f)
                lineToRelative(-1.818f, 2.232f)
                curveToRelative(-0.488f, -0.302f, -2.51f, -1.465f, -4.122f, -1.136f)
                curveToRelative(-1.223f, 0.25f, -1.35f, 1.088f, -1.356f, 1.162f)
                curveToRelative(-0.031f, 0.373f, 0.364f, 0.963f, 0.718f, 1.148f)
                curveToRelative(1.656f, 0.858f, 3.761f, 1.561f, 4.617f, 2.024f)
                curveToRelative(2.452f, 1.325f, 2.638f, 3.322f, 2.295f, 4.873f)
                curveToRelative(-0.902f, 4.092f, -6.821f, 4.835f, -10.516f, 2.638f)
                arcToRelative(7.119f, 7.119f, 0.0f, false, true, -1.424f, -1.097f)
                lineToRelative(2.037f, -2.442f)
                curveToRelative(0.319f, 0.189f, 0.45f, 0.408f, 1.485f, 0.955f)
                curveToRelative(2.47f, 1.308f, 4.132f, 0.398f, 4.29f, 0.292f)
                curveToRelative(0.528f, -0.356f, 0.547f, -0.957f, 0.538f, -1.155f)
                curveToRelative(-0.03f, -0.627f, -0.502f, -0.97f, -1.115f, -1.236f)
                curveToRelative(-1.01f, -0.438f, -2.7f, -1.108f, -3.87f, -1.647f)
                curveToRelative(-1.687f, -0.777f, -2.757f, -2.046f, -2.76f, -3.982f)
                curveToRelative(-0.003f, -3.209f, 2.827f, -4.261f, 3.91f, -4.547f)
                arcToRelative(6.916f, 6.916f, 0.0f, false, true, 1.58f, -0.223f)
                close()
            }
        }
        .build()
        return _semanticui!!
    }

private var _semanticui: ImageVector? = null
