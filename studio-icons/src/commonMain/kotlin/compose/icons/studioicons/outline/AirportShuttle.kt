package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AirportShuttle: ImageVector
    get() {
        if (_airportShuttle != null) {
            return _airportShuttle!!
        }
        _airportShuttle = Builder(name = "AirportShuttle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(3.0f, 5.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f)
                verticalLineToRelative(9.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-5.0f)
                lineToRelative(-6.0f, -6.0f)
                close()
                moveTo(15.0f, 7.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(15.0f, 7.0f)
                close()
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(9.0f, 10.0f)
                lineTo(9.0f, 7.0f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 10.0f)
                lineTo(3.0f, 7.0f)
                close()
                moveTo(6.0f, 17.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(18.0f, 17.25f)
                curveToRelative(-0.69f, 0.0f, -1.25f, -0.56f, -1.25f, -1.25f)
                reflectiveCurveToRelative(0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
                close()
                moveTo(21.0f, 14.0f)
                horizontalLineToRelative(-0.78f)
                curveToRelative(-0.55f, -0.61f, -1.34f, -1.0f, -2.22f, -1.0f)
                reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f)
                lineTo(8.22f, 14.0f)
                curveToRelative(-0.55f, -0.61f, -1.33f, -1.0f, -2.22f, -1.0f)
                reflectiveCurveToRelative(-1.67f, 0.39f, -2.22f, 1.0f)
                lineTo(3.0f, 14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _airportShuttle!!
    }

private var _airportShuttle: ImageVector? = null
