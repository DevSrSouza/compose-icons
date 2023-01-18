package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.FlightLandFill: ImageVector
    get() {
        if (_flightLandFill != null) {
            return _flightLandFill!!
        }
        _flightLandFill = Builder(name = "FlightLandFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.254f, 10.47f)
                lineToRelative(-0.37f, -8.382f)
                lineToRelative(1.933f, 0.518f)
                lineToRelative(2.81f, 9.035f)
                lineToRelative(5.261f, 1.41f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -0.776f, 2.898f)
                lineTo(4.14f, 11.937f)
                lineToRelative(0.776f, -2.898f)
                lineToRelative(0.242f, 0.065f)
                lineToRelative(0.914f, 3.35f)
                lineToRelative(-2.627f, -0.703f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.74f, -0.983f)
                lineToRelative(0.09f, -5.403f)
                lineToRelative(1.449f, 0.388f)
                lineToRelative(0.914f, 3.351f)
                lineToRelative(5.096f, 1.366f)
                close()
                moveTo(4.0f, 19.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _flightLandFill!!
    }

private var _flightLandFill: ImageVector? = null
