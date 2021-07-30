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

public val SimpleIcons.Pixabay: ImageVector
    get() {
        if (_pixabay != null) {
            return _pixabay!!
        }
        _pixabay = Builder(name = "Pixabay", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.627f, 10.234f)
                arcToRelative(0.888f, 0.888f, 0.0f, false, true, -0.887f, -0.888f)
                lineTo(1.7f, 9.346f)
                curveToRelative(0.0f, 0.49f, -0.398f, 0.888f, -0.888f, 0.888f)
                lineTo(0.0f, 10.234f)
                verticalLineToRelative(9.447f)
                horizontalLineToRelative(15.56f)
                verticalLineToRelative(-9.447f)
                lineTo(5.64f, 10.234f)
                close()
                moveTo(4.741f, 13.03f)
                horizontalLineToRelative(-3.04f)
                verticalLineToRelative(-1.323f)
                horizontalLineToRelative(3.04f)
                verticalLineToRelative(1.323f)
                close()
                moveTo(10.085f, 18.264f)
                arcToRelative(3.271f, 3.271f, 0.0f, false, true, -3.267f, -3.269f)
                curveToRelative(0.0f, -1.802f, 1.466f, -3.193f, 3.267f, -3.193f)
                reflectiveCurveToRelative(3.267f, 1.39f, 3.267f, 3.193f)
                arcToRelative(3.271f, 3.271f, 0.0f, false, true, -3.267f, 3.269f)
                close()
                moveTo(11.841f, 14.995f)
                curveToRelative(0.0f, 0.969f, -0.788f, 1.757f, -1.756f, 1.757f)
                arcToRelative(1.759f, 1.759f, 0.0f, false, true, -1.756f, -1.757f)
                curveToRelative(0.0f, -0.969f, 0.788f, -1.757f, 1.756f, -1.757f)
                reflectiveCurveToRelative(1.756f, 0.788f, 1.756f, 1.757f)
                close()
                moveTo(24.0f, 9.501f)
                lineToRelative(-3.93f, 10.156f)
                lineToRelative(-3.164f, -1.226f)
                lineTo(16.906f, 16.7f)
                lineToRelative(2.242f, 0.869f)
                lineToRelative(2.765f, -7.146f)
                lineTo(11.55f, 6.407f)
                lineToRelative(-0.96f, 2.482f)
                horizontalLineToRelative(-1.73f)
                lineToRelative(1.769f, -4.57f)
                lineTo(24.0f, 9.501f)
                close()
            }
        }
        .build()
        return _pixabay!!
    }

private var _pixabay: ImageVector? = null
