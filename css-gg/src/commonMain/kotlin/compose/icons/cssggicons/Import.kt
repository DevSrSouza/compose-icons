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

public val CssGgIcons.Import: ImageVector
    get() {
        if (_import != null) {
            return _import!!
        }
        _import = Builder(name = "Import", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 9.982f)
                verticalLineTo(19.982f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.982f)
                horizontalLineTo(15.0f)
                verticalLineTo(7.982f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.982f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.982f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.982f)
                horizontalLineTo(5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 2.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.053f)
                lineTo(8.465f, 11.517f)
                lineTo(7.05f, 12.932f)
                lineTo(12.0f, 17.882f)
                lineTo(16.95f, 12.932f)
                lineTo(15.536f, 11.517f)
                lineTo(13.0f, 14.053f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _import!!
    }

private var _import: ImageVector? = null
