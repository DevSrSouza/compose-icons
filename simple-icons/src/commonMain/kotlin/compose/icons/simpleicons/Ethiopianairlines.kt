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

public val SimpleIcons.Ethiopianairlines: ImageVector
    get() {
        if (_ethiopianairlines != null) {
            return _ethiopianairlines!!
        }
        _ethiopianairlines = Builder(name = "Ethiopianairlines", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.308f, 11.603f)
                curveToRelative(2.39f, -1.456f, 4.239f, -2.53f, 4.966f, -4.355f)
                curveToRelative(1.544f, -4.17f, 0.363f, -5.865f, -1.104f, -4.564f)
                curveTo(20.293f, 4.506f, 11.478f, 13.754f, 0.195f, 20.257f)
                curveToRelative(-0.172f, 0.098f, -0.2f, 0.322f, 0.558f, 0.091f)
                curveToRelative(4.48f, -1.572f, 14.23f, -6.705f, 17.555f, -8.745f)
                close()
                moveTo(20.131f, 11.27f)
                curveToRelative(0.942f, -0.586f, 1.976f, -0.237f, 0.316f, 2.466f)
                curveToRelative(-1.126f, 1.662f, -1.905f, 2.63f, -4.92f, 3.544f)
                curveToRelative(-2.075f, 0.785f, -9.768f, 3.024f, -15.157f, 3.675f)
                curveToRelative(-0.401f, 0.033f, -0.524f, -0.114f, -0.128f, -0.246f)
                curveToRelative(5.135f, -1.306f, 17.984f, -8.21f, 19.889f, -9.44f)
                close()
                moveTo(11.154f, 21.74f)
                curveToRelative(2.204f, -0.072f, 3.862f, 0.242f, 5.725f, -1.73f)
                curveToRelative(1.95f, -2.02f, 1.72f, -3.07f, 0.544f, -2.743f)
                curveToRelative(-1.745f, 0.524f, -8.111f, 2.69f, -15.622f, 3.735f)
                curveToRelative(-0.338f, 0.046f, -0.256f, 0.226f, 0.14f, 0.25f)
                curveToRelative(5.018f, 0.474f, 6.911f, 0.51f, 9.213f, 0.488f)
                close()
            }
        }
        .build()
        return _ethiopianairlines!!
    }

private var _ethiopianairlines: ImageVector? = null
