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

public val SimpleIcons.Soriana: ImageVector
    get() {
        if (_soriana != null) {
            return _soriana!!
        }
        _soriana = Builder(name = "Soriana", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.994f, 3.2f)
                curveToRelative(-1.16f, 0.0f, -2.772f, 0.494f, -3.94f, 2.104f)
                curveToRelative(-0.223f, 0.314f, -0.39f, 0.664f, -0.494f, 1.034f)
                arcToRelative(4.27f, 4.27f, 0.0f, false, false, 0.678f, 3.692f)
                curveToRelative(0.6f, 0.812f, 1.368f, 1.42f, 2.044f, 1.96f)
                curveToRelative(0.332f, 0.26f, 1.034f, 0.926f, 1.26f, 1.208f)
                curveToRelative(0.34f, 0.422f, 0.596f, 0.674f, 0.902f, 1.606f)
                curveToRelative(0.186f, 0.564f, 0.212f, 1.308f, 0.12f, 1.73f)
                curveTo(21.684f, 14.384f, 24.0f, 11.594f, 24.0f, 8.56f)
                curveToRelative(0.0f, -3.486f, -2.498f, -5.36f, -5.006f, -5.36f)
                moveTo(15.05f, 14.986f)
                curveToRelative(-0.886f, -1.204f, -1.908f, -1.936f, -2.754f, -2.706f)
                curveToRelative(-0.368f, -0.336f, -0.772f, -0.584f, -1.07f, -0.88f)
                curveToRelative(-1.434f, -1.424f, -2.102f, -3.18f, -1.764f, -5.34f)
                curveToRelative(0.268f, -1.692f, 1.108f, -2.806f, 2.124f, -3.622f)
                arcToRelative(7.098f, 7.098f, 0.0f, false, false, -4.278f, -1.372f)
                curveTo(3.274f, 1.066f, -0.1f, 4.31f, 0.002f, 8.306f)
                curveToRelative(0.184f, 7.22f, 9.224f, 13.37f, 12.948f, 14.628f)
                curveToRelative(1.992f, -1.02f, 3.05f, -2.928f, 3.05f, -4.884f)
                curveToRelative(0.0f, -1.426f, -0.612f, -2.6f, -0.95f, -3.064f)
            }
        }
        .build()
        return _soriana!!
    }

private var _soriana: ImageVector? = null
