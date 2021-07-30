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

public val CssGgIcons.Photoscan: ImageVector
    get() {
        if (_photoscan != null) {
            return _photoscan!!
        }
        _photoscan = Builder(name = "Photoscan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                curveTo(9.5523f, 8.0f, 10.0f, 7.5523f, 10.0f, 7.0f)
                curveTo(10.0f, 6.4477f, 9.5523f, 6.0f, 9.0f, 6.0f)
                curveTo(8.4477f, 6.0f, 8.0f, 6.4477f, 8.0f, 7.0f)
                curveTo(8.0f, 7.5523f, 8.4477f, 8.0f, 9.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.0f, 3.0f)
                curveTo(18.1046f, 3.0f, 19.0f, 3.8954f, 19.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(19.0f, 20.1046f, 18.1046f, 21.0f, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(5.8954f, 21.0f, 5.0f, 20.1046f, 5.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(5.0f, 3.8954f, 5.8954f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(12.4649f, 5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                lineTo(7.0f, 10.4649f)
                curveTo(7.5883f, 10.8052f, 8.2714f, 11.0f, 9.0f, 11.0f)
                curveTo(11.2091f, 11.0f, 13.0f, 9.2091f, 13.0f, 7.0f)
                curveTo(13.0f, 6.2714f, 12.8052f, 5.5883f, 12.4649f, 5.0f)
                close()
                moveTo(9.0f, 5.0f)
                curveTo(7.8954f, 5.0f, 7.0f, 5.8954f, 7.0f, 7.0f)
                curveTo(7.0f, 8.1046f, 7.8954f, 9.0f, 9.0f, 9.0f)
                curveTo(10.1046f, 9.0f, 11.0f, 8.1046f, 11.0f, 7.0f)
                curveTo(11.0f, 5.8954f, 10.1046f, 5.0f, 9.0f, 5.0f)
                close()
            }
        }
        .build()
        return _photoscan!!
    }

private var _photoscan: ImageVector? = null
