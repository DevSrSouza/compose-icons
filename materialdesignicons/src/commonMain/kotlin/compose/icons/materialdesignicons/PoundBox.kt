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

public val MaterialDesignIcons.PoundBox: ImageVector
    get() {
        if (_poundBox != null) {
            return _poundBox!!
        }
        _poundBox = Builder(name = "PoundBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                moveTo(7.0f, 18.0f)
                horizontalLineTo(9.0f)
                lineTo(9.35f, 16.0f)
                horizontalLineTo(13.35f)
                lineTo(13.0f, 18.0f)
                horizontalLineTo(15.0f)
                lineTo(15.35f, 16.0f)
                horizontalLineTo(17.35f)
                lineTo(17.71f, 14.0f)
                horizontalLineTo(15.71f)
                lineTo(16.41f, 10.0f)
                horizontalLineTo(18.41f)
                lineTo(18.76f, 8.0f)
                horizontalLineTo(16.76f)
                lineTo(17.12f, 6.0f)
                horizontalLineTo(15.12f)
                lineTo(14.76f, 8.0f)
                horizontalLineTo(10.76f)
                lineTo(11.12f, 6.0f)
                horizontalLineTo(9.12f)
                lineTo(8.76f, 8.0f)
                horizontalLineTo(6.76f)
                lineTo(6.41f, 10.0f)
                horizontalLineTo(8.41f)
                lineTo(7.71f, 14.0f)
                horizontalLineTo(5.71f)
                lineTo(5.35f, 16.0f)
                horizontalLineTo(7.35f)
                lineTo(7.0f, 18.0f)
                moveTo(10.41f, 10.0f)
                horizontalLineTo(14.41f)
                lineTo(13.71f, 14.0f)
                horizontalLineTo(9.71f)
                lineTo(10.41f, 10.0f)
                close()
            }
        }
        .build()
        return _poundBox!!
    }

private var _poundBox: ImageVector? = null
