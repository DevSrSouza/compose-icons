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

public val MaterialDesignIcons.FilterMinus: ImageVector
    get() {
        if (_filterMinus != null) {
            return _filterMinus!!
        }
        _filterMinus = Builder(name = "FilterMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                verticalLineTo(19.88f)
                curveTo(12.04f, 20.18f, 11.94f, 20.5f, 11.71f, 20.71f)
                curveTo(11.32f, 21.1f, 10.69f, 21.1f, 10.3f, 20.71f)
                lineTo(8.29f, 18.7f)
                curveTo(8.06f, 18.47f, 7.96f, 18.16f, 8.0f, 17.86f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.97f)
                lineTo(2.21f, 4.62f)
                curveTo(1.87f, 4.19f, 1.95f, 3.56f, 2.38f, 3.22f)
                curveTo(2.57f, 3.08f, 2.78f, 3.0f, 3.0f, 3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                curveTo(17.22f, 3.0f, 17.43f, 3.08f, 17.62f, 3.22f)
                curveTo(18.05f, 3.56f, 18.13f, 4.19f, 17.79f, 4.62f)
                lineTo(12.03f, 12.0f)
                horizontalLineTo(12.0f)
                moveTo(15.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _filterMinus!!
    }

private var _filterMinus: ImageVector? = null
