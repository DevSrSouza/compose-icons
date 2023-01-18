package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.RowTriple: ImageVector
    get() {
        if (_rowTriple != null) {
            return _rowTriple!!
        }
        _rowTriple = Builder(name = "RowTriple", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.75f, 2.0195f)
                curveTo(4.7835f, 2.0195f, 4.0f, 2.803f, 4.0f, 3.7695f)
                verticalLineTo(6.2695f)
                curveTo(4.0f, 7.236f, 4.7835f, 8.0195f, 5.75f, 8.0195f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 8.0195f, 20.0f, 7.236f, 20.0f, 6.2695f)
                verticalLineTo(3.7695f)
                curveTo(20.0f, 2.803f, 19.2165f, 2.0195f, 18.25f, 2.0195f)
                horizontalLineTo(5.75f)
                close()
                moveTo(5.75f, 9.0195f)
                curveTo(4.7835f, 9.0195f, 4.0f, 9.803f, 4.0f, 10.7695f)
                verticalLineTo(13.2695f)
                curveTo(4.0f, 14.236f, 4.7835f, 15.0195f, 5.75f, 15.0195f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 15.0195f, 20.0f, 14.236f, 20.0f, 13.2695f)
                verticalLineTo(10.7695f)
                curveTo(20.0f, 9.803f, 19.2165f, 9.0195f, 18.25f, 9.0195f)
                horizontalLineTo(5.75f)
                close()
                moveTo(5.75f, 16.0195f)
                curveTo(4.7835f, 16.0195f, 4.0f, 16.803f, 4.0f, 17.7695f)
                verticalLineTo(20.2695f)
                curveTo(4.0f, 21.236f, 4.7835f, 22.0195f, 5.75f, 22.0195f)
                horizontalLineTo(18.25f)
                curveTo(19.2165f, 22.0195f, 20.0f, 21.236f, 20.0f, 20.2695f)
                verticalLineTo(17.7695f)
                curveTo(20.0f, 16.803f, 19.2165f, 16.0195f, 18.25f, 16.0195f)
                horizontalLineTo(5.75f)
                close()
            }
        }
        .build()
        return _rowTriple!!
    }

private var _rowTriple: ImageVector? = null
