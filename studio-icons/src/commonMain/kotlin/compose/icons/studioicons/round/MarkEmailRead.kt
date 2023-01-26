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

public val RoundGroup.MarkEmailRead: ImageVector
    get() {
        if (_markEmailRead != null) {
            return _markEmailRead!!
        }
        _markEmailRead = Builder(name = "MarkEmailRead", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.05f, 21.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-2.12f, -2.12f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(3.54f, -3.54f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(18.05f, 21.29f)
                close()
                moveTo(12.08f, 20.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(6.68f)
                curveTo(21.09f, 12.25f, 20.08f, 12.0f, 19.0f, 12.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f)
                curveTo(12.0f, 19.34f, 12.03f, 19.67f, 12.08f, 20.0f)
                close()
                moveTo(11.47f, 12.67f)
                curveToRelative(0.32f, 0.2f, 0.74f, 0.2f, 1.06f, 0.0f)
                lineToRelative(7.07f, -4.42f)
                curveTo(19.85f, 8.09f, 20.0f, 7.82f, 20.0f, 7.53f)
                curveToRelative(0.0f, -0.67f, -0.73f, -1.07f, -1.3f, -0.72f)
                lineTo(12.0f, 11.0f)
                lineTo(5.3f, 6.81f)
                curveTo(4.73f, 6.46f, 4.0f, 6.86f, 4.0f, 7.53f)
                curveToRelative(0.0f, 0.29f, 0.15f, 0.56f, 0.4f, 0.72f)
                lineTo(11.47f, 12.67f)
                close()
            }
        }
        .build()
        return _markEmailRead!!
    }

private var _markEmailRead: ImageVector? = null
