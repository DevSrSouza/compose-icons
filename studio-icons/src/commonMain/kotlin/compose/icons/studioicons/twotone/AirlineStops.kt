package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.AirlineStops: ImageVector
    get() {
        if (_airlineStops != null) {
            return _airlineStops!!
        }
        _airlineStops = Builder(name = "AirlineStops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.21f, 9.21f)
                curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(-0.5f, -4.5f, -4.37f, -8.0f, -9.0f, -8.0f)
                verticalLineTo(7.0f)
                curveToRelative(4.39f, 0.0f, 8.22f, 2.55f, 10.0f, 6.3f)
                curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f)
                lineTo(14.0f, 5.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(7.0f)
                lineTo(18.21f, 9.21f)
                close()
            }
        }
        .build()
        return _airlineStops!!
    }

private var _airlineStops: ImageVector? = null
