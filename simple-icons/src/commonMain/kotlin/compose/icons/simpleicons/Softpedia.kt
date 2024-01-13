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

public val SimpleIcons.Softpedia: ImageVector
    get() {
        if (_softpedia != null) {
            return _softpedia!!
        }
        _softpedia = Builder(name = "Softpedia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.88f, 18.093f)
                verticalLineTo(24.0f)
                curveToRelative(4.526f, 0.0f, 9.959f, -0.326f, 13.765f, -1.628f)
                arcToRelative(14.698f, 14.698f, 0.0f, false, false, 2.708f, -1.23f)
                curveToRelative(1.255f, -0.752f, 2.208f, -1.668f, 2.844f, -2.763f)
                curveToRelative(0.317f, -0.533f, 0.559f, -1.107f, 0.725f, -1.709f)
                lineToRelative(0.197f, -1.723f)
                curveToRelative(0.0f, -0.63f, -0.09f, -1.23f, -0.257f, -1.819f)
                arcToRelative(6.72f, 6.72f, 0.0f, false, false, -0.696f, -1.531f)
                curveToRelative(-0.484f, -0.78f, -1.165f, -1.45f, -2.012f, -2.024f)
                arcToRelative(12.187f, 12.187f, 0.0f, false, false, -1.95f, -0.999f)
                curveToRelative(-1.722f, -0.642f, -4.38f, -1.295f, -5.356f, -1.654f)
                curveToRelative(-0.882f, -0.294f, -1.784f, -0.738f, -1.784f, -1.012f)
                horizontalLineTo(20.59f)
                verticalLineTo(0.0f)
                horizontalLineTo(10.11f)
                curveTo(7.522f, 0.0f, 5.677f, 1.148f, 4.573f, 3.46f)
                curveToRelative(-1.18f, 2.461f, -0.741f, 4.704f, 1.286f, 6.714f)
                curveToRelative(0.56f, 0.561f, 1.24f, 1.053f, 2.042f, 1.477f)
                curveToRelative(0.862f, 0.452f, 2.072f, 0.903f, 3.615f, 1.34f)
                curveToRelative(1.664f, 0.493f, 2.465f, 0.712f, 2.374f, 0.684f)
                curveToRelative(0.56f, 0.178f, 1.0f, 0.342f, 1.332f, 0.493f)
                lineToRelative(0.62f, 0.328f)
                curveToRelative(0.272f, 0.191f, 0.332f, 0.506f, 0.18f, 0.957f)
                curveToRelative(-0.165f, 0.22f, -0.437f, 0.452f, -0.8f, 0.67f)
                curveToRelative(-0.938f, 0.574f, -2.375f, 1.026f, -4.311f, 1.34f)
                curveToRelative(-2.39f, 0.424f, -5.4f, 0.63f, -9.03f, 0.63f)
                close()
            }
        }
        .build()
        return _softpedia!!
    }

private var _softpedia: ImageVector? = null
