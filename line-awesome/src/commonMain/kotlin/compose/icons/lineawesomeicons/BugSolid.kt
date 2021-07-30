package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.BugSolid: ImageVector
    get() {
        if (_bugSolid != null) {
            return _bugSolid!!
        }
        _bugSolid = Builder(name = "BugSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.7188f, 3.2813f)
                lineTo(9.2813f, 4.7188f)
                lineTo(11.2188f, 6.6563f)
                curveTo(9.7578f, 7.7734f, 8.6094f, 9.4102f, 7.875f, 11.3125f)
                lineTo(5.4375f, 10.0938f)
                lineTo(4.5625f, 11.9063f)
                lineTo(7.3125f, 13.2813f)
                curveTo(7.1289f, 14.1563f, 7.0f, 15.0625f, 7.0f, 16.0f)
                curveTo(7.0f, 16.3398f, 7.0078f, 16.668f, 7.0313f, 17.0f)
                lineTo(4.0f, 17.0f)
                lineTo(4.0f, 19.0f)
                lineTo(7.375f, 19.0f)
                curveTo(7.6172f, 20.043f, 7.9375f, 21.0391f, 8.4063f, 21.9375f)
                lineTo(5.4063f, 24.1875f)
                lineTo(6.5938f, 25.8125f)
                lineTo(9.5313f, 23.625f)
                curveTo(11.1484f, 25.6797f, 13.418f, 27.0f, 16.0f, 27.0f)
                curveTo(18.582f, 27.0f, 20.8516f, 25.6797f, 22.4688f, 23.625f)
                lineTo(25.4063f, 25.8125f)
                lineTo(26.5938f, 24.1875f)
                lineTo(23.5938f, 21.9375f)
                curveTo(24.0625f, 21.0391f, 24.3828f, 20.043f, 24.625f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 17.0f)
                lineTo(24.9688f, 17.0f)
                curveTo(24.9922f, 16.668f, 25.0f, 16.3398f, 25.0f, 16.0f)
                curveTo(25.0f, 15.0625f, 24.8711f, 14.1563f, 24.6875f, 13.2813f)
                lineTo(27.4375f, 11.9063f)
                lineTo(26.5625f, 10.0938f)
                lineTo(24.125f, 11.3125f)
                curveTo(23.3906f, 9.4102f, 22.2422f, 7.7734f, 20.7813f, 6.6563f)
                lineTo(22.7188f, 4.7188f)
                lineTo(21.2813f, 3.2813f)
                lineTo(18.9688f, 5.5938f)
                curveTo(18.0469f, 5.2031f, 17.0469f, 5.0f, 16.0f, 5.0f)
                curveTo(14.9531f, 5.0f, 13.9531f, 5.2031f, 13.0313f, 5.5938f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(17.9766f, 7.0f, 19.8281f, 8.0938f, 21.125f, 9.875f)
                curveTo(19.9922f, 10.3867f, 18.1992f, 11.0f, 16.0f, 11.0f)
                curveTo(13.8008f, 11.0f, 12.0078f, 10.3867f, 10.875f, 9.875f)
                curveTo(12.1719f, 8.0938f, 14.0234f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(9.9063f, 11.5938f)
                curveTo(11.0586f, 12.1367f, 12.8281f, 12.7734f, 15.0f, 12.9375f)
                lineTo(15.0f, 24.9063f)
                curveTo(11.6992f, 24.2813f, 9.0f, 20.6289f, 9.0f, 16.0f)
                curveTo(9.0f, 14.3828f, 9.3359f, 12.8867f, 9.9063f, 11.5938f)
                close()
                moveTo(22.0938f, 11.5938f)
                curveTo(22.6641f, 12.8867f, 23.0f, 14.3828f, 23.0f, 16.0f)
                curveTo(23.0f, 20.6289f, 20.3008f, 24.2813f, 17.0f, 24.9063f)
                lineTo(17.0f, 12.9375f)
                curveTo(19.1719f, 12.7734f, 20.9414f, 12.1367f, 22.0938f, 11.5938f)
                close()
            }
        }
        .build()
        return _bugSolid!!
    }

private var _bugSolid: ImageVector? = null
