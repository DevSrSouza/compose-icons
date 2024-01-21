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

public val Octicons.Strikethrough16: ImageVector
    get() {
        if (_strikethrough16 != null) {
            return _strikethrough16!!
        }
        _strikethrough16 = Builder(name = "Strikethrough16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.055f, 8.5f)
                curveToRelative(0.524f, 0.536f, 0.815f, 1.257f, 0.811f, 2.007f)
                arcToRelative(3.133f, 3.133f, 0.0f, false, true, -1.12f, 2.408f)
                curveTo(9.948f, 13.597f, 8.748f, 14.0f, 7.096f, 14.0f)
                curveToRelative(-1.706f, 0.0f, -3.104f, -0.607f, -3.902f, -1.377f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 1.042f, -1.079f)
                curveToRelative(0.48f, 0.463f, 1.487f, 0.956f, 2.86f, 0.956f)
                curveToRelative(1.422f, 0.0f, 2.232f, -0.346f, 2.676f, -0.726f)
                curveToRelative(0.435f, -0.372f, 0.594f, -0.839f, 0.594f, -1.267f)
                curveToRelative(0.0f, -0.472f, -0.208f, -0.857f, -0.647f, -1.197f)
                curveToRelative(-0.448f, -0.346f, -1.116f, -0.623f, -1.951f, -0.81f)
                horizontalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, -1.5f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.0f, 1.5f)
                close()
                moveTo(7.581f, 3.25f)
                curveToRelative(-2.036f, 0.0f, -2.778f, 1.082f, -2.778f, 1.786f)
                curveToRelative(0.0f, 0.055f, 0.002f, 0.107f, 0.006f, 0.157f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.496f, 0.114f)
                arcToRelative(3.506f, 3.506f, 0.0f, false, true, -0.01f, -0.271f)
                curveToRelative(0.0f, -1.832f, 1.75f, -3.286f, 4.278f, -3.286f)
                curveToRelative(1.418f, 0.0f, 2.721f, 0.58f, 3.514f, 1.093f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.814f, 1.26f)
                curveToRelative(-0.64f, -0.414f, -1.662f, -0.853f, -2.7f, -0.853f)
                close()
            }
        }
        .build()
        return _strikethrough16!!
    }

private var _strikethrough16: ImageVector? = null
