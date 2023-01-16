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

public val MaterialDesignIcons.Battery10: ImageVector
    get() {
        if (_battery10 != null) {
            return _battery10!!
        }
        _battery10 = Builder(name = "Battery10", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.0f)
                moveTo(16.67f, 4.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.33f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 6.0f, 5.33f)
                verticalLineTo(20.67f)
                curveTo(6.0f, 21.4f, 6.6f, 22.0f, 7.33f, 22.0f)
                horizontalLineTo(16.67f)
                arcTo(1.33f, 1.33f, 0.0f, false, false, 18.0f, 20.67f)
                verticalLineTo(5.33f)
                curveTo(18.0f, 4.6f, 17.4f, 4.0f, 16.67f, 4.0f)
                close()
            }
        }
        .build()
        return _battery10!!
    }

private var _battery10: ImageVector? = null
