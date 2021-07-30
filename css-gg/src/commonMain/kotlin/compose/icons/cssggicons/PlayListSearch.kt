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
                moveTo(15.8787f, 4.8787f)
                horizontalLineTo(3.8787f)
                verticalLineTo(6.8787f)
                horizontalLineTo(15.8787f)
                verticalLineTo(4.8787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8787f, 8.8787f)
                horizontalLineTo(3.8787f)
                verticalLineTo(10.8787f)
                horizontalLineTo(15.8787f)
                verticalLineTo(8.8787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.8787f, 12.8787f)
                horizontalLineTo(11.8787f)
                verticalLineTo(14.8787f)
                horizontalLineTo(3.8787f)
                verticalLineTo(12.8787f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.7574f, 12.7573f)
                curveTo(12.5858f, 13.9289f, 12.5858f, 15.8284f, 13.7574f, 17.0f)
                curveTo(14.681f, 17.9236f, 16.0571f, 18.1191f, 17.1722f, 17.5864f)
                lineTo(18.7071f, 19.1213f)
                lineTo(20.1213f, 17.7071f)
                lineTo(18.5864f, 16.1722f)
                curveTo(19.1191f, 15.057f, 18.9236f, 13.681f, 18.0f, 12.7573f)
                curveTo(16.8284f, 11.5858f, 14.9289f, 11.5858f, 13.7574f, 12.7573f)
                close()
                moveTo(15.1716f, 15.5858f)
                curveTo(15.5621f, 15.9763f, 16.1953f, 15.9763f, 16.5858f, 15.5858f)
                curveTo(16.9763f, 15.1952f, 16.9763f, 14.5621f, 16.5858f, 14.1716f)
                curveTo(16.1953f, 13.781f, 15.5621f, 13.781f, 15.1716f, 14.1716f)
                curveTo(14.7811f, 14.5621f, 14.7811f, 15.1952f, 15.1716f, 15.5858f)
                close()
            }
        }
        .build()
        return _playListSearch!!
    }

private var _playListSearch: ImageVector? = null
