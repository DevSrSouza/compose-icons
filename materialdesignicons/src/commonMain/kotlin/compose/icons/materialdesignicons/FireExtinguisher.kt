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

public val MaterialDesignIcons.FireExtinguisher: ImageVector
    get() {
        if (_fireExtinguisher != null) {
            return _fireExtinguisher!!
        }
        _fireExtinguisher = Builder(name = "FireExtinguisher", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 7.0f)
                horizontalLineTo(11.75f)
                lineTo(12.0f, 5.0f)
                horizontalLineTo(10.25f)
                lineTo(6.0f, 7.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.5f)
                lineTo(10.0f, 3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                lineTo(17.0f, 2.5f)
                verticalLineTo(5.5f)
                lineTo(16.0f, 5.0f)
                horizontalLineTo(14.0f)
                lineTo(14.25f, 7.0f)
                horizontalLineTo(15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 8.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.5f, 7.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisher!!
    }

private var _fireExtinguisher: ImageVector? = null
