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

public val MaterialDesignIcons.Stocking: ImageVector
    get() {
        if (_stocking != null) {
            return _stocking!!
        }
        _stocking = Builder(name = "Stocking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 2.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 4.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 17.0f, 9.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 17.85f, 16.5f, 18.57f, 15.74f, 18.86f)
                lineTo(9.5f, 21.77f)
                curveTo(8.5f, 22.24f, 7.29f, 21.81f, 6.83f, 20.81f)
                lineTo(6.0f, 19.0f)
                curveTo(5.5f, 18.0f, 5.95f, 16.8f, 6.95f, 16.34f)
                lineTo(10.0f, 14.91f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 7.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 2.0f)
                horizontalLineTo(17.0f)
                moveTo(10.0f, 4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _stocking!!
    }

private var _stocking: ImageVector? = null
