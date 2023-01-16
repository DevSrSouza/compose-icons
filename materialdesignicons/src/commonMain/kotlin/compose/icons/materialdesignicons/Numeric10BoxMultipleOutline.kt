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

public val MaterialDesignIcons.Numeric10BoxMultipleOutline: ImageVector
    get() {
        if (_numeric10BoxMultipleOutline != null) {
            return _numeric10BoxMultipleOutline!!
        }
        _numeric10BoxMultipleOutline = Builder(name = "Numeric10BoxMultipleOutline", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(21.0f)
                moveTo(21.0f, 1.0f)
                curveTo(22.11f, 1.0f, 23.0f, 1.9f, 23.0f, 3.0f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 18.11f, 22.11f, 19.0f, 21.0f, 19.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 19.0f, 5.0f, 18.11f, 5.0f, 17.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.9f, 5.9f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(21.0f)
                moveTo(3.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                curveTo(1.9f, 23.0f, 1.0f, 22.11f, 1.0f, 21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                moveTo(18.0f, 5.0f)
                horizontalLineTo(16.0f)
                curveTo(14.9f, 5.0f, 14.0f, 5.9f, 14.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(14.0f, 14.11f, 14.9f, 15.0f, 16.0f, 15.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 15.0f, 20.0f, 14.11f, 20.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 5.9f, 19.11f, 5.0f, 18.0f, 5.0f)
                moveTo(18.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _numeric10BoxMultipleOutline!!
    }

private var _numeric10BoxMultipleOutline: ImageVector? = null
