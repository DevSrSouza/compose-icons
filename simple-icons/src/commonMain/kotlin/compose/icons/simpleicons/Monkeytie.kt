package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Monkeytie: ImageVector
    get() {
        if (_monkeytie != null) {
            return _monkeytie!!
        }
        _monkeytie = Builder(name = "Monkeytie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.001f, 0.0f)
                horizontalLineToRelative(-16.0f)
                curveTo(1.791f, 0.0f, 0.0f, 1.791f, 0.0f, 4.001f)
                verticalLineToRelative(15.998f)
                curveTo(0.0f, 22.209f, 1.791f, 24.0f, 4.001f, 24.0f)
                horizontalLineToRelative(16.0f)
                curveTo(22.209f, 24.0f, 24.0f, 22.209f, 24.0f, 19.999f)
                lineTo(24.0f, 4.001f)
                curveTo(24.0f, 1.791f, 22.209f, 0.0f, 20.001f, 0.0f)
                close()
                moveTo(12.335f, 16.295f)
                lineToRelative(-0.866f, -6.759f)
                lineToRelative(-2.579f, 4.638f)
                lineToRelative(-2.583f, -4.623f)
                lineToRelative(-0.858f, 6.744f)
                horizontalLineToRelative(-1.93f)
                lineToRelative(1.4f, -10.086f)
                lineTo(6.43f, 6.209f)
                lineTo(8.888f, 10.8f)
                lineToRelative(2.454f, -4.591f)
                horizontalLineToRelative(1.514f)
                lineToRelative(1.397f, 10.086f)
                horizontalLineToRelative(-1.918f)
                close()
                moveTo(18.864f, 10.559f)
                horizontalLineToRelative(-1.585f)
                verticalLineToRelative(3.257f)
                curveToRelative(0.0f, 1.095f, 0.087f, 1.151f, 1.096f, 1.151f)
                horizontalLineToRelative(0.49f)
                lineToRelative(-0.171f, 1.472f)
                horizontalLineToRelative(-1.293f)
                curveToRelative(-1.354f, 0.0f, -1.93f, -0.95f, -1.93f, -1.89f)
                verticalLineToRelative(-3.997f)
                horizontalLineToRelative(-1.027f)
                lineToRelative(0.156f, -1.47f)
                horizontalLineToRelative(0.855f)
                lineTo(15.455f, 7.504f)
                lineToRelative(1.79f, -0.188f)
                verticalLineToRelative(1.775f)
                horizontalLineToRelative(1.588f)
                verticalLineToRelative(1.467f)
                horizontalLineToRelative(0.031f)
                close()
                moveTo(20.541f, 16.439f)
                horizontalLineToRelative(-1.484f)
                lineToRelative(0.159f, -1.485f)
                horizontalLineToRelative(1.487f)
                lineToRelative(-0.172f, 1.479f)
                lineToRelative(0.01f, 0.006f)
                close()
            }
        }
        .build()
        return _monkeytie!!
    }

private var _monkeytie: ImageVector? = null
