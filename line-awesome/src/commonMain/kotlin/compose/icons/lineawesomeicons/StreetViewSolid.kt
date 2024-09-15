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

public val LineAwesomeIcons.StreetViewSolid: ImageVector
    get() {
        if (_streetViewSolid != null) {
            return _streetViewSolid!!
        }
        _streetViewSolid = Builder(name = "StreetViewSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(13.801f, 4.0f, 12.0f, 5.801f, 12.0f, 8.0f)
                curveTo(12.0f, 9.113f, 12.477f, 10.117f, 13.219f, 10.844f)
                curveTo(11.887f, 11.746f, 11.0f, 13.281f, 11.0f, 15.0f)
                lineTo(11.0f, 19.625f)
                lineTo(13.0f, 20.625f)
                lineTo(13.0f, 25.0f)
                lineTo(19.0f, 25.0f)
                lineTo(19.0f, 20.625f)
                lineTo(21.0f, 19.625f)
                lineTo(21.0f, 15.0f)
                curveTo(21.0f, 13.281f, 20.113f, 11.746f, 18.781f, 10.844f)
                curveTo(19.523f, 10.117f, 20.0f, 9.113f, 20.0f, 8.0f)
                curveTo(20.0f, 5.801f, 18.199f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(17.117f, 6.0f, 18.0f, 6.883f, 18.0f, 8.0f)
                curveTo(18.0f, 9.117f, 17.117f, 10.0f, 16.0f, 10.0f)
                curveTo(14.883f, 10.0f, 14.0f, 9.117f, 14.0f, 8.0f)
                curveTo(14.0f, 6.883f, 14.883f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.668f, 12.0f, 19.0f, 13.332f, 19.0f, 15.0f)
                lineTo(19.0f, 18.375f)
                lineTo(17.0f, 19.375f)
                lineTo(17.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 19.375f)
                lineTo(13.0f, 18.375f)
                lineTo(13.0f, 15.0f)
                curveTo(13.0f, 13.332f, 14.332f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(9.0f, 18.875f)
                curveTo(6.082f, 19.691f, 4.0f, 21.074f, 4.0f, 23.0f)
                curveTo(4.0f, 26.281f, 10.035f, 28.0f, 16.0f, 28.0f)
                curveTo(21.965f, 28.0f, 28.0f, 26.281f, 28.0f, 23.0f)
                curveTo(28.0f, 21.074f, 25.918f, 19.691f, 23.0f, 18.875f)
                lineTo(23.0f, 20.969f)
                curveTo(24.902f, 21.582f, 26.0f, 22.375f, 26.0f, 23.0f)
                curveTo(26.0f, 24.195f, 22.012f, 26.0f, 16.0f, 26.0f)
                curveTo(9.988f, 26.0f, 6.0f, 24.195f, 6.0f, 23.0f)
                curveTo(6.0f, 22.375f, 7.098f, 21.582f, 9.0f, 20.969f)
                close()
            }
        }
        .build()
        return _streetViewSolid!!
    }

private var _streetViewSolid: ImageVector? = null
