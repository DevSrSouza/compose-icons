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

public val RoundGroup.FlightLand: ImageVector
    get() {
        if (_flightLand != null) {
            return _flightLand!!
        }
        _flightLand = Builder(name = "FlightLand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(3.51f, 11.61f)
                lineToRelative(15.83f, 4.24f)
                curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f)
                curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f)
                lineToRelative(-5.31f, -1.42f)
                lineToRelative(-2.58f, -8.45f)
                curveToRelative(-0.11f, -0.36f, -0.39f, -0.63f, -0.75f, -0.73f)
                curveToRelative(-0.68f, -0.18f, -1.35f, 0.33f, -1.35f, 1.04f)
                verticalLineToRelative(6.88f)
                lineTo(5.15f, 8.95f)
                lineTo(4.4f, 7.09f)
                curveToRelative(-0.12f, -0.29f, -0.36f, -0.51f, -0.67f, -0.59f)
                lineToRelative(-0.33f, -0.09f)
                curveToRelative(-0.32f, -0.09f, -0.63f, 0.15f, -0.63f, 0.48f)
                verticalLineToRelative(3.75f)
                curveToRelative(0.0f, 0.46f, 0.3f, 0.85f, 0.74f, 0.97f)
                close()
            }
        }
        .build()
        return _flightLand!!
    }

private var _flightLand: ImageVector? = null
