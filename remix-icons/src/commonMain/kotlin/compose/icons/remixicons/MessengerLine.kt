package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MessengerLine: ImageVector
    get() {
        if (_messengerLine != null) {
            return _messengerLine!!
        }
        _messengerLine = Builder(name = "MessengerLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.764f, 19.225f)
                curveToRelative(0.59f, -0.26f, 1.25f, -0.309f, 1.868f, -0.139f)
                curveToRelative(0.77f, 0.21f, 1.565f, 0.316f, 2.368f, 0.314f)
                curveToRelative(4.585f, 0.0f, 8.0f, -3.287f, 8.0f, -7.7f)
                reflectiveCurveTo(16.585f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(-8.0f, 3.287f, -8.0f, 7.7f)
                curveToRelative(0.0f, 2.27f, 0.896f, 4.272f, 2.466f, 5.676f)
                arcToRelative(2.8f, 2.8f, 0.0f, false, true, 0.942f, 2.006f)
                lineToRelative(0.356f, -0.157f)
                close()
                moveTo(12.0f, 2.0f)
                curveToRelative(5.634f, 0.0f, 10.0f, 4.127f, 10.0f, 9.7f)
                curveToRelative(0.0f, 5.573f, -4.366f, 9.7f, -10.0f, 9.7f)
                arcToRelative(10.894f, 10.894f, 0.0f, false, true, -2.895f, -0.384f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, false, -0.534f, 0.039f)
                lineToRelative(-1.984f, 0.876f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -1.123f, -0.707f)
                lineToRelative(-0.055f, -1.78f)
                arcToRelative(0.797f, 0.797f, 0.0f, false, false, -0.268f, -0.57f)
                curveTo(3.195f, 17.135f, 2.0f, 14.617f, 2.0f, 11.7f)
                curveTo(2.0f, 6.127f, 6.367f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(5.995f, 14.537f)
                lineToRelative(2.937f, -4.66f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 2.17f, -0.4f)
                lineToRelative(2.336f, 1.75f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, 0.723f, 0.0f)
                lineToRelative(3.155f, -2.396f)
                curveToRelative(0.421f, -0.319f, 0.971f, 0.185f, 0.689f, 0.633f)
                lineToRelative(-2.937f, 4.66f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, -2.17f, 0.4f)
                lineToRelative(-2.336f, -1.75f)
                arcToRelative(0.6f, 0.6f, 0.0f, false, false, -0.723f, 0.0f)
                lineToRelative(-3.155f, 2.395f)
                curveToRelative(-0.421f, 0.319f, -0.971f, -0.185f, -0.689f, -0.633f)
                close()
            }
        }
        .build()
        return _messengerLine!!
    }

private var _messengerLine: ImageVector? = null
