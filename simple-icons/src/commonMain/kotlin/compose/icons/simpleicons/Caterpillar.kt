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

public val SimpleIcons.Caterpillar: ImageVector
    get() {
        if (_caterpillar != null) {
            return _caterpillar!!
        }
        _caterpillar = Builder(name = "Caterpillar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.901f, 11.554f)
                lineToRelative(0.802f, -4.1f)
                lineToRelative(0.798f, 4.1f)
                close()
                moveTo(14.77f, 5.034f)
                horizontalLineToRelative(-4.15f)
                lineTo(8.2f, 15.884f)
                lineToRelative(4.503f, -3.635f)
                lineToRelative(4.695f, 3.934f)
                close()
                moveTo(12.703f, 13.19f)
                lineToRelative(-7.509f, 6.072f)
                lineTo(19.95f, 19.262f)
                close()
                moveTo(24.0f, 5.02f)
                verticalLineToRelative(2.77f)
                horizontalLineToRelative(-2.066f)
                verticalLineToRelative(11.45f)
                horizontalLineToRelative(-0.882f)
                lineToRelative(-2.436f, -2.04f)
                lineTo(18.616f, 7.79f)
                horizontalLineToRelative(-2.057f)
                lineTo(16.559f, 5.02f)
                close()
                moveTo(6.872f, 16.864f)
                curveToRelative(0.548f, -0.458f, 0.642f, -1.024f, 0.642f, -1.532f)
                lineTo(7.514f, 13.2f)
                horizontalLineToRelative(-2.98f)
                verticalLineToRelative(2.894f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.748f, 0.751f)
                curveToRelative(-0.414f, 0.0f, -0.722f, -0.336f, -0.722f, -0.75f)
                lineTo(3.064f, 7.893f)
                curveToRelative(0.0f, -0.414f, 0.308f, -0.75f, 0.722f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.749f, 0.75f)
                verticalLineToRelative(2.913f)
                lineTo(7.51f, 10.806f)
                lineTo(7.51f, 7.785f)
                curveToRelative(0.0f, -1.67f, -1.092f, -3.044f, -3.75f, -3.047f)
                curveToRelative(-2.728f, 0.0f, -3.76f, 1.38f, -3.76f, 3.05f)
                verticalLineToRelative(8.563f)
                curveToRelative(0.0f, 1.655f, 1.314f, 2.907f, 2.995f, 2.907f)
                horizontalLineToRelative(0.922f)
                close()
            }
        }
        .build()
        return _caterpillar!!
    }

private var _caterpillar: ImageVector? = null
