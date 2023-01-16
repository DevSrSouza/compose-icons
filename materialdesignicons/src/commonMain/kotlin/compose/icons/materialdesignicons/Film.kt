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

public val MaterialDesignIcons.Film: ImageVector
    get() {
        if (_film != null) {
            return _film!!
        }
        _film = Builder(name = "Film", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(1.8f)
                curveTo(5.0f, 1.36f, 5.36f, 1.0f, 5.8f, 1.0f)
                horizontalLineTo(10.2f)
                curveTo(10.64f, 1.0f, 11.0f, 1.36f, 11.0f, 1.8f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 4.5f)
                verticalLineTo(5.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 22.0f)
                horizontalLineTo(3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 2.0f, 20.5f)
                verticalLineTo(4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.5f, 3.0f)
                moveTo(18.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                moveTo(14.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(18.0f)
                moveTo(10.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _film!!
    }

private var _film: ImageVector? = null
