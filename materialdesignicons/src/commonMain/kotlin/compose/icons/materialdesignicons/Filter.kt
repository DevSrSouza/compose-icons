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

public val MaterialDesignIcons.Filter: ImageVector
    get() {
        if (_filter != null) {
            return _filter!!
        }
        _filter = Builder(name = "Filter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 12.0f)
                verticalLineTo(19.88f)
                curveTo(14.04f, 20.18f, 13.94f, 20.5f, 13.71f, 20.71f)
                curveTo(13.32f, 21.1f, 12.69f, 21.1f, 12.3f, 20.71f)
                lineTo(10.29f, 18.7f)
                curveTo(10.06f, 18.47f, 9.96f, 18.16f, 10.0f, 17.87f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.97f)
                lineTo(4.21f, 4.62f)
                curveTo(3.87f, 4.19f, 3.95f, 3.56f, 4.38f, 3.22f)
                curveTo(4.57f, 3.08f, 4.78f, 3.0f, 5.0f, 3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                curveTo(19.22f, 3.0f, 19.43f, 3.08f, 19.62f, 3.22f)
                curveTo(20.05f, 3.56f, 20.13f, 4.19f, 19.79f, 4.62f)
                lineTo(14.03f, 12.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _filter!!
    }

private var _filter: ImageVector? = null
