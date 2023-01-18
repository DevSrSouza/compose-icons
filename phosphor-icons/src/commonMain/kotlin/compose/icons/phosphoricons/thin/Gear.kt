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

public val ThinGroup.Gear: ImageVector
    get() {
        if (_gear != null) {
            return _gear!!
        }
        _gear = Builder(name = "Gear", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 76.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, false, 52.0f, 52.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 128.0f, 76.0f)
                close()
                moveTo(128.0f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 44.0f, -44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, true, 128.0f, 172.0f)
                close()
                moveTo(231.6f, 152.8f)
                lineTo(215.9f, 131.9f)
                curveToRelative(0.1f, -2.6f, 0.0f, -5.9f, 0.0f, -7.7f)
                lineToRelative(15.7f, -21.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.7f, -3.4f)
                arcToRelative(106.4f, 106.4f, 0.0f, false, false, -10.6f, -25.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.9f, -1.9f)
                lineToRelative(-25.9f, -3.7f)
                arcToRelative(71.4f, 71.4f, 0.0f, false, false, -5.5f, -5.5f)
                lineToRelative(-3.7f, -25.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.9f, -2.9f)
                arcToRelative(109.1f, 109.1f, 0.0f, false, false, -25.5f, -10.6f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -3.5f, 0.7f)
                lineTo(131.9f, 40.1f)
                quadToRelative(-3.9f, -0.1f, -7.8f, 0.0f)
                lineTo(103.2f, 24.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -3.4f, -0.7f)
                arcTo(106.4f, 106.4f, 0.0f, false, false, 74.2f, 34.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -1.9f, 2.9f)
                lineTo(68.6f, 63.1f)
                arcToRelative(71.4f, 71.4f, 0.0f, false, false, -5.5f, 5.5f)
                lineTo(37.2f, 72.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -2.9f, 1.9f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 23.7f, 99.8f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.7f, 3.4f)
                lineToRelative(15.7f, 20.9f)
                curveToRelative(-0.1f, 2.6f, 0.0f, 5.9f, 0.0f, 7.7f)
                lineToRelative(-15.7f, 21.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, -0.7f, 3.4f)
                arcToRelative(110.6f, 110.6f, 0.0f, false, false, 10.6f, 25.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, 1.9f)
                lineToRelative(25.9f, 3.7f)
                arcToRelative(71.4f, 71.4f, 0.0f, false, false, 5.5f, 5.5f)
                lineToRelative(3.7f, 25.9f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 1.9f, 2.9f)
                arcToRelative(108.1f, 108.1f, 0.0f, false, false, 25.6f, 10.6f)
                horizontalLineToRelative(1.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.4f, -0.8f)
                lineToRelative(20.9f, -15.7f)
                horizontalLineToRelative(7.8f)
                lineToRelative(20.9f, 15.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.4f, 0.7f)
                arcToRelative(106.4f, 106.4f, 0.0f, false, false, 25.6f, -10.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 1.9f, -2.9f)
                lineToRelative(3.7f, -25.9f)
                lineToRelative(5.5f, -5.5f)
                lineToRelative(25.9f, -3.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, -1.9f)
                arcToRelative(108.1f, 108.1f, 0.0f, false, false, 10.6f, -25.6f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 231.6f, 152.8f)
                close()
                moveTo(215.7f, 176.1f)
                lineTo(190.3f, 179.7f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, -2.3f, 1.2f)
                curveToRelative(0.0f, 0.1f, -4.6f, 4.9f, -7.0f, 7.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.3f, 2.4f)
                lineToRelative(-3.6f, 25.4f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 156.0f, 224.0f)
                lineToRelative(-20.5f, -15.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.6f, -0.7f)
                horizontalLineToRelative(-9.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.6f, 0.7f)
                lineTo(100.0f, 224.0f)
                arcToRelative(97.9f, 97.9f, 0.0f, false, true, -20.1f, -8.3f)
                lineToRelative(-3.6f, -25.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -1.3f, -2.4f)
                arcToRelative(74.9f, 74.9f, 0.0f, false, true, -6.9f, -6.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -2.4f, -1.3f)
                lineToRelative(-25.4f, -3.6f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 32.0f, 156.0f)
                lineToRelative(15.4f, -20.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, 0.8f, -2.5f)
                curveToRelative(0.0f, -0.1f, -0.2f, -6.7f, -0.1f, -9.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.7f, -2.6f)
                lineTo(32.0f, 100.0f)
                arcToRelative(97.9f, 97.9f, 0.0f, false, true, 8.3f, -20.1f)
                lineToRelative(25.4f, -3.6f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 68.1f, 75.0f)
                arcTo(74.9f, 74.9f, 0.0f, false, true, 75.0f, 68.1f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.3f, -2.4f)
                lineToRelative(3.6f, -25.4f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 100.0f, 32.0f)
                lineToRelative(20.5f, 15.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.6f, 0.7f)
                curveToRelative(3.3f, -0.1f, 6.5f, -0.1f, 9.8f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.6f, -0.7f)
                lineTo(156.0f, 32.0f)
                arcToRelative(97.9f, 97.9f, 0.0f, false, true, 20.1f, 8.3f)
                lineToRelative(3.6f, 25.4f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.3f, 2.4f)
                arcToRelative(74.9f, 74.9f, 0.0f, false, true, 6.9f, 6.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.4f, 1.3f)
                lineToRelative(25.4f, 3.6f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 224.0f, 100.0f)
                lineToRelative(-15.4f, 20.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, false, -0.8f, 2.5f)
                curveToRelative(0.0f, 0.1f, 0.2f, 6.7f, 0.1f, 9.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.7f, 2.6f)
                lineTo(224.0f, 156.0f)
                arcTo(97.9f, 97.9f, 0.0f, false, true, 215.7f, 176.1f)
                close()
            }
        }
        .build()
        return _gear!!
    }

private var _gear: ImageVector? = null
