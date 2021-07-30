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

public val CssGgIcons.CPlusPlus: ImageVector
    get() {
        if (_cPlusPlus != null) {
            return _cPlusPlus!!
        }
        _cPlusPlus = Builder(name = "CPlusPlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.207f, 16.278f)
                curveTo(11.1241f, 17.343f, 9.6388f, 18.0f, 8.0f, 18.0f)
                curveTo(4.6863f, 18.0f, 2.0f, 15.3137f, 2.0f, 12.0f)
                curveTo(2.0f, 8.6863f, 4.6863f, 6.0f, 8.0f, 6.0f)
                curveTo(9.6749f, 6.0f, 11.1896f, 6.6863f, 12.278f, 7.793f)
                lineTo(13.6923f, 6.3788f)
                curveTo(12.2418f, 4.9101f, 10.2272f, 4.0f, 8.0f, 4.0f)
                curveTo(3.5817f, 4.0f, 0.0f, 7.5817f, 0.0f, 12.0f)
                curveTo(0.0f, 16.4183f, 3.5817f, 20.0f, 8.0f, 20.0f)
                curveTo(10.1911f, 20.0f, 12.1764f, 19.1192f, 13.6212f, 17.6923f)
                lineTo(12.207f, 16.278f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 9.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _cPlusPlus!!
    }

private var _cPlusPlus: ImageVector? = null
