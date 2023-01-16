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

public val MaterialDesignIcons.ArrowExpandLeft: ImageVector
    get() {
        if (_arrowExpandLeft != null) {
            return _arrowExpandLeft!!
        }
        _arrowExpandLeft = Builder(name = "ArrowExpandLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.83f)
                lineTo(11.33f, 5.5f)
                lineTo(9.92f, 4.08f)
                lineTo(2.0f, 12.0f)
                lineTo(9.92f, 19.92f)
                lineTo(11.33f, 18.5f)
                lineTo(5.83f, 13.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _arrowExpandLeft!!
    }

private var _arrowExpandLeft: ImageVector? = null
