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

public val MaterialDesignIcons.Stool: ImageVector
    get() {
        if (_stool != null) {
            return _stool!!
        }
        _stool = Builder(name = "Stool", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                curveTo(20.0f, 3.79f, 18.21f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(5.78f, 2.0f, 4.0f, 3.79f, 4.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                lineTo(4.0f, 22.0f)
                horizontalLineTo(6.0f)
                lineTo(7.5f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.5f)
                lineTo(18.0f, 22.0f)
                horizontalLineTo(20.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(7.93f, 13.0f)
                lineTo(9.0f, 8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.93f)
                moveTo(16.07f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                lineTo(16.07f, 13.0f)
                close()
            }
        }
        .build()
        return _stool!!
    }

private var _stool: ImageVector? = null
