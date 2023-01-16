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

public val MaterialDesignIcons.GlassPintOutline: ImageVector
    get() {
        if (_glassPintOutline != null) {
            return _glassPintOutline!!
        }
        _glassPintOutline = Builder(name = "GlassPintOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                lineTo(6.0f, 22.0f)
                horizontalLineTo(17.0f)
                lineTo(19.0f, 2.0f)
                horizontalLineTo(4.0f)
                moveTo(6.2f, 4.0f)
                horizontalLineTo(16.8f)
                lineTo(15.2f, 20.0f)
                horizontalLineTo(7.8f)
                lineTo(6.2f, 4.0f)
                close()
            }
        }
        .build()
        return _glassPintOutline!!
    }

private var _glassPintOutline: ImageVector? = null
