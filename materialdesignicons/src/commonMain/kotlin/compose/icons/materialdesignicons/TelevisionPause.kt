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

public val MaterialDesignIcons.TelevisionPause: ImageVector
    get() {
        if (_televisionPause != null) {
            return _televisionPause!!
        }
        _televisionPause = Builder(name = "TelevisionPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(1.89f, 3.0f, 1.0f, 3.89f, 1.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 18.1f, 1.9f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 19.0f, 23.0f, 18.1f, 23.0f, 17.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.89f, 22.1f, 3.0f, 21.0f, 3.0f)
                moveTo(3.0f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                moveTo(9.0f, 8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(8.0f)
                moveTo(13.0f, 8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
            }
        }
        .build()
        return _televisionPause!!
    }

private var _televisionPause: ImageVector? = null
