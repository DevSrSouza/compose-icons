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

public val SimpleIcons.Opsgenie: ImageVector
    get() {
        if (_opsgenie != null) {
            return _opsgenie!!
        }
        _opsgenie = Builder(name = "Opsgenie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 0.0f)
                arcToRelative(5.988f, 5.988f, 0.0f, true, true, 0.0f, 11.975f)
                arcToRelative(5.988f, 5.988f, 0.0f, false, true, 0.0f, -11.975f)
                close()
                moveTo(21.725f, 13.026f)
                horizontalLineToRelative(-0.03f)
                lineToRelative(-4.527f, -2.242f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.876f, 0.268f)
                arcToRelative(22.408f, 22.408f, 0.0f, false, true, -4.306f, 5.217f)
                arcToRelative(22.407f, 22.407f, 0.0f, false, true, -4.286f, -5.2f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.876f, -0.269f)
                lineToRelative(-4.535f, 2.226f)
                horizontalLineToRelative(-0.03f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.248f, 0.902f)
                arcToRelative(28.85f, 28.85f, 0.0f, false, false, 4.55f, 5.933f)
                lineToRelative(-0.002f, 0.001f)
                curveToRelative(0.024f, 0.025f, 0.05f, 0.048f, 0.075f, 0.072f)
                curveToRelative(0.335f, 0.335f, 0.676f, 0.664f, 1.027f, 0.981f)
                curveToRelative(0.081f, 0.074f, 0.165f, 0.144f, 0.247f, 0.217f)
                curveToRelative(0.315f, 0.278f, 0.632f, 0.555f, 0.96f, 0.82f)
                curveToRelative(0.144f, 0.117f, 0.295f, 0.227f, 0.441f, 0.341f)
                curveToRelative(0.277f, 0.216f, 0.552f, 0.434f, 0.837f, 0.639f)
                curveToRelative(0.44f, 0.318f, 0.888f, 0.625f, 1.346f, 0.917f)
                arcToRelative(0.963f, 0.963f, 0.0f, false, false, 1.007f, 0.017f)
                curveToRelative(0.487f, -0.312f, 0.962f, -0.64f, 1.428f, -0.98f)
                curveToRelative(0.068f, -0.05f, 0.132f, -0.103f, 0.2f, -0.153f)
                curveToRelative(0.358f, -0.266f, 0.713f, -0.537f, 1.06f, -0.82f)
                curveToRelative(0.234f, -0.19f, 0.46f, -0.39f, 0.688f, -0.588f)
                curveToRelative(0.17f, -0.147f, 0.34f, -0.291f, 0.506f, -0.442f)
                curveToRelative(0.295f, -0.268f, 0.58f, -0.545f, 0.864f, -0.825f)
                curveToRelative(0.061f, -0.06f, 0.127f, -0.118f, 0.188f, -0.179f)
                lineToRelative(-0.004f, -0.002f)
                arcToRelative(28.852f, 28.852f, 0.0f, false, false, 4.565f, -5.949f)
                arcToRelative(0.671f, 0.671f, 0.0f, false, false, -0.269f, -0.902f)
                close()
            }
        }
        .build()
        return _opsgenie!!
    }

private var _opsgenie: ImageVector? = null
