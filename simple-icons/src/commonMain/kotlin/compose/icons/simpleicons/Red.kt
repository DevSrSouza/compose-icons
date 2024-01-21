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

public val SimpleIcons.Red: ImageVector
    get() {
        if (_red != null) {
            return _red!!
        }
        _red = Builder(name = "Red", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.679f)
                lineTo(12.0f, 0.0f)
                lineTo(8.655f, 4.945f)
                close()
                moveTo(12.0f, 8.655f)
                verticalLineToRelative(6.69f)
                lineToRelative(7.673f, -4.0f)
                lineTo(16.327f, 6.4f)
                close()
                moveTo(12.0f, 6.679f)
                lineTo(15.345f, 4.945f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(20.655f, 12.812f)
                lineTo(12.0f, 17.322f)
                lineTo(12.0f, 24.0f)
                lineToRelative(12.0f, -6.242f)
                close()
                moveTo(12.0f, 24.0f)
                verticalLineToRelative(-6.679f)
                lineToRelative(-8.655f, -4.509f)
                lineTo(0.0f, 17.758f)
                close()
                moveTo(4.327f, 11.345f)
                lineToRelative(7.673f, 4.0f)
                verticalLineToRelative(-6.69f)
                lineTo(7.673f, 6.4f)
                close()
            }
        }
        .build()
        return _red!!
    }

private var _red: ImageVector? = null
