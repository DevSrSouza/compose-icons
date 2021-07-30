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
                curveTo(14.2091f, 18.939f, 16.0f, 17.1482f, 16.0f, 14.939f)
                curveTo(16.0f, 12.7299f, 14.2091f, 10.939f, 12.0f, 10.939f)
                curveTo(9.7909f, 10.939f, 8.0f, 12.7299f, 8.0f, 14.939f)
                curveTo(8.0f, 17.1482f, 9.7909f, 18.939f, 12.0f, 18.939f)
                close()
                moveTo(12.0f, 16.939f)
                curveTo(13.1046f, 16.939f, 14.0f, 16.0436f, 14.0f, 14.939f)
                curveTo(14.0f, 13.8345f, 13.1046f, 12.939f, 12.0f, 12.939f)
                curveTo(10.8954f, 12.939f, 10.0f, 13.8345f, 10.0f, 14.939f)
                curveTo(10.0f, 16.0436f, 10.8954f, 16.939f, 12.0f, 16.939f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.044f)
                curveTo(13.1046f, 9.044f, 14.0f, 8.1486f, 14.0f, 7.044f)
                curveTo(14.0f, 5.9394f, 13.1046f, 5.044f, 12.0f, 5.044f)
                curveTo(10.8954f, 5.044f, 10.0f, 5.9394f, 10.0f, 7.044f)
                curveTo(10.0f, 8.1486f, 10.8954f, 9.044f, 12.0f, 9.044f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 1.0f)
                curveTo(5.3432f, 1.0f, 4.0f, 2.3431f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.6569f, 5.3432f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(18.6569f, 23.0f, 20.0f, 21.6569f, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(20.0f, 2.3431f, 18.6569f, 1.0f, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                close()
                moveTo(17.0f, 3.0f)
                horizontalLineTo(7.0f)
                curveTo(6.4477f, 3.0f, 6.0f, 3.4477f, 6.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(6.0f, 20.5523f, 6.4477f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(17.5523f, 21.0f, 18.0f, 20.5523f, 18.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 3.4477f, 17.5523f, 3.0f, 17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _musicSpeaker!!
    }

private var _musicSpeaker: ImageVector? = null
