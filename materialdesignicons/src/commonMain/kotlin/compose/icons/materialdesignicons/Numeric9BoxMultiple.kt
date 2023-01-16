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

public val MaterialDesignIcons.Numeric9BoxMultiple: ImageVector
    get() {
        if (_numeric9BoxMultiple != null) {
            return _numeric9BoxMultiple!!
        }
        _numeric9BoxMultiple = Builder(name = "Numeric9BoxMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(3.0f, 5.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 1.0f, 21.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                moveTo(15.0f, 5.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 7.0f)
                verticalLineTo(9.0f)
                curveTo(11.0f, 10.11f, 11.9f, 11.0f, 13.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 13.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 5.89f, 16.1f, 5.0f, 15.0f, 5.0f)
                moveTo(21.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 23.0f, 3.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 19.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 17.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 1.0f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _numeric9BoxMultiple!!
    }

private var _numeric9BoxMultiple: ImageVector? = null
