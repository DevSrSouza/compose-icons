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

public val LineAwesomeIcons.ViharaSolid: ImageVector
    get() {
        if (_viharaSolid != null) {
            return _viharaSolid!!
        }
        _viharaSolid = Builder(name = "ViharaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.699f)
                lineTo(8.1f, 10.0f)
                lineTo(10.0f, 10.0f)
                lineTo(10.0f, 12.523f)
                lineTo(5.1f, 16.199f)
                lineTo(7.0f, 17.123f)
                lineTo(7.0f, 20.527f)
                lineTo(2.0f, 24.301f)
                lineTo(6.0f, 25.881f)
                lineTo(6.0f, 28.0f)
                lineTo(8.0f, 28.0f)
                lineTo(8.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 26.0f)
                lineTo(24.0f, 26.0f)
                lineTo(24.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 25.885f)
                lineTo(30.1f, 24.301f)
                lineTo(25.0f, 20.453f)
                lineTo(25.0f, 17.146f)
                lineTo(27.0f, 16.199f)
                lineTo(22.0f, 12.449f)
                lineTo(22.0f, 10.0f)
                lineTo(23.9f, 10.0f)
                lineTo(16.0f, 3.699f)
                close()
                moveTo(16.0f, 6.301f)
                lineTo(18.199f, 8.0f)
                lineTo(13.9f, 8.0f)
                lineTo(16.0f, 6.301f)
                close()
                moveTo(12.0f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(12.0f, 12.0f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(11.4f, 14.0f)
                lineTo(20.699f, 14.0f)
                lineTo(23.0f, 15.801f)
                lineTo(22.699f, 16.0f)
                lineTo(9.199f, 16.0f)
                lineTo(9.0f, 15.801f)
                lineTo(11.4f, 14.0f)
                close()
                moveTo(9.0f, 18.0f)
                lineTo(23.0f, 18.0f)
                lineTo(23.0f, 20.0f)
                lineTo(9.0f, 20.0f)
                lineTo(9.0f, 18.0f)
                close()
                moveTo(8.301f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(23.0f, 22.0f)
                lineTo(23.699f, 22.0f)
                lineTo(26.0f, 23.699f)
                lineTo(25.301f, 24.0f)
                lineTo(6.699f, 24.0f)
                lineTo(6.0f, 23.699f)
                lineTo(8.301f, 22.0f)
                close()
            }
        }
        .build()
        return _viharaSolid!!
    }

private var _viharaSolid: ImageVector? = null
