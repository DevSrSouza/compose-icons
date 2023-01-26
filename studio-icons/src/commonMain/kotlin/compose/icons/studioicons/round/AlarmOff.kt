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

public val RoundGroup.AlarmOff: ImageVector
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
                moveTo(3.71f, 2.79f)
                curveToRelative(-0.38f, -0.38f, -1.0f, -0.38f, -1.39f, 0.0f)
                lineToRelative(-0.02f, 0.03f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.01f, 0.0f, 1.39f)
                lineToRelative(0.68f, 0.68f)
                lineToRelative(-0.17f, 0.14f)
                curveToRelative(-0.42f, 0.34f, -0.47f, 0.96f, -0.13f, 1.38f)
                lineToRelative(0.03f, 0.03f)
                curveToRelative(0.35f, 0.42f, 0.96f, 0.47f, 1.38f, 0.12f)
                lineToRelative(0.31f, -0.25f)
                lineToRelative(0.8f, 0.8f)
                curveTo(3.83f, 8.69f, 3.0f, 10.75f, 3.0f, 13.0f)
                curveToRelative(0.0f, 4.97f, 4.03f, 9.0f, 9.0f, 9.0f)
                curveToRelative(2.25f, 0.0f, 4.31f, -0.83f, 5.89f, -2.2f)
                lineToRelative(1.41f, 1.41f)
                curveToRelative(0.38f, 0.38f, 1.0f, 0.38f, 1.39f, 0.0f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1.0f, 0.0f, -1.39f)
                lineToRelative(-17.01f, -17.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.86f, 0.0f, -7.0f, -3.14f, -7.0f, -7.0f)
                curveToRelative(0.0f, -1.7f, 0.61f, -3.26f, 1.62f, -4.47f)
                lineToRelative(9.85f, 9.85f)
                curveTo(15.26f, 19.39f, 13.7f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(19.91f, 6.56f)
                curveToRelative(0.42f, 0.35f, 1.03f, 0.29f, 1.38f, -0.12f)
                lineToRelative(0.03f, -0.03f)
                curveToRelative(0.35f, -0.42f, 0.29f, -1.03f, -0.12f, -1.38f)
                lineToRelative(-3.1f, -2.59f)
                curveToRelative(-0.42f, -0.35f, -1.03f, -0.29f, -1.38f, 0.12f)
                lineToRelative(-0.03f, 0.03f)
                curveToRelative(-0.35f, 0.42f, -0.29f, 1.03f, 0.12f, 1.38f)
                lineToRelative(3.1f, 2.59f)
                close()
                moveTo(7.43f, 3.68f)
                curveToRelative(0.18f, -0.34f, 0.15f, -0.77f, -0.11f, -1.09f)
                lineToRelative(-0.03f, -0.03f)
                curveToRelative(-0.3f, -0.36f, -0.8f, -0.43f, -1.2f, -0.22f)
                lineToRelative(1.34f, 1.34f)
                close()
            }
        }
        .build()
        return _alarmOff!!
    }

private var _alarmOff: ImageVector? = null
