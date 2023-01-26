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

public val RoundGroup.MotionPhotosOff: ImageVector
    get() {
        if (_motionPhotosOff != null) {
            return _motionPhotosOff!!
        }
        _motionPhotosOff = Builder(name = "MotionPhotosOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveToRelative(-0.92f, 0.0f, -1.8f, 0.22f, -2.58f, 0.59f)
                lineToRelative(7.99f, 7.99f)
                curveTo(17.78f, 13.8f, 18.0f, 12.92f, 18.0f, 12.0f)
                curveTo(18.0f, 8.69f, 15.31f, 6.0f, 12.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.1f, 3.51f)
                lineTo(2.1f, 3.51f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0.0f, 1.42f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(-1.25f, 1.88f, -1.88f, 4.21f, -1.59f, 6.7f)
                curveToRelative(0.52f, 4.54f, 4.21f, 8.23f, 8.75f, 8.75f)
                curveToRelative(2.49f, 0.28f, 4.81f, -0.34f, 6.69f, -1.59f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveTo(3.13f, 3.13f, 2.49f, 3.12f, 2.1f, 3.51f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                lineToRelative(1.47f, 1.47f)
                curveTo(6.22f, 10.2f, 6.0f, 11.08f, 6.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(0.92f, 0.0f, 1.8f, -0.22f, 2.58f, -0.59f)
                lineToRelative(1.47f, 1.47f)
                curveTo(14.86f, 19.59f, 13.48f, 20.0f, 12.0f, 20.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.05f)
                lineToRelative(1.45f, 1.45f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveTo(9.96f, 2.0f, 8.07f, 2.61f, 6.49f, 3.66f)
                lineToRelative(1.45f, 1.45f)
                curveTo(9.14f, 4.41f, 10.52f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _motionPhotosOff!!
    }

private var _motionPhotosOff: ImageVector? = null
