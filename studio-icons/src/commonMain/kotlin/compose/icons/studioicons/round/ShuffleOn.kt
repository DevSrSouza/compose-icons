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

public val RoundGroup.ShuffleOn: ImageVector
    get() {
        if (_shuffleOn != null) {
            return _shuffleOn!!
        }
        _shuffleOn = Builder(name = "ShuffleOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 1.0f, 1.0f, 1.9f, 1.0f, 3.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(3.0f)
                curveTo(23.0f, 1.9f, 22.1f, 1.0f, 21.0f, 1.0f)
                close()
                moveTo(4.3f, 4.7f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(4.47f, 4.47f)
                lineToRelative(-1.42f, 1.4f)
                lineTo(4.3f, 6.11f)
                curveTo(3.91f, 5.72f, 3.91f, 5.09f, 4.3f, 4.7f)
                close()
                moveTo(19.59f, 19.5f)
                curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineTo(15.3f)
                curveToRelative(-0.45f, 0.0f, -0.67f, -0.54f, -0.36f, -0.85f)
                lineToRelative(1.2f, -1.2f)
                lineToRelative(-3.13f, -3.13f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.13f, 3.14f)
                lineToRelative(1.19f, -1.19f)
                curveToRelative(0.31f, -0.32f, 0.85f, -0.1f, 0.85f, 0.35f)
                verticalLineTo(19.5f)
                close()
                moveTo(19.59f, 8.29f)
                curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.36f)
                lineToRelative(-1.19f, -1.19f)
                lineTo(5.7f, 19.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(16.13f, 6.04f)
                lineToRelative(-1.19f, -1.19f)
                curveTo(14.63f, 4.54f, 14.85f, 4.0f, 15.3f, 4.0f)
                horizontalLineToRelative(3.79f)
                curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(8.29f)
                close()
            }
        }
        .build()
        return _shuffleOn!!
    }

private var _shuffleOn: ImageVector? = null
