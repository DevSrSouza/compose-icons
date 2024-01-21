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

public val SimpleIcons.Conan: ImageVector
    get() {
        if (_conan != null) {
            return _conan!!
        }
        _conan = Builder(name = "Conan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.709f, 0.0f)
                lineTo(0.0f, 5.534f)
                lineTo(0.0f, 16.76f)
                lineTo(11.984f, 24.0f)
                lineToRelative(4.857f, -2.706f)
                lineTo(16.841f, 9.998f)
                curveToRelative(0.13f, -0.084f, 0.275f, -0.196f, 0.399f, -0.27f)
                lineToRelative(0.032f, -0.017f)
                curveToRelative(0.197f, -0.11f, 0.329f, -0.102f, 0.23f, 0.33f)
                verticalLineToRelative(10.884f)
                lineToRelative(6.466f, -3.603f)
                lineTo(23.968f, 6.11f)
                lineTo(24.0f, 6.093f)
                close()
                moveTo(12.624f, 2.83f)
                curveToRelative(0.932f, 0.02f, 1.855f, 0.191f, 2.706f, 0.552f)
                curveToRelative(1.32f, 0.533f, 2.522f, 1.364f, 3.45f, 2.429f)
                arcToRelative(62.814f, 62.814f, 0.0f, false, true, -3.044f, 1.616f)
                curveToRelative(0.56f, -0.853f, 0.14f, -2.009f, -0.76f, -2.455f)
                curveToRelative(-0.93f, -0.648f, -2.093f, -0.73f, -3.205f, -0.674f)
                curveToRelative(-1.064f, 0.175f, -2.258f, 0.51f, -2.893f, 1.474f)
                curveToRelative(-0.722f, 0.862f, -0.084f, 2.11f, 0.914f, 2.408f)
                curveToRelative(1.2f, 0.509f, 2.543f, 0.38f, 3.806f, 0.413f)
                curveToRelative(-0.975f, 0.457f, -1.931f, 0.97f, -2.927f, 1.358f)
                curveToRelative(-1.701f, -0.176f, -3.585f, -0.917f, -4.374f, -2.51f)
                curveToRelative(-0.574f, -1.178f, 0.215f, -2.572f, 1.319f, -3.14f)
                arcToRelative(11.426f, 11.426f, 0.0f, false, true, 3.336f, -1.348f)
                arcToRelative(9.212f, 9.212f, 0.0f, false, true, 1.672f, -0.123f)
                close()
            }
        }
        .build()
        return _conan!!
    }

private var _conan: ImageVector? = null
