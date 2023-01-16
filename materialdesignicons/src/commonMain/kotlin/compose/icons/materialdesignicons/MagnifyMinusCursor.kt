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

public val MaterialDesignIcons.MagnifyMinusCursor: ImageVector
    get() {
        if (_magnifyMinusCursor != null) {
            return _magnifyMinusCursor!!
        }
        _magnifyMinusCursor = Builder(name = "MagnifyMinusCursor", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 18.0f, 11.0f)
                curveTo(18.0f, 12.5f, 17.5f, 14.0f, 16.61f, 15.19f)
                lineTo(17.42f, 16.0f)
                horizontalLineTo(18.0f)
                lineTo(23.0f, 21.0f)
                lineTo(21.0f, 23.0f)
                lineTo(16.0f, 18.0f)
                verticalLineTo(17.41f)
                lineTo(15.19f, 16.6f)
                curveTo(12.1f, 18.92f, 7.71f, 18.29f, 5.39f, 15.2f)
                curveTo(3.07f, 12.11f, 3.7f, 7.72f, 6.79f, 5.4f)
                curveTo(8.0f, 4.5f, 9.5f, 4.0f, 11.0f, 4.0f)
                moveTo(7.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                moveTo(1.0f, 1.0f)
                verticalLineTo(8.0f)
                lineTo(8.0f, 1.0f)
                horizontalLineTo(1.0f)
                close()
            }
        }
        .build()
        return _magnifyMinusCursor!!
    }

private var _magnifyMinusCursor: ImageVector? = null
