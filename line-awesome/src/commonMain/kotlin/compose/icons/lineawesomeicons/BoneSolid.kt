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

public val LineAwesomeIcons.BoneSolid: ImageVector
    get() {
        if (_boneSolid != null) {
            return _boneSolid!!
        }
        _boneSolid = Builder(name = "BoneSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                curveTo(17.8008f, 4.0f, 16.0f, 5.8008f, 16.0f, 8.0f)
                curveTo(16.0f, 9.0f, 16.4531f, 9.832f, 17.0625f, 10.5313f)
                lineTo(10.5313f, 17.0625f)
                curveTo(9.832f, 16.4531f, 9.0f, 16.0f, 8.0f, 16.0f)
                curveTo(5.8008f, 16.0f, 4.0f, 17.8008f, 4.0f, 20.0f)
                curveTo(4.0f, 22.1992f, 5.8008f, 24.0f, 8.0f, 24.0f)
                curveTo(8.0f, 26.1992f, 9.8008f, 28.0f, 12.0f, 28.0f)
                curveTo(14.1992f, 28.0f, 16.0f, 26.1992f, 16.0f, 24.0f)
                curveTo(16.0f, 23.0f, 15.5469f, 22.168f, 14.9375f, 21.4688f)
                lineTo(21.4688f, 14.9375f)
                curveTo(22.168f, 15.5469f, 23.0f, 16.0f, 24.0f, 16.0f)
                curveTo(26.1992f, 16.0f, 28.0f, 14.1992f, 28.0f, 12.0f)
                curveTo(28.0f, 9.8008f, 26.1992f, 8.0f, 24.0f, 8.0f)
                curveTo(24.0f, 5.8008f, 22.1992f, 4.0f, 20.0f, 4.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(21.1172f, 6.0f, 22.0f, 6.8828f, 22.0f, 8.0f)
                curveTo(22.0f, 8.1719f, 21.9727f, 8.3477f, 21.9063f, 8.5625f)
                lineTo(21.7188f, 9.1563f)
                lineTo(22.1563f, 9.5625f)
                lineTo(22.4375f, 9.8438f)
                lineTo(22.8438f, 10.2813f)
                lineTo(23.4375f, 10.0938f)
                curveTo(23.6523f, 10.0273f, 23.8281f, 10.0f, 24.0f, 10.0f)
                curveTo(25.1172f, 10.0f, 26.0f, 10.8828f, 26.0f, 12.0f)
                curveTo(26.0f, 13.1172f, 25.1172f, 14.0f, 24.0f, 14.0f)
                curveTo(23.2695f, 14.0f, 22.668f, 13.6133f, 22.3125f, 13.0313f)
                lineTo(21.625f, 11.9375f)
                lineTo(20.75f, 12.8438f)
                lineTo(12.8438f, 20.75f)
                lineTo(11.9375f, 21.625f)
                lineTo(13.0313f, 22.3125f)
                curveTo(13.6133f, 22.668f, 14.0f, 23.2695f, 14.0f, 24.0f)
                curveTo(14.0f, 25.1172f, 13.1172f, 26.0f, 12.0f, 26.0f)
                curveTo(10.8828f, 26.0f, 10.0f, 25.1172f, 10.0f, 24.0f)
                curveTo(10.0f, 23.8281f, 10.0273f, 23.6523f, 10.0938f, 23.4375f)
                lineTo(10.2813f, 22.8438f)
                lineTo(9.8438f, 22.4375f)
                lineTo(9.5625f, 22.1563f)
                lineTo(9.1563f, 21.7188f)
                lineTo(8.5625f, 21.9063f)
                curveTo(8.3477f, 21.9727f, 8.1719f, 22.0f, 8.0f, 22.0f)
                curveTo(6.8828f, 22.0f, 6.0f, 21.1172f, 6.0f, 20.0f)
                curveTo(6.0f, 18.8828f, 6.8828f, 18.0f, 8.0f, 18.0f)
                curveTo(8.7305f, 18.0f, 9.332f, 18.3867f, 9.6875f, 18.9688f)
                lineTo(10.375f, 20.0625f)
                lineTo(11.25f, 19.1563f)
                lineTo(19.1563f, 11.25f)
                lineTo(20.0625f, 10.375f)
                lineTo(18.9688f, 9.6875f)
                curveTo(18.3867f, 9.332f, 18.0f, 8.7305f, 18.0f, 8.0f)
                curveTo(18.0f, 6.8828f, 18.8828f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _boneSolid!!
    }

private var _boneSolid: ImageVector? = null
