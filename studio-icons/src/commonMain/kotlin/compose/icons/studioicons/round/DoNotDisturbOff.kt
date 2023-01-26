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

public val RoundGroup.DoNotDisturbOff: ImageVector
    get() {
        if (_doNotDisturbOff != null) {
            return _doNotDisturbOff!!
        }
        _doNotDisturbOff = Builder(name = "DoNotDisturbOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(4.51f, 4.51f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveTo(9.96f, 2.0f, 8.07f, 2.61f, 6.49f, 3.66f)
                lineTo(13.83f, 11.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(2.1f, 4.93f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(-1.37f, 2.07f, -2.0f, 4.68f, -1.48f, 7.45f)
                curveToRelative(0.75f, 3.95f, 3.92f, 7.13f, 7.88f, 7.88f)
                curveToRelative(2.77f, 0.52f, 5.38f, -0.1f, 7.45f, -1.48f)
                lineToRelative(1.56f, 1.56f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(3.51f, 3.51f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveTo(1.71f, 3.91f, 1.71f, 4.54f, 2.1f, 4.93f)
                close()
                moveTo(7.0f, 11.0f)
                horizontalLineToRelative(1.17f)
                lineToRelative(2.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _doNotDisturbOff!!
    }

private var _doNotDisturbOff: ImageVector? = null
