package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 0.0f)
                curveToRelative(-29.9f, 0.0f, -54.7f, 20.5f, -61.8f, 48.2f)
                curveToRelative(-0.8f, 0.0f, -1.4f, -0.2f, -2.2f, -0.2f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                curveToRelative(0.0f, 4.8f, 0.6f, 9.5f, 1.7f, 14.0f)
                curveTo(52.5f, 138.0f, 32.0f, 166.6f, 32.0f, 200.0f)
                curveToRelative(0.0f, 12.6f, 3.2f, 24.3f, 8.3f, 34.9f)
                curveTo(16.3f, 248.7f, 0.0f, 274.3f, 0.0f, 304.0f)
                curveToRelative(0.0f, 33.3f, 20.4f, 61.9f, 49.4f, 73.9f)
                curveToRelative(-0.9f, 4.6f, -1.4f, 9.3f, -1.4f, 14.1f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                curveToRelative(4.1f, 0.0f, 8.1f, -0.5f, 12.0f, -1.2f)
                curveToRelative(9.6f, 28.5f, 36.2f, 49.2f, 68.0f, 49.2f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                lineTo(272.0f, 64.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                close()
                moveTo(576.0f, 304.0f)
                curveToRelative(0.0f, -29.7f, -16.3f, -55.3f, -40.3f, -69.1f)
                curveToRelative(5.2f, -10.6f, 8.3f, -22.3f, 8.3f, -34.9f)
                curveToRelative(0.0f, -33.4f, -20.5f, -62.0f, -49.7f, -74.0f)
                curveToRelative(1.0f, -4.5f, 1.7f, -9.2f, 1.7f, -14.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                curveToRelative(-0.8f, 0.0f, -1.5f, 0.2f, -2.2f, 0.2f)
                curveTo(422.7f, 20.5f, 397.9f, 0.0f, 368.0f, 0.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.6f, -64.0f, 64.0f)
                verticalLineToRelative(376.0f)
                curveToRelative(0.0f, 39.8f, 32.2f, 72.0f, 72.0f, 72.0f)
                curveToRelative(31.8f, 0.0f, 58.4f, -20.7f, 68.0f, -49.2f)
                curveToRelative(3.9f, 0.7f, 7.9f, 1.2f, 12.0f, 1.2f)
                curveToRelative(39.8f, 0.0f, 72.0f, -32.2f, 72.0f, -72.0f)
                curveToRelative(0.0f, -4.8f, -0.5f, -9.5f, -1.4f, -14.1f)
                curveToRelative(29.0f, -12.0f, 49.4f, -40.6f, 49.4f, -73.9f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
