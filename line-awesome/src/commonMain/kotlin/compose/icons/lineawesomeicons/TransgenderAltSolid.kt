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

public val LineAwesomeIcons.TransgenderAltSolid: ImageVector
    get() {
        if (_transgenderAltSolid != null) {
            return _transgenderAltSolid!!
        }
        _transgenderAltSolid = Builder(name = "TransgenderAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                lineTo(4.0f, 11.0f)
                lineTo(6.0f, 11.0f)
                lineTo(6.0f, 7.4063f)
                lineTo(9.0625f, 10.5f)
                lineTo(7.2813f, 12.2813f)
                lineTo(8.7188f, 13.7188f)
                lineTo(10.5f, 11.9375f)
                lineTo(11.8125f, 13.25f)
                curveTo(11.2852f, 14.043f, 11.0f, 14.9844f, 11.0f, 16.0f)
                curveTo(11.0f, 18.4063f, 12.7266f, 20.4375f, 15.0f, 20.9063f)
                lineTo(15.0f, 23.0f)
                lineTo(12.0f, 23.0f)
                lineTo(12.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 20.9063f)
                curveTo(19.2734f, 20.4375f, 21.0f, 18.4063f, 21.0f, 16.0f)
                curveTo(21.0f, 14.9844f, 20.7148f, 14.043f, 20.1875f, 13.25f)
                lineTo(26.0f, 7.4063f)
                lineTo(26.0f, 11.0f)
                lineTo(28.0f, 11.0f)
                lineTo(28.0f, 4.0f)
                lineTo(21.0f, 4.0f)
                lineTo(21.0f, 6.0f)
                lineTo(24.5938f, 6.0f)
                lineTo(18.75f, 11.8125f)
                curveTo(17.957f, 11.2852f, 17.0156f, 11.0f, 16.0f, 11.0f)
                curveTo(14.9844f, 11.0f, 14.043f, 11.2852f, 13.25f, 11.8125f)
                lineTo(11.9375f, 10.5f)
                lineTo(13.7188f, 8.7188f)
                lineTo(12.2813f, 7.2813f)
                lineTo(10.5f, 9.0625f)
                lineTo(7.4063f, 6.0f)
                lineTo(11.0f, 6.0f)
                lineTo(11.0f, 4.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(17.668f, 13.0f, 19.0f, 14.332f, 19.0f, 16.0f)
                curveTo(19.0f, 17.668f, 17.668f, 19.0f, 16.0f, 19.0f)
                curveTo(14.332f, 19.0f, 13.0f, 17.668f, 13.0f, 16.0f)
                curveTo(13.0f, 14.332f, 14.332f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _transgenderAltSolid!!
    }

private var _transgenderAltSolid: ImageVector? = null
