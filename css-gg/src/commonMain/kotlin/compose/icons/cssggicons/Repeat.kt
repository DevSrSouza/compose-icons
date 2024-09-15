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

public val CssGgIcons.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.37f, 8.0f)
                lineTo(13.87f, 10.598f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.89f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.89f)
                verticalLineTo(7.0f)
                horizontalLineTo(13.87f)
                verticalLineTo(5.402f)
                lineTo(18.37f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.13f, 17.0f)
                horizontalLineTo(19.11f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.11f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.13f)
                verticalLineTo(13.402f)
                lineTo(5.63f, 16.0f)
                lineTo(10.13f, 18.598f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
