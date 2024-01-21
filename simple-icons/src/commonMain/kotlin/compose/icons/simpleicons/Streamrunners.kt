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

public val SimpleIcons.Streamrunners: ImageVector
    get() {
        if (_streamrunners != null) {
            return _streamrunners!!
        }
        _streamrunners = Builder(name = "Streamrunners", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.572f, 12.737f)
                arcToRelative(0.854f, 0.854f, 0.0f, false, false, 0.0f, -1.48f)
                lineToRelative(-12.66f, -7.31f)
                curveToRelative(-0.695f, -0.4f, -1.51f, 0.292f, -1.225f, 1.043f)
                lineToRelative(0.98f, 2.587f)
                curveToRelative(0.106f, 0.28f, -0.1f, 0.578f, -0.4f, 0.578f)
                horizontalLineTo(7.55f)
                curveToRelative(-0.658f, 0.0f, -1.275f, 0.32f, -1.656f, 0.857f)
                lineTo(3.632f, 12.21f)
                horizontalLineToRelative(8.553f)
                curveToRelative(0.02f, 0.0f, 0.034f, 0.02f, 0.027f, 0.04f)
                curveToRelative(-0.847f, 2.253f, -1.69f, 4.508f, -2.537f, 6.761f)
                curveToRelative(-0.282f, 0.75f, 0.532f, 1.44f, 1.227f, 1.04f)
                close()
                moveTo(0.001f, 17.052f)
                arcToRelative(0.005f, 0.005f, 0.0f, false, false, 0.0f, 0.006f)
                horizontalLineToRelative(8.297f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, 0.612f, -0.452f)
                lineToRelative(0.656f, -2.134f)
                arcToRelative(0.64f, 0.64f, 0.0f, false, false, -0.613f, -0.83f)
                lineToRelative(-6.805f, 0.018f)
                arcToRelative(0.078f, 0.078f, 0.0f, false, false, -0.067f, 0.036f)
                curveTo(1.386f, 14.813f, 0.694f, 15.933f, 0.0f, 17.052f)
                close()
            }
        }
        .build()
        return _streamrunners!!
    }

private var _streamrunners: ImageVector? = null
