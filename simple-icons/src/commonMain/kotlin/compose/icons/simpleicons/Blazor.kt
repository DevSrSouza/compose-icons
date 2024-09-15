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

public val SimpleIcons.Blazor: ImageVector
    get() {
        if (_blazor != null) {
            return _blazor!!
        }
        _blazor = Builder(name = "Blazor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.834f, 8.101f)
                arcToRelative(13.912f, 13.912f, 0.0f, false, true, -13.642f, 11.72f)
                arcToRelative(10.105f, 10.105f, 0.0f, false, true, -1.994f, -0.121f)
                arcToRelative(6.111f, 6.111f, 0.0f, false, true, -5.082f, -5.761f)
                arcToRelative(5.934f, 5.934f, 0.0f, false, true, 11.867f, -0.084f)
                curveToRelative(0.025f, 0.984f, -0.401f, 1.846f, -1.277f, 1.871f)
                curveToRelative(-0.936f, 0.0f, -1.374f, -0.668f, -1.374f, -1.567f)
                verticalLineToRelative(-2.5f)
                arcToRelative(1.531f, 1.531f, 0.0f, false, false, -1.52f, -1.533f)
                lineTo(8.715f, 10.127f)
                arcToRelative(3.648f, 3.648f, 0.0f, true, false, 2.695f, 6.079f)
                lineToRelative(0.073f, -0.109f)
                lineToRelative(0.073f, 0.121f)
                arcToRelative(2.581f, 2.581f, 0.0f, false, false, 2.201f, 1.048f)
                arcToRelative(2.909f, 2.909f, 0.0f, false, false, 2.695f, -3.041f)
                arcToRelative(7.912f, 7.912f, 0.0f, false, false, -0.217f, -1.932f)
                arcToRelative(7.404f, 7.404f, 0.0f, false, false, -14.639f, 1.603f)
                arcToRelative(7.497f, 7.497f, 0.0f, false, false, 7.307f, 7.404f)
                reflectiveCurveToRelative(0.549f, 0.05f, 1.168f, 0.036f)
                arcToRelative(15.803f, 15.803f, 0.0f, false, false, 8.475f, -2.528f)
                curveToRelative(0.036f, -0.025f, 0.072f, 0.025f, 0.048f, 0.061f)
                arcToRelative(12.439f, 12.439f, 0.0f, false, true, -9.69f, 3.963f)
                arcTo(8.744f, 8.744f, 0.0f, false, true, 0.003f, 13.86f)
                arcToRelative(9.049f, 9.049f, 0.0f, false, true, 3.635f, -7.247f)
                arcToRelative(8.863f, 8.863f, 0.0f, false, true, 5.229f, -1.726f)
                horizontalLineToRelative(2.813f)
                arcToRelative(7.915f, 7.915f, 0.0f, false, false, 5.839f, -2.578f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, true, 0.059f, -0.034f)
                arcToRelative(0.112f, 0.112f, 0.0f, false, true, 0.119f, 0.052f)
                arcToRelative(0.113f, 0.113f, 0.0f, false, true, 0.015f, 0.067f)
                arcToRelative(7.935f, 7.935f, 0.0f, false, true, -1.227f, 3.549f)
                arcToRelative(0.108f, 0.108f, 0.0f, false, false, -0.013f, 0.061f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, false, 0.072f, 0.094f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, false, 0.062f, 0.003f)
                arcToRelative(8.505f, 8.505f, 0.0f, false, false, 5.913f, -4.876f)
                arcToRelative(0.155f, 0.155f, 0.0f, false, true, 0.055f, -0.053f)
                arcToRelative(0.15f, 0.15f, 0.0f, false, true, 0.147f, 0.0f)
                arcToRelative(0.154f, 0.154f, 0.0f, false, true, 0.055f, 0.053f)
                arcToRelative(10.779f, 10.779f, 0.0f, false, true, 1.058f, 6.875f)
                close()
                moveTo(8.895f, 11.628f)
                arcToRelative(2.188f, 2.188f, 0.0f, true, false, 2.188f, 2.188f)
                verticalLineToRelative(-2.043f)
                arcToRelative(0.158f, 0.158f, 0.0f, false, false, -0.15f, -0.15f)
                close()
            }
        }
        .build()
        return _blazor!!
    }

private var _blazor: ImageVector? = null
