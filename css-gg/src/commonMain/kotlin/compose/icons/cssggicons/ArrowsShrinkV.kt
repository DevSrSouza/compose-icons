package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.ArrowsShrinkV: ImageVector
    get() {
        if (_arrowsShrinkV != null) {
            return _arrowsShrinkV!!
        }
        _arrowsShrinkV = Builder(name = "ArrowsShrinkV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 1.0f)
                verticalLineTo(3.0f)
                lineTo(7.0f, 3.0f)
                verticalLineTo(1.0f)
                lineTo(17.0f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2427f, 8.4477f)
                lineTo(14.8285f, 9.8619f)
                lineTo(13.0f, 8.0335f)
                lineTo(13.0f, 15.9665f)
                lineTo(14.8285f, 14.138f)
                lineTo(16.2427f, 15.5522f)
                lineTo(12.0f, 19.7949f)
                lineTo(7.7574f, 15.5522f)
                lineTo(9.1716f, 14.138f)
                lineTo(11.0f, 15.9664f)
                lineTo(11.0f, 8.0336f)
                lineTo(9.1716f, 9.8619f)
                lineTo(7.7574f, 8.4477f)
                lineTo(12.0f, 4.2051f)
                lineTo(16.2427f, 8.4477f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 23.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _arrowsShrinkV!!
    }

private var _arrowsShrinkV: ImageVector? = null
