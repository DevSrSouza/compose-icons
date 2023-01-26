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

public val SharpGroup.AlarmOff: ImageVector
    get() {
        if (_alarmOff != null) {
            return _alarmOff!!
        }
        _alarmOff = Builder(name = "AlarmOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.04f, 6.29f)
                curveTo(10.66f, 6.11f, 11.32f, 6.0f, 12.0f, 6.0f)
                curveToRelative(3.86f, 0.0f, 7.0f, 3.14f, 7.0f, 7.0f)
                curveToRelative(0.0f, 0.68f, -0.11f, 1.34f, -0.29f, 1.96f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.47f, -1.08f, 0.73f, -2.27f, 0.73f, -3.52f)
                curveToRelative(0.0f, -4.97f, -4.03f, -9.0f, -9.0f, -9.0f)
                curveToRelative(-1.25f, 0.0f, -2.44f, 0.26f, -3.53f, 0.72f)
                lineToRelative(1.57f, 1.57f)
                close()
                moveTo(17.337f, 1.81f)
                lineToRelative(4.607f, 3.845f)
                lineToRelative(-1.28f, 1.535f)
                lineToRelative(-4.61f, -3.843f)
                close()
                moveTo(3.02f, 2.1f)
                lineTo(1.61f, 3.51f)
                lineToRelative(1.37f, 1.37f)
                lineToRelative(-0.92f, 0.77f)
                lineToRelative(1.28f, 1.54f)
                lineToRelative(1.06f, -0.88f)
                lineToRelative(0.8f, 0.8f)
                curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f)
                lineToRelative(2.1f, 2.1f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.02f, 2.1f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f)
                lineToRelative(9.85f, 9.85f)
                curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(7.48f, 3.73f)
                lineToRelative(0.46f, -0.38f)
                lineToRelative(-1.28f, -1.54f)
                lineToRelative(-0.6f, 0.5f)
                close()
            }
        }
        .build()
        return _alarmOff!!
    }

private var _alarmOff: ImageVector? = null
