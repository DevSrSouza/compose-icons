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

public val RegularGroup.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) {
            return _trademarkRegistered!!
        }
        _trademarkRegistered = Builder(name = "TrademarkRegistered", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(168.0f, 112.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -32.0f, -32.0f)
                lineTo(104.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(112.0f, 144.0f)
                horizontalLineToRelative(21.4f)
                lineToRelative(20.0f, 28.6f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 160.0f, 176.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 4.6f, -1.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.0f, -11.2f)
                lineToRelative(-16.1f, -22.9f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 168.0f, 112.0f)
                close()
                moveTo(136.0f, 128.0f)
                lineTo(112.0f, 128.0f)
                lineTo(112.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
            }
        }
        .build()
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
