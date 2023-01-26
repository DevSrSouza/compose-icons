package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SensorOccupied: ImageVector
    get() {
        if (_sensorOccupied != null) {
            return _sensorOccupied!!
        }
        _sensorOccupied = Builder(name = "SensorOccupied", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                reflectiveCurveToRelative(-1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 6.34f, 9.0f, 8.0f)
                reflectiveCurveTo(10.34f, 11.0f, 12.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(-1.84f, 0.0f, -3.56f, 0.5f, -5.03f, 1.37f)
                curveTo(6.36f, 13.72f, 6.0f, 14.39f, 6.0f, 15.09f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(-1.91f)
                curveToRelative(0.0f, -0.7f, -0.36f, -1.36f, -0.97f, -1.72f)
                curveTo(15.56f, 12.5f, 13.84f, 12.0f, 12.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.23f, 8.15f)
                lineToRelative(1.85f, -0.77f)
                curveToRelative(-1.22f, -2.91f, -3.55f, -5.25f, -6.46f, -6.46f)
                lineToRelative(-0.77f, 1.85f)
                curveTo(18.27f, 3.79f, 20.21f, 5.73f, 21.23f, 8.15f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.15f, 2.77f)
                lineTo(7.38f, 0.92f)
                curveTo(4.47f, 2.14f, 2.14f, 4.47f, 0.92f, 7.38f)
                lineToRelative(1.85f, 0.77f)
                curveTo(3.79f, 5.73f, 5.73f, 3.79f, 8.15f, 2.77f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.77f, 15.85f)
                lineToRelative(-1.85f, 0.77f)
                curveToRelative(1.22f, 2.91f, 3.55f, 5.25f, 6.46f, 6.46f)
                lineToRelative(0.77f, -1.85f)
                curveTo(5.73f, 20.21f, 3.79f, 18.27f, 2.77f, 15.85f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.85f, 21.23f)
                lineToRelative(0.77f, 1.85f)
                curveToRelative(2.91f, -1.22f, 5.25f, -3.55f, 6.46f, -6.46f)
                lineToRelative(-1.85f, -0.77f)
                curveTo(20.21f, 18.27f, 18.27f, 20.21f, 15.85f, 21.23f)
                close()
            }
        }
        .build()
        return _sensorOccupied!!
    }

private var _sensorOccupied: ImageVector? = null
