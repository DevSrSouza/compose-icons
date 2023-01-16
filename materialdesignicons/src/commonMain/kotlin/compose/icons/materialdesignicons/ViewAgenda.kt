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

public val MaterialDesignIcons.ViewAgenda: ImageVector
    get() {
        if (_viewAgenda != null) {
            return _viewAgenda!!
        }
        _viewAgenda = Builder(name = "ViewAgenda", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 3.0f, 2.0f, 3.4f, 2.0f, 4.0f)
                verticalLineTo(10.0f)
                curveTo(2.0f, 10.6f, 2.4f, 11.0f, 3.0f, 11.0f)
                horizontalLineTo(21.0f)
                curveTo(21.6f, 11.0f, 22.0f, 10.6f, 22.0f, 10.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 3.4f, 21.6f, 3.0f, 21.0f, 3.0f)
                moveTo(21.0f, 13.0f)
                horizontalLineTo(3.0f)
                curveTo(2.4f, 13.0f, 2.0f, 13.4f, 2.0f, 14.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 20.6f, 2.4f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(21.6f, 21.0f, 22.0f, 20.6f, 22.0f, 20.0f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 13.4f, 21.6f, 13.0f, 21.0f, 13.0f)
                close()
            }
        }
        .build()
        return _viewAgenda!!
    }

private var _viewAgenda: ImageVector? = null
