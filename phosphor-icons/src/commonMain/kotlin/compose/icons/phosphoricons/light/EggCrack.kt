package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.EggCrack: ImageVector
    get() {
        if (_eggCrack != null) {
            return _eggCrack!!
        }
        _eggCrack = Builder(name = "EggCrack", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.0f, 60.7f)
                curveTo(167.2f, 34.0f, 145.9f, 18.0f, 128.0f, 18.0f)
                reflectiveCurveTo(88.8f, 34.0f, 71.0f, 60.7f)
                reflectiveCurveTo(42.0f, 121.6f, 42.0f, 152.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 121.6f, 203.4f, 88.3f, 185.0f, 60.7f)
                close()
                moveTo(128.0f, 226.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, -74.0f)
                curveToRelative(0.0f, -28.1f, 9.8f, -58.9f, 27.0f, -84.7f)
                curveTo(96.1f, 44.7f, 114.6f, 30.0f, 128.0f, 30.0f)
                curveToRelative(10.5f, 0.0f, 24.1f, 9.0f, 36.8f, 23.8f)
                lineTo(125.3f, 97.7f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.3f, 9.6f)
                lineToRelative(24.2f, 9.3f)
                lineToRelative(-6.3f, 32.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.8f, 7.0f)
                horizontalLineToRelative(1.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 5.9f, -4.9f)
                lineToRelative(7.2f, -37.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.7f, -6.7f)
                lineToRelative(-20.7f, -8.0f)
                lineToRelative(32.2f, -35.9f)
                lineToRelative(2.7f, 3.9f)
                curveToRelative(17.2f, 25.8f, 27.0f, 56.6f, 27.0f, 84.7f)
                arcTo(74.1f, 74.1f, 0.0f, false, true, 128.0f, 226.0f)
                close()
            }
        }
        .build()
        return _eggCrack!!
    }

private var _eggCrack: ImageVector? = null
