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

public val MaterialDesignIcons.Submarine: ImageVector
    get() {
        if (_submarine != null) {
            return _submarine!!
        }
        _submarine = Builder(name = "Submarine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.67f)
                curveTo(6.78f, 4.53f, 5.39f, 4.93f, 4.0f, 5.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                curveTo(5.37f, 7.0f, 6.74f, 6.65f, 8.0f, 6.0f)
                curveTo(10.5f, 7.3f, 13.5f, 7.3f, 16.0f, 6.0f)
                curveTo(17.26f, 6.65f, 18.62f, 6.94f, 20.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(20.0f)
                curveTo(18.61f, 5.0f, 17.22f, 4.53f, 16.0f, 3.67f)
                curveTo(13.56f, 5.38f, 10.44f, 5.38f, 8.0f, 3.67f)
                moveTo(16.0f, 8.67f)
                lineTo(15.0f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 14.0f)
                horizontalLineTo(9.0f)
                lineTo(6.0f, 16.0f)
                lineTo(5.0f, 14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                lineTo(2.0f, 17.0f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.14f)
                lineTo(6.0f, 18.0f)
                lineTo(9.0f, 20.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 18.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 14.0f)
                horizontalLineTo(18.0f)
                lineTo(17.0f, 13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.67f)
                close()
            }
        }
        .build()
        return _submarine!!
    }

private var _submarine: ImageVector? = null
