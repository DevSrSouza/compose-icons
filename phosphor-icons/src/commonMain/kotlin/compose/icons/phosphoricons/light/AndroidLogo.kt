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

public val LightGroup.AndroidLogo: ImageVector
    get() {
        if (_androidLogo != null) {
            return _androidLogo!!
        }
        _androidLogo = Builder(name = "AndroidLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 156.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 174.0f, 156.0f)
                close()
                moveTo(92.0f, 146.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, false, 10.0f, 10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 92.0f, 146.0f)
                close()
                moveTo(238.0f, 168.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                lineTo(32.0f, 206.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, -14.0f)
                lineTo(18.0f, 169.1f)
                arcTo(111.0f, 111.0f, 0.0f, false, true, 54.3f, 86.8f)
                lineTo(27.8f, 60.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, 8.4f, -8.4f)
                lineTo(63.6f, 79.1f)
                arcToRelative(108.6f, 108.6f, 0.0f, false, true, 64.0f, -21.1f)
                horizontalLineToRelative(0.4f)
                arcToRelative(109.3f, 109.3f, 0.0f, false, true, 64.6f, 20.9f)
                lineToRelative(27.2f, -27.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                lineTo(201.9f, 86.6f)
                curveToRelative(1.3f, 1.1f, 2.5f, 2.3f, 3.7f, 3.5f)
                arcTo(109.1f, 109.1f, 0.0f, false, true, 238.0f, 168.0f)
                close()
                moveTo(226.0f, 168.0f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, false, -98.0f, -98.0f)
                horizontalLineToRelative(-0.3f)
                curveTo(73.8f, 70.2f, 30.0f, 114.7f, 30.0f, 169.1f)
                lineTo(30.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, 2.0f)
                lineTo(224.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _androidLogo!!
    }

private var _androidLogo: ImageVector? = null
