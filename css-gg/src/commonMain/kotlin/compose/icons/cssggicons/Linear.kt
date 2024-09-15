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

public val CssGgIcons.Linear: ImageVector
    get() {
        if (_linear != null) {
            return _linear!!
        }
        _linear = Builder(name = "Linear", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.035f, 12.943f)
                curveTo(3.242f, 14.923f, 4.105f, 16.847f, 5.622f, 18.364f)
                curveTo(7.139f, 19.881f, 9.063f, 20.743f, 11.043f, 20.951f)
                lineTo(3.035f, 12.943f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 11.494f)
                lineTo(12.492f, 20.986f)
                curveTo(13.298f, 20.941f, 14.098f, 20.788f, 14.87f, 20.527f)
                lineTo(3.458f, 9.115f)
                curveTo(3.198f, 9.888f, 3.045f, 10.688f, 3.0f, 11.494f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.867f, 8.11f)
                lineTo(15.876f, 20.119f)
                curveTo(16.499f, 19.82f, 17.095f, 19.446f, 17.649f, 18.996f)
                lineTo(4.99f, 6.337f)
                curveTo(4.54f, 6.891f, 4.166f, 7.487f, 3.867f, 8.11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.663f, 5.595f)
                curveTo(9.181f, 2.121f, 14.849f, 2.135f, 18.35f, 5.636f)
                curveTo(21.851f, 9.137f, 21.865f, 14.805f, 18.391f, 18.323f)
                lineTo(5.663f, 5.595f)
                close()
            }
        }
        .build()
        return _linear!!
    }

private var _linear: ImageVector? = null
