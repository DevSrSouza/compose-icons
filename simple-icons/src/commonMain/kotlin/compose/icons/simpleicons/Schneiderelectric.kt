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

public val SimpleIcons.Schneiderelectric: ImageVector
    get() {
        if (_schneiderelectric != null) {
            return _schneiderelectric!!
        }
        _schneiderelectric = Builder(name = "Schneiderelectric", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.73f, 0.313f)
                curveToRelative(-3.56f, -0.049f, -7.797f, 1.68f, -11.288f, 5.02f)
                curveToRelative(-0.87f, 0.83f, -1.607f, 1.725f, -2.28f, 2.642f)
                horizontalLineToRelative(3.042f)
                lineTo(5.497f, 9.99f)
                lineTo(1.864f, 9.99f)
                curveToRelative(-0.346f, 0.636f, -0.672f, 1.266f, -0.922f, 1.906f)
                horizontalLineToRelative(4.307f)
                lineToRelative(-0.687f, 2.016f)
                lineTo(0.327f, 13.912f)
                curveToRelative(-0.724f, 3.079f, -0.262f, 5.953f, 1.559f, 7.777f)
                curveToRelative(3.54f, 3.538f, 11.01f, 2.292f, 16.591f, -3.048f)
                curveToRelative(0.977f, -0.93f, 1.783f, -1.931f, 2.511f, -2.96f)
                horizontalLineToRelative(-3.906f)
                lineToRelative(0.596f, -2.013f)
                horizontalLineToRelative(4.568f)
                curveToRelative(0.334f, -0.64f, 0.643f, -1.274f, 0.883f, -1.914f)
                horizontalLineToRelative(-4.992f)
                lineToRelative(0.554f, -2.01f)
                horizontalLineToRelative(5.051f)
                curveToRelative(0.623f, -2.917f, 0.132f, -5.62f, -1.638f, -7.39f)
                curveTo(20.76f, 1.01f, 18.867f, 0.34f, 16.73f, 0.312f)
                close()
                moveTo(15.686f, 5.027f)
                horizontalLineToRelative(4.968f)
                lineToRelative(-0.634f, 2.938f)
                horizontalLineToRelative(-3.002f)
                curveToRelative(-0.323f, 0.0f, -0.46f, 0.054f, -0.592f, 0.201f)
                curveToRelative(-0.05f, 0.058f, -0.07f, 0.115f, -0.09f, 0.23f)
                lineToRelative(-1.639f, 6.22f)
                curveToRelative(-0.385f, 2.179f, -3.065f, 4.359f, -6.555f, 4.359f)
                lineTo(3.288f, 18.975f)
                lineToRelative(0.842f, -3.198f)
                horizontalLineToRelative(3.119f)
                arcToRelative(0.984f, 0.984f, 0.0f, false, false, 0.775f, -0.347f)
                curveToRelative(0.076f, -0.09f, 0.177f, -0.232f, 0.19f, -0.377f)
                lineTo(9.509f, 9.62f)
                curveToRelative(0.381f, -2.182f, 2.686f, -4.592f, 6.177f, -4.592f)
                close()
            }
        }
        .build()
        return _schneiderelectric!!
    }

private var _schneiderelectric: ImageVector? = null
