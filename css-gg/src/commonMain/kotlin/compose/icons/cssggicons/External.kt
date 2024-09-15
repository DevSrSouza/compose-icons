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

public val CssGgIcons.External: ImageVector
    get() {
        if (_external != null) {
            return _external!!
        }
        _external = Builder(name = "External", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.64f, 7.025f)
                horizontalLineTo(12.018f)
                verticalLineTo(5.025f)
                horizontalLineTo(19.018f)
                verticalLineTo(12.025f)
                horizontalLineTo(17.018f)
                verticalLineTo(8.475f)
                lineTo(12.104f, 13.389f)
                lineTo(10.69f, 11.975f)
                lineTo(15.64f, 7.025f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.982f, 6.975f)
                horizontalLineTo(4.982f)
                verticalLineTo(18.975f)
                horizontalLineTo(16.982f)
                verticalLineTo(12.975f)
                horizontalLineTo(14.982f)
                verticalLineTo(16.975f)
                horizontalLineTo(6.982f)
                verticalLineTo(8.975f)
                horizontalLineTo(10.982f)
                verticalLineTo(6.975f)
                close()
            }
        }
        .build()
        return _external!!
    }

private var _external: ImageVector? = null
