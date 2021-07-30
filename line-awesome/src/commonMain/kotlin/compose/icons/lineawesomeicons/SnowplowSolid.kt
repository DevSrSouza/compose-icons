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

public val LineAwesomeIcons.SnowplowSolid: ImageVector
    get() {
        if (_snowplowSolid != null) {
            return _snowplowSolid!!
        }
        _snowplowSolid = Builder(name = "SnowplowSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 6.0f)
                curveTo(9.1641f, 6.0f, 7.9922f, 6.9023f, 7.625f, 8.1875f)
                lineTo(6.3125f, 12.7188f)
                lineTo(4.3125f, 12.0625f)
                lineTo(3.6875f, 13.9375f)
                lineTo(5.1563f, 14.4375f)
                lineTo(4.875f, 14.7188f)
                curveTo(4.3125f, 15.2813f, 4.0f, 16.0156f, 4.0f, 16.8125f)
                lineTo(4.0f, 19.0f)
                lineTo(3.1875f, 19.0f)
                lineTo(3.0313f, 19.8125f)
                lineTo(2.0313f, 24.8125f)
                lineTo(1.7813f, 26.0f)
                lineTo(30.2188f, 26.0f)
                lineTo(29.9688f, 24.8125f)
                lineTo(28.9688f, 19.8125f)
                lineTo(28.8125f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 16.8125f)
                curveTo(28.0f, 16.0156f, 27.6875f, 15.2813f, 27.125f, 14.7188f)
                lineTo(26.8438f, 14.4375f)
                lineTo(28.3125f, 13.9375f)
                lineTo(27.6875f, 12.0625f)
                lineTo(25.6875f, 12.7188f)
                lineTo(24.375f, 8.1875f)
                curveTo(24.0078f, 6.9023f, 22.8359f, 6.0f, 21.5f, 6.0f)
                close()
                moveTo(10.5f, 8.0f)
                lineTo(21.5f, 8.0f)
                curveTo(21.9492f, 8.0f, 22.3125f, 8.2852f, 22.4375f, 8.7188f)
                lineTo(23.6563f, 13.0f)
                lineTo(8.3438f, 13.0f)
                lineTo(9.5625f, 8.7188f)
                curveTo(9.6875f, 8.2852f, 10.0508f, 8.0f, 10.5f, 8.0f)
                close()
                moveTo(7.4375f, 15.0f)
                lineTo(24.5625f, 15.0f)
                lineTo(25.7188f, 16.125f)
                curveTo(25.9063f, 16.3125f, 26.0f, 16.5469f, 26.0f, 16.8125f)
                lineTo(26.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 16.8125f)
                curveTo(6.0f, 16.5469f, 6.0938f, 16.3125f, 6.2813f, 16.125f)
                close()
                moveTo(4.8125f, 21.0f)
                lineTo(27.1875f, 21.0f)
                lineTo(27.7813f, 24.0f)
                lineTo(4.2188f, 24.0f)
                close()
            }
        }
        .build()
        return _snowplowSolid!!
    }

private var _snowplowSolid: ImageVector? = null
