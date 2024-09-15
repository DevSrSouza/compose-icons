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

public val LineAwesomeIcons.HourglassEndSolid: ImageVector
    get() {
        if (_hourglassEndSolid != null) {
            return _hourglassEndSolid!!
        }
        _hourglassEndSolid = Builder(name = "HourglassEndSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 10.0f)
                curveTo(9.0f, 12.543f, 10.367f, 14.773f, 12.406f, 16.0f)
                curveTo(10.367f, 17.227f, 9.0f, 19.457f, 9.0f, 22.0f)
                lineTo(9.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                lineTo(7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                lineTo(25.0f, 26.0f)
                lineTo(23.0f, 26.0f)
                lineTo(23.0f, 22.0f)
                curveTo(23.0f, 19.457f, 21.633f, 17.227f, 19.594f, 16.0f)
                curveTo(21.633f, 14.773f, 23.0f, 12.543f, 23.0f, 10.0f)
                lineTo(23.0f, 6.0f)
                lineTo(25.0f, 6.0f)
                lineTo(25.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 10.0f)
                curveTo(21.0f, 12.773f, 18.773f, 15.0f, 16.0f, 15.0f)
                curveTo(13.227f, 15.0f, 11.0f, 12.773f, 11.0f, 10.0f)
                close()
                moveTo(16.0f, 17.0f)
                curveTo(18.773f, 17.0f, 21.0f, 19.227f, 21.0f, 22.0f)
                lineTo(21.0f, 26.0f)
                lineTo(20.0f, 26.0f)
                lineTo(20.0f, 24.0f)
                curveTo(20.0f, 21.789f, 18.211f, 20.0f, 16.0f, 20.0f)
                curveTo(13.789f, 20.0f, 12.0f, 21.789f, 12.0f, 24.0f)
                lineTo(12.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 22.0f)
                curveTo(11.0f, 19.227f, 13.227f, 17.0f, 16.0f, 17.0f)
                close()
            }
        }
        .build()
        return _hourglassEndSolid!!
    }

private var _hourglassEndSolid: ImageVector? = null
