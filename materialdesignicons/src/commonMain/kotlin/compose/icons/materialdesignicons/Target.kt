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

public val MaterialDesignIcons.Target: ImageVector
    get() {
        if (_target != null) {
            return _target!!
        }
        _target = Builder(name = "Target", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                verticalLineTo(4.07f)
                curveTo(7.38f, 4.53f, 4.53f, 7.38f, 4.07f, 11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.07f)
                curveTo(4.53f, 16.62f, 7.38f, 19.47f, 11.0f, 19.93f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(19.93f)
                curveTo(16.62f, 19.47f, 19.47f, 16.62f, 19.93f, 13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.93f)
                curveTo(19.47f, 7.38f, 16.62f, 4.53f, 13.0f, 4.07f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 6.08f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.09f)
                curveTo(15.5f, 6.5f, 17.5f, 8.5f, 17.92f, 11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.91f)
                curveTo(17.5f, 15.5f, 15.5f, 17.5f, 13.0f, 17.92f)
                verticalLineTo(16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.91f)
                curveTo(8.5f, 17.5f, 6.5f, 15.5f, 6.08f, 13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.09f)
                curveTo(6.5f, 8.5f, 8.5f, 6.5f, 11.0f, 6.08f)
                moveTo(12.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _target!!
    }

private var _target: ImageVector? = null
