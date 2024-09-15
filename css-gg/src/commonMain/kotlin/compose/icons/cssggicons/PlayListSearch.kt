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

public val CssGgIcons.PlayListSearch: ImageVector
    get() {
        if (_playListSearch != null) {
            return _playListSearch!!
        }
        _playListSearch = Builder(name = "PlayListSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.879f, 4.879f)
                horizontalLineTo(3.879f)
                verticalLineTo(6.879f)
                horizontalLineTo(15.879f)
                verticalLineTo(4.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.879f, 8.879f)
                horizontalLineTo(3.879f)
                verticalLineTo(10.879f)
                horizontalLineTo(15.879f)
                verticalLineTo(8.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.879f, 12.879f)
                horizontalLineTo(11.879f)
                verticalLineTo(14.879f)
                horizontalLineTo(3.879f)
                verticalLineTo(12.879f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.757f, 12.757f)
                curveTo(12.586f, 13.929f, 12.586f, 15.828f, 13.757f, 17.0f)
                curveTo(14.681f, 17.924f, 16.057f, 18.119f, 17.172f, 17.586f)
                lineTo(18.707f, 19.121f)
                lineTo(20.121f, 17.707f)
                lineTo(18.586f, 16.172f)
                curveTo(19.119f, 15.057f, 18.924f, 13.681f, 18.0f, 12.757f)
                curveTo(16.828f, 11.586f, 14.929f, 11.586f, 13.757f, 12.757f)
                close()
                moveTo(15.172f, 15.586f)
                curveTo(15.562f, 15.976f, 16.195f, 15.976f, 16.586f, 15.586f)
                curveTo(16.976f, 15.195f, 16.976f, 14.562f, 16.586f, 14.172f)
                curveTo(16.195f, 13.781f, 15.562f, 13.781f, 15.172f, 14.172f)
                curveTo(14.781f, 14.562f, 14.781f, 15.195f, 15.172f, 15.586f)
                close()
            }
        }
        .build()
        return _playListSearch!!
    }

private var _playListSearch: ImageVector? = null
