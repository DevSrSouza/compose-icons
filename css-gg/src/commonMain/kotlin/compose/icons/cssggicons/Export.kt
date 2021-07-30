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

public val CssGgIcons.Export: ImageVector
    get() {
        if (_export != null) {
            return _export!!
        }
        _export = Builder(name = "Export", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.9498f, 5.9678f)
                lineTo(15.5356f, 7.382f)
                lineTo(13.0f, 4.8465f)
                verticalLineTo(17.0421f)
                horizontalLineTo(11.0f)
                verticalLineTo(4.8465f)
                lineTo(8.4645f, 7.382f)
                lineTo(7.0503f, 5.9678f)
                lineTo(12.0f, 1.0181f)
                lineTo(16.9498f, 5.9678f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.9819f)
                verticalLineTo(10.9819f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.9819f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.9819f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.9819f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.9819f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.9819f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _export!!
    }

private var _export: ImageVector? = null
