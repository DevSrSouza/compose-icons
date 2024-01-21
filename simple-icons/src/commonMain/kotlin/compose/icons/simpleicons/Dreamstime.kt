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

public val SimpleIcons.Dreamstime: ImageVector
    get() {
        if (_dreamstime != null) {
            return _dreamstime!!
        }
        _dreamstime = Builder(name = "Dreamstime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.532f, 5.153f)
                curveTo(16.952f, -1.604f, 7.118f, -0.402f, 2.764f, 4.628f)
                curveTo(0.586f, 7.105f, -0.241f, 10.558f, 0.059f, 13.711f)
                curveToRelative(0.3f, 2.478f, 1.201f, 4.73f, 2.478f, 6.231f)
                curveToRelative(3.378f, 4.13f, 9.234f, 4.58f, 13.063f, 1.953f)
                curveToRelative(5.405f, -3.755f, 5.03f, -9.834f, 2.102f, -13.214f)
                curveToRelative(-5.255f, -6.006f, -14.264f, -0.075f, -10.885f, 6.757f)
                curveToRelative(0.825f, 1.65f, 2.7f, 2.552f, 4.429f, 2.552f)
                curveToRelative(2.402f, 0.0f, 4.279f, -2.852f, 3.153f, -4.579f)
                curveToRelative(-1.126f, -1.802f, -3.078f, 0.0f, -2.253f, 1.35f)
                curveToRelative(0.676f, 1.052f, -0.75f, 1.653f, -1.35f, 1.503f)
                curveToRelative(-1.577f, -0.376f, -2.329f, -2.553f, -1.802f, -4.354f)
                curveToRelative(0.45f, -1.577f, 2.1f, -2.628f, 3.678f, -2.553f)
                curveToRelative(2.177f, 0.15f, 4.58f, 1.877f, 4.354f, 5.63f)
                curveToRelative(-0.525f, 6.082f, -8.484f, 7.208f, -11.636f, 2.853f)
                curveToRelative(-4.955f, -6.982f, 0.9f, -16.366f, 9.835f, -13.513f)
                curveToRelative(4.58f, 1.5f, 7.958f, 6.907f, 5.855f, 12.688f)
                curveToRelative(-0.825f, 2.177f, -1.275f, 3.002f, -1.35f, 3.754f)
                curveToRelative(-0.377f, 2.777f, 8.408f, -5.856f, 1.8f, -15.617f)
                close()
            }
        }
        .build()
        return _dreamstime!!
    }

private var _dreamstime: ImageVector? = null
