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

public val MaterialDesignIcons.Ocr: ImageVector
    get() {
        if (_ocr != null) {
            return _ocr!!
        }
        _ocr = Builder(name = "Ocr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                curveTo(10.89f, 17.0f, 10.0f, 16.11f, 10.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(10.0f, 7.89f, 10.89f, 7.0f, 12.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                moveTo(14.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                moveTo(14.0f, 9.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                moveTo(14.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                moveTo(5.0f, 7.0f)
                horizontalLineTo(7.0f)
                curveTo(8.11f, 7.0f, 9.0f, 7.89f, 9.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 16.11f, 8.11f, 17.0f, 7.0f, 17.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 17.0f, 3.0f, 16.11f, 3.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(3.0f, 7.89f, 3.89f, 7.0f, 5.0f, 7.0f)
                moveTo(17.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                moveTo(5.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                moveTo(19.0f, 9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _ocr!!
    }

private var _ocr: ImageVector? = null
