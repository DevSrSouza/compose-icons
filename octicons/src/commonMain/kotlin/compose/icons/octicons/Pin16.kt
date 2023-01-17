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
                moveTo(4.456f, 0.734f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.826f, 0.504f)
                lineToRelative(0.613f, 1.327f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, 2.084f, 1.707f)
                lineToRelative(2.454f, 0.584f)
                curveToRelative(1.332f, 0.317f, 1.8f, 1.972f, 0.832f, 2.94f)
                lineTo(11.06f, 10.0f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.748f, 0.748f, 0.0f, false, true, -0.332f, 1.265f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.729f, -0.205f)
                lineTo(10.0f, 11.06f)
                lineToRelative(-2.204f, 2.205f)
                curveToRelative(-0.968f, 0.968f, -2.623f, 0.5f, -2.94f, -0.832f)
                lineToRelative(-0.584f, -2.454f)
                arcToRelative(3.08f, 3.08f, 0.0f, false, false, -1.707f, -2.084f)
                lineToRelative(-1.327f, -0.613f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.504f, -2.826f)
                close()
                moveTo(5.92f, 1.866f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.183f, -0.142f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, -0.221f, 0.07f)
                lineTo(1.794f, 5.516f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, -0.07f, 0.221f)
                curveToRelative(0.015f, 0.08f, 0.068f, 0.149f, 0.142f, 0.183f)
                lineToRelative(1.328f, 0.613f)
                arcTo(4.582f, 4.582f, 0.0f, false, true, 5.73f, 9.63f)
                lineToRelative(0.584f, 2.454f)
                arcToRelative(0.251f, 0.251f, 0.0f, false, false, 0.42f, 0.12f)
                lineToRelative(5.47f, -5.47f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.12f, -0.42f)
                lineTo(9.63f, 5.73f)
                arcToRelative(4.583f, 4.583f, 0.0f, false, true, -3.098f, -2.537f)
                close()
            }
        }
        .build()
        return _pin16!!
    }

private var _pin16: ImageVector? = null
