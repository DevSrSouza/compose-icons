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

public val LineAwesomeIcons.PlaneDepartureSolid: ImageVector
    get() {
        if (_planeDepartureSolid != null) {
            return _planeDepartureSolid!!
        }
        _planeDepartureSolid = Builder(name = "PlaneDepartureSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(25.719f, 4.781f)
                curveTo(25.332f, 4.816f, 24.957f, 4.93f, 24.594f, 5.125f)
                lineTo(19.875f, 7.625f)
                lineTo(13.5f, 6.063f)
                lineTo(13.125f, 5.969f)
                lineTo(12.75f, 6.156f)
                lineTo(10.594f, 7.406f)
                lineTo(9.313f, 8.156f)
                lineTo(10.5f, 9.063f)
                lineTo(13.219f, 11.125f)
                lineTo(9.813f, 12.938f)
                lineTo(6.156f, 11.281f)
                lineTo(5.719f, 11.094f)
                lineTo(5.281f, 11.313f)
                lineTo(3.531f, 12.25f)
                lineTo(2.375f, 12.875f)
                lineTo(3.25f, 13.813f)
                lineTo(8.656f, 19.625f)
                lineTo(9.156f, 20.219f)
                lineTo(9.844f, 19.844f)
                lineTo(15.0f, 17.094f)
                lineTo(13.969f, 22.781f)
                lineTo(13.625f, 24.594f)
                lineTo(15.344f, 23.875f)
                lineTo(17.906f, 22.781f)
                lineTo(18.281f, 22.625f)
                lineTo(18.438f, 22.25f)
                lineTo(22.156f, 13.219f)
                lineTo(27.406f, 10.406f)
                curveTo(28.852f, 9.629f, 29.434f, 7.789f, 28.656f, 6.344f)
                curveTo(28.27f, 5.621f, 27.609f, 5.129f, 26.875f, 4.906f)
                curveTo(26.508f, 4.797f, 26.105f, 4.746f, 25.719f, 4.781f)
                close()
                moveTo(25.906f, 6.781f)
                curveTo(26.031f, 6.773f, 26.16f, 6.777f, 26.281f, 6.813f)
                curveTo(26.523f, 6.887f, 26.742f, 7.035f, 26.875f, 7.281f)
                curveTo(27.141f, 7.777f, 26.965f, 8.359f, 26.469f, 8.625f)
                lineTo(20.875f, 11.656f)
                lineTo(20.563f, 11.813f)
                lineTo(20.438f, 12.156f)
                lineTo(16.719f, 21.094f)
                lineTo(16.281f, 21.281f)
                lineTo(17.344f, 15.375f)
                lineTo(17.719f, 13.344f)
                lineTo(15.906f, 14.313f)
                lineTo(9.594f, 17.719f)
                lineTo(5.625f, 13.406f)
                lineTo(5.781f, 13.313f)
                lineTo(9.438f, 14.938f)
                lineTo(9.906f, 15.156f)
                lineTo(10.313f, 14.906f)
                lineTo(25.531f, 6.875f)
                curveTo(25.656f, 6.809f, 25.781f, 6.789f, 25.906f, 6.781f)
                close()
                moveTo(13.375f, 8.094f)
                lineTo(17.219f, 9.031f)
                lineTo(15.156f, 10.094f)
                lineTo(12.906f, 8.375f)
                close()
                moveTo(3.0f, 26.0f)
                lineTo(3.0f, 28.0f)
                lineTo(29.0f, 28.0f)
                lineTo(29.0f, 26.0f)
                close()
            }
        }
        .build()
        return _planeDepartureSolid!!
    }

private var _planeDepartureSolid: ImageVector? = null
