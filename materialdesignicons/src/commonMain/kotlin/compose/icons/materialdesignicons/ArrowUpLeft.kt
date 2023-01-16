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

public val MaterialDesignIcons.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) {
            return _arrowUpLeft!!
        }
        _arrowUpLeft = Builder(name = "ArrowUpLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.5f)
                curveTo(9.91f, 20.0f, 7.0f, 17.09f, 7.0f, 13.5f)
                verticalLineTo(7.83f)
                lineTo(3.91f, 10.92f)
                lineTo(2.5f, 9.5f)
                lineTo(8.0f, 4.0f)
                lineTo(13.5f, 9.5f)
                lineTo(12.09f, 10.91f)
                lineTo(9.0f, 7.83f)
                verticalLineTo(13.5f)
                curveTo(9.0f, 16.0f, 11.0f, 18.0f, 13.5f, 18.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
