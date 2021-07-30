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

public val CssGgIcons.MergeVertical: ImageVector
    get() {
        if (_mergeVertical != null) {
            return _mergeVertical!!
        }
        _mergeVertical = Builder(name = "MergeVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.9758f, 12.0f)
                lineTo(4.7331f, 7.7574f)
                lineTo(3.3189f, 9.1716f)
                lineTo(6.1473f, 12.0f)
                lineTo(3.3189f, 14.8284f)
                lineTo(4.7331f, 16.2426f)
                lineTo(8.9758f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.9998f, 19.0f)
                curveTo(11.4475f, 19.0f, 10.9998f, 18.5523f, 10.9998f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(10.9998f, 5.4477f, 11.4475f, 5.0f, 11.9998f, 5.0f)
                curveTo(12.5521f, 5.0f, 12.9998f, 5.4477f, 12.9998f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(12.9998f, 18.5523f, 12.5521f, 19.0f, 11.9998f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0242f, 12.0f)
                lineTo(19.2669f, 16.2426f)
                lineTo(20.6811f, 14.8284f)
                lineTo(17.8527f, 12.0f)
                lineTo(20.6811f, 9.1716f)
                lineTo(19.2669f, 7.7574f)
                lineTo(15.0242f, 12.0f)
                close()
            }
        }
        .build()
        return _mergeVertical!!
    }

private var _mergeVertical: ImageVector? = null
