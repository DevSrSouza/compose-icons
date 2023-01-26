package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SubtitlesOff: ImageVector
    get() {
        if (_subtitlesOff != null) {
            return _subtitlesOff!!
        }
        _subtitlesOff = Builder(name = "SubtitlesOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.83f, 4.0f)
                lineToRelative(8.0f, 8.0f)
                lineToRelative(5.17f, 0.0f)
                lineToRelative(0.0f, 2.0f)
                lineToRelative(-3.17f, 0.0f)
                lineToRelative(5.17f, 5.17f)
                lineToRelative(0.0f, -15.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.04f, 3.87f)
                lineTo(2.0f, 4.83f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(15.17f)
                lineToRelative(2.96f, 2.96f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.45f, 2.45f)
                lineTo(1.04f, 3.87f)
                close()
                moveTo(4.0f, 12.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(12.0f)
                close()
                moveTo(4.0f, 16.0f)
                horizontalLineToRelative(9.17f)
                lineTo(14.0f, 16.83f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _subtitlesOff!!
    }

private var _subtitlesOff: ImageVector? = null
