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

public val MaterialDesignIcons.Tent: ImageVector
    get() {
        if (_tent != null) {
            return _tent!!
        }
        _tent = Builder(name = "Tent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                curveTo(4.0f, 7.19f, 4.39f, 8.27f, 5.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 2.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 3.0f)
                curveTo(4.39f, 3.73f, 4.0f, 4.81f, 4.0f, 6.0f)
                moveTo(2.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(4.76f)
                lineTo(12.0f, 4.78f)
                lineTo(19.24f, 19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                moveTo(12.0f, 9.19f)
                lineTo(7.0f, 19.0f)
                horizontalLineTo(17.0f)
                lineTo(12.0f, 9.19f)
                close()
            }
        }
        .build()
        return _tent!!
    }

private var _tent: ImageVector? = null
