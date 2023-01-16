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

public val MaterialDesignIcons.Numeric10Box: ImageVector
    get() {
        if (_numeric10Box != null) {
            return _numeric10Box!!
        }
        _numeric10Box = Builder(name = "Numeric10Box", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.0f)
                moveTo(21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 20.11f, 20.11f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(7.0f)
                moveTo(18.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 7.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(12.0f, 16.11f, 12.9f, 17.0f, 14.0f, 17.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 17.0f, 18.0f, 16.11f, 18.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _numeric10Box!!
    }

private var _numeric10Box: ImageVector? = null
