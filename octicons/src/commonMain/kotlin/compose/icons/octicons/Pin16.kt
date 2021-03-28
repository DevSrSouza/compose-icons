package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(4.456f, 0.734f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.826f, 0.504f)
                lineToRelative(0.613f, 1.327f)
                arcToRelative(3.081f, 3.081f, 0.0f, false, false, 2.084f, 1.707f)
                lineToRelative(2.454f, 0.584f)
                curveToRelative(1.332f, 0.317f, 1.8f, 1.972f, 0.832f, 2.94f)
                lineTo(11.06f, 10.0f)
                lineToRelative(3.72f, 3.72f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.061f, 1.06f)
                lineTo(10.0f, 11.06f)
                lineToRelative(-2.204f, 2.205f)
                curveToRelative(-0.968f, 0.968f, -2.623f, 0.5f, -2.94f, -0.832f)
                lineToRelative(-0.584f, -2.454f)
                arcToRelative(3.081f, 3.081f, 0.0f, false, false, -1.707f, -2.084f)
                lineToRelative(-1.327f, -0.613f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, -0.504f, -2.826f)
                lineTo(4.456f, 0.734f)
                close()
                moveTo(5.92f, 1.866f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.404f, -0.072f)
                lineTo(1.794f, 5.516f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.072f, 0.404f)
                lineToRelative(1.328f, 0.613f)
                arcTo(4.582f, 4.582f, 0.0f, false, true, 5.73f, 9.63f)
                lineToRelative(0.584f, 2.454f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.42f, 0.12f)
                lineToRelative(5.47f, -5.47f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.12f, -0.42f)
                lineTo(9.63f, 5.73f)
                arcToRelative(4.581f, 4.581f, 0.0f, false, true, -3.098f, -2.537f)
                lineTo(5.92f, 1.866f)
                close()
            }
        }
        .build()
        return _pin16!!
    }

private var _pin16: ImageVector? = null
