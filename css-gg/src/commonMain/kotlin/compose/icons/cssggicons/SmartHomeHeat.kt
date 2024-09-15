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

public val CssGgIcons.SmartHomeHeat: ImageVector
    get() {
        if (_smartHomeHeat != null) {
            return _smartHomeHeat!!
        }
        _smartHomeHeat = Builder(name = "SmartHomeHeat", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 11.0f)
                horizontalLineTo(7.0f)
                curveTo(6.448f, 11.0f, 6.0f, 11.448f, 6.0f, 12.0f)
                curveTo(6.0f, 12.552f, 6.448f, 13.0f, 7.0f, 13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                curveTo(5.343f, 15.0f, 4.0f, 13.657f, 4.0f, 12.0f)
                curveTo(4.0f, 10.343f, 5.343f, 9.0f, 7.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(18.657f, 9.0f, 20.0f, 10.343f, 20.0f, 12.0f)
                curveTo(20.0f, 13.657f, 18.657f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                curveTo(17.552f, 13.0f, 18.0f, 12.552f, 18.0f, 12.0f)
                curveTo(18.0f, 11.448f, 17.552f, 11.0f, 17.0f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(0.0f, 12.0f)
                curveTo(0.0f, 8.134f, 3.134f, 5.0f, 7.0f, 5.0f)
                horizontalLineTo(17.0f)
                curveTo(20.866f, 5.0f, 24.0f, 8.134f, 24.0f, 12.0f)
                curveTo(24.0f, 15.866f, 20.866f, 19.0f, 17.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(3.134f, 19.0f, 0.0f, 15.866f, 0.0f, 12.0f)
                close()
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                curveTo(19.761f, 7.0f, 22.0f, 9.239f, 22.0f, 12.0f)
                curveTo(22.0f, 14.761f, 19.761f, 17.0f, 17.0f, 17.0f)
                horizontalLineTo(7.0f)
                curveTo(4.239f, 17.0f, 2.0f, 14.761f, 2.0f, 12.0f)
                curveTo(2.0f, 9.239f, 4.239f, 7.0f, 7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _smartHomeHeat!!
    }

private var _smartHomeHeat: ImageVector? = null
