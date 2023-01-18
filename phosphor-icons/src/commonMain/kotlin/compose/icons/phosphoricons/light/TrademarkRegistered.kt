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

public val LightGroup.TrademarkRegistered: ImageVector
    get() {
        if (_trademarkRegistered != null) {
            return _trademarkRegistered!!
        }
        _trademarkRegistered = Builder(name = "TrademarkRegistered", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, false, -30.0f, -30.0f)
                lineTo(104.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 142.0f)
                horizontalLineToRelative(24.5f)
                lineToRelative(20.6f, 29.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 8.3f, 1.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.5f, -8.3f)
                lineToRelative(-17.4f, -24.9f)
                arcTo(29.9f, 29.9f, 0.0f, false, false, 166.0f, 112.0f)
                close()
                moveTo(136.0f, 130.0f)
                lineTo(110.0f, 130.0f)
                lineTo(110.0f, 94.0f)
                horizontalLineToRelative(26.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                close()
            }
        }
        .build()
        return _trademarkRegistered!!
    }

private var _trademarkRegistered: ImageVector? = null
