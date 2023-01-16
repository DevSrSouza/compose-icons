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

public val MaterialDesignIcons.BorderRadius: ImageVector
    get() {
        if (_borderRadius != null) {
            return _borderRadius!!
        }
        _borderRadius = Builder(name = "BorderRadius", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 18.8f, 5.2f, 21.0f, 8.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                curveTo(6.3f, 19.0f, 5.0f, 17.7f, 5.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(16.0f)
                moveTo(21.0f, 8.0f)
                curveTo(21.0f, 5.2f, 18.8f, 3.0f, 16.0f, 3.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                curveTo(17.7f, 5.0f, 19.0f, 6.3f, 19.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(8.0f)
                moveTo(16.0f, 21.0f)
                curveTo(18.8f, 21.0f, 21.0f, 18.8f, 21.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(16.0f)
                curveTo(19.0f, 17.7f, 17.7f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                moveTo(8.0f, 3.0f)
                curveTo(5.2f, 3.0f, 3.0f, 5.2f, 3.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                curveTo(5.0f, 6.3f, 6.3f, 5.0f, 8.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _borderRadius!!
    }

private var _borderRadius: ImageVector? = null
