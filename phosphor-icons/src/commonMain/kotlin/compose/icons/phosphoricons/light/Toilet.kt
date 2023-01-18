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

public val LightGroup.Toilet: ImageVector
    get() {
        if (_toilet != null) {
            return _toilet!!
        }
        _toilet = Builder(name = "Toilet", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(118.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 70.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 118.0f, 64.0f)
                close()
                moveTo(169.0f, 196.6f)
                lineTo(172.6f, 222.0f)
                arcToRelative(14.2f, 14.2f, 0.0f, false, true, -3.2f, 11.2f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -10.6f, 4.8f)
                lineTo(97.2f, 238.0f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, -10.6f, -4.8f)
                arcTo(14.2f, 14.2f, 0.0f, false, true, 83.4f, 222.0f)
                lineTo(87.0f, 196.6f)
                arcTo(94.3f, 94.3f, 0.0f, false, true, 34.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(58.0f, 106.0f)
                lineTo(58.0f, 40.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 72.0f, 26.0f)
                lineTo(184.0f, 26.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineToRelative(66.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                arcTo(94.3f, 94.3f, 0.0f, false, true, 169.0f, 196.6f)
                close()
                moveTo(70.0f, 106.0f)
                lineTo(186.0f, 106.0f)
                lineTo(186.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(72.0f, 38.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
                moveTo(157.5f, 201.2f)
                arcToRelative(93.1f, 93.1f, 0.0f, false, true, -59.0f, 0.0f)
                lineToRelative(-3.3f, 22.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.5f, 1.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.5f, 0.7f)
                horizontalLineToRelative(61.6f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.5f, -0.7f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.5f, -1.6f)
                close()
                moveTo(209.8f, 118.0f)
                lineTo(46.2f, 118.0f)
                arcToRelative(82.0f, 82.0f, 0.0f, false, false, 163.6f, 0.0f)
                close()
            }
        }
        .build()
        return _toilet!!
    }

private var _toilet: ImageVector? = null
