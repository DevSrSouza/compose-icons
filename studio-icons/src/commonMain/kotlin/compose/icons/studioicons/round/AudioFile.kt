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

public val RoundGroup.AudioFile: ImageVector
    get() {
        if (_audioFile != null) {
            return _audioFile!!
        }
        _audioFile = Builder(name = "AudioFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.41f, 7.41f)
                lineToRelative(-4.83f, -4.83f)
                curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.9f, 2.0f, 4.01f, 2.9f, 4.01f, 4.0f)
                lineTo(4.0f, 20.0f)
                curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f)
                horizontalLineTo(18.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineTo(8.83f)
                curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f)
                close()
                moveTo(15.0f, 13.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.61f)
                curveToRelative(0.0f, 1.28f, -1.0f, 2.41f, -2.28f, 2.39f)
                curveToRelative(-1.44f, -0.02f, -2.56f, -1.39f, -2.13f, -2.91f)
                curveToRelative(0.21f, -0.72f, 0.8f, -1.31f, 1.53f, -1.51f)
                curveToRelative(0.7f, -0.19f, 1.36f, -0.05f, 1.88f, 0.29f)
                verticalLineTo(12.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(16.0f, 12.55f, 15.55f, 13.0f, 15.0f, 13.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(3.5f)
                lineTo(18.5f, 9.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _audioFile!!
    }

private var _audioFile: ImageVector? = null
