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

public val ThinGroup.Hand: ImageVector
    get() {
        if (_hand != null) {
            return _hand!!
        }
        _hand = Builder(name = "Hand", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 44.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -16.0f, 6.1f)
                lineTo(172.0f, 36.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -47.9f, -1.8f)
                arcTo(23.8f, 23.8f, 0.0f, false, false, 108.0f, 28.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 84.0f, 52.0f)
                verticalLineToRelative(90.3f)
                lineToRelative(-14.5f, -25.0f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, -32.7f, -8.8f)
                arcToRelative(23.5f, 23.5f, 0.0f, false, false, -11.2f, 14.6f)
                arcToRelative(23.2f, 23.2f, 0.0f, false, false, 2.3f, 18.0f)
                curveTo(59.6f, 208.0f, 80.5f, 236.0f, 128.0f, 236.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, 84.0f, -84.0f)
                lineTo(212.0f, 68.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 188.0f, 44.0f)
                close()
                moveTo(204.0f, 152.0f)
                arcToRelative(76.1f, 76.1f, 0.0f, false, true, -76.0f, 76.0f)
                curveToRelative(-37.0f, 0.0f, -56.6f, -13.7f, -93.0f, -90.4f)
                verticalLineToRelative(-0.3f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 5.9f, -21.9f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 21.8f, 5.9f)
                lineToRelative(21.9f, 38.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.5f, 1.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.0f, -3.8f)
                lineTo(92.1f, 52.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(132.1f, 36.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(172.1f, 68.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _hand!!
    }

private var _hand: ImageVector? = null
