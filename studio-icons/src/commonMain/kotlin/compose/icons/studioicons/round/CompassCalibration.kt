package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CompassCalibration: ImageVector
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
                moveTo(12.0f, 3.0f)
                curveTo(8.49f, 3.0f, 5.28f, 4.29f, 2.8f, 6.41f)
                curveToRelative(-0.44f, 0.38f, -0.48f, 1.06f, -0.06f, 1.48f)
                lineToRelative(3.6f, 3.6f)
                curveToRelative(0.36f, 0.36f, 0.92f, 0.39f, 1.32f, 0.08f)
                curveToRelative(1.2f, -0.94f, 2.71f, -1.5f, 4.34f, -1.5f)
                curveToRelative(1.64f, 0.0f, 3.14f, 0.56f, 4.34f, 1.49f)
                curveToRelative(0.4f, 0.31f, 0.96f, 0.28f, 1.31f, -0.08f)
                lineToRelative(3.6f, -3.6f)
                curveToRelative(0.42f, -0.42f, 0.38f, -1.1f, -0.07f, -1.48f)
                curveTo(18.72f, 4.28f, 15.51f, 3.0f, 12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _compassCalibration!!
    }

private var _compassCalibration: ImageVector? = null
