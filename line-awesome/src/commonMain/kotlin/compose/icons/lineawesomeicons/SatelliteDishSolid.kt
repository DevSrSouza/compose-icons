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

public val LineAwesomeIcons.SatelliteDishSolid: ImageVector
    get() {
        if (_satelliteDishSolid != null) {
            return _satelliteDishSolid!!
        }
        _satelliteDishSolid = Builder(name = "SatelliteDishSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.5f)
                lineTo(16.5f, 6.5f)
                curveTo(21.484f, 6.5f, 25.5f, 10.516f, 25.5f, 15.5f)
                lineTo(27.5f, 15.5f)
                curveTo(27.5f, 9.438f, 22.563f, 4.5f, 16.5f, 4.5f)
                close()
                moveTo(16.5f, 8.5f)
                lineTo(16.5f, 10.5f)
                curveTo(19.273f, 10.5f, 21.5f, 12.727f, 21.5f, 15.5f)
                lineTo(23.5f, 15.5f)
                curveTo(23.5f, 11.645f, 20.355f, 8.5f, 16.5f, 8.5f)
                close()
                moveTo(7.906f, 8.594f)
                lineTo(7.219f, 9.281f)
                curveTo(2.949f, 13.551f, 2.949f, 20.512f, 7.219f, 24.781f)
                curveTo(11.488f, 29.051f, 18.449f, 29.051f, 22.719f, 24.781f)
                lineTo(23.406f, 24.094f)
                lineTo(22.719f, 23.375f)
                lineTo(17.219f, 17.875f)
                curveTo(18.242f, 17.563f, 19.0f, 16.629f, 19.0f, 15.5f)
                curveTo(19.0f, 14.121f, 17.879f, 13.0f, 16.5f, 13.0f)
                curveTo(15.371f, 13.0f, 14.438f, 13.758f, 14.125f, 14.781f)
                lineTo(8.625f, 9.281f)
                close()
                moveTo(8.063f, 11.563f)
                lineTo(20.438f, 23.938f)
                curveTo(16.918f, 26.73f, 11.883f, 26.633f, 8.625f, 23.375f)
                curveTo(5.367f, 20.117f, 5.27f, 15.082f, 8.063f, 11.563f)
                close()
            }
        }
        .build()
        return _satelliteDishSolid!!
    }

private var _satelliteDishSolid: ImageVector? = null
