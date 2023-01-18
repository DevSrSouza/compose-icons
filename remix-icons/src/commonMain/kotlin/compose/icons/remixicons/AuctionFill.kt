package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AuctionFill: ImageVector
    get() {
        if (_auctionFill != null) {
            return _auctionFill!!
        }
        _auctionFill = Builder(name = "AuctionFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(14.586f, 0.686f)
                lineToRelative(7.778f, 7.778f)
                lineTo(20.95f, 9.88f)
                lineToRelative(-1.06f, -0.354f)
                lineTo(17.413f, 12.0f)
                lineToRelative(5.657f, 5.657f)
                lineToRelative(-1.414f, 1.414f)
                lineTo(16.0f, 13.414f)
                lineToRelative(-2.404f, 2.404f)
                lineToRelative(0.283f, 1.132f)
                lineToRelative(-1.415f, 1.414f)
                lineToRelative(-7.778f, -7.778f)
                lineToRelative(1.415f, -1.414f)
                lineToRelative(1.13f, 0.282f)
                lineToRelative(6.294f, -6.293f)
                lineToRelative(-0.353f, -1.06f)
                lineTo(14.586f, 0.686f)
                close()
            }
        }
        .build()
        return _auctionFill!!
    }

private var _auctionFill: ImageVector? = null
