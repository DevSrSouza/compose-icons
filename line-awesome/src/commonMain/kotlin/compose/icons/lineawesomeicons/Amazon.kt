package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Amazon: ImageVector
    get() {
        if (_amazon != null) {
            return _amazon!!
        }
        _amazon = Builder(name = "Amazon", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2f, 4.0f)
                curveToRelative(-3.3f, 0.0f, -6.9f, 1.2f, -7.7f, 5.3f)
                curveTo(8.4f, 9.7f, 8.7f, 10.0f, 9.0f, 10.0f)
                lineToRelative(3.3f, 0.3f)
                curveToRelative(0.3f, 0.0f, 0.6f, -0.3f, 0.6f, -0.6f)
                curveToRelative(0.3f, -1.4f, 1.5f, -2.1f, 2.8f, -2.1f)
                curveToRelative(0.7f, 0.0f, 1.5f, 0.3f, 1.9f, 0.9f)
                curveToRelative(0.5f, 0.7f, 0.4f, 1.7f, 0.4f, 2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(-2.0f, 0.2f, -4.6f, 0.4f, -6.5f, 1.2f)
                curveToRelative(-2.2f, 0.9f, -3.7f, 2.8f, -3.7f, 5.7f)
                curveToRelative(0.0f, 3.6f, 2.3f, 5.4f, 5.2f, 5.4f)
                curveToRelative(2.5f, 0.0f, 3.8f, -0.6f, 5.7f, -2.5f)
                curveToRelative(0.6f, 0.9f, 0.9f, 1.4f, 2.0f, 2.3f)
                curveToRelative(0.3f, 0.1f, 0.6f, 0.1f, 0.8f, -0.1f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.7f, -0.6f, 2.0f, -1.7f, 2.7f, -2.3f)
                curveToRelative(0.3f, -0.2f, 0.2f, -0.6f, 0.0f, -0.9f)
                curveToRelative(-0.6f, -0.9f, -1.3f, -1.6f, -1.3f, -3.2f)
                verticalLineToRelative(-5.4f)
                curveToRelative(0.0f, -2.3f, 0.2f, -4.4f, -1.5f, -6.0f)
                curveTo(20.1f, 4.4f, 17.9f, 4.0f, 16.2f, 4.0f)
                close()
                moveTo(17.1f, 14.3f)
                curveToRelative(0.3f, 0.0f, 0.6f, 0.0f, 0.9f, 0.0f)
                verticalLineToRelative(0.8f)
                curveToRelative(0.0f, 1.3f, 0.1f, 2.5f, -0.6f, 3.7f)
                curveToRelative(-0.5f, 1.0f, -1.4f, 1.6f, -2.4f, 1.6f)
                curveToRelative(-1.3f, 0.0f, -2.1f, -1.0f, -2.1f, -2.5f)
                curveTo(12.9f, 15.2f, 14.9f, 14.5f, 17.1f, 14.3f)
                close()
                moveTo(26.7f, 22.4f)
                curveToRelative(-0.9f, 0.0f, -1.9f, 0.2f, -2.7f, 0.8f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.4f, 0.1f, 0.4f)
                curveToRelative(0.9f, -0.1f, 2.8f, -0.4f, 3.2f, 0.1f)
                reflectiveCurveToRelative(-0.4f, 2.3f, -0.7f, 3.1f)
                curveToRelative(-0.1f, 0.2f, 0.1f, 0.3f, 0.3f, 0.2f)
                curveToRelative(1.5f, -1.2f, 1.9f, -3.8f, 1.6f, -4.2f)
                curveTo(28.3f, 22.5f, 27.6f, 22.4f, 26.7f, 22.4f)
                close()
                moveTo(3.7f, 22.8f)
                curveToRelative(-0.2f, 0.0f, -0.3f, 0.3f, -0.1f, 0.4f)
                curveToRelative(3.3f, 3.0f, 7.6f, 4.7f, 12.4f, 4.7f)
                curveToRelative(3.4f, 0.0f, 7.4f, -1.1f, 10.2f, -3.1f)
                curveToRelative(0.5f, -0.3f, 0.1f, -0.9f, -0.4f, -0.7f)
                curveToRelative(-3.1f, 1.3f, -6.4f, 1.9f, -9.5f, 1.9f)
                curveToRelative(-4.5f, 0.0f, -8.8f, -1.2f, -12.4f, -3.3f)
                curveTo(3.8f, 22.9f, 3.7f, 22.8f, 3.7f, 22.8f)
                close()
            }
        }
        .build()
        return _amazon!!
    }

private var _amazon: ImageVector? = null
