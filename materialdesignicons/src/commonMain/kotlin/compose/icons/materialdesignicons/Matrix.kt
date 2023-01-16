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

public val MaterialDesignIcons.Matrix: ImageVector
    get() {
        if (_matrix != null) {
            return _matrix!!
        }
        _matrix = Builder(name = "Matrix", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(2.0f)
                moveTo(20.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                lineTo(8.0f, 6.5f)
                verticalLineTo(5.5f)
                lineTo(9.0f, 5.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                lineTo(14.0f, 14.5f)
                verticalLineTo(13.5f)
                lineTo(15.0f, 13.0f)
                moveTo(9.0f, 13.0f)
                curveTo(10.1f, 13.0f, 11.0f, 14.34f, 11.0f, 16.0f)
                curveTo(11.0f, 17.66f, 10.1f, 19.0f, 9.0f, 19.0f)
                curveTo(7.9f, 19.0f, 7.0f, 17.66f, 7.0f, 16.0f)
                curveTo(7.0f, 14.34f, 7.9f, 13.0f, 9.0f, 13.0f)
                moveTo(9.0f, 14.0f)
                curveTo(8.45f, 14.0f, 8.0f, 14.9f, 8.0f, 16.0f)
                curveTo(8.0f, 17.1f, 8.45f, 18.0f, 9.0f, 18.0f)
                curveTo(9.55f, 18.0f, 10.0f, 17.1f, 10.0f, 16.0f)
                curveTo(10.0f, 14.9f, 9.55f, 14.0f, 9.0f, 14.0f)
                moveTo(15.0f, 5.0f)
                curveTo(16.1f, 5.0f, 17.0f, 6.34f, 17.0f, 8.0f)
                curveTo(17.0f, 9.66f, 16.1f, 11.0f, 15.0f, 11.0f)
                curveTo(13.9f, 11.0f, 13.0f, 9.66f, 13.0f, 8.0f)
                curveTo(13.0f, 6.34f, 13.9f, 5.0f, 15.0f, 5.0f)
                moveTo(15.0f, 6.0f)
                curveTo(14.45f, 6.0f, 14.0f, 6.9f, 14.0f, 8.0f)
                curveTo(14.0f, 9.1f, 14.45f, 10.0f, 15.0f, 10.0f)
                curveTo(15.55f, 10.0f, 16.0f, 9.1f, 16.0f, 8.0f)
                curveTo(16.0f, 6.9f, 15.55f, 6.0f, 15.0f, 6.0f)
                close()
            }
        }
        .build()
        return _matrix!!
    }

private var _matrix: ImageVector? = null
