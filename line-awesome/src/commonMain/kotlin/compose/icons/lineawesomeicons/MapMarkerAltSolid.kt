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

public val LineAwesomeIcons.MapMarkerAltSolid: ImageVector
    get() {
        if (_mapMarkerAltSolid != null) {
            return _mapMarkerAltSolid!!
        }
        _mapMarkerAltSolid = Builder(name = "MapMarkerAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(11.043f, 3.0f, 7.0f, 7.043f, 7.0f, 12.0f)
                curveTo(7.0f, 13.406f, 7.57f, 15.02f, 8.344f, 16.781f)
                curveTo(9.117f, 18.543f, 10.113f, 20.414f, 11.125f, 22.156f)
                curveTo(13.148f, 25.645f, 15.188f, 28.563f, 15.188f, 28.563f)
                lineTo(16.0f, 29.75f)
                lineTo(16.813f, 28.563f)
                curveTo(16.813f, 28.563f, 18.852f, 25.645f, 20.875f, 22.156f)
                curveTo(21.887f, 20.414f, 22.883f, 18.543f, 23.656f, 16.781f)
                curveTo(24.43f, 15.02f, 25.0f, 13.406f, 25.0f, 12.0f)
                curveTo(25.0f, 7.043f, 20.957f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(19.879f, 5.0f, 23.0f, 8.121f, 23.0f, 12.0f)
                curveTo(23.0f, 12.801f, 22.57f, 14.316f, 21.844f, 15.969f)
                curveTo(21.117f, 17.621f, 20.113f, 19.453f, 19.125f, 21.156f)
                curveTo(17.555f, 23.867f, 16.578f, 25.301f, 16.0f, 26.156f)
                curveTo(15.422f, 25.301f, 14.445f, 23.867f, 12.875f, 21.156f)
                curveTo(11.887f, 19.453f, 10.883f, 17.621f, 10.156f, 15.969f)
                curveTo(9.43f, 14.316f, 9.0f, 12.801f, 9.0f, 12.0f)
                curveTo(9.0f, 8.121f, 12.121f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(14.895f, 10.0f, 14.0f, 10.895f, 14.0f, 12.0f)
                curveTo(14.0f, 13.105f, 14.895f, 14.0f, 16.0f, 14.0f)
                curveTo(17.105f, 14.0f, 18.0f, 13.105f, 18.0f, 12.0f)
                curveTo(18.0f, 10.895f, 17.105f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mapMarkerAltSolid!!
    }

private var _mapMarkerAltSolid: ImageVector? = null
