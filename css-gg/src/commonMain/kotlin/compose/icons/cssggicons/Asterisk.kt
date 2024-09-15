package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Asterisk: ImageVector
    get() {
        if (_asterisk != null) {
            return _asterisk!!
        }
        _asterisk = Builder(name = "Asterisk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(10.079f)
                lineTo(16.341f, 7.739f)
                lineTo(17.489f, 9.378f)
                lineTo(13.743f, 12.0f)
                lineTo(17.489f, 14.622f)
                lineTo(16.341f, 16.261f)
                lineTo(13.0f, 13.921f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.921f)
                lineTo(7.659f, 16.261f)
                lineTo(6.511f, 14.622f)
                lineTo(10.257f, 12.0f)
                lineTo(6.511f, 9.378f)
                lineTo(7.659f, 7.739f)
                lineTo(11.0f, 10.079f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _asterisk!!
    }

private var _asterisk: ImageVector? = null
