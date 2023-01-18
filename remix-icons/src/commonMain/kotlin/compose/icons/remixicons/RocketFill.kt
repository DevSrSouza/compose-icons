package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.RocketFill: ImageVector
    get() {
        if (_rocketFill != null) {
            return _rocketFill!!
        }
        _rocketFill = Builder(name = "RocketFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.33f, 15.929f)
                arcTo(13.064f, 13.064f, 0.0f, false, true, 5.0f, 13.0f)
                curveToRelative(0.0f, -5.088f, 2.903f, -9.436f, 7.0f, -11.182f)
                curveTo(16.097f, 3.564f, 19.0f, 7.912f, 19.0f, 13.0f)
                curveToRelative(0.0f, 1.01f, -0.114f, 1.991f, -0.33f, 2.929f)
                lineToRelative(2.02f, 1.796f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.097f, 0.63f)
                lineToRelative(-2.458f, 4.096f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.782f, 0.096f)
                lineToRelative(-2.254f, -2.254f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, -0.293f)
                horizontalLineTo(9.414f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.707f, 0.293f)
                lineToRelative(-2.254f, 2.254f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.782f, -0.096f)
                lineToRelative(-2.458f, -4.095f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, 0.097f, -0.631f)
                lineToRelative(2.02f, -1.796f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _rocketFill!!
    }

private var _rocketFill: ImageVector? = null
