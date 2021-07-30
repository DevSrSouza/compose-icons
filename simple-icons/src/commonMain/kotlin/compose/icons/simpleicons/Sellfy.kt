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

public val SimpleIcons.Sellfy: ImageVector
    get() {
        if (_sellfy != null) {
            return _sellfy!!
        }
        _sellfy = Builder(name = "Sellfy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.179f, 0.818f)
                curveTo(15.533f, -0.273f, 8.406f, -0.273f, 0.8f, 0.818f)
                curveTo(-0.266f, 8.377f, -0.266f, 15.424f, 0.8f, 22.946f)
                curveTo(4.511f, 23.491f, 8.22f, 24.0f, 12.005f, 24.0f)
                curveToRelative(3.748f, 0.0f, 7.459f, -0.51f, 11.17f, -1.017f)
                curveToRelative(1.1f, -7.56f, 1.1f, -14.607f, 0.0f, -22.165f)
                horizontalLineToRelative(0.004f)
                close()
                moveTo(11.639f, 19.132f)
                curveToRelative(-2.055f, 0.0f, -4.226f, -0.689f, -5.179f, -1.199f)
                lineToRelative(0.807f, -3.126f)
                curveToRelative(1.064f, 0.705f, 2.682f, 1.395f, 4.446f, 1.395f)
                curveToRelative(1.395f, 0.0f, 2.24f, -0.436f, 2.24f, -1.305f)
                curveToRelative(0.0f, -0.615f, -0.435f, -0.975f, -1.575f, -1.26f)
                lineToRelative(-2.279f, -0.631f)
                curveToRelative(-2.416f, -0.66f, -3.557f, -1.891f, -3.557f, -3.855f)
                curveToRelative(0.0f, -2.365f, 1.83f, -4.256f, 5.619f, -4.256f)
                curveToRelative(1.99f, 0.0f, 3.973f, 0.545f, 5.07f, 1.092f)
                lineToRelative(-0.951f, 2.976f)
                curveToRelative(-1.104f, -0.615f, -2.79f, -1.125f, -4.226f, -1.125f)
                curveToRelative(-1.365f, 0.0f, -1.95f, 0.436f, -1.95f, 1.092f)
                curveToRelative(0.0f, 0.619f, 0.404f, 0.87f, 1.291f, 1.092f)
                lineToRelative(2.488f, 0.734f)
                curveToRelative(2.566f, 0.736f, 3.707f, 1.966f, 3.707f, 3.885f)
                curveToRelative(-0.076f, 2.701f, -2.461f, 4.517f, -5.957f, 4.517f)
                lineToRelative(0.006f, -0.026f)
                close()
            }
        }
        .build()
        return _sellfy!!
    }

private var _sellfy: ImageVector? = null
