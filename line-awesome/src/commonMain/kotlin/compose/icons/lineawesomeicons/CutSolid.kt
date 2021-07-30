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

public val LineAwesomeIcons.CutSolid: ImageVector
    get() {
        if (_cutSolid != null) {
            return _cutSolid!!
        }
        _cutSolid = Builder(name = "CutSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.6563f, 4.3125f)
                curveTo(18.8828f, 4.4063f, 18.1953f, 4.9531f, 17.9688f, 5.75f)
                lineTo(15.3125f, 15.0625f)
                lineTo(11.9688f, 16.0313f)
                curveTo(11.7305f, 14.3359f, 10.2578f, 13.0f, 8.5f, 13.0f)
                curveTo(6.5781f, 13.0f, 5.0f, 14.5781f, 5.0f, 16.5f)
                curveTo(5.0f, 18.4219f, 6.5781f, 20.0f, 8.5f, 20.0f)
                curveTo(9.7891f, 20.0f, 10.9258f, 19.2695f, 11.5313f, 18.2188f)
                lineTo(14.6563f, 17.3438f)
                lineTo(13.7813f, 20.4688f)
                curveTo(12.7305f, 21.0742f, 12.0f, 22.2109f, 12.0f, 23.5f)
                curveTo(12.0f, 25.4219f, 13.5781f, 27.0f, 15.5f, 27.0f)
                curveTo(17.4219f, 27.0f, 19.0f, 25.4219f, 19.0f, 23.5f)
                curveTo(19.0f, 21.7422f, 17.6641f, 20.2695f, 15.9688f, 20.0313f)
                lineTo(20.4375f, 4.375f)
                curveTo(20.1719f, 4.3008f, 19.9141f, 4.2813f, 19.6563f, 4.3125f)
                close()
                moveTo(27.625f, 11.5625f)
                lineTo(18.9063f, 14.0313f)
                lineTo(18.25f, 16.3125f)
                lineTo(26.25f, 14.0313f)
                curveTo(27.3125f, 13.7266f, 27.9297f, 12.625f, 27.625f, 11.5625f)
                close()
                moveTo(8.5f, 15.0f)
                curveTo(9.3398f, 15.0f, 10.0f, 15.6602f, 10.0f, 16.5f)
                curveTo(10.0f, 17.3398f, 9.3398f, 18.0f, 8.5f, 18.0f)
                curveTo(7.6602f, 18.0f, 7.0f, 17.3398f, 7.0f, 16.5f)
                curveTo(7.0f, 15.6602f, 7.6602f, 15.0f, 8.5f, 15.0f)
                close()
                moveTo(15.5f, 22.0f)
                curveTo(16.3398f, 22.0f, 17.0f, 22.6602f, 17.0f, 23.5f)
                curveTo(17.0f, 24.3398f, 16.3398f, 25.0f, 15.5f, 25.0f)
                curveTo(14.6602f, 25.0f, 14.0f, 24.3398f, 14.0f, 23.5f)
                curveTo(14.0f, 22.6602f, 14.6602f, 22.0f, 15.5f, 22.0f)
                close()
            }
        }
        .build()
        return _cutSolid!!
    }

private var _cutSolid: ImageVector? = null
