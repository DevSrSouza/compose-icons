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
                curveTo(5.343f, 7.0f, 4.0f, 8.343f, 4.0f, 10.0f)
                curveTo(4.0f, 11.657f, 5.343f, 13.0f, 7.0f, 13.0f)
                curveTo(8.657f, 13.0f, 10.0f, 11.657f, 10.0f, 10.0f)
                curveTo(10.0f, 8.343f, 8.657f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(6.0f, 10.0f)
                curveTo(6.0f, 9.448f, 6.448f, 9.0f, 7.0f, 9.0f)
                curveTo(7.552f, 9.0f, 8.0f, 9.448f, 8.0f, 10.0f)
                curveTo(8.0f, 10.552f, 7.552f, 11.0f, 7.0f, 11.0f)
                curveTo(6.448f, 11.0f, 6.0f, 10.552f, 6.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 3.0f)
                curveTo(1.343f, 3.0f, 0.0f, 4.343f, 0.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(0.0f, 19.657f, 1.343f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.657f, 21.0f, 24.0f, 19.657f, 24.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(24.0f, 4.343f, 22.657f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                close()
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                curveTo(2.448f, 5.0f, 2.0f, 5.448f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 18.552f, 2.448f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(7.314f)
                lineTo(14.192f, 12.121f)
                curveTo(15.364f, 10.95f, 17.264f, 10.95f, 18.435f, 12.121f)
                lineTo(22.0f, 15.686f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 5.448f, 21.552f, 5.0f, 21.0f, 5.0f)
                close()
                moveTo(21.0f, 19.0f)
                horizontalLineTo(10.142f)
                lineTo(15.607f, 13.536f)
                curveTo(15.997f, 13.145f, 16.63f, 13.145f, 17.021f, 13.536f)
                lineTo(21.907f, 18.422f)
                curveTo(21.748f, 18.763f, 21.402f, 19.0f, 21.0f, 19.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
