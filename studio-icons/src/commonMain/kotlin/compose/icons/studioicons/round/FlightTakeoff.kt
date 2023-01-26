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

public val RoundGroup.FlightTakeoff: ImageVector
    get() {
        if (_flightTakeoff != null) {
            return _flightTakeoff!!
        }
        _flightTakeoff = Builder(name = "FlightTakeoff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 19.0f)
                horizontalLineToRelative(-17.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(17.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(22.07f, 9.64f)
                curveToRelative(-0.22f, -0.8f, -1.04f, -1.27f, -1.84f, -1.06f)
                lineTo(14.92f, 10.0f)
                lineTo(8.46f, 3.98f)
                curveToRelative(-0.27f, -0.26f, -0.66f, -0.35f, -1.02f, -0.25f)
                curveToRelative(-0.68f, 0.19f, -1.0f, 0.97f, -0.65f, 1.58f)
                lineToRelative(3.44f, 5.96f)
                lineToRelative(-4.97f, 1.33f)
                lineToRelative(-1.57f, -1.24f)
                curveToRelative(-0.25f, -0.19f, -0.57f, -0.26f, -0.88f, -0.18f)
                lineToRelative(-0.33f, 0.09f)
                curveToRelative(-0.32f, 0.08f, -0.47f, 0.45f, -0.3f, 0.73f)
                lineToRelative(1.88f, 3.25f)
                curveToRelative(0.23f, 0.39f, 0.69f, 0.58f, 1.12f, 0.47f)
                lineTo(21.0f, 11.48f)
                curveToRelative(0.8f, -0.22f, 1.28f, -1.04f, 1.07f, -1.84f)
                close()
            }
        }
        .build()
        return _flightTakeoff!!
    }

private var _flightTakeoff: ImageVector? = null
