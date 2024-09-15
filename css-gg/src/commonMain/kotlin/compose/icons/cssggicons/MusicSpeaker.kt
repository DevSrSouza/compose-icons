package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import compose.icons.CssGgIcons

public val CssGgIcons.MusicSpeaker: ImageVector
    get() {
        if (_musicSpeaker != null) {
            return _musicSpeaker!!
        }
        _musicSpeaker = Builder(name = "MusicSpeaker", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 18.939f)
                curveTo(14.209f, 18.939f, 16.0f, 17.148f, 16.0f, 14.939f)
                curveTo(16.0f, 12.73f, 14.209f, 10.939f, 12.0f, 10.939f)
                curveTo(9.791f, 10.939f, 8.0f, 12.73f, 8.0f, 14.939f)
                curveTo(8.0f, 17.148f, 9.791f, 18.939f, 12.0f, 18.939f)
                close()
                moveTo(12.0f, 16.939f)
                curveTo(13.105f, 16.939f, 14.0f, 16.044f, 14.0f, 14.939f)
                curveTo(14.0f, 13.835f, 13.105f, 12.939f, 12.0f, 12.939f)
                curveTo(10.895f, 12.939f, 10.0f, 13.835f, 10.0f, 14.939f)
                curveTo(10.0f, 16.044f, 10.895f, 16.939f, 12.0f, 16.939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.044f)
                curveTo(13.105f, 9.044f, 14.0f, 8.149f, 14.0f, 7.044f)
                curveTo(14.0f, 5.939f, 13.105f, 5.044f, 12.0f, 5.044f)
                curveTo(10.895f, 5.044f, 10.0f, 5.939f, 10.0f, 7.044f)
                curveTo(10.0f, 8.149f, 10.895f, 9.044f, 12.0f, 9.044f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 1.0f)
                curveTo(5.343f, 1.0f, 4.0f, 2.343f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.657f, 5.343f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(18.657f, 23.0f, 20.0f, 21.657f, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.343f, 18.657f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 3.0f, 6.0f, 3.448f, 6.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 20.552f, 6.448f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 21.0f, 18.0f, 20.552f, 18.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 3.448f, 17.552f, 3.0f, 17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _musicSpeaker!!
    }

private var _musicSpeaker: ImageVector? = null
