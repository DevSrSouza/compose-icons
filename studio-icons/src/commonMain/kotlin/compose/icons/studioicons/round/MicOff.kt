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

public val RoundGroup.MicOff: ImageVector
    get() {
        if (_micOff != null) {
            return _micOff!!
        }
        _micOff = Builder(name = "MicOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.6f)
                lineTo(15.0f, 5.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                curveToRelative(-1.54f, 0.0f, -2.79f, 1.16f, -2.96f, 2.65f)
                lineTo(15.0f, 10.6f)
                close()
                moveTo(18.08f, 11.0f)
                curveToRelative(-0.41f, 0.0f, -0.77f, 0.3f, -0.83f, 0.71f)
                curveToRelative(-0.05f, 0.32f, -0.12f, 0.64f, -0.22f, 0.93f)
                lineToRelative(1.27f, 1.27f)
                curveToRelative(0.3f, -0.6f, 0.52f, -1.25f, 0.63f, -1.94f)
                curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f)
                close()
                moveTo(3.71f, 3.56f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(9.0f, 10.27f)
                verticalLineToRelative(0.43f)
                curveToRelative(0.0f, 1.19f, 0.6f, 2.32f, 1.63f, 2.91f)
                curveToRelative(0.75f, 0.43f, 1.41f, 0.44f, 2.02f, 0.31f)
                lineToRelative(1.66f, 1.66f)
                curveToRelative(-0.71f, 0.33f, -1.5f, 0.52f, -2.31f, 0.52f)
                curveToRelative(-2.54f, 0.0f, -4.88f, -1.77f, -5.25f, -4.39f)
                curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f)
                curveToRelative(-0.52f, 0.0f, -0.92f, 0.46f, -0.85f, 0.97f)
                curveToRelative(0.46f, 2.96f, 2.96f, 5.3f, 5.93f, 5.75f)
                lineTo(11.0f, 20.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.28f)
                curveToRelative(0.91f, -0.13f, 1.77f, -0.45f, 2.55f, -0.9f)
                lineToRelative(3.49f, 3.49f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(5.12f, 3.56f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                close()
            }
        }
        .build()
        return _micOff!!
    }

private var _micOff: ImageVector? = null
