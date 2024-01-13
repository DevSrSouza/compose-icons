package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Pin16: ImageVector
    get() {
        if (_pin16 != null) {
            return _pin16!!
        }
        _pin16 = Builder(name = "Pin16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(11.294f, 0.984f)
                lineToRelative(3.722f, 3.722f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.504f, 2.826f)
                lineToRelative(-1.327f, 0.613f)
                arcToRelative(3.089f, 3.089f, 0.0f, false, false, -1.707f, 2.084f)
                lineToRelative(-0.584f, 2.454f)
                curveToRelative(-0.317f, 1.332f, -1.972f, 1.8f, -2.94f, 0.832f)
                lineTo(5.75f, 11.311f)
                lineTo(1.78f, 15.28f)
                arcToRelative(0.749f, 0.749f, 0.0f, true, true, -1.06f, -1.06f)
                lineToRelative(3.969f, -3.97f)
                lineToRelative(-2.204f, -2.204f)
                curveToRelative(-0.968f, -0.968f, -0.5f, -2.623f, 0.832f, -2.94f)
                lineToRelative(2.454f, -0.584f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 2.084f, -1.707f)
                lineToRelative(0.613f, -1.327f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.826f, -0.504f)
                close()
                moveTo(6.283f, 9.723f)
                lineToRelative(2.732f, 2.731f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.42f, -0.119f)
                lineToRelative(0.584f, -2.454f)
                arcToRelative(4.586f, 4.586f, 0.0f, false, true, 2.537f, -3.098f)
                lineToRelative(1.328f, -0.613f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.072f, -0.404f)
                lineToRelative(-3.722f, -3.722f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.404f, 0.072f)
                lineToRelative(-0.613f, 1.328f)
                arcToRelative(4.584f, 4.584f, 0.0f, false, true, -3.098f, 2.537f)
                lineToRelative(-2.454f, 0.584f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.119f, 0.42f)
                lineToRelative(2.731f, 2.732f)
                close()
            }
        }
        .build()
        return _pin16!!
    }

private var _pin16: ImageVector? = null
