package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) {
            return _eggCrack!!
        }
        _eggCrack = Builder(name = "EggCrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                curveTo(92.9f, 20.0f, 44.0f, 86.5f, 44.0f, 152.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 168.0f, 0.0f)
                curveTo(212.0f, 86.5f, 163.1f, 20.0f, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 228.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, -76.0f)
                curveToRelative(0.0f, -28.5f, 10.0f, -59.7f, 27.3f, -85.8f)
                curveTo(94.8f, 43.0f, 113.9f, 28.0f, 128.0f, 28.0f)
                curveToRelative(11.4f, 0.0f, 26.0f, 9.8f, 39.4f, 25.8f)
                lineTo(126.8f, 99.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.9f, 3.6f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 2.5f, 2.8f)
                lineToRelative(25.6f, 10.0f)
                lineToRelative(-6.5f, 33.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.1f, 4.7f)
                horizontalLineToRelative(0.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.9f, -3.2f)
                lineToRelative(7.2f, -37.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.5f, -4.5f)
                lineToRelative(-23.4f, -9.0f)
                lineToRelative(35.8f, -39.9f)
                curveToRelative(1.5f, 1.9f, 2.9f, 3.9f, 4.3f, 6.0f)
                curveTo(194.0f, 92.3f, 204.0f, 123.5f, 204.0f, 152.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 128.0f, 228.0f)
                close()
            }
        }
        .build()
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
