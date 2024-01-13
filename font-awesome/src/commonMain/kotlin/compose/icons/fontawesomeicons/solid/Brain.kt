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
        _brain = Builder(name = "Brain", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 0.0f)
                curveToRelative(30.9f, 0.0f, 56.0f, 25.1f, 56.0f, 56.0f)
                verticalLineTo(456.0f)
                curveToRelative(0.0f, 30.9f, -25.1f, 56.0f, -56.0f, 56.0f)
                curveToRelative(-28.9f, 0.0f, -52.7f, -21.9f, -55.7f, -50.1f)
                curveToRelative(-5.2f, 1.4f, -10.7f, 2.1f, -16.3f, 2.1f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                curveToRelative(0.0f, -7.4f, 1.3f, -14.6f, 3.6f, -21.2f)
                curveTo(21.4f, 367.4f, 0.0f, 338.2f, 0.0f, 304.0f)
                curveToRelative(0.0f, -31.9f, 18.7f, -59.5f, 45.8f, -72.3f)
                curveTo(37.1f, 220.8f, 32.0f, 207.0f, 32.0f, 192.0f)
                curveToRelative(0.0f, -30.7f, 21.6f, -56.3f, 50.4f, -62.6f)
                curveTo(80.8f, 123.9f, 80.0f, 118.0f, 80.0f, 112.0f)
                curveToRelative(0.0f, -29.9f, 20.6f, -55.1f, 48.3f, -62.1f)
                curveTo(131.3f, 21.9f, 155.1f, 0.0f, 184.0f, 0.0f)
                close()
                moveTo(328.0f, 0.0f)
                curveToRelative(28.9f, 0.0f, 52.6f, 21.9f, 55.7f, 49.9f)
                curveToRelative(27.8f, 7.0f, 48.3f, 32.1f, 48.3f, 62.1f)
                curveToRelative(0.0f, 6.0f, -0.8f, 11.9f, -2.4f, 17.4f)
                curveToRelative(28.8f, 6.2f, 50.4f, 31.9f, 50.4f, 62.6f)
                curveToRelative(0.0f, 15.0f, -5.1f, 28.8f, -13.8f, 39.7f)
                curveTo(493.3f, 244.5f, 512.0f, 272.1f, 512.0f, 304.0f)
                curveToRelative(0.0f, 34.2f, -21.4f, 63.4f, -51.6f, 74.8f)
                curveToRelative(2.3f, 6.6f, 3.6f, 13.8f, 3.6f, 21.2f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-5.6f, 0.0f, -11.1f, -0.7f, -16.3f, -2.1f)
                curveToRelative(-3.0f, 28.2f, -26.8f, 50.1f, -55.7f, 50.1f)
                curveToRelative(-30.9f, 0.0f, -56.0f, -25.1f, -56.0f, -56.0f)
                verticalLineTo(56.0f)
                curveToRelative(0.0f, -30.9f, 25.1f, -56.0f, 56.0f, -56.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
