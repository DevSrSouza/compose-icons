package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Mapbox: ImageVector
    get() {
        if (_mapbox != null) {
            return _mapbox!!
        }
        _mapbox = Builder(name = "Mapbox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.372f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.372f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.372f, 12.0f, -12.0f)
                reflectiveCurveTo(18.628f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(17.696f, 14.943f)
                curveToRelative(-4.103f, 4.103f, -11.433f, 2.794f, -11.433f, 2.794f)
                reflectiveCurveTo(4.94f, 10.421f, 9.057f, 6.304f)
                curveToRelative(2.281f, -2.281f, 6.061f, -2.187f, 8.45f, 0.189f)
                reflectiveCurveToRelative(2.471f, 6.168f, 0.189f, 8.45f)
                close()
                moveTo(13.377f, 7.033f)
                lineToRelative(-1.174f, 2.416f)
                lineToRelative(-2.416f, 1.174f)
                lineToRelative(2.416f, 1.174f)
                lineToRelative(1.174f, 2.416f)
                lineToRelative(1.174f, -2.416f)
                lineToRelative(2.416f, -1.174f)
                lineToRelative(-2.416f, -1.174f)
                lineToRelative(-1.174f, -2.416f)
                close()
            }
        }
        .build()
        return _mapbox!!
    }

private var _mapbox: ImageVector? = null
