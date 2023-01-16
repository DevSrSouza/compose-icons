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

public val MaterialDesignIcons.VectorArrangeBelow: ImageVector
    get() {
        if (_vectorArrangeBelow != null) {
            return _vectorArrangeBelow!!
        }
        _vectorArrangeBelow = Builder(name = "VectorArrangeBelow", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.89f, 21.11f, 7.0f, 20.0f, 7.0f)
                curveTo(16.33f, 7.0f, 12.67f, 7.0f, 9.0f, 7.0f)
                curveTo(7.89f, 7.0f, 7.0f, 7.89f, 7.0f, 9.0f)
                curveTo(7.0f, 12.67f, 7.0f, 16.33f, 7.0f, 20.0f)
                curveTo(7.0f, 21.11f, 7.89f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                moveTo(5.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                curveTo(16.0f, 1.89f, 15.11f, 1.0f, 14.0f, 1.0f)
                horizontalLineTo(3.0f)
                curveTo(1.89f, 1.0f, 1.0f, 1.89f, 1.0f, 3.0f)
                verticalLineTo(14.0f)
                curveTo(1.0f, 15.11f, 1.89f, 16.0f, 3.0f, 16.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _vectorArrangeBelow!!
    }

private var _vectorArrangeBelow: ImageVector? = null
