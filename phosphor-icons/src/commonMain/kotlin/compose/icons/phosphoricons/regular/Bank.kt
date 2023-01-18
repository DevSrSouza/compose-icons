package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Bank: ImageVector
    get() {
        if (_bank != null) {
            return _bank!!
        }
        _bank = Builder(name = "Bank", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 104.0f)
                lineTo(48.0f, 104.0f)
                verticalLineToRelative(64.0f)
                lineTo(32.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(224.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(208.0f, 168.0f)
                lineTo(208.0f, 104.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, -14.8f)
                lineToRelative(-104.0f, -64.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -8.4f, 0.0f)
                lineToRelative(-104.0f, 64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 24.0f, 104.0f)
                close()
                moveTo(64.0f, 104.0f)
                lineTo(96.0f, 104.0f)
                verticalLineToRelative(64.0f)
                lineTo(64.0f, 168.0f)
                close()
                moveTo(144.0f, 104.0f)
                verticalLineToRelative(64.0f)
                lineTo(112.0f, 168.0f)
                lineTo(112.0f, 104.0f)
                close()
                moveTo(192.0f, 168.0f)
                lineTo(160.0f, 168.0f)
                lineTo(160.0f, 104.0f)
                horizontalLineToRelative(32.0f)
                close()
                moveTo(128.0f, 41.4f)
                lineTo(203.7f, 88.0f)
                lineTo(52.3f, 88.0f)
                close()
                moveTo(248.0f, 208.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(16.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                lineTo(240.0f, 200.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 248.0f, 208.0f)
                close()
            }
        }
        .build()
        return _bank!!
    }

private var _bank: ImageVector? = null
