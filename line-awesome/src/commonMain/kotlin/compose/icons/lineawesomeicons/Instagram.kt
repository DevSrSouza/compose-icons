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

public val LineAwesomeIcons.Instagram: ImageVector
    get() {
        if (_instagram != null) {
            return _instagram!!
        }
        _instagram = Builder(name = "Instagram", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.4688f, 5.0f)
                curveTo(7.918f, 5.0f, 5.0f, 7.9141f, 5.0f, 11.4688f)
                lineTo(5.0f, 20.5313f)
                curveTo(5.0f, 24.082f, 7.9141f, 27.0f, 11.4688f, 27.0f)
                lineTo(20.5313f, 27.0f)
                curveTo(24.082f, 27.0f, 27.0f, 24.0859f, 27.0f, 20.5313f)
                lineTo(27.0f, 11.4688f)
                curveTo(27.0f, 7.918f, 24.0859f, 5.0f, 20.5313f, 5.0f)
                close()
                moveTo(11.4688f, 7.0f)
                lineTo(20.5313f, 7.0f)
                curveTo(23.0039f, 7.0f, 25.0f, 8.9961f, 25.0f, 11.4688f)
                lineTo(25.0f, 20.5313f)
                curveTo(25.0f, 23.0039f, 23.0039f, 25.0f, 20.5313f, 25.0f)
                lineTo(11.4688f, 25.0f)
                curveTo(8.9961f, 25.0f, 7.0f, 23.0039f, 7.0f, 20.5313f)
                lineTo(7.0f, 11.4688f)
                curveTo(7.0f, 8.9961f, 8.9961f, 7.0f, 11.4688f, 7.0f)
                close()
                moveTo(21.9063f, 9.1875f)
                curveTo(21.4023f, 9.1875f, 21.0f, 9.5898f, 21.0f, 10.0938f)
                curveTo(21.0f, 10.5977f, 21.4023f, 11.0f, 21.9063f, 11.0f)
                curveTo(22.4102f, 11.0f, 22.8125f, 10.5977f, 22.8125f, 10.0938f)
                curveTo(22.8125f, 9.5898f, 22.4102f, 9.1875f, 21.9063f, 9.1875f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(12.6992f, 10.0f, 10.0f, 12.6992f, 10.0f, 16.0f)
                curveTo(10.0f, 19.3008f, 12.6992f, 22.0f, 16.0f, 22.0f)
                curveTo(19.3008f, 22.0f, 22.0f, 19.3008f, 22.0f, 16.0f)
                curveTo(22.0f, 12.6992f, 19.3008f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.2227f, 12.0f, 20.0f, 13.7773f, 20.0f, 16.0f)
                curveTo(20.0f, 18.2227f, 18.2227f, 20.0f, 16.0f, 20.0f)
                curveTo(13.7773f, 20.0f, 12.0f, 18.2227f, 12.0f, 16.0f)
                curveTo(12.0f, 13.7773f, 13.7773f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _instagram!!
    }

private var _instagram: ImageVector? = null
