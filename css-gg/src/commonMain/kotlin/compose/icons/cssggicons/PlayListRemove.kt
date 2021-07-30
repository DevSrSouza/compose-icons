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
                moveTo(15.9644f, 4.6338f)
                horizontalLineTo(3.9644f)
                verticalLineTo(6.6338f)
                horizontalLineTo(15.9644f)
                verticalLineTo(4.6338f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9644f, 8.6338f)
                horizontalLineTo(3.9644f)
                verticalLineTo(10.6338f)
                horizontalLineTo(15.9644f)
                verticalLineTo(8.6338f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.9644f, 12.6338f)
                horizontalLineTo(11.9644f)
                verticalLineTo(14.6338f)
                horizontalLineTo(3.9644f)
                verticalLineTo(12.6338f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9645f, 13.7093f)
                lineTo(14.3787f, 12.295f)
                lineTo(16.5f, 14.4163f)
                lineTo(18.6213f, 12.2951f)
                lineTo(20.0355f, 13.7093f)
                lineTo(17.9142f, 15.8305f)
                lineTo(20.0356f, 17.9519f)
                lineTo(18.6214f, 19.3661f)
                lineTo(16.5f, 17.2447f)
                lineTo(14.3786f, 19.3661f)
                lineTo(12.9644f, 17.9519f)
                lineTo(15.0858f, 15.8305f)
                lineTo(12.9645f, 13.7093f)
                close()
            }
        }
        .build()
        return _playListRemove!!
    }

private var _playListRemove: ImageVector? = null
