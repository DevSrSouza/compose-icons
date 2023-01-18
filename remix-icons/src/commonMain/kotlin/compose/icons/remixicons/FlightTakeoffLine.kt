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

public val RemixIcons.FlightTakeoffLine: ImageVector
    get() {
        if (_flightTakeoffLine != null) {
            return _flightTakeoffLine!!
        }
        _flightTakeoffLine = Builder(name = "FlightTakeoffLine", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.478f, 11.632f)
                lineTo(5.968f, 4.56f)
                lineToRelative(1.931f, -0.518f)
                lineToRelative(6.951f, 6.42f)
                lineToRelative(5.262f, -1.41f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.776f, 2.898f)
                lineTo(5.916f, 15.96f)
                lineToRelative(-0.776f, -2.898f)
                lineToRelative(0.241f, -0.065f)
                lineToRelative(2.467f, 2.445f)
                lineToRelative(-2.626f, 0.704f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.133f, -0.48f)
                lineTo(1.466f, 10.94f)
                lineToRelative(1.449f, -0.388f)
                lineToRelative(2.466f, 2.445f)
                lineToRelative(5.097f, -1.366f)
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
        return _flightTakeoffLine!!
    }

private var _flightTakeoffLine: ImageVector? = null
