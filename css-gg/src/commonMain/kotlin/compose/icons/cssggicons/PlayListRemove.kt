package compose.icons.cssggicons

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
import compose.icons.CssGgIcons

public val CssGgIcons.PlayListRemove: ImageVector
    get() {
        if (_playListRemove != null) {
            return _playListRemove!!
        }
        _playListRemove = Builder(name = "PlayListRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.964f, 4.634f)
                horizontalLineTo(3.964f)
                verticalLineTo(6.634f)
                horizontalLineTo(15.964f)
                verticalLineTo(4.634f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.964f, 8.634f)
                horizontalLineTo(3.964f)
                verticalLineTo(10.634f)
                horizontalLineTo(15.964f)
                verticalLineTo(8.634f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.964f, 12.634f)
                horizontalLineTo(11.964f)
                verticalLineTo(14.634f)
                horizontalLineTo(3.964f)
                verticalLineTo(12.634f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.965f, 13.709f)
                lineTo(14.379f, 12.295f)
                lineTo(16.5f, 14.416f)
                lineTo(18.621f, 12.295f)
                lineTo(20.035f, 13.709f)
                lineTo(17.914f, 15.83f)
                lineTo(20.036f, 17.952f)
                lineTo(18.621f, 19.366f)
                lineTo(16.5f, 17.245f)
                lineTo(14.379f, 19.366f)
                lineTo(12.964f, 17.952f)
                lineTo(15.086f, 15.83f)
                lineTo(12.965f, 13.709f)
                close()
            }
        }
        .build()
        return _playListRemove!!
    }

private var _playListRemove: ImageVector? = null
