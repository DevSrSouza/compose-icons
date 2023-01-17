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

public val SimpleIcons.Saltproject: ImageVector
    get() {
        if (_saltproject != null) {
            return _saltproject!!
        }
        _saltproject = Builder(name = "Saltproject", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                verticalLineToRelative(10.56f)
                horizontalLineToRelative(12.0f)
                lineTo(18.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(1.44f)
                horizontalLineTo(12.0f)
                lineTo(6.0f, 12.0f)
                close()
            }
        }
        .build()
        return _saltproject!!
    }

private var _saltproject: ImageVector? = null
