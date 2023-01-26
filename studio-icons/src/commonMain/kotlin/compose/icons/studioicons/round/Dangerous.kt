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

public val RoundGroup.Dangerous: ImageVector
    get() {
        if (_dangerous != null) {
            return _dangerous!!
        }
        _dangerous = Builder(name = "Dangerous", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9f, 3.0f)
                horizontalLineTo(9.1f)
                curveTo(8.57f, 3.0f, 8.06f, 3.21f, 7.68f, 3.59f)
                lineToRelative(-4.1f, 4.1f)
                curveTo(3.21f, 8.06f, 3.0f, 8.57f, 3.0f, 9.1f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(4.1f, 4.1f)
                curveTo(8.06f, 20.79f, 8.57f, 21.0f, 9.1f, 21.0f)
                horizontalLineToRelative(5.8f)
                curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f)
                lineToRelative(4.1f, -4.1f)
                curveTo(20.79f, 15.94f, 21.0f, 15.43f, 21.0f, 14.9f)
                verticalLineTo(9.1f)
                curveToRelative(0.0f, -0.53f, -0.21f, -1.04f, -0.59f, -1.41f)
                lineToRelative(-4.1f, -4.1f)
                curveTo(15.94f, 3.21f, 15.43f, 3.0f, 14.9f, 3.0f)
                close()
                moveTo(15.54f, 15.54f)
                lineTo(15.54f, 15.54f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(12.0f, 13.41f)
                lineToRelative(-2.12f, 2.12f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(10.59f, 12.0f)
                lineTo(8.46f, 9.88f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(12.0f, 10.59f)
                lineToRelative(2.12f, -2.12f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(13.41f, 12.0f)
                lineToRelative(2.12f, 2.12f)
                curveTo(15.93f, 14.51f, 15.93f, 15.15f, 15.54f, 15.54f)
                close()
            }
        }
        .build()
        return _dangerous!!
    }

private var _dangerous: ImageVector? = null
