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

public val CssGgIcons.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 16.0f)
                curveTo(14.209f, 16.0f, 16.0f, 14.209f, 16.0f, 12.0f)
                curveTo(16.0f, 9.791f, 14.209f, 8.0f, 12.0f, 8.0f)
                curveTo(9.791f, 8.0f, 8.0f, 9.791f, 8.0f, 12.0f)
                curveTo(8.0f, 14.209f, 9.791f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(12.0f, 18.0f)
                curveTo(15.314f, 18.0f, 18.0f, 15.314f, 18.0f, 12.0f)
                curveTo(18.0f, 8.686f, 15.314f, 6.0f, 12.0f, 6.0f)
                curveTo(8.686f, 6.0f, 6.0f, 8.686f, 6.0f, 12.0f)
                curveTo(6.0f, 15.314f, 8.686f, 18.0f, 12.0f, 18.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 0.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.062f)
                curveTo(12.672f, 4.021f, 12.339f, 4.0f, 12.0f, 4.0f)
                curveTo(11.661f, 4.0f, 11.328f, 4.021f, 11.0f, 4.062f)
                verticalLineTo(0.0f)
                close()
                moveTo(7.094f, 5.68f)
                lineTo(4.222f, 2.808f)
                lineTo(2.808f, 4.222f)
                lineTo(5.68f, 7.094f)
                curveTo(6.091f, 6.566f, 6.566f, 6.091f, 7.094f, 5.68f)
                close()
                moveTo(4.062f, 11.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.062f)
                curveTo(4.021f, 12.672f, 4.0f, 12.339f, 4.0f, 12.0f)
                curveTo(4.0f, 11.661f, 4.021f, 11.328f, 4.062f, 11.0f)
                close()
                moveTo(5.68f, 16.906f)
                lineTo(2.808f, 19.778f)
                lineTo(4.222f, 21.192f)
                lineTo(7.094f, 18.32f)
                curveTo(6.566f, 17.909f, 6.091f, 17.434f, 5.68f, 16.906f)
                close()
                moveTo(11.0f, 19.938f)
                verticalLineTo(24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.938f)
                curveTo(12.672f, 19.979f, 12.339f, 20.0f, 12.0f, 20.0f)
                curveTo(11.661f, 20.0f, 11.328f, 19.979f, 11.0f, 19.938f)
                close()
                moveTo(16.906f, 18.32f)
                lineTo(19.778f, 21.192f)
                lineTo(21.192f, 19.778f)
                lineTo(18.32f, 16.906f)
                curveTo(17.909f, 17.434f, 17.434f, 17.909f, 16.906f, 18.32f)
                close()
                moveTo(19.938f, 13.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.938f)
                curveTo(19.979f, 11.328f, 20.0f, 11.661f, 20.0f, 12.0f)
                curveTo(20.0f, 12.339f, 19.979f, 12.672f, 19.938f, 13.0f)
                close()
                moveTo(18.32f, 7.094f)
                lineTo(21.192f, 4.222f)
                lineTo(19.778f, 2.808f)
                lineTo(16.906f, 5.68f)
                curveTo(17.434f, 6.091f, 17.909f, 6.566f, 18.32f, 7.094f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
