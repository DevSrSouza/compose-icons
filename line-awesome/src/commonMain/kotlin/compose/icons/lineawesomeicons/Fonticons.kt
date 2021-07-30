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

public val LineAwesomeIcons.Fonticons: ImageVector
    get() {
        if (_fonticons != null) {
            return _fonticons!!
        }
        _fonticons = Builder(name = "Fonticons", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(19.7188f, 8.9063f)
                lineTo(19.0313f, 10.1875f)
                lineTo(17.7813f, 10.1875f)
                lineTo(17.625f, 10.625f)
                lineTo(18.625f, 11.6875f)
                lineTo(18.2188f, 13.1875f)
                curveTo(18.2188f, 13.1875f, 18.5078f, 13.5391f, 18.5313f, 13.5313f)
                curveTo(18.5547f, 13.5234f, 19.9375f, 12.75f, 19.9375f, 12.75f)
                lineTo(21.3125f, 13.5313f)
                lineTo(21.6875f, 13.1875f)
                lineTo(21.25f, 11.6875f)
                lineTo(22.25f, 10.5938f)
                lineTo(22.0313f, 10.1875f)
                lineTo(20.8125f, 10.1875f)
                lineTo(20.125f, 8.9063f)
                close()
                moveTo(14.375f, 10.7188f)
                curveTo(10.8711f, 10.7188f, 10.9688f, 13.375f, 10.9688f, 13.375f)
                lineTo(10.9688f, 14.75f)
                lineTo(9.6875f, 14.75f)
                lineTo(9.6875f, 16.4375f)
                lineTo(10.9375f, 16.4375f)
                lineTo(10.9375f, 21.8125f)
                lineTo(9.6875f, 21.9688f)
                lineTo(9.6875f, 23.125f)
                lineTo(15.5625f, 23.125f)
                curveTo(15.5469f, 23.1445f, 15.5625f, 22.0f, 15.5625f, 22.0f)
                lineTo(13.4688f, 21.7813f)
                lineTo(13.4688f, 16.4375f)
                lineTo(15.9688f, 16.4375f)
                lineTo(16.4688f, 14.75f)
                lineTo(13.4688f, 14.75f)
                lineTo(13.4688f, 13.0f)
                curveTo(13.4688f, 13.0f, 13.6367f, 12.25f, 14.2813f, 12.25f)
                curveTo(14.9258f, 12.25f, 15.0313f, 12.8438f, 15.0313f, 12.8438f)
                lineTo(15.0313f, 13.3438f)
                lineTo(17.2813f, 13.0313f)
                curveTo(17.2813f, 13.0313f, 17.7031f, 10.7188f, 14.375f, 10.7188f)
                close()
                moveTo(17.8125f, 14.7813f)
                lineTo(17.4375f, 16.0625f)
                lineTo(18.625f, 16.4063f)
                curveTo(18.7695f, 16.4453f, 18.875f, 16.5703f, 18.875f, 16.7188f)
                lineTo(18.875f, 21.5f)
                curveTo(18.875f, 21.6563f, 18.75f, 21.7813f, 18.5938f, 21.8125f)
                lineTo(17.6563f, 22.0f)
                lineTo(17.6563f, 23.125f)
                lineTo(22.2188f, 23.125f)
                lineTo(22.2188f, 22.0313f)
                lineTo(21.6875f, 21.9375f)
                curveTo(21.5313f, 21.9102f, 21.4063f, 21.7539f, 21.4063f, 21.5938f)
                lineTo(21.4063f, 14.7813f)
                close()
            }
        }
        .build()
        return _fonticons!!
    }

private var _fonticons: ImageVector? = null
