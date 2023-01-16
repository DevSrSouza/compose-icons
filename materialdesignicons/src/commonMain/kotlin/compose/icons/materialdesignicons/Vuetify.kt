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

public val MaterialDesignIcons.Vuetify: ImageVector
    get() {
        if (_vuetify != null) {
            return _vuetify!!
        }
        _vuetify = Builder(name = "Vuetify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.64f)
                lineTo(7.92f, 2.0f)
                horizontalLineTo(16.08f)
                lineTo(12.0f, 11.64f)
                moveTo(12.0f, 21.95f)
                lineTo(3.27f, 4.91f)
                horizontalLineTo(7.84f)
                lineTo(12.0f, 14.47f)
                lineTo(16.16f, 4.91f)
                horizontalLineTo(20.73f)
                lineTo(12.0f, 21.95f)
                close()
            }
        }
        .build()
        return _vuetify!!
    }

private var _vuetify: ImageVector? = null
