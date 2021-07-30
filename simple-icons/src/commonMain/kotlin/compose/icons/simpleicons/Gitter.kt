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

public val SimpleIcons.Gitter: ImageVector
    get() {
        if (_gitter != null) {
            return _gitter!!
        }
        _gitter = Builder(name = "Gitter", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.501f, 4.001f)
                lineTo(10.5f, 4.001f)
                lineTo(10.5f, 24.0f)
                lineTo(8.501f, 24.0f)
                lineTo(8.501f, 4.001f)
                close()
                moveTo(15.5f, 4.001f)
                lineTo(15.5f, 24.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(13.5f, 4.001f)
                horizontalLineToRelative(2.0f)
                close()
                moveTo(3.5f, 0.0f)
                horizontalLineToRelative(2.001f)
                verticalLineToRelative(15.0f)
                lineTo(3.5f, 15.0f)
                lineTo(3.5f, 0.0f)
                close()
                moveTo(18.5f, 4.001f)
                horizontalLineToRelative(2.0f)
                lineTo(20.5f, 15.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(18.5f, 4.001f)
                close()
            }
        }
        .build()
        return _gitter!!
    }

private var _gitter: ImageVector? = null
