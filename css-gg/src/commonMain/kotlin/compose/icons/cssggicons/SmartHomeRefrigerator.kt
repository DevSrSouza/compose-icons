package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.SmartHomeRefrigerator: ImageVector
    get() {
        if (_smartHomeRefrigerator != null) {
            return _smartHomeRefrigerator!!
        }
        _smartHomeRefrigerator = Builder(name = "SmartHomeRefrigerator", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.0f)
                curveTo(9.0f, 5.448f, 9.448f, 5.0f, 10.0f, 5.0f)
                curveTo(10.552f, 5.0f, 11.0f, 5.448f, 11.0f, 6.0f)
                verticalLineTo(8.0f)
                curveTo(11.0f, 8.552f, 10.552f, 9.0f, 10.0f, 9.0f)
                curveTo(9.448f, 9.0f, 9.0f, 8.552f, 9.0f, 8.0f)
                verticalLineTo(6.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 13.0f)
                curveTo(9.448f, 13.0f, 9.0f, 13.448f, 9.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(9.0f, 16.552f, 9.448f, 17.0f, 10.0f, 17.0f)
                curveTo(10.552f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                verticalLineTo(14.0f)
                curveTo(11.0f, 13.448f, 10.552f, 13.0f, 10.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 4.0f)
                curveTo(5.0f, 2.343f, 6.343f, 1.0f, 8.0f, 1.0f)
                horizontalLineTo(16.0f)
                curveTo(17.657f, 1.0f, 19.0f, 2.343f, 19.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(19.0f, 21.657f, 17.657f, 23.0f, 16.0f, 23.0f)
                horizontalLineTo(8.0f)
                curveTo(6.343f, 23.0f, 5.0f, 21.657f, 5.0f, 20.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(8.0f, 3.0f)
                horizontalLineTo(16.0f)
                curveTo(16.552f, 3.0f, 17.0f, 3.448f, 17.0f, 4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                curveTo(7.0f, 3.448f, 7.448f, 3.0f, 8.0f, 3.0f)
                close()
                moveTo(7.0f, 12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                curveTo(17.0f, 20.552f, 16.552f, 21.0f, 16.0f, 21.0f)
                horizontalLineTo(8.0f)
                curveTo(7.448f, 21.0f, 7.0f, 20.552f, 7.0f, 20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _smartHomeRefrigerator!!
    }

private var _smartHomeRefrigerator: ImageVector? = null
