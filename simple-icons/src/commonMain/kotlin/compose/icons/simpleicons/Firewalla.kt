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

public val SimpleIcons.Firewalla: ImageVector
    get() {
        if (_firewalla != null) {
            return _firewalla!!
        }
        _firewalla = Builder(name = "Firewalla", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.156f, 0.0f)
                curveToRelative(-3.602f, 4.89f, 0.391f, 7.768f, 2.61f, 11.893f)
                curveToRelative(-0.751f, 1.527f, -1.745f, 3.08f, -2.733f, 4.836f)
                lineToRelative(-0.072f, 0.025f)
                curveToRelative(-0.849f, -0.983f, -1.99f, -1.85f, -3.033f, -2.967f)
                curveToRelative(2.606f, -5.783f, -0.809f, -9.812f, -0.809f, -9.812f)
                arcToRelative(12.555f, 12.555f, 0.0f, false, false, -1.916f, 2.021f)
                curveToRelative(-2.296f, 3.06f, -2.027f, 5.897f, -2.027f, 5.897f)
                curveTo(4.176f, 19.07f, 12.125f, 24.0f, 12.125f, 24.0f)
                arcToRelative(21.738f, 21.738f, 0.0f, false, false, 2.139f, -1.594f)
                curveToRelative(5.864f, -4.974f, 5.564f, -10.513f, 5.564f, -10.513f)
                curveToRelative(0.122f, -4.308f, -1.622f, -5.905f, -4.82f, -9.014f)
                arcTo(83.864f, 83.864f, 0.0f, false, true, 12.156f, 0.0f)
                close()
                moveTo(12.437f, 17.37f)
                close()
                moveTo(12.834f, 18.057f)
                arcToRelative(4.298f, 4.298f, 0.0f, false, true, 0.14f, 0.328f)
                arcToRelative(4.463f, 4.463f, 0.0f, false, false, -0.14f, -0.328f)
                close()
                moveTo(13.1f, 18.775f)
                arcToRelative(4.289f, 4.289f, 0.0f, false, true, 0.14f, 0.791f)
                curveToRelative(0.024f, 0.286f, 0.023f, 0.588f, -0.006f, 0.91f)
                arcToRelative(5.23f, 5.23f, 0.0f, false, false, 0.006f, -0.91f)
                arcToRelative(4.513f, 4.513f, 0.0f, false, false, -0.14f, -0.79f)
                close()
            }
        }
        .build()
        return _firewalla!!
    }

private var _firewalla: ImageVector? = null
