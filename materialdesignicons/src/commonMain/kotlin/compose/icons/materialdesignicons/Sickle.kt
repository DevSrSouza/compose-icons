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

public val MaterialDesignIcons.Sickle: ImageVector
    get() {
        if (_sickle != null) {
            return _sickle!!
        }
        _sickle = Builder(name = "Sickle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.3f, 7.2f)
                curveTo(17.5f, 4.7f, 14.9f, 3.0f, 12.0f, 2.0f)
                curveTo(26.2f, 10.5f, 15.4f, 22.9f, 8.5f, 15.5f)
                lineTo(5.9f, 16.0f)
                lineTo(2.5f, 19.4f)
                curveTo(1.9f, 20.0f, 1.9f, 21.0f, 2.5f, 21.5f)
                curveTo(3.1f, 22.1f, 4.1f, 22.1f, 4.6f, 21.5f)
                lineTo(7.8f, 18.3f)
                curveTo(15.3f, 24.3f, 25.0f, 15.0f, 19.3f, 7.2f)
                close()
            }
        }
        .build()
        return _sickle!!
    }

private var _sickle: ImageVector? = null
