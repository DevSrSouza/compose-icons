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

public val MaterialDesignIcons.CloseThick: ImageVector
    get() {
        if (_closeThick != null) {
            return _closeThick!!
        }
        _closeThick = Builder(name = "CloseThick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.91f)
                lineTo(17.09f, 4.0f)
                lineTo(12.0f, 9.09f)
                lineTo(6.91f, 4.0f)
                lineTo(4.0f, 6.91f)
                lineTo(9.09f, 12.0f)
                lineTo(4.0f, 17.09f)
                lineTo(6.91f, 20.0f)
                lineTo(12.0f, 14.91f)
                lineTo(17.09f, 20.0f)
                lineTo(20.0f, 17.09f)
                lineTo(14.91f, 12.0f)
                lineTo(20.0f, 6.91f)
                close()
            }
        }
        .build()
        return _closeThick!!
    }

private var _closeThick: ImageVector? = null
