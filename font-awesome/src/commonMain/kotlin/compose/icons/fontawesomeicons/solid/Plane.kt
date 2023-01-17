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

public val SolidGroup.Plane: ImageVector
    get() {
        if (_plane != null) {
            return _plane!!
        }
        _plane = Builder(name = "Plane", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(482.3f, 192.0f)
                curveToRelative(34.2f, 0.0f, 93.7f, 29.0f, 93.7f, 64.0f)
                curveToRelative(0.0f, 36.0f, -59.5f, 64.0f, -93.7f, 64.0f)
                lineToRelative(-116.6f, 0.0f)
                lineTo(265.2f, 495.9f)
                curveToRelative(-5.7f, 10.0f, -16.3f, 16.1f, -27.8f, 16.1f)
                lineToRelative(-56.2f, 0.0f)
                curveToRelative(-10.6f, 0.0f, -18.3f, -10.2f, -15.4f, -20.4f)
                lineToRelative(49.0f, -171.6f)
                lineTo(112.0f, 320.0f)
                lineTo(68.8f, 377.6f)
                curveToRelative(-3.0f, 4.0f, -7.8f, 6.4f, -12.8f, 6.4f)
                lineToRelative(-42.0f, 0.0f)
                curveToRelative(-7.8f, 0.0f, -14.0f, -6.3f, -14.0f, -14.0f)
                curveToRelative(0.0f, -1.3f, 0.2f, -2.6f, 0.5f, -3.9f)
                lineTo(32.0f, 256.0f)
                lineTo(0.5f, 145.9f)
                curveToRelative(-0.4f, -1.3f, -0.5f, -2.6f, -0.5f, -3.9f)
                curveToRelative(0.0f, -7.8f, 6.3f, -14.0f, 14.0f, -14.0f)
                lineToRelative(42.0f, 0.0f)
                curveToRelative(5.0f, 0.0f, 9.8f, 2.4f, 12.8f, 6.4f)
                lineTo(112.0f, 192.0f)
                lineToRelative(102.9f, 0.0f)
                lineToRelative(-49.0f, -171.6f)
                curveTo(162.9f, 10.2f, 170.6f, 0.0f, 181.2f, 0.0f)
                lineToRelative(56.2f, 0.0f)
                curveToRelative(11.5f, 0.0f, 22.1f, 6.2f, 27.8f, 16.1f)
                lineTo(365.7f, 192.0f)
                lineToRelative(116.6f, 0.0f)
                close()
            }
        }
        .build()
        return _plane!!
    }

private var _plane: ImageVector? = null
