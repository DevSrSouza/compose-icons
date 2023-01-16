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

public val MaterialDesignIcons.Contrast: ImageVector
    get() {
        if (_contrast != null) {
            return _contrast!!
        }
        _contrast = Builder(name = "Contrast", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.38f, 20.9f)
                curveTo(3.78f, 20.71f, 3.3f, 20.23f, 3.1f, 19.63f)
                lineTo(19.63f, 3.1f)
                curveTo(20.23f, 3.3f, 20.71f, 3.78f, 20.9f, 4.38f)
                lineTo(4.38f, 20.9f)
                moveTo(20.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(20.0f)
                moveTo(3.0f, 6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                close()
            }
        }
        .build()
        return _contrast!!
    }

private var _contrast: ImageVector? = null
