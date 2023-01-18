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

public val ThinGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 100.0f)
                lineTo(52.0f, 100.0f)
                verticalLineToRelative(72.0f)
                lineTo(32.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(224.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(204.0f, 172.0f)
                lineTo(204.0f, 100.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.8f, -2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.7f, -4.5f)
                lineToRelative(-104.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 0.0f)
                lineToRelative(-104.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.7f, 4.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 24.0f, 100.0f)
                close()
                moveTo(60.0f, 100.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(72.0f)
                lineTo(60.0f, 172.0f)
                close()
                moveTo(148.0f, 100.0f)
                verticalLineToRelative(72.0f)
                lineTo(108.0f, 172.0f)
                lineTo(108.0f, 100.0f)
                close()
                moveTo(196.0f, 172.0f)
                lineTo(156.0f, 172.0f)
                lineTo(156.0f, 100.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(128.0f, 36.7f)
                lineTo(217.9f, 92.0f)
                lineTo(38.1f, 92.0f)
                close()
                moveTo(244.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(16.0f, 212.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(240.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 244.0f, 208.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
