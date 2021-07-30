package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vuetify: ImageVector
    get() {
        if (_vuetify != null) {
            return _vuetify!!
        }
        _vuetify = Builder(name = "Vuetify", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.094f, 0.0f)
                lineTo(12.0f, 11.596f)
                lineTo(16.906f, 0.0f)
                horizontalLineTo(7.094f)
                close()
                moveTo(1.5f, 3.5f)
                lineTo(12.0f, 24.0f)
                lineTo(22.5f, 3.5f)
                horizontalLineTo(17.0f)
                lineTo(12.0f, 15.0f)
                lineTo(7.0f, 3.5f)
                close()
            }
        }
        .build()
        return _vuetify!!
    }

private var _vuetify: ImageVector? = null
