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

public val CssGgIcons.ArrowsV: ImageVector
    get() {
        if (_arrowsV != null) {
            return _arrowsV!!
        }
        _arrowsV = Builder(name = "ArrowsV", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7574f, 5.0408f)
                lineTo(9.1716f, 6.455f)
                lineTo(11.0001f, 4.6265f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0001f)
                verticalLineTo(4.6266f)
                lineTo(14.8284f, 6.455f)
                lineTo(16.2426f, 5.0408f)
                lineTo(12.0f, 0.7981f)
                lineTo(7.7574f, 5.0408f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2426f, 18.9593f)
                lineTo(14.8284f, 17.545f)
                lineTo(13.0001f, 19.3734f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0001f)
                verticalLineTo(19.3735f)
                lineTo(9.1716f, 17.545f)
                lineTo(7.7574f, 18.9593f)
                lineTo(12.0f, 23.2019f)
                lineTo(16.2426f, 18.9593f)
                close()
            }
        }
        .build()
        return _arrowsV!!
    }

private var _arrowsV: ImageVector? = null
