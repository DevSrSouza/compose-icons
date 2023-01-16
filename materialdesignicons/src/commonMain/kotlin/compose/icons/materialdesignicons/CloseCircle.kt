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

public val MaterialDesignIcons.CloseCircle: ImageVector
    get() {
        if (_closeCircle != null) {
            return _closeCircle!!
        }
        _closeCircle = Builder(name = "CloseCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.53f, 2.0f, 22.0f, 6.47f, 22.0f, 12.0f)
                curveTo(22.0f, 17.53f, 17.53f, 22.0f, 12.0f, 22.0f)
                curveTo(6.47f, 22.0f, 2.0f, 17.53f, 2.0f, 12.0f)
                curveTo(2.0f, 6.47f, 6.47f, 2.0f, 12.0f, 2.0f)
                moveTo(15.59f, 7.0f)
                lineTo(12.0f, 10.59f)
                lineTo(8.41f, 7.0f)
                lineTo(7.0f, 8.41f)
                lineTo(10.59f, 12.0f)
                lineTo(7.0f, 15.59f)
                lineTo(8.41f, 17.0f)
                lineTo(12.0f, 13.41f)
                lineTo(15.59f, 17.0f)
                lineTo(17.0f, 15.59f)
                lineTo(13.41f, 12.0f)
                lineTo(17.0f, 8.41f)
                lineTo(15.59f, 7.0f)
                close()
            }
        }
        .build()
        return _closeCircle!!
    }

private var _closeCircle: ImageVector? = null
