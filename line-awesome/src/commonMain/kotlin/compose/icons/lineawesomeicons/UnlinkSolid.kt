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

public val LineAwesomeIcons.UnlinkSolid: ImageVector
    get() {
        if (_unlinkSolid != null) {
            return _unlinkSolid!!
        }
        _unlinkSolid = Builder(name = "UnlinkSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.1484f, 4.0f, 18.5313f, 4.625f, 17.3125f, 5.8438f)
                lineTo(15.8438f, 7.3125f)
                curveTo(14.8281f, 8.3281f, 14.2266f, 9.6172f, 14.0625f, 10.9375f)
                lineTo(16.0625f, 11.1875f)
                curveTo(16.1758f, 10.2813f, 16.5586f, 9.4102f, 17.25f, 8.7188f)
                lineTo(18.7188f, 7.25f)
                curveTo(20.3906f, 5.5781f, 23.0781f, 5.5781f, 24.75f, 7.25f)
                curveTo(26.4219f, 8.9219f, 26.4219f, 11.6094f, 24.75f, 13.2813f)
                lineTo(23.2813f, 14.75f)
                lineTo(23.25f, 14.75f)
                curveTo(22.5586f, 15.4453f, 21.7148f, 15.8281f, 20.8125f, 15.9375f)
                lineTo(21.0625f, 17.9375f)
                curveTo(22.3828f, 17.7734f, 23.6719f, 17.1719f, 24.6875f, 16.1563f)
                lineTo(26.1563f, 14.6875f)
                curveTo(28.5898f, 12.2539f, 28.5898f, 8.2773f, 26.1563f, 5.8438f)
                curveTo(24.9375f, 4.625f, 23.3516f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(7.7188f, 6.2813f)
                lineTo(6.2813f, 7.7188f)
                lineTo(10.2813f, 11.7188f)
                lineTo(11.7188f, 10.2813f)
                close()
                moveTo(10.9375f, 14.0625f)
                curveTo(9.6172f, 14.2266f, 8.3281f, 14.8281f, 7.3125f, 15.8438f)
                lineTo(5.8438f, 17.3125f)
                curveTo(3.4102f, 19.7461f, 3.4102f, 23.7227f, 5.8438f, 26.1563f)
                curveTo(8.2773f, 28.5898f, 12.2539f, 28.5898f, 14.6875f, 26.1563f)
                lineTo(16.1563f, 24.6875f)
                curveTo(17.1719f, 23.6719f, 17.7734f, 22.3828f, 17.9375f, 21.0625f)
                lineTo(15.9375f, 20.8125f)
                curveTo(15.8242f, 21.7188f, 15.4414f, 22.5898f, 14.75f, 23.2813f)
                lineTo(13.2813f, 24.75f)
                curveTo(11.6094f, 26.4219f, 8.9219f, 26.4219f, 7.25f, 24.75f)
                curveTo(5.5781f, 23.0781f, 5.5781f, 20.3906f, 7.25f, 18.7188f)
                lineTo(8.7188f, 17.25f)
                lineTo(8.75f, 17.25f)
                curveTo(9.4414f, 16.5547f, 10.2852f, 16.1719f, 11.1875f, 16.0625f)
                close()
                moveTo(21.7188f, 20.2813f)
                lineTo(20.2813f, 21.7188f)
                lineTo(24.2813f, 25.7188f)
                lineTo(25.7188f, 24.2813f)
                close()
            }
        }
        .build()
        return _unlinkSolid!!
    }

private var _unlinkSolid: ImageVector? = null
