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

public val MaterialDesignIcons.LedVariantOff: ImageVector
    get() {
        if (_ledVariantOff != null) {
            return _ledVariantOff!!
        }
        _ledVariantOff = Builder(name = "LedVariantOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(10.05f, 3.0f, 8.43f, 4.4f, 8.08f, 6.25f)
                lineTo(16.82f, 15.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(3.28f, 4.0f)
                lineTo(2.0f, 5.27f)
                lineTo(8.0f, 11.27f)
                verticalLineTo(13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.73f)
                lineTo(13.0f, 16.27f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.27f)
                lineTo(18.73f, 22.0f)
                lineTo(20.0f, 20.72f)
                lineTo(15.0f, 15.72f)
                lineTo(8.0f, 8.72f)
                lineTo(3.28f, 4.0f)
                close()
            }
        }
        .build()
        return _ledVariantOff!!
    }

private var _ledVariantOff: ImageVector? = null
