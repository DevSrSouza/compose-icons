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

public val Octicons.Question16: ImageVector
    get() {
        if (_question16 != null) {
            return _question16!!
        }
        _question16 = Builder(name = "Question16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, true, false, 0.0f, 13.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, 0.0f, -13.0f)
                close()
                moveTo(0.0f, 8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 16.0f, 0.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(9.0f, 11.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(6.92f, 6.085f)
                curveToRelative(0.081f, -0.16f, 0.19f, -0.299f, 0.34f, -0.398f)
                curveToRelative(0.145f, -0.097f, 0.371f, -0.187f, 0.74f, -0.187f)
                curveToRelative(0.28f, 0.0f, 0.553f, 0.087f, 0.738f, 0.225f)
                arcTo(0.613f, 0.613f, 0.0f, false, true, 9.0f, 6.25f)
                curveToRelative(0.0f, 0.177f, -0.04f, 0.264f, -0.077f, 0.318f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, -0.277f, 0.245f)
                curveToRelative(-0.076f, 0.051f, -0.158f, 0.1f, -0.258f, 0.161f)
                lineToRelative(-0.007f, 0.004f)
                arcToRelative(7.728f, 7.728f, 0.0f, false, false, -0.313f, 0.195f)
                arcToRelative(2.416f, 2.416f, 0.0f, false, false, -0.692f, 0.661f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.248f, 0.832f)
                arcToRelative(0.956f, 0.956f, 0.0f, false, true, 0.276f, -0.245f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, 0.26f, -0.16f)
                lineToRelative(0.006f, -0.004f)
                curveToRelative(0.093f, -0.057f, 0.204f, -0.123f, 0.313f, -0.195f)
                curveToRelative(0.222f, -0.149f, 0.487f, -0.355f, 0.692f, -0.662f)
                curveToRelative(0.214f, -0.32f, 0.329f, -0.702f, 0.329f, -1.15f)
                curveToRelative(0.0f, -0.76f, -0.36f, -1.348f, -0.863f, -1.725f)
                arcTo(2.76f, 2.76f, 0.0f, false, false, 8.0f, 4.0f)
                curveToRelative(-0.631f, 0.0f, -1.155f, 0.16f, -1.572f, 0.438f)
                curveToRelative(-0.413f, 0.276f, -0.68f, 0.638f, -0.849f, 0.977f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.342f, 0.67f)
                close()
            }
        }
        .build()
        return _question16!!
    }

private var _question16: ImageVector? = null
