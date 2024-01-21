package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.SpiralOff: ImageVector
    get() {
        if (_spiralOff != null) {
            return _spiralOff!!
        }
        _spiralOff = Builder(name = "SpiralOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 12.057f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, false, 0.614f, 0.743f)
                curveToRelative(0.682f, 0.459f, 1.509f, 0.374f, 2.164f, -0.02f)
                moveToRelative(1.103f, -2.92f)
                arcToRelative(3.298f, 3.298f, 0.0f, false, false, -1.749f, -2.059f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -0.507f, -0.195f)
                moveToRelative(-3.385f, 0.634f)
                arcToRelative(4.154f, 4.154f, 0.0f, false, false, -1.347f, 1.646f)
                curveToRelative(-1.095f, 2.432f, 0.29f, 5.248f, 2.71f, 6.246f)
                curveToRelative(1.955f, 0.806f, 4.097f, 0.35f, 5.65f, -0.884f)
                moveToRelative(1.745f, -2.268f)
                lineToRelative(0.043f, -0.103f)
                curveToRelative(1.36f, -3.343f, -0.557f, -7.134f, -3.896f, -8.41f)
                curveToRelative(-1.593f, -0.61f, -3.27f, -0.599f, -4.79f, -0.113f)
                moveToRelative(-2.579f, 1.408f)
                arcToRelative(7.574f, 7.574f, 0.0f, false, false, -2.268f, 3.128f)
                curveToRelative(-1.63f, 4.253f, 0.823f, 9.024f, 5.082f, 10.576f)
                curveToRelative(3.211f, 1.17f, 6.676f, 0.342f, 9.124f, -1.738f)
                moveToRelative(1.869f, -2.149f)
                arcToRelative(9.354f, 9.354f, 0.0f, false, false, 1.417f, -4.516f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _spiralOff!!
    }

private var _spiralOff: ImageVector? = null
