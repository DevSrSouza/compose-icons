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

public val RoundGroup.CloseFullscreen: ImageVector
    get() {
        if (_closeFullscreen != null) {
            return _closeFullscreen!!
        }
        _closeFullscreen = Builder(name = "CloseFullscreen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.29f, 4.12f)
                lineToRelative(-4.59f, 4.59f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(0.63f, 0.63f, 0.18f, 1.71f, -0.71f, 1.71f)
                horizontalLineTo(13.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(6.41f)
                curveToRelative(0.0f, -0.89f, 1.08f, -1.34f, 1.71f, -0.71f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(4.59f, -4.59f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                verticalLineToRelative(0.0f)
                curveTo(21.68f, 3.1f, 21.68f, 3.73f, 21.29f, 4.12f)
                close()
                moveTo(4.12f, 21.29f)
                lineToRelative(4.59f, -4.59f)
                lineToRelative(1.59f, 1.59f)
                curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
                verticalLineTo(13.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(6.41f)
                curveToRelative(-0.89f, 0.0f, -1.34f, 1.08f, -0.71f, 1.71f)
                lineToRelative(1.59f, 1.59f)
                lineToRelative(-4.59f, 4.59f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveTo(3.1f, 21.68f, 3.73f, 21.68f, 4.12f, 21.29f)
                close()
            }
        }
        .build()
        return _closeFullscreen!!
    }

private var _closeFullscreen: ImageVector? = null
