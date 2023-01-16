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

public val MaterialDesignIcons.Directions: ImageVector
    get() {
        if (_directions != null) {
            return _directions!!
        }
        _directions = Builder(name = "Directions", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 14.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 10.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.5f)
                lineTo(17.5f, 11.0f)
                moveTo(21.71f, 11.29f)
                lineTo(12.71f, 2.29f)
                horizontalLineTo(12.7f)
                curveTo(12.31f, 1.9f, 11.68f, 1.9f, 11.29f, 2.29f)
                lineTo(2.29f, 11.29f)
                curveTo(1.9f, 11.68f, 1.9f, 12.32f, 2.29f, 12.71f)
                lineTo(11.29f, 21.71f)
                curveTo(11.68f, 22.09f, 12.31f, 22.1f, 12.71f, 21.71f)
                lineTo(21.71f, 12.71f)
                curveTo(22.1f, 12.32f, 22.1f, 11.68f, 21.71f, 11.29f)
                close()
            }
        }
        .build()
        return _directions!!
    }

private var _directions: ImageVector? = null
