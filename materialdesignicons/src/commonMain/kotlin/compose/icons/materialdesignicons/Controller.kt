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

public val MaterialDesignIcons.Controller: ImageVector
    get() {
        if (_controller != null) {
            return _controller!!
        }
        _controller = Builder(name = "Controller", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.97f, 16.0f)
                lineTo(5.0f, 19.0f)
                curveTo(4.67f, 19.3f, 4.23f, 19.5f, 3.75f, 19.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 2.0f, 17.75f)
                verticalLineTo(17.5f)
                lineTo(3.0f, 10.12f)
                curveTo(3.21f, 7.81f, 5.14f, 6.0f, 7.5f, 6.0f)
                horizontalLineTo(16.5f)
                curveTo(18.86f, 6.0f, 20.79f, 7.81f, 21.0f, 10.12f)
                lineTo(22.0f, 17.5f)
                verticalLineTo(17.75f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 20.25f, 19.5f)
                curveTo(19.77f, 19.5f, 19.33f, 19.3f, 19.0f, 19.0f)
                lineTo(16.03f, 16.0f)
                horizontalLineTo(7.97f)
                moveTo(7.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                moveTo(16.5f, 8.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.75f, 8.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 9.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.25f, 8.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 8.0f)
                moveTo(14.75f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.75f, 11.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 14.75f, 9.75f)
                moveTo(18.25f, 9.75f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.5f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 18.25f, 11.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 19.0f, 10.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 18.25f, 9.75f)
                moveTo(16.5f, 11.5f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 15.75f, 12.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 13.0f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 17.25f, 12.25f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.5f, 11.5f)
                close()
            }
        }
        .build()
        return _controller!!
    }

private var _controller: ImageVector? = null
