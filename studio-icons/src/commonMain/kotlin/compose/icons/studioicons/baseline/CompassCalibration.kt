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

public val BaselineGroup.CompassCalibration: ImageVector
    get() {
        if (_compassCalibration != null) {
            return _compassCalibration!!
        }
        _compassCalibration = Builder(name = "CompassCalibration", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 17.0f)
                moveToRelative(-4.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -8.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.07f)
                curveToRelative(1.95f, 0.0f, 3.72f, 0.79f, 5.0f, 2.07f)
                lineToRelative(5.0f, -5.0f)
                curveTo(19.44f, 4.59f, 15.9f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(4.56f, 4.59f, 2.0f, 7.15f)
                lineToRelative(5.0f, 5.0f)
                curveToRelative(1.28f, -1.28f, 3.05f, -2.08f, 5.0f, -2.08f)
                close()
            }
        }
        .build()
        return _compassCalibration!!
    }

private var _compassCalibration: ImageVector? = null
