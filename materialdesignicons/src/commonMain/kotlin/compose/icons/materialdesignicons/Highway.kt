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

public val MaterialDesignIcons.Highway: ImageVector
    get() {
        if (_highway != null) {
            return _highway!!
        }
        _highway = Builder(name = "Highway", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                lineTo(8.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                moveTo(13.0f, 2.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                lineTo(14.0f, 2.0f)
                horizontalLineTo(13.0f)
                moveTo(2.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                lineTo(18.06f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(2.0f)
                moveTo(7.0f, 11.0f)
                lineTo(3.34f, 22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                moveTo(13.0f, 11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.66f)
                lineTo(17.0f, 11.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _highway!!
    }

private var _highway: ImageVector? = null
