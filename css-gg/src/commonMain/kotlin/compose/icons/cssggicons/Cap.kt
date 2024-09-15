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

public val CssGgIcons.Cap: ImageVector
    get() {
        if (_cap != null) {
            return _cap!!
        }
        _cap = Builder(name = "Cap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.988f, 3.22f)
                curveTo(13.996f, 3.148f, 14.0f, 3.074f, 14.0f, 3.0f)
                curveTo(14.0f, 1.895f, 13.105f, 1.0f, 12.0f, 1.0f)
                curveTo(10.895f, 1.0f, 10.0f, 1.895f, 10.0f, 3.0f)
                curveTo(10.0f, 3.074f, 10.004f, 3.148f, 10.012f, 3.22f)
                curveTo(5.998f, 4.125f, 3.0f, 7.713f, 3.0f, 12.0f)
                curveTo(3.0f, 12.388f, 3.025f, 12.771f, 3.072f, 13.146f)
                curveTo(1.869f, 13.537f, 1.0f, 14.667f, 1.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.657f, 2.343f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 23.0f, 23.0f, 21.657f, 23.0f, 20.0f)
                verticalLineTo(16.0f)
                curveTo(23.0f, 14.667f, 22.131f, 13.537f, 20.928f, 13.146f)
                curveTo(20.975f, 12.771f, 21.0f, 12.388f, 21.0f, 12.0f)
                curveTo(21.0f, 7.713f, 18.002f, 4.125f, 13.988f, 3.22f)
                close()
                moveTo(12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 12.34f, 5.024f, 12.674f, 5.071f, 13.0f)
                horizontalLineTo(18.929f)
                curveTo(18.976f, 12.674f, 19.0f, 12.34f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 15.448f, 3.448f, 15.0f, 4.0f, 15.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 15.0f, 21.0f, 15.448f, 21.0f, 16.0f)
                verticalLineTo(20.0f)
                curveTo(21.0f, 20.552f, 20.552f, 21.0f, 20.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 21.0f, 3.0f, 20.552f, 3.0f, 20.0f)
                verticalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _cap!!
    }

private var _cap: ImageVector? = null
