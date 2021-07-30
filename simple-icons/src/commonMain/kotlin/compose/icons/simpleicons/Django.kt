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

public val SimpleIcons.Django: ImageVector
    get() {
        if (_django != null) {
            return _django!!
        }
        _django = Builder(name = "Django", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.146f, 0.0f)
                horizontalLineToRelative(3.924f)
                verticalLineToRelative(18.166f)
                curveToRelative(-2.013f, 0.382f, -3.491f, 0.535f, -5.096f, 0.535f)
                curveToRelative(-4.791f, 0.0f, -7.288f, -2.166f, -7.288f, -6.32f)
                curveToRelative(0.0f, -4.002f, 2.65f, -6.6f, 6.753f, -6.6f)
                curveToRelative(0.637f, 0.0f, 1.121f, 0.05f, 1.707f, 0.203f)
                close()
                moveTo(11.146f, 9.143f)
                arcToRelative(3.894f, 3.894f, 0.0f, false, false, -1.325f, -0.204f)
                curveToRelative(-1.988f, 0.0f, -3.134f, 1.223f, -3.134f, 3.365f)
                curveToRelative(0.0f, 2.09f, 1.096f, 3.236f, 3.109f, 3.236f)
                curveToRelative(0.433f, 0.0f, 0.79f, -0.025f, 1.35f, -0.102f)
                lineTo(11.146f, 9.142f)
                close()
                moveTo(21.314f, 6.06f)
                verticalLineToRelative(9.098f)
                curveToRelative(0.0f, 3.134f, -0.229f, 4.638f, -0.917f, 5.937f)
                curveToRelative(-0.637f, 1.249f, -1.478f, 2.039f, -3.211f, 2.905f)
                lineToRelative(-3.644f, -1.733f)
                curveToRelative(1.733f, -0.815f, 2.574f, -1.53f, 3.109f, -2.625f)
                curveToRelative(0.561f, -1.121f, 0.739f, -2.421f, 0.739f, -5.835f)
                lineTo(17.39f, 6.059f)
                horizontalLineToRelative(3.924f)
                close()
                moveTo(17.39f, 0.021f)
                horizontalLineToRelative(3.924f)
                verticalLineToRelative(4.026f)
                lineTo(17.39f, 4.047f)
                close()
            }
        }
        .build()
        return _django!!
    }

private var _django: ImageVector? = null
