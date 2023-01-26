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

public val OutlineGroup.CompassCalibration: ImageVector
    get() {
        if (_compassCalibration != null) {
            return _compassCalibration!!
        }
        _compassCalibration = Builder(name = "CompassCalibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-1.65f, 0.0f, -3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3.0f, -3.0f, 3.0f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(8.1f, 3.0f, 4.56f, 4.59f, 2.0f, 7.15f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f)
                reflectiveCurveToRelative(3.72f, 0.79f, 5.0f, 2.07f)
                lineToRelative(5.0f, -5.0f)
                curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(16.84f, 9.47f)
                curveToRelative(-1.44f, -0.91f, -3.1f, -1.4f, -4.84f, -1.4f)
                curveToRelative(-1.74f, 0.0f, -3.41f, 0.49f, -4.85f, 1.41f)
                lineTo(4.94f, 7.26f)
                curveTo(6.99f, 5.79f, 9.44f, 5.0f, 12.0f, 5.0f)
                curveToRelative(2.56f, 0.0f, 5.0f, 0.79f, 7.05f, 2.26f)
                lineToRelative(-2.21f, 2.21f)
                close()
            }
        }
        .build()
        return _compassCalibration!!
    }

private var _compassCalibration: ImageVector? = null
