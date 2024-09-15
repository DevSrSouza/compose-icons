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
                moveTo(12.0f, 8.976f)
                lineTo(16.243f, 4.733f)
                lineTo(14.828f, 3.319f)
                lineTo(12.0f, 6.147f)
                lineTo(9.172f, 3.319f)
                lineTo(7.757f, 4.733f)
                lineTo(12.0f, 8.976f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.0f)
                curveTo(5.0f, 11.448f, 5.448f, 11.0f, 6.0f, 11.0f)
                horizontalLineTo(18.0f)
                curveTo(18.552f, 11.0f, 19.0f, 11.448f, 19.0f, 12.0f)
                curveTo(19.0f, 12.552f, 18.552f, 13.0f, 18.0f, 13.0f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 13.0f, 5.0f, 12.552f, 5.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.024f)
                lineTo(7.757f, 19.267f)
                lineTo(9.172f, 20.681f)
                lineTo(12.0f, 17.853f)
                lineTo(14.828f, 20.681f)
                lineTo(16.243f, 19.267f)
                lineTo(12.0f, 15.024f)
                close()
            }
        }
        .build()
        return _mergeHorizontal!!
    }

private var _mergeHorizontal: ImageVector? = null
