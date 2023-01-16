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

public val MaterialDesignIcons.DotNet: ImageVector
    get() {
        if (_dotNet != null) {
            return _dotNet!!
        }
        _dotNet = Builder(name = "DotNet", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 1.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 15.0f)
                moveTo(21.0f, 17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                moveTo(16.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(16.0f)
                moveTo(11.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                lineTo(6.0f, 11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                lineTo(9.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _dotNet!!
    }

private var _dotNet: ImageVector? = null
