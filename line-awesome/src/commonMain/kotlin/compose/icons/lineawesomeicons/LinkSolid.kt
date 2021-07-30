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

public val LineAwesomeIcons.LinkSolid: ImageVector
    get() {
        if (_linkSolid != null) {
            return _linkSolid!!
        }
        _linkSolid = Builder(name = "LinkSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.0781f, 4.0f, 18.4922f, 4.6602f, 17.3125f, 5.8438f)
                lineTo(15.8438f, 7.3125f)
                curveTo(14.6602f, 8.4961f, 14.0f, 10.0781f, 14.0f, 11.75f)
                curveTo(14.0f, 12.543f, 14.1523f, 13.3164f, 14.4375f, 14.0313f)
                lineTo(16.0625f, 12.4063f)
                curveTo(15.8594f, 11.1094f, 16.2539f, 9.7148f, 17.25f, 8.7188f)
                lineTo(18.7188f, 7.25f)
                curveTo(19.5234f, 6.4453f, 20.6133f, 6.0f, 21.75f, 6.0f)
                curveTo(22.8867f, 6.0f, 23.9453f, 6.4453f, 24.75f, 7.25f)
                curveTo(26.4102f, 8.9102f, 26.4102f, 11.6211f, 24.75f, 13.2813f)
                lineTo(23.2813f, 14.75f)
                curveTo(22.4766f, 15.5547f, 21.3867f, 16.0f, 20.25f, 16.0f)
                curveTo(20.0273f, 16.0f, 19.8086f, 15.9766f, 19.5938f, 15.9375f)
                lineTo(17.9688f, 17.5625f)
                curveTo(18.6836f, 17.8477f, 19.457f, 18.0f, 20.25f, 18.0f)
                curveTo(21.9219f, 18.0f, 23.5078f, 17.3398f, 24.6875f, 16.1563f)
                lineTo(26.1563f, 14.6875f)
                curveTo(27.3398f, 13.5039f, 28.0f, 11.9219f, 28.0f, 10.25f)
                curveTo(28.0f, 8.5781f, 27.3398f, 7.0273f, 26.1563f, 5.8438f)
                curveTo(24.9766f, 4.6602f, 23.4219f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(19.2813f, 11.2813f)
                lineTo(11.2813f, 19.2813f)
                lineTo(12.7188f, 20.7188f)
                lineTo(20.7188f, 12.7188f)
                close()
                moveTo(11.75f, 14.0f)
                curveTo(10.0781f, 14.0f, 8.4922f, 14.6602f, 7.3125f, 15.8438f)
                lineTo(5.8438f, 17.3125f)
                curveTo(4.6602f, 18.4961f, 4.0f, 20.0781f, 4.0f, 21.75f)
                curveTo(4.0f, 23.4219f, 4.6602f, 24.9727f, 5.8438f, 26.1563f)
                curveTo(7.0234f, 27.3398f, 8.5781f, 28.0f, 10.25f, 28.0f)
                curveTo(11.9219f, 28.0f, 13.5078f, 27.3398f, 14.6875f, 26.1563f)
                lineTo(16.1563f, 24.6875f)
                curveTo(17.3398f, 23.5039f, 18.0f, 21.9219f, 18.0f, 20.25f)
                curveTo(18.0f, 19.457f, 17.8477f, 18.6836f, 17.5625f, 17.9688f)
                lineTo(15.9375f, 19.5938f)
                curveTo(16.1406f, 20.8906f, 15.7461f, 22.2852f, 14.75f, 23.2813f)
                lineTo(13.2813f, 24.75f)
                curveTo(12.4766f, 25.5547f, 11.3867f, 26.0f, 10.25f, 26.0f)
                curveTo(9.1133f, 26.0f, 8.0547f, 25.5547f, 7.25f, 24.75f)
                curveTo(5.5898f, 23.0898f, 5.5898f, 20.3789f, 7.25f, 18.7188f)
                lineTo(8.7188f, 17.25f)
                curveTo(9.5234f, 16.4453f, 10.6133f, 16.0f, 11.75f, 16.0f)
                curveTo(11.9727f, 16.0f, 12.1914f, 16.0234f, 12.4063f, 16.0625f)
                lineTo(14.0313f, 14.4375f)
                curveTo(13.3164f, 14.1523f, 12.543f, 14.0f, 11.75f, 14.0f)
                close()
            }
        }
        .build()
        return _linkSolid!!
    }

private var _linkSolid: ImageVector? = null
