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

public val RoundGroup.PublicOff: ImageVector
    get() {
        if (_publicOff != null) {
            return _publicOff!!
        }
        _publicOff = Builder(name = "PublicOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 8.17f)
                lineTo(6.49f, 3.66f)
                curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(19.59f, 14.87f, 20.0f, 13.48f, 20.0f, 12.0f)
                curveToRelative(0.0f, -3.35f, -2.07f, -6.22f, -5.0f, -7.41f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(8.17f)
                close()
                moveTo(20.49f, 21.9f)
                lineTo(20.49f, 21.9f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-1.56f, -1.56f)
                curveToRelative(-2.07f, 1.37f, -4.68f, 2.0f, -7.45f, 1.48f)
                curveToRelative(-3.95f, -0.75f, -7.13f, -3.92f, -7.88f, -7.88f)
                curveToRelative(-0.52f, -2.77f, 0.1f, -5.38f, 1.48f, -7.45f)
                lineTo(2.1f, 4.93f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(16.97f, 16.97f)
                curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f)
                close()
                moveTo(11.0f, 18.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                lineToRelative(-4.79f, -4.79f)
                curveTo(4.08f, 10.79f, 4.0f, 11.38f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.08f, 3.05f, 7.44f, 7.0f, 7.93f)
                verticalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _publicOff!!
    }

private var _publicOff: ImageVector? = null
