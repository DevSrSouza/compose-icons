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

public val Octicons.Strikethrough16: ImageVector
    get() {
        if (_strikethrough16 != null) {
            return _strikethrough16!!
        }
        _strikethrough16 = Builder(name = "Strikethrough16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.581f, 3.25f)
                curveToRelative(-2.036f, 0.0f, -2.778f, 1.082f, -2.778f, 1.786f)
                curveToRelative(0.0f, 0.055f, 0.002f, 0.107f, 0.006f, 0.157f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.496f, 0.114f)
                arcToRelative(3.56f, 3.56f, 0.0f, false, true, -0.01f, -0.271f)
                curveToRelative(0.0f, -1.832f, 1.75f, -3.286f, 4.278f, -3.286f)
                curveToRelative(1.418f, 0.0f, 2.721f, 0.58f, 3.514f, 1.093f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.814f, 1.26f)
                curveToRelative(-0.64f, -0.414f, -1.662f, -0.853f, -2.7f, -0.853f)
                close()
                moveTo(11.055f, 8.5f)
                horizontalLineToRelative(3.195f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                lineTo(1.75f, 7.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(6.018f)
                curveToRelative(0.835f, 0.187f, 1.503f, 0.464f, 1.951f, 0.81f)
                curveToRelative(0.439f, 0.34f, 0.647f, 0.725f, 0.647f, 1.197f)
                curveToRelative(0.0f, 0.428f, -0.159f, 0.895f, -0.594f, 1.267f)
                curveToRelative(-0.444f, 0.38f, -1.254f, 0.726f, -2.676f, 0.726f)
                curveToRelative(-1.373f, 0.0f, -2.38f, -0.493f, -2.86f, -0.956f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.042f, 1.079f)
                curveTo(3.992f, 13.393f, 5.39f, 14.0f, 7.096f, 14.0f)
                curveToRelative(1.652f, 0.0f, 2.852f, -0.403f, 3.65f, -1.085f)
                arcToRelative(3.134f, 3.134f, 0.0f, false, false, 1.12f, -2.408f)
                arcToRelative(2.85f, 2.85f, 0.0f, false, false, -0.811f, -2.007f)
                close()
            }
        }
        .build()
        return _strikethrough16!!
    }

private var _strikethrough16: ImageVector? = null
