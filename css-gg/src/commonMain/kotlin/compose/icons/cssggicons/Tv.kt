package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Tv: ImageVector
    get() {
        if (_tv != null) {
            return _tv!!
        }
        _tv = Builder(name = "Tv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 6.119f)
                lineTo(9.413f, 4.706f)
                lineTo(11.537f, 6.83f)
                lineTo(14.367f, 4.0f)
                lineTo(15.778f, 5.412f)
                lineTo(13.314f, 7.876f)
                horizontalLineTo(18.0f)
                curveTo(19.105f, 7.876f, 20.0f, 8.771f, 20.0f, 9.876f)
                verticalLineTo(16.876f)
                curveTo(20.0f, 17.98f, 19.105f, 18.876f, 18.0f, 18.876f)
                horizontalLineTo(6.0f)
                curveTo(4.895f, 18.876f, 4.0f, 17.98f, 4.0f, 16.876f)
                verticalLineTo(9.876f)
                curveTo(4.0f, 8.771f, 4.895f, 7.876f, 6.0f, 7.876f)
                horizontalLineTo(9.757f)
                lineTo(8.0f, 6.119f)
                close()
                moveTo(18.0f, 9.876f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.876f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.876f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 19.876f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.876f)
                horizontalLineTo(8.0f)
                verticalLineTo(19.876f)
                close()
            }
        }
        .build()
        return _tv!!
    }

private var _tv: ImageVector? = null
