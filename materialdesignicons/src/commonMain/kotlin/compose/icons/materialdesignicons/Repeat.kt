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

public val MaterialDesignIcons.Repeat: ImageVector
    get() {
        if (_repeat != null) {
            return _repeat!!
        }
        _repeat = Builder(name = "Repeat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(14.0f)
                lineTo(3.0f, 18.0f)
                lineTo(7.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.0f)
                lineTo(21.0f, 6.0f)
                lineTo(17.0f, 2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _repeat!!
    }

private var _repeat: ImageVector? = null
