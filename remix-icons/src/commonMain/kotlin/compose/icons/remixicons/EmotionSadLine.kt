package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EmotionSadLine: ImageVector
    get() {
        if (_emotionSadLine != null) {
            return _emotionSadLine!!
        }
        _emotionSadLine = Builder(name = "EmotionSadLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                curveToRelative(0.0f, 0.727f, -0.077f, 1.435f, -0.225f, 2.118f)
                lineToRelative(-1.782f, -1.783f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -4.375f, 6.801f)
                arcToRelative(3.997f, 3.997f, 0.0f, false, false, 1.555f, 1.423f)
                arcTo(9.956f, 9.956f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(19.0f, 14.172f)
                lineToRelative(1.414f, 1.414f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -2.93f, 0.11f)
                lineToRelative(0.102f, -0.11f)
                lineTo(19.0f, 14.172f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(1.466f, 0.0f, 2.785f, 0.631f, 3.7f, 1.637f)
                lineToRelative(-0.945f, 0.86f)
                curveTo(13.965f, 17.182f, 13.018f, 17.0f, 12.0f, 17.0f)
                curveToRelative(-1.018f, 0.0f, -1.965f, 0.183f, -2.755f, 0.496f)
                lineToRelative(-0.945f, -0.86f)
                arcTo(4.987f, 4.987f, 0.0f, false, true, 12.0f, 15.0f)
                close()
                moveTo(8.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
                moveTo(15.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _emotionSadLine!!
    }

private var _emotionSadLine: ImageVector? = null
