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

public val SimpleIcons.MobxStateTree: ImageVector
    get() {
        if (_mobxStateTree != null) {
            return _mobxStateTree!!
        }
        _mobxStateTree = Builder(name = "MobxStateTree", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.436f, 0.592f)
                curveToRelative(-0.533f, 0.001f, -1.073f, 0.271f, -1.432f, 0.807f)
                lineTo(0.306f, 17.553f)
                curveToRelative(-0.94f, 1.981f, 0.422f, 3.874f, 2.269f, 4.411f)
                curveToRelative(3.469f, 0.773f, 6.646f, -1.293f, 6.646f, -1.293f)
                curveToRelative(4.68f, -2.994f, 7.702f, -4.685f, 7.702f, -4.685f)
                curveToRelative(3.73f, -1.891f, 6.993f, 0.429f, 6.999f, 0.434f)
                lineTo(13.825f, 1.399f)
                curveToRelative(-0.331f, -0.54f, -0.856f, -0.808f, -1.389f, -0.807f)
                close()
                moveTo(12.44f, 2.252f)
                curveToRelative(0.419f, -0.001f, 0.833f, 0.21f, 1.093f, 0.635f)
                curveToRelative(2.466f, 3.661f, 5.269f, 7.435f, 7.629f, 11.162f)
                curveToRelative(0.0f, 0.0f, -2.252f, -1.172f, -5.19f, 0.317f)
                curveToRelative(0.0f, 0.0f, -2.379f, 1.331f, -6.062f, 3.687f)
                curveToRelative(0.0f, 0.0f, -2.499f, 1.624f, -5.229f, 1.016f)
                curveToRelative(-1.453f, -0.422f, -2.526f, -1.913f, -1.786f, -3.471f)
                lineToRelative(8.42f, -12.711f)
                curveToRelative(0.282f, -0.421f, 0.707f, -0.634f, 1.126f, -0.635f)
                close()
                moveTo(20.86f, 16.417f)
                curveToRelative(-4.035f, 0.1f, -7.536f, 3.869f, -10.387f, 4.984f)
                curveToRelative(4.335f, 5.21f, 17.314f, -0.971f, 12.454f, -4.424f)
                curveToRelative(-0.617f, -0.42f, -1.315f, -0.578f, -2.067f, -0.559f)
                close()
                moveTo(20.835f, 17.433f)
                curveToRelative(0.545f, 0.003f, 1.04f, 0.145f, 1.457f, 0.478f)
                curveToRelative(2.288f, 2.286f, -6.305f, 6.262f, -9.958f, 3.647f)
                curveToRelative(1.181f, -0.091f, 5.561f, -4.141f, 8.502f, -4.125f)
                close()
            }
        }
        .build()
        return _mobxStateTree!!
    }

private var _mobxStateTree: ImageVector? = null
