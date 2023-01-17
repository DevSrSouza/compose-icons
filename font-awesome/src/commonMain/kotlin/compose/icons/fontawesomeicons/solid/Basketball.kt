package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Basketball: ImageVector
    get() {
        if (_basketball != null) {
            return _basketball!!
        }
        _basketball = Builder(name = "Basketball", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.6f, 64.0f)
                curveTo(119.0f, 35.5f, 158.6f, 15.0f, 202.3f, 5.6f)
                curveTo(206.0f, 19.1f, 208.0f, 33.3f, 208.0f, 48.0f)
                curveToRelative(0.0f, 38.4f, -13.5f, 73.7f, -36.1f, 101.3f)
                lineTo(86.6f, 64.0f)
                close()
                moveTo(64.0f, 86.6f)
                lineToRelative(85.2f, 85.2f)
                curveTo(121.7f, 194.5f, 86.4f, 208.0f, 48.0f, 208.0f)
                curveToRelative(-14.7f, 0.0f, -28.9f, -2.0f, -42.4f, -5.7f)
                curveTo(15.0f, 158.6f, 35.5f, 119.0f, 64.0f, 86.6f)
                close()
                moveTo(256.0f, 0.0f)
                curveToRelative(64.9f, 0.0f, 124.2f, 24.2f, 169.4f, 64.0f)
                lineTo(256.0f, 233.4f)
                lineTo(194.6f, 172.0f)
                curveTo(222.9f, 138.5f, 240.0f, 95.3f, 240.0f, 48.0f)
                curveToRelative(0.0f, -16.2f, -2.0f, -32.0f, -5.8f, -47.1f)
                curveTo(241.4f, 0.3f, 248.7f, 0.0f, 256.0f, 0.0f)
                close()
                moveTo(48.0f, 240.0f)
                curveToRelative(47.3f, 0.0f, 90.5f, -17.1f, 124.0f, -45.4f)
                lineTo(233.4f, 256.0f)
                lineTo(64.0f, 425.4f)
                curveTo(24.2f, 380.2f, 0.0f, 320.9f, 0.0f, 256.0f)
                curveToRelative(0.0f, -7.3f, 0.3f, -14.6f, 0.9f, -21.8f)
                curveTo(16.0f, 238.0f, 31.8f, 240.0f, 48.0f, 240.0f)
                close()
                moveTo(511.1f, 277.8f)
                curveTo(496.0f, 274.0f, 480.2f, 272.0f, 464.0f, 272.0f)
                curveToRelative(-47.3f, 0.0f, -90.5f, 17.1f, -124.0f, 45.4f)
                lineTo(278.6f, 256.0f)
                lineTo(448.0f, 86.6f)
                curveToRelative(39.8f, 45.1f, 64.0f, 104.4f, 64.0f, 169.4f)
                curveToRelative(0.0f, 7.3f, -0.3f, 14.6f, -0.9f, 21.8f)
                close()
                moveTo(506.4f, 309.7f)
                curveTo(497.0f, 353.4f, 476.5f, 393.0f, 448.0f, 425.4f)
                lineToRelative(-85.2f, -85.2f)
                curveTo(390.3f, 317.5f, 425.6f, 304.0f, 464.0f, 304.0f)
                curveToRelative(14.7f, 0.0f, 28.9f, 2.0f, 42.4f, 5.7f)
                close()
                moveTo(340.1f, 362.7f)
                lineTo(425.4f, 448.0f)
                curveTo(393.0f, 476.5f, 353.4f, 497.0f, 309.7f, 506.4f)
                curveTo(306.0f, 492.9f, 304.0f, 478.7f, 304.0f, 464.0f)
                curveToRelative(0.0f, -38.4f, 13.5f, -73.7f, 36.1f, -101.3f)
                close()
                moveTo(317.4f, 340.0f)
                curveTo(289.1f, 373.5f, 272.0f, 416.7f, 272.0f, 464.0f)
                curveToRelative(0.0f, 16.2f, 2.0f, 32.0f, 5.8f, 47.1f)
                curveToRelative(-7.2f, 0.6f, -14.5f, 0.9f, -21.8f, 0.9f)
                curveToRelative(-64.9f, 0.0f, -124.2f, -24.2f, -169.4f, -64.0f)
                lineTo(256.0f, 278.6f)
                lineTo(317.4f, 340.0f)
                close()
            }
        }
        .build()
        return _basketball!!
    }

private var _basketball: ImageVector? = null
