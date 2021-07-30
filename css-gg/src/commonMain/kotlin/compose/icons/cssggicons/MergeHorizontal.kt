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

public val CssGgIcons.MergeHorizontal: ImageVector
    get() {
        if (_mergeHorizontal != null) {
            return _mergeHorizontal!!
        }
        _mergeHorizontal = Builder(name = "MergeHorizontal", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.9757f)
                lineTo(16.2426f, 4.7331f)
                lineTo(14.8284f, 3.3189f)
                lineTo(12.0f, 6.1473f)
                lineTo(9.1716f, 3.3189f)
                lineTo(7.7574f, 4.7331f)
                lineTo(12.0f, 8.9757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 11.9998f)
                curveTo(5.0f, 11.4475f, 5.4477f, 10.9997f, 6.0f, 10.9997f)
                horizontalLineTo(18.0f)
                curveTo(18.5523f, 10.9997f, 19.0f, 11.4475f, 19.0f, 11.9998f)
                curveTo(19.0f, 12.552f, 18.5523f, 12.9998f, 18.0f, 12.9998f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 12.9998f, 5.0f, 12.552f, 5.0f, 11.9998f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0242f)
                lineTo(7.7574f, 19.2668f)
                lineTo(9.1716f, 20.681f)
                lineTo(12.0f, 17.8526f)
                lineTo(14.8284f, 20.681f)
                lineTo(16.2426f, 19.2668f)
                lineTo(12.0f, 15.0242f)
                close()
            }
        }
        .build()
        return _mergeHorizontal!!
    }

private var _mergeHorizontal: ImageVector? = null
