package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.MapPin3Fill: ImageVector
    get() {
        if (_mapPin3Fill != null) {
            return _mapPin3Fill!!
        }
        _mapPin3Fill = Builder(name = "MapPin3Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 19.945f)
                arcTo(9.001f, 9.001f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, 1.0f, 17.945f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-4.055f)
                close()
            }
        }
        .build()
        return _mapPin3Fill!!
    }

private var _mapPin3Fill: ImageVector? = null
