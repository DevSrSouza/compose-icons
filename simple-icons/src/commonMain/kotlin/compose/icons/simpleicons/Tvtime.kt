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

public val SimpleIcons.Tvtime: ImageVector
    get() {
        if (_tvtime != null) {
            return _tvtime!!
        }
        _tvtime = Builder(name = "Tvtime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(4.8f, 4.8f)
                horizontalLineToRelative(14.4f)
                verticalLineToRelative(4.8f)
                horizontalLineToRelative(-4.8f)
                verticalLineToRelative(9.6f)
                lineTo(9.6f, 19.2f)
                lineTo(9.6f, 9.6f)
                lineTo(4.8f, 9.6f)
                close()
            }
        }
        .build()
        return _tvtime!!
    }

private var _tvtime: ImageVector? = null
