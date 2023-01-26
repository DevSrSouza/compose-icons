package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.FlightTakeoff: ImageVector
    get() {
        if (_flightTakeoff != null) {
            return _flightTakeoff!!
        }
        _flightTakeoff = Builder(name = "FlightTakeoff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 19.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-19.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(22.07f, 9.64f)
                curveToRelative(-0.21f, -0.8f, -1.04f, -1.28f, -1.84f, -1.06f)
                lineTo(14.92f, 10.0f)
                lineToRelative(-6.9f, -6.43f)
                lineToRelative(-1.93f, 0.51f)
                lineToRelative(4.14f, 7.17f)
                lineToRelative(-4.97f, 1.33f)
                lineToRelative(-1.97f, -1.54f)
                lineToRelative(-1.45f, 0.39f)
                lineToRelative(1.82f, 3.16f)
                lineToRelative(0.77f, 1.33f)
                lineTo(21.0f, 11.49f)
                curveToRelative(0.81f, -0.23f, 1.28f, -1.05f, 1.07f, -1.85f)
                close()
            }
        }
        .build()
        return _flightTakeoff!!
    }

private var _flightTakeoff: ImageVector? = null
