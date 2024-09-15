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

public val LineAwesomeIcons.ChartLineSolid: ImageVector
    get() {
        if (_chartLineSolid != null) {
            return _chartLineSolid!!
        }
        _chartLineSolid = Builder(name = "ChartLineSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.219f, 5.375f)
                lineTo(23.719f, 9.75f)
                lineTo(20.438f, 8.094f)
                lineTo(19.656f, 7.719f)
                lineTo(19.156f, 8.438f)
                lineTo(15.75f, 13.563f)
                lineTo(12.594f, 11.188f)
                lineTo(12.0f, 10.75f)
                lineTo(11.406f, 11.188f)
                lineTo(7.781f, 13.906f)
                lineTo(4.25f, 13.031f)
                lineTo(3.75f, 14.969f)
                lineTo(7.75f, 15.969f)
                lineTo(8.219f, 16.094f)
                lineTo(8.594f, 15.813f)
                lineTo(12.0f, 13.25f)
                lineTo(15.406f, 15.813f)
                lineTo(16.25f, 16.438f)
                lineTo(16.844f, 15.563f)
                lineTo(20.344f, 10.313f)
                lineTo(23.563f, 11.906f)
                lineTo(24.281f, 12.25f)
                lineTo(28.781f, 6.625f)
                close()
                moveTo(20.063f, 18.313f)
                lineTo(19.219f, 19.375f)
                lineTo(15.813f, 23.625f)
                lineTo(12.594f, 21.188f)
                lineTo(12.0f, 20.75f)
                lineTo(11.406f, 21.188f)
                lineTo(7.906f, 23.813f)
                lineTo(4.438f, 22.094f)
                lineTo(3.563f, 23.906f)
                lineTo(7.563f, 25.906f)
                lineTo(8.094f, 26.156f)
                lineTo(8.594f, 25.813f)
                lineTo(12.0f, 23.25f)
                lineTo(15.406f, 25.813f)
                lineTo(16.188f, 26.375f)
                lineTo(16.781f, 25.625f)
                lineTo(19.906f, 21.719f)
                lineTo(23.156f, 26.563f)
                lineTo(23.938f, 27.688f)
                lineTo(24.781f, 26.625f)
                lineTo(28.781f, 21.625f)
                lineTo(27.219f, 20.375f)
                lineTo(24.094f, 24.281f)
                lineTo(20.844f, 19.438f)
                close()
            }
        }
        .build()
        return _chartLineSolid!!
    }

private var _chartLineSolid: ImageVector? = null
