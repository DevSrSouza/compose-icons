package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.0f, 3.0f)
                verticalLineTo(3.2899f)
                curveTo(16.8915f, 4.1504f, 19.0f, 6.829f, 19.0f, 10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                curveTo(5.0f, 6.829f, 7.1085f, 4.1504f, 10.0f, 3.2899f)
                verticalLineTo(3.0f)
                curveTo(10.0f, 1.8954f, 10.8954f, 1.0f, 12.0f, 1.0f)
                curveTo(13.1046f, 1.0f, 14.0f, 1.8954f, 14.0f, 3.0f)
                close()
                moveTo(7.0f, 17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                curveTo(17.0f, 7.2386f, 14.7614f, 5.0f, 12.0f, 5.0f)
                curveTo(9.2386f, 5.0f, 7.0f, 7.2386f, 7.0f, 10.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(14.0f, 21.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                curveTo(10.0f, 22.1046f, 10.8954f, 23.0f, 12.0f, 23.0f)
                curveTo(13.1046f, 23.0f, 14.0f, 22.1046f, 14.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
