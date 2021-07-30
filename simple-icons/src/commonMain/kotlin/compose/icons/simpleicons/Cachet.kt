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

public val SimpleIcons.Cachet: ImageVector
    get() {
        if (_cachet != null) {
            return _cachet!!
        }
        _cachet = Builder(name = "Cachet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.746f, 0.254f)
                curveTo(5.265f, 0.254f, 0.0f, 5.519f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.481f, 5.265f, 11.746f, 11.746f, 11.746f)
                curveToRelative(6.482f, 0.0f, 11.746f, -5.265f, 11.746f, -11.746f)
                curveToRelative(0.0f, -1.44f, -0.26f, -2.82f, -0.734f, -4.097f)
                lineToRelative(-0.264f, -0.709f)
                lineToRelative(-1.118f, 1.118f)
                lineToRelative(0.1f, 0.288f)
                curveToRelative(0.373f, 1.064f, 0.575f, 2.207f, 0.575f, 3.4f)
                arcToRelative(10.297f, 10.297f, 0.0f, false, true, -10.305f, 10.305f)
                arcTo(10.297f, 10.297f, 0.0f, false, true, 1.441f, 12.0f)
                arcTo(10.297f, 10.297f, 0.0f, false, true, 11.746f, 1.695f)
                curveToRelative(1.817f, 0.0f, 3.52f, 0.47f, 5.002f, 1.293f)
                lineToRelative(0.32f, 0.178f)
                lineToRelative(1.054f, -1.053f)
                lineToRelative(-0.553f, -0.316f)
                arcTo(11.699f, 11.699f, 0.0f, false, false, 11.746f, 0.254f)
                close()
                moveTo(22.97f, 0.841f)
                lineToRelative(-13.92f, 13.92f)
                lineToRelative(-3.722f, -3.721f)
                lineToRelative(-1.031f, 1.03f)
                lineToRelative(4.752f, 4.753f)
                lineTo(24.0f, 1.872f)
                close()
            }
        }
        .build()
        return _cachet!!
    }

private var _cachet: ImageVector? = null
