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

public val MaterialDesignIcons.Wrap: ImageVector
    get() {
        if (_wrap != null) {
            return _wrap!!
        }
        _wrap = Builder(name = "Wrap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                moveTo(3.0f, 19.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                moveTo(3.0f, 13.0f)
                horizontalLineTo(18.0f)
                curveTo(19.0f, 13.0f, 20.0f, 13.43f, 20.0f, 15.0f)
                curveTo(20.0f, 16.57f, 19.0f, 17.0f, 18.0f, 17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                lineTo(12.0f, 18.0f)
                lineTo(16.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                curveTo(20.95f, 19.0f, 22.0f, 17.73f, 22.0f, 15.0f)
                curveTo(22.0f, 12.28f, 21.0f, 11.0f, 18.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _wrap!!
    }

private var _wrap: ImageVector? = null
