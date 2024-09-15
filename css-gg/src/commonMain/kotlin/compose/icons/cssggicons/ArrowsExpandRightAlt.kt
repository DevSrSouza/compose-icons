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

public val CssGgIcons.ArrowsExpandRightAlt: ImageVector
    get() {
        if (_arrowsExpandRightAlt != null) {
            return _arrowsExpandRightAlt!!
        }
        _arrowsExpandRightAlt = Builder(name = "ArrowsExpandRightAlt", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.899f, 2.101f)
                verticalLineTo(4.101f)
                horizontalLineTo(18.485f)
                lineTo(12.707f, 9.879f)
                lineTo(14.121f, 11.293f)
                lineTo(19.899f, 5.515f)
                verticalLineTo(10.101f)
                horizontalLineTo(21.899f)
                verticalLineTo(2.101f)
                horizontalLineTo(13.899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.515f, 19.899f)
                horizontalLineTo(10.101f)
                verticalLineTo(21.899f)
                horizontalLineTo(2.1f)
                verticalLineTo(13.899f)
                horizontalLineTo(4.1f)
                verticalLineTo(18.485f)
                lineTo(9.879f, 12.707f)
                lineTo(11.293f, 14.121f)
                lineTo(5.515f, 19.899f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.172f, 7.757f)
                lineTo(7.757f, 9.172f)
                lineTo(14.828f, 16.243f)
                lineTo(16.243f, 14.828f)
                lineTo(9.172f, 7.757f)
                close()
            }
        }
        .build()
        return _arrowsExpandRightAlt!!
    }

private var _arrowsExpandRightAlt: ImageVector? = null
