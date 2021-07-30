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

public val CssGgIcons.External: ImageVector
    get() {
        if (_external != null) {
            return _external!!
        }
        _external = Builder(name = "External", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.6396f, 7.0253f)
                horizontalLineTo(12.0181f)
                verticalLineTo(5.0253f)
                horizontalLineTo(19.0181f)
                verticalLineTo(12.0253f)
                horizontalLineTo(17.0181f)
                verticalLineTo(8.4753f)
                lineTo(12.1042f, 13.3892f)
                lineTo(10.6899f, 11.975f)
                lineTo(15.6396f, 7.0253f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.9819f, 6.9747f)
                horizontalLineTo(4.9819f)
                verticalLineTo(18.9747f)
                horizontalLineTo(16.9819f)
                verticalLineTo(12.9747f)
                horizontalLineTo(14.9819f)
                verticalLineTo(16.9747f)
                horizontalLineTo(6.9819f)
                verticalLineTo(8.9747f)
                horizontalLineTo(10.9819f)
                verticalLineTo(6.9747f)
                close()
            }
        }
        .build()
        return _external!!
    }

private var _external: ImageVector? = null
