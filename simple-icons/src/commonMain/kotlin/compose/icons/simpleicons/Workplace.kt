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

public val SimpleIcons.Workplace: ImageVector
    get() {
        if (_workplace != null) {
            return _workplace!!
        }
        _workplace = Builder(name = "Workplace", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.268f, 10.541f)
                curveTo(23.268f, 4.715f, 18.544f, 0.0f, 12.728f, 0.0f)
                curveToRelative(-1.614f, 0.0f, -3.191f, 0.317f, -4.663f, 0.952f)
                arcToRelative(11.952f, 11.952f, 0.0f, false, false, -3.817f, 2.574f)
                arcToRelative(11.915f, 11.915f, 0.0f, false, false, -3.516f, 8.478f)
                arcToRelative(11.924f, 11.924f, 0.0f, false, false, 3.516f, 8.48f)
                arcToRelative(12.05f, 12.05f, 0.0f, false, false, 3.817f, 2.573f)
                curveToRelative(1.472f, 0.626f, 3.05f, 0.943f, 4.671f, 0.943f)
                curveToRelative(1.56f, 0.0f, 3.05f, -0.3f, 4.416f, -0.837f)
                lineToRelative(-0.908f, -2.292f)
                arcToRelative(9.448f, 9.448f, 0.0f, false, true, -3.508f, 0.67f)
                arcToRelative(9.481f, 9.481f, 0.0f, false, true, -6.743f, -2.794f)
                arcTo(9.481f, 9.481f, 0.0f, false, true, 3.2f, 12.004f)
                curveToRelative(0.0f, -2.547f, 0.996f, -4.944f, 2.794f, -6.742f)
                arcToRelative(9.496f, 9.496f, 0.0f, false, true, 6.743f, -2.794f)
                arcToRelative(8.072f, 8.072f, 0.0f, false, true, 6.734f, 12.524f)
                lineToRelative(-2.098f, -5.165f)
                curveToRelative(-0.308f, -0.758f, -0.679f, -1.895f, -2.071f, -1.895f)
                curveToRelative(-1.393f, 0.0f, -1.763f, 1.146f, -2.063f, 1.895f)
                lineToRelative(-1.93f, 4.769f)
                lineToRelative(-2.591f, -6.54f)
                horizontalLineTo(5.993f)
                lineToRelative(3.226f, 7.95f)
                curveToRelative(0.326f, 0.802f, 0.688f, 1.895f, 2.09f, 1.895f)
                curveToRelative(1.4f, 0.0f, 1.753f, -1.093f, 2.08f, -1.895f)
                lineToRelative(1.912f, -4.724f)
                lineToRelative(1.921f, 4.724f)
                curveToRelative(0.388f, 0.978f, 0.802f, 1.895f, 2.08f, 1.895f)
                curveToRelative(0.908f, 0.0f, 1.481f, -0.582f, 1.798f, -0.96f)
                arcToRelative(10.493f, 10.493f, 0.0f, false, false, 2.168f, -6.4f)
                close()
            }
        }
        .build()
        return _workplace!!
    }

private var _workplace: ImageVector? = null
