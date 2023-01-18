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

public val RemixIcons.MapPin4Fill: ImageVector
    get() {
        if (_mapPin4Fill != null) {
            return _mapPin4Fill!!
        }
        _mapPin4Fill = Builder(name = "MapPin4Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.938f)
                arcTo(8.001f, 8.001f, 0.0f, false, true, 12.0f, 2.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.0f, 15.938f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.062f)
                close()
                moveTo(5.0f, 22.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(-2.0f)
                close()
            }
        }
        .build()
        return _mapPin4Fill!!
    }

private var _mapPin4Fill: ImageVector? = null
