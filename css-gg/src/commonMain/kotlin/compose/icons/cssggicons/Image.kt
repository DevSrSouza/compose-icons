package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.0f, 7.0f)
                curveTo(5.3432f, 7.0f, 4.0f, 8.3432f, 4.0f, 10.0f)
                curveTo(4.0f, 11.6569f, 5.3432f, 13.0f, 7.0f, 13.0f)
                curveTo(8.6568f, 13.0f, 10.0f, 11.6569f, 10.0f, 10.0f)
                curveTo(10.0f, 8.3432f, 8.6568f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.4477f, 6.4477f, 9.0f, 7.0f, 9.0f)
                curveTo(7.5523f, 9.0f, 8.0f, 9.4477f, 8.0f, 10.0f)
                curveTo(8.0f, 10.5523f, 7.5523f, 11.0f, 7.0f, 11.0f)
                curveTo(6.4477f, 11.0f, 6.0f, 10.5523f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                curveTo(1.3432f, 3.0f, 0.0f, 4.3432f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 19.6569f, 1.3432f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.6569f, 21.0f, 24.0f, 19.6569f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.3432f, 22.6569f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4477f, 5.0f, 2.0f, 5.4477f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.5523f, 2.4477f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(7.3137f)
                lineTo(14.1924f, 12.1214f)
                curveTo(15.364f, 10.9498f, 17.2635f, 10.9498f, 18.435f, 12.1214f)
                lineTo(22.0f, 15.6863f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.4477f, 21.5523f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineTo(10.1422f)
                lineTo(15.6066f, 13.5356f)
                curveTo(15.9971f, 13.145f, 16.6303f, 13.145f, 17.0208f, 13.5356f)
                lineTo(21.907f, 18.4217f)
                curveTo(21.7479f, 18.7633f, 21.4016f, 19.0f, 21.0f, 19.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
