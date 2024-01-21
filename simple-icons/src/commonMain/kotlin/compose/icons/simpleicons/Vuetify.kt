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
                moveTo(6.312f, 12.564f)
                lineTo(12.636f, 1.2f)
                lineTo(0.0f, 1.2f)
                lineToRelative(6.312f, 11.364f)
                close()
                moveTo(14.94f, 1.2f)
                lineTo(7.464f, 14.64f)
                lineTo(12.0f, 22.8f)
                lineTo(24.0f, 1.2f)
                horizontalLineToRelative(-9.06f)
                close()
                moveTo(19.92f, 3.6f)
                lineTo(12.0f, 17.856f)
                lineToRelative(-1.788f, -3.216f)
                lineTo(16.344f, 3.6f)
                horizontalLineToRelative(3.576f)
                close()
                moveTo(6.312f, 7.62f)
                lineTo(4.08f, 3.6f)
                horizontalLineToRelative(4.476f)
                lineTo(6.312f, 7.62f)
                close()
            }
        }
        .build()
        return _vuetify!!
    }

private var _vuetify: ImageVector? = null
