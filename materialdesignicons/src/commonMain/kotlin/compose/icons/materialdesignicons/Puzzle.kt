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

public val MaterialDesignIcons.Puzzle: ImageVector
    get() {
        if (_puzzle != null) {
            return _puzzle!!
        }
        _puzzle = Builder(name = "Puzzle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                curveTo(19.0f, 5.89f, 18.1f, 5.0f, 17.0f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.5f, 1.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 8.0f, 3.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 7.0f)
                verticalLineTo(10.8f)
                horizontalLineTo(3.5f)
                curveTo(5.0f, 10.8f, 6.2f, 12.0f, 6.2f, 13.5f)
                curveTo(6.2f, 15.0f, 5.0f, 16.2f, 3.5f, 16.2f)
                horizontalLineTo(2.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 22.0f)
                horizontalLineTo(7.8f)
                verticalLineTo(20.5f)
                curveTo(7.8f, 19.0f, 9.0f, 17.8f, 10.5f, 17.8f)
                curveTo(12.0f, 17.8f, 13.2f, 19.0f, 13.2f, 20.5f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 23.0f, 13.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 11.0f)
                close()
            }
        }
        .build()
        return _puzzle!!
    }

private var _puzzle: ImageVector? = null
