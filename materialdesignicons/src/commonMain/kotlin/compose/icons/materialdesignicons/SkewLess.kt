package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.SkewLess: ImageVector
    get() {
        if (_skewLess != null) {
            return _skewLess!!
        }
        _skewLess = Builder(name = "SkewLess", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 11.0f)
                lineTo(15.41f, 20.0f)
                horizontalLineTo(10.5f)
                lineTo(12.59f, 11.0f)
                horizontalLineTo(17.5f)
                moveTo(20.0f, 9.0f)
                horizontalLineTo(11.0f)
                lineTo(8.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(20.0f, 9.0f)
                moveTo(4.0f, 6.0f)
                lineTo(8.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                lineTo(4.0f, 6.0f)
                close()
            }
        }
        .build()
        return _skewLess!!
    }

private var _skewLess: ImageVector? = null
