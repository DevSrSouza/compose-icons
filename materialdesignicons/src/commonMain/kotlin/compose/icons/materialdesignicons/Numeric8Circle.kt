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

public val MaterialDesignIcons.Numeric8Circle: ImageVector
    get() {
        if (_numeric8Circle != null) {
            return _numeric8Circle!!
        }
        _numeric8Circle = Builder(name = "Numeric8Circle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                moveTo(11.0f, 17.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 15.0f)
                verticalLineTo(13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 15.0f, 10.5f)
                verticalLineTo(9.0f)
                curveTo(15.0f, 7.89f, 14.1f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 9.0f)
                verticalLineTo(10.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 10.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 9.0f, 13.5f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 16.11f, 9.9f, 17.0f, 11.0f, 17.0f)
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _numeric8Circle!!
    }

private var _numeric8Circle: ImageVector? = null
