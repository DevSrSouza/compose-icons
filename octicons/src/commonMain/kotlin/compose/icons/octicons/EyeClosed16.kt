package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.EyeClosed16: ImageVector
    get() {
        if (_eyeClosed16 != null) {
            return _eyeClosed16!!
        }
        _eyeClosed16 = Builder(name = "EyeClosed16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.143f, 2.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.047f, -0.167f)
                lineToRelative(14.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.88f, 1.214f)
                lineToRelative(-2.248f, -1.628f)
                curveTo(11.346f, 13.19f, 9.792f, 14.0f, 8.0f, 14.0f)
                curveToRelative(-1.981f, 0.0f, -3.67f, -0.992f, -4.933f, -2.078f)
                curveTo(1.797f, 10.832f, 0.88f, 9.577f, 0.43f, 8.9f)
                arcToRelative(1.619f, 1.619f, 0.0f, false, true, 0.0f, -1.797f)
                curveToRelative(0.353f, -0.533f, 0.995f, -1.42f, 1.868f, -2.305f)
                lineTo(0.31f, 3.357f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 0.143f, 2.31f)
                close()
                moveTo(1.679f, 7.932f)
                arcTo(0.12f, 0.12f, 0.0f, false, false, 1.657f, 8.0f)
                curveToRelative(0.0f, 0.021f, 0.006f, 0.045f, 0.022f, 0.068f)
                curveToRelative(0.412f, 0.621f, 1.242f, 1.75f, 2.366f, 2.717f)
                curveTo(5.175f, 11.758f, 6.527f, 12.5f, 8.0f, 12.5f)
                curveToRelative(1.195f, 0.0f, 2.31f, -0.488f, 3.29f, -1.191f)
                lineTo(9.063f, 9.695f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.058f, 7.52f)
                lineTo(3.529f, 5.688f)
                arcToRelative(14.207f, 14.207f, 0.0f, false, false, -1.85f, 2.244f)
                close()
                moveTo(8.0f, 3.5f)
                curveToRelative(-0.516f, 0.0f, -1.017f, 0.09f, -1.499f, 0.251f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.473f, -1.423f)
                arcTo(6.207f, 6.207f, 0.0f, false, true, 8.0f, 2.0f)
                curveToRelative(1.981f, 0.0f, 3.67f, 0.992f, 4.933f, 2.078f)
                curveToRelative(1.27f, 1.091f, 2.187f, 2.345f, 2.637f, 3.023f)
                arcToRelative(1.62f, 1.62f, 0.0f, false, true, 0.0f, 1.798f)
                curveToRelative(-0.11f, 0.166f, -0.248f, 0.365f, -0.41f, 0.587f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.21f, -0.887f)
                curveToRelative(0.148f, -0.201f, 0.272f, -0.382f, 0.371f, -0.53f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, false, 0.0f, -0.137f)
                curveToRelative(-0.412f, -0.621f, -1.242f, -1.75f, -2.366f, -2.717f)
                curveTo(10.825f, 4.242f, 9.473f, 3.5f, 8.0f, 3.5f)
                close()
            }
        }
        .build()
        return _eyeClosed16!!
    }

private var _eyeClosed16: ImageVector? = null
