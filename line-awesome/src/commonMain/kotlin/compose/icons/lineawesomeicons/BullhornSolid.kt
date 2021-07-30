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

public val LineAwesomeIcons.BullhornSolid: ImageVector
    get() {
        if (_bullhornSolid != null) {
            return _bullhornSolid!!
        }
        _bullhornSolid = Builder(name = "BullhornSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 3.0313f)
                lineTo(26.4063f, 4.1875f)
                curveTo(26.4063f, 4.1875f, 24.418f, 5.6641f, 21.5625f, 7.125f)
                curveTo(18.707f, 8.5859f, 14.9883f, 10.0f, 11.7188f, 10.0f)
                lineTo(2.0f, 10.0f)
                lineTo(2.0f, 19.125f)
                lineTo(2.0313f, 19.2813f)
                lineTo(4.0313f, 26.2813f)
                lineTo(4.25f, 27.0f)
                lineTo(10.3125f, 27.0f)
                lineTo(9.9688f, 25.7188f)
                lineTo(8.3438f, 20.0f)
                lineTo(11.7188f, 20.0f)
                curveTo(14.9453f, 20.0f, 18.6641f, 21.4414f, 21.5313f, 22.9063f)
                curveTo(24.3984f, 24.3711f, 26.4063f, 25.8125f, 26.4063f, 25.8125f)
                lineTo(28.0f, 26.9688f)
                lineTo(28.0f, 17.8125f)
                curveTo(29.1563f, 17.3945f, 30.0f, 16.293f, 30.0f, 15.0f)
                curveTo(30.0f, 13.707f, 29.1563f, 12.6055f, 28.0f, 12.1875f)
                close()
                moveTo(26.0f, 6.75f)
                lineTo(26.0f, 23.2188f)
                curveTo(25.1719f, 22.6602f, 24.5156f, 22.1523f, 22.4375f, 21.0938f)
                curveTo(19.5f, 19.5938f, 15.707f, 18.0742f, 12.0f, 18.0f)
                lineTo(12.0f, 12.0f)
                curveTo(15.7422f, 11.9258f, 19.5391f, 10.375f, 22.4688f, 8.875f)
                curveTo(24.543f, 7.8125f, 25.1797f, 7.3086f, 26.0f, 6.75f)
                close()
                moveTo(4.0f, 12.0f)
                lineTo(10.0f, 12.0f)
                lineTo(10.0f, 18.0f)
                lineTo(4.0f, 18.0f)
                close()
                moveTo(4.3438f, 20.0f)
                lineTo(6.25f, 20.0f)
                lineTo(7.6563f, 25.0f)
                lineTo(5.75f, 25.0f)
                close()
            }
        }
        .build()
        return _bullhornSolid!!
    }

private var _bullhornSolid: ImageVector? = null
