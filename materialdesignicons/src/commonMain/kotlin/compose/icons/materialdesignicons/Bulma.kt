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

public val MaterialDesignIcons.Bulma: ImageVector
    get() {
        if (_bulma != null) {
            return _bulma!!
        }
        _bulma = Builder(name = "Bulma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.38f, 2.0f)
                lineTo(6.38f, 7.0f)
                lineTo(5.13f, 15.75f)
                lineTo(11.38f, 22.0f)
                lineTo(18.88f, 17.0f)
                lineTo(13.88f, 12.0f)
                lineTo(17.63f, 8.25f)
                lineTo(11.38f, 2.0f)
                close()
            }
        }
        .build()
        return _bulma!!
    }

private var _bulma: ImageVector? = null
