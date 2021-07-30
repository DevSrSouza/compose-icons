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

public val LineAwesomeIcons.AccessibleIcon: ImageVector
    get() {
        if (_accessibleIcon != null) {
            return _accessibleIcon!!
        }
        _accessibleIcon = Builder(name = "AccessibleIcon", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 4.0f)
                curveTo(22.3555f, 4.0f, 21.0f, 5.3555f, 21.0f, 7.0f)
                curveTo(21.0f, 8.6445f, 22.3555f, 10.0f, 24.0f, 10.0f)
                curveTo(25.6445f, 10.0f, 27.0f, 8.6445f, 27.0f, 7.0f)
                curveTo(27.0f, 5.3555f, 25.6445f, 4.0f, 24.0f, 4.0f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(24.5625f, 6.0f, 25.0f, 6.4375f, 25.0f, 7.0f)
                curveTo(25.0f, 7.5625f, 24.5625f, 8.0f, 24.0f, 8.0f)
                curveTo(23.4375f, 8.0f, 23.0f, 7.5625f, 23.0f, 7.0f)
                curveTo(23.0f, 6.4375f, 23.4375f, 6.0f, 24.0f, 6.0f)
                close()
                moveTo(18.5625f, 9.0313f)
                lineTo(14.9688f, 9.4375f)
                curveTo(14.3984f, 9.5039f, 13.9219f, 9.8438f, 13.5938f, 10.3125f)
                lineTo(13.5625f, 10.2813f)
                lineTo(13.5313f, 10.3438f)
                lineTo(11.2188f, 13.4063f)
                lineTo(12.7813f, 14.5938f)
                lineTo(15.1563f, 11.5f)
                lineTo(15.2188f, 11.4375f)
                lineTo(17.4063f, 11.1875f)
                lineTo(15.7188f, 15.0313f)
                curveTo(13.4648f, 15.1211f, 11.4648f, 16.2617f, 10.25f, 18.0f)
                lineTo(13.0313f, 18.0f)
                curveTo(13.8633f, 17.3789f, 14.8867f, 17.0f, 16.0f, 17.0f)
                curveTo(18.7578f, 17.0f, 21.0f, 19.2422f, 21.0f, 22.0f)
                curveTo(21.0f, 24.7578f, 18.7578f, 27.0f, 16.0f, 27.0f)
                curveTo(14.3711f, 27.0f, 12.9453f, 26.207f, 12.0313f, 25.0f)
                lineTo(9.6875f, 25.0f)
                curveTo(10.8125f, 27.3594f, 13.2148f, 29.0f, 16.0f, 29.0f)
                curveTo(19.8594f, 29.0f, 23.0f, 25.8594f, 23.0f, 22.0f)
                curveTo(23.0f, 21.6602f, 22.9531f, 21.3281f, 22.9063f, 21.0f)
                lineTo(24.875f, 21.0f)
                lineTo(23.3438f, 26.75f)
                lineTo(25.2813f, 27.25f)
                lineTo(26.9375f, 21.0313f)
                lineTo(27.0f, 20.8125f)
                lineTo(26.9688f, 20.5625f)
                curveTo(26.7695f, 19.6484f, 25.9336f, 19.0f, 25.0f, 19.0f)
                lineTo(22.3125f, 19.0f)
                curveTo(22.0195f, 18.3867f, 21.6367f, 17.8438f, 21.1875f, 17.3438f)
                lineTo(22.8125f, 13.9375f)
                lineTo(22.8438f, 13.875f)
                lineTo(22.8438f, 13.8438f)
                curveTo(23.3477f, 12.4492f, 22.7422f, 10.8867f, 21.4375f, 10.1875f)
                lineTo(19.75f, 9.25f)
                lineTo(19.75f, 9.2813f)
                curveTo(19.3906f, 9.0898f, 18.9648f, 8.9844f, 18.5625f, 9.0313f)
                close()
                moveTo(19.4688f, 11.375f)
                lineTo(20.5f, 11.9375f)
                curveTo(20.9453f, 12.1758f, 21.1406f, 12.6836f, 20.9688f, 13.1563f)
                lineTo(19.5938f, 16.0f)
                curveTo(19.0352f, 15.6641f, 18.4297f, 15.4219f, 17.7813f, 15.25f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(7.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(4.0f, 22.0f)
                lineTo(4.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 22.0f)
                close()
            }
        }
        .build()
        return _accessibleIcon!!
    }

private var _accessibleIcon: ImageVector? = null
