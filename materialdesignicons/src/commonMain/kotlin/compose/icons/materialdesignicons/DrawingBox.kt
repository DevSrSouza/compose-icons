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

public val MaterialDesignIcons.DrawingBox: ImageVector
    get() {
        if (_drawingBox != null) {
            return _drawingBox!!
        }
        _drawingBox = Builder(name = "DrawingBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(12.21f)
                curveTo(11.34f, 12.82f, 10.47f, 13.2f, 9.5f, 13.2f)
                curveTo(7.46f, 13.2f, 5.8f, 11.54f, 5.8f, 9.5f)
                arcTo(3.7f, 3.7f, 0.0f, false, true, 9.5f, 5.8f)
                curveTo(11.54f, 5.8f, 13.2f, 7.46f, 13.2f, 9.5f)
                curveTo(13.2f, 10.47f, 12.82f, 11.34f, 12.21f, 12.0f)
                horizontalLineTo(18.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _drawingBox!!
    }

private var _drawingBox: ImageVector? = null
