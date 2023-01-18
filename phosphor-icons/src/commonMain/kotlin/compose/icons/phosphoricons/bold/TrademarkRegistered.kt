package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) {
            return _trademarkRegistered!!
        }
        _trademarkRegistered = Builder(name = "TrademarkRegistered", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.1f, 108.1f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 84.0f, -84.0f)
                arcTo(84.1f, 84.1f, 0.0f, false, true, 128.0f, 212.0f)
                close()
                moveTo(172.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, -36.0f, -36.0f)
                lineTo(104.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 92.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(116.0f, 148.0f)
                horizontalLineToRelative(15.4f)
                lineToRelative(18.8f, 26.9f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 160.0f, 180.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.9f, -2.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.9f, -16.7f)
                lineToRelative(-13.5f, -19.4f)
                arcTo(35.9f, 35.9f, 0.0f, false, false, 172.0f, 112.0f)
                close()
                moveTo(116.0f, 100.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(116.0f, 124.0f)
                close()
            }
        }
        .build()
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
