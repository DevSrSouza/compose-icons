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

public val MaterialDesignIcons.Tree: ImageVector
    get() {
        if (_tree != null) {
            return _tree!!
        }
        _tree = Builder(name = "Tree", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 21.0f)
                verticalLineTo(16.74f)
                curveTo(10.53f, 16.91f, 10.03f, 17.0f, 9.5f, 17.0f)
                curveTo(7.0f, 17.0f, 5.0f, 15.0f, 5.0f, 12.5f)
                curveTo(5.0f, 11.23f, 5.5f, 10.09f, 6.36f, 9.27f)
                curveTo(6.13f, 8.73f, 6.0f, 8.13f, 6.0f, 7.5f)
                curveTo(6.0f, 5.0f, 8.0f, 3.0f, 10.5f, 3.0f)
                curveTo(12.06f, 3.0f, 13.44f, 3.8f, 14.25f, 5.0f)
                curveTo(14.33f, 5.0f, 14.41f, 5.0f, 14.5f, 5.0f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 20.0f, 10.5f)
                arcTo(5.5f, 5.5f, 0.0f, false, true, 14.5f, 16.0f)
                curveTo(14.0f, 16.0f, 13.5f, 15.93f, 13.0f, 15.79f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _tree!!
    }

private var _tree: ImageVector? = null
