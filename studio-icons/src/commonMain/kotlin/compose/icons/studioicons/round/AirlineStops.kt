package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AirlineStops: ImageVector
    get() {
        if (_airlineStops != null) {
            return _airlineStops!!
        }
        _airlineStops = Builder(name = "AirlineStops", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 18.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-4.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(-0.47f, -4.21f, -3.89f, -7.55f, -8.12f, -7.96f)
                curveTo(2.37f, 8.99f, 2.0f, 8.56f, 2.0f, 8.05f)
                curveToRelative(0.0f, -0.59f, 0.52f, -1.06f, 1.11f, -1.0f)
                curveTo(7.03f, 7.44f, 10.37f, 9.87f, 12.0f, 13.3f)
                curveToRelative(1.13f, -2.43f, 2.99f, -4.25f, 4.78f, -5.52f)
                lineToRelative(-1.92f, -1.92f)
                curveTo(14.54f, 5.54f, 14.76f, 5.0f, 15.21f, 5.0f)
                horizontalLineToRelative(5.29f)
                curveTo(20.78f, 5.0f, 21.0f, 5.22f, 21.0f, 5.5f)
                verticalLineToRelative(5.29f)
                curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f)
                lineToRelative(-1.94f, -1.94f)
                curveTo(15.93f, 10.78f, 13.45f, 13.3f, 13.0f, 17.0f)
                horizontalLineToRelative(1.0f)
                curveTo(14.55f, 17.0f, 15.0f, 17.45f, 15.0f, 18.0f)
                close()
            }
        }
        .build()
        return _airlineStops!!
    }

private var _airlineStops: ImageVector? = null
