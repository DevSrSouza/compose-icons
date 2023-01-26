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

public val SharpGroup.DepartureBoard: ImageVector
    get() {
        if (_departureBoard != null) {
            return _departureBoard!!
        }
        _departureBoard = Builder(name = "DepartureBoard", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.34f, 1.13f)
                curveToRelative(-2.94f, -0.55f, -5.63f, 0.75f, -7.12f, 2.92f)
                curveToRelative(0.01f, -0.01f, 0.01f, -0.02f, 0.02f, -0.03f)
                curveTo(9.84f, 4.0f, 9.42f, 4.0f, 9.0f, 4.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 0.5f, -8.0f, 4.0f)
                verticalLineToRelative(10.0f)
                curveToRelative(0.0f, 0.88f, 0.39f, 1.67f, 1.0f, 2.22f)
                lineTo(2.0f, 23.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f)
                verticalLineToRelative(-3.08f)
                curveToRelative(3.72f, -0.54f, 6.5f, -3.98f, 5.92f, -7.97f)
                curveToRelative(-0.42f, -2.9f, -2.7f, -5.29f, -5.58f, -5.82f)
                close()
                moveTo(4.5f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(3.67f, 16.0f, 4.5f, 16.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(5.33f, 19.0f, 4.5f, 19.0f)
                close()
                moveTo(3.0f, 13.0f)
                lineTo(3.0f, 8.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.96f, 0.81f, 3.73f, 2.11f, 5.0f)
                lineTo(3.0f, 13.0f)
                close()
                moveTo(13.5f, 19.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveTo(16.0f, 13.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f)
                reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f)
                reflectiveCurveToRelative(-2.24f, 5.0f, -5.0f, 5.0f)
                close()
                moveTo(16.5f, 4.0f)
                lineTo(15.0f, 4.0f)
                verticalLineToRelative(5.0f)
                lineToRelative(3.62f, 2.16f)
                lineToRelative(0.75f, -1.23f)
                lineToRelative(-2.87f, -1.68f)
                lineTo(16.5f, 4.0f)
                close()
            }
        }
        .build()
        return _departureBoard!!
    }

private var _departureBoard: ImageVector? = null
