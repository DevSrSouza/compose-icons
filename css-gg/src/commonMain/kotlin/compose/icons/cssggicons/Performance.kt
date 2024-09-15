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

public val CssGgIcons.Performance: ImageVector
    get() {
        if (_performance != null) {
            return _performance!!
        }
        _performance = Builder(name = "Performance", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0f, 9.0f)
                verticalLineTo(13.171f)
                curveTo(9.835f, 13.583f, 9.0f, 14.694f, 9.0f, 16.0f)
                curveTo(9.0f, 17.657f, 10.343f, 19.0f, 12.0f, 19.0f)
                curveTo(13.657f, 19.0f, 15.0f, 17.657f, 15.0f, 16.0f)
                curveTo(15.0f, 14.694f, 14.165f, 13.583f, 13.0f, 13.171f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(11.0f, 15.448f, 11.448f, 15.0f, 12.0f, 15.0f)
                curveTo(12.552f, 15.0f, 13.0f, 15.448f, 13.0f, 16.0f)
                curveTo(13.0f, 16.552f, 12.552f, 17.0f, 12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 16.552f, 11.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                curveTo(17.0f, 9.239f, 14.761f, 7.0f, 12.0f, 7.0f)
                curveTo(9.239f, 7.0f, 7.0f, 9.239f, 7.0f, 12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                curveTo(5.0f, 8.134f, 8.134f, 5.0f, 12.0f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                close()
                moveTo(12.0f, 21.0f)
                curveTo(16.971f, 21.0f, 21.0f, 16.971f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _performance!!
    }

private var _performance: ImageVector? = null
