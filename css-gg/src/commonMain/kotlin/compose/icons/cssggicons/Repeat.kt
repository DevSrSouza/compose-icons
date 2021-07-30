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
                moveTo(18.3701f, 7.9999f)
                lineTo(13.8701f, 10.598f)
                verticalLineTo(8.9999f)
                horizontalLineTo(6.8899f)
                verticalLineTo(12.9999f)
                horizontalLineTo(4.8899f)
                verticalLineTo(6.9999f)
                horizontalLineTo(13.8701f)
                verticalLineTo(5.4019f)
                lineTo(18.3701f, 7.9999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1299f, 16.9999f)
                horizontalLineTo(19.1101f)
                verticalLineTo(10.9999f)
                horizontalLineTo(17.1101f)
                verticalLineTo(14.9999f)
                horizontalLineTo(10.1299f)
                verticalLineTo(13.4019f)
                lineTo(5.6299f, 15.9999f)
                lineTo(10.1299f, 18.598f)
                verticalLineTo(16.9999f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
