package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SubtitlesOff: ImageVector
    get() {
        if (_subtitlesOff != null) {
            return _subtitlesOff!!
        }
        _subtitlesOff = Builder(name = "SubtitlesOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                horizontalLineTo(6.83f)
                lineToRelative(8.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.17f)
                lineToRelative(4.93f, 4.93f)
                curveTo(21.91f, 18.65f, 22.0f, 18.34f, 22.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.9f, 21.1f, 4.0f, 20.0f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.04f, 3.87f)
                lineToRelative(1.2f, 1.2f)
                curveTo(2.09f, 5.35f, 2.0f, 5.66f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(13.17f)
                lineToRelative(2.96f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.45f, 2.45f)
                lineTo(1.04f, 3.87f)
                close()
                moveTo(8.0f, 12.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(8.0f)
                close()
                moveTo(14.0f, 16.83f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(9.17f)
                lineTo(14.0f, 16.83f)
                close()
            }
        }
        .build()
        return _subtitlesOff!!
    }

private var _subtitlesOff: ImageVector? = null
