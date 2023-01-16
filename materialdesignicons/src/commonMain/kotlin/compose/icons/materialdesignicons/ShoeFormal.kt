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

public val MaterialDesignIcons.ShoeFormal: ImageVector
    get() {
        if (_shoeFormal != null) {
            return _shoeFormal!!
        }
        _shoeFormal = Builder(name = "ShoeFormal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.5f, 9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.5f)
                lineTo(19.5f, 9.0f)
                horizontalLineTo(15.0f)
                lineTo(14.0f, 8.0f)
                horizontalLineTo(13.0f)
                lineTo(7.0f, 12.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                lineTo(13.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(21.5f)
                verticalLineTo(14.0f)
                curveTo(21.5f, 14.0f, 22.0f, 13.0f, 22.0f, 11.5f)
                curveTo(22.0f, 10.0f, 21.5f, 9.0f, 21.5f, 9.0f)
                close()
            }
        }
        .build()
        return _shoeFormal!!
    }

private var _shoeFormal: ImageVector? = null
