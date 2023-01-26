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

public val BaselineGroup.MotionPhotosOff: ImageVector
    get() {
        if (_motionPhotosOff != null) {
            return _motionPhotosOff!!
        }
        _motionPhotosOff = Builder(name = "MotionPhotosOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.84f, 20.84f)
                lineTo(3.16f, 3.16f)
                lineTo(1.89f, 4.43f)
                lineToRelative(1.89f, 1.89f)
                curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.77f)
                lineToRelative(1.89f, 1.89f)
                lineToRelative(1.27f, -1.28f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.55f, 0.45f, -3.0f, 1.22f, -4.23f)
                lineToRelative(1.46f, 1.46f)
                curveTo(6.25f, 10.06f, 6.0f, 11.0f, 6.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(1.0f, 0.0f, 1.94f, -0.25f, 2.77f, -0.68f)
                lineToRelative(1.46f, 1.46f)
                curveTo(15.0f, 19.55f, 13.55f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(6.32f, 3.77f)
                curveTo(7.93f, 2.66f, 9.89f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.11f, -0.66f, 4.07f, -1.77f, 5.68f)
                lineToRelative(-1.45f, -1.45f)
                curveTo(19.55f, 15.0f, 20.0f, 13.55f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-1.55f, 0.0f, -3.0f, 0.45f, -4.23f, 1.22f)
                lineTo(6.32f, 3.77f)
                close()
                moveTo(18.0f, 12.0f)
                curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f)
                lineTo(9.23f, 6.68f)
                curveTo(10.06f, 6.25f, 11.0f, 6.0f, 12.0f, 6.0f)
                curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f)
                close()
            }
        }
        .build()
        return _motionPhotosOff!!
    }

private var _motionPhotosOff: ImageVector? = null
