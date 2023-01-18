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

public val ThinGroup.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.8f, 61.6f)
                arcToRelative(180.2f, 180.2f, 0.0f, false, false, -209.6f, 0.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.1f, 16.2f)
                lineToRelative(97.8f, 153.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 20.2f, 0.0f)
                lineTo(235.9f, 77.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 232.8f, 61.6f)
                close()
                moveTo(62.4f, 129.5f)
                arcTo(23.8f, 23.8f, 0.0f, false, true, 84.0f, 116.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.4f, 48.0f)
                close()
                moveTo(131.4f, 227.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.8f, 0.0f)
                lineTo(89.2f, 171.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -31.6f, -49.7f)
                lineTo(42.1f, 97.5f)
                arcToRelative(139.8f, 139.8f, 0.0f, false, true, 171.8f, 0.0f)
                lineToRelative(-21.5f, 33.8f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -34.1f, 53.6f)
                close()
                moveTo(162.7f, 178.1f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 25.4f, -39.9f)
                close()
                moveTo(229.2f, 73.5f)
                lineTo(218.3f, 90.7f)
                arcToRelative(148.2f, 148.2f, 0.0f, false, false, -180.6f, 0.0f)
                lineTo(26.8f, 73.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.1f, -5.4f)
                arcToRelative(172.1f, 172.1f, 0.0f, false, true, 200.2f, 0.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 229.2f, 73.5f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
