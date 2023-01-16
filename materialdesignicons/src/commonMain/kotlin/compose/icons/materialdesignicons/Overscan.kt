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

public val MaterialDesignIcons.Overscan: ImageVector
    get() {
        if (_overscan != null) {
            return _overscan!!
        }
        _overscan = Builder(name = "Overscan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.5f)
                lineTo(10.0f, 8.0f)
                horizontalLineTo(14.0f)
                lineTo(12.0f, 5.5f)
                moveTo(18.0f, 10.0f)
                verticalLineTo(14.0f)
                lineTo(20.5f, 12.0f)
                lineTo(18.0f, 10.0f)
                moveTo(6.0f, 10.0f)
                lineTo(3.5f, 12.0f)
                lineTo(6.0f, 14.0f)
                verticalLineTo(10.0f)
                moveTo(14.0f, 16.0f)
                horizontalLineTo(10.0f)
                lineTo(12.0f, 18.5f)
                lineTo(14.0f, 16.0f)
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.1f, 1.9f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 21.0f, 23.0f, 20.1f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(21.0f, 19.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _overscan!!
    }

private var _overscan: ImageVector? = null
