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

public val SimpleIcons.Nintendo: ImageVector
    get() {
        if (_nintendo != null) {
            return _nintendo!!
        }
        _nintendo = Builder(name = "Nintendo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.6f)
                horizontalLineToRelative(7.1f)
                lineToRelative(9.85f, 15.9f)
                verticalLineTo(0.6f)
                horizontalLineTo(24.0f)
                verticalLineToRelative(22.8f)
                horizontalLineToRelative(-7.04f)
                lineTo(7.06f, 7.5f)
                verticalLineToRelative(15.9f)
                horizontalLineTo(0.0f)
                verticalLineTo(0.6f)
            }
        }
        .build()
        return _nintendo!!
    }

private var _nintendo: ImageVector? = null
