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

public val LineAwesomeIcons.PlugSolid: ImageVector
    get() {
        if (_plugSolid != null) {
            return _plugSolid!!
        }
        _plugSolid = Builder(name = "PlugSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.5938f)
                lineTo(18.0f, 7.5625f)
                lineTo(15.7188f, 5.2813f)
                lineTo(14.2813f, 6.7188f)
                lineTo(15.0313f, 7.4688f)
                lineTo(9.9063f, 12.5938f)
                curveTo(8.6953f, 13.8047f, 8.6953f, 15.7891f, 9.9063f, 17.0f)
                lineTo(11.75f, 18.8438f)
                lineTo(4.2813f, 26.2813f)
                lineTo(5.7188f, 27.7188f)
                lineTo(13.1563f, 20.25f)
                lineTo(15.0f, 22.0938f)
                curveTo(16.2109f, 23.3047f, 18.1953f, 23.3047f, 19.4063f, 22.0938f)
                lineTo(24.5313f, 16.9688f)
                lineTo(25.2813f, 17.7188f)
                lineTo(26.7188f, 16.2813f)
                lineTo(24.4375f, 14.0f)
                lineTo(28.4063f, 10.0f)
                lineTo(27.0f, 8.5938f)
                lineTo(23.0f, 12.5625f)
                lineTo(19.4375f, 9.0f)
                lineTo(23.4063f, 5.0f)
                close()
                moveTo(16.4375f, 8.875f)
                lineTo(23.125f, 15.5625f)
                lineTo(18.0f, 20.6875f)
                curveTo(17.6133f, 21.0742f, 16.793f, 21.0742f, 16.4063f, 20.6875f)
                lineTo(11.3125f, 15.5938f)
                curveTo(10.9258f, 15.207f, 10.9258f, 14.3867f, 11.3125f, 14.0f)
                close()
            }
        }
        .build()
        return _plugSolid!!
    }

private var _plugSolid: ImageVector? = null
