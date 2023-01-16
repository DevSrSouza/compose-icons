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

public val MaterialDesignIcons.DiscPlayer: ImageVector
    get() {
        if (_discPlayer != null) {
            return _discPlayer!!
        }
        _discPlayer = Builder(name = "DiscPlayer", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 10.37f)
                curveTo(15.54f, 10.37f, 16.38f, 9.53f, 16.38f, 8.5f)
                curveTo(16.38f, 7.46f, 15.54f, 6.63f, 14.5f, 6.63f)
                curveTo(13.46f, 6.63f, 12.63f, 7.46f, 12.63f, 8.5f)
                arcTo(1.87f, 1.87f, 0.0f, false, false, 14.5f, 10.37f)
                moveTo(14.5f, 1.0f)
                arcTo(7.5f, 7.5f, 0.0f, false, true, 22.0f, 8.5f)
                curveTo(22.0f, 10.67f, 21.08f, 12.63f, 19.6f, 14.0f)
                horizontalLineTo(9.4f)
                curveTo(7.93f, 12.63f, 7.0f, 10.67f, 7.0f, 8.5f)
                curveTo(7.0f, 4.35f, 10.36f, 1.0f, 14.5f, 1.0f)
                moveTo(6.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.0f)
                moveTo(4.0f, 18.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(4.0f)
                moveTo(15.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 17.0f)
                close()
            }
        }
        .build()
        return _discPlayer!!
    }

private var _discPlayer: ImageVector? = null
