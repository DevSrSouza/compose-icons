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

public val CssGgIcons.Webcam: ImageVector
    get() {
        if (_webcam != null) {
            return _webcam!!
        }
        _webcam = Builder(name = "Webcam", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 10.0f)
                curveTo(13.0f, 10.552f, 12.552f, 11.0f, 12.0f, 11.0f)
                curveTo(11.448f, 11.0f, 11.0f, 10.552f, 11.0f, 10.0f)
                curveTo(11.0f, 9.448f, 11.448f, 9.0f, 12.0f, 9.0f)
                curveTo(12.552f, 9.0f, 13.0f, 9.448f, 13.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(13.0f, 14.9f)
                curveTo(15.282f, 14.437f, 17.0f, 12.419f, 17.0f, 10.0f)
                curveTo(17.0f, 7.239f, 14.761f, 5.0f, 12.0f, 5.0f)
                curveTo(9.239f, 5.0f, 7.0f, 7.239f, 7.0f, 10.0f)
                curveTo(7.0f, 12.419f, 8.718f, 14.437f, 11.0f, 14.9f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.9f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(13.657f, 13.0f, 15.0f, 11.657f, 15.0f, 10.0f)
                curveTo(15.0f, 8.343f, 13.657f, 7.0f, 12.0f, 7.0f)
                curveTo(10.343f, 7.0f, 9.0f, 8.343f, 9.0f, 10.0f)
                curveTo(9.0f, 11.657f, 10.343f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _webcam!!
    }

private var _webcam: ImageVector? = null
