package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.FlightLand: ImageVector
    get() {
        if (_flightLand != null) {
            return _flightLand!!
        }
        _flightLand = Builder(name = "FlightLand", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 19.0f)
                horizontalLineToRelative(19.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-19.0f)
                verticalLineTo(19.0f)
                close()
                moveTo(19.34f, 15.85f)
                curveToRelative(0.8f, 0.21f, 1.62f, -0.26f, 1.84f, -1.06f)
                curveToRelative(0.21f, -0.8f, -0.26f, -1.62f, -1.06f, -1.84f)
                lineToRelative(-5.31f, -1.42f)
                lineToRelative(-2.76f, -9.02f)
                lineTo(10.12f, 2.0f)
                verticalLineToRelative(8.28f)
                lineTo(5.15f, 8.95f)
                lineTo(4.22f, 6.63f)
                lineTo(2.77f, 6.24f)
                verticalLineToRelative(5.17f)
                lineTo(19.34f, 15.85f)
                close()
            }
        }
        .build()
        return _flightLand!!
    }

private var _flightLand: ImageVector? = null
