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

public val SimpleIcons.Jellyfin: ImageVector
    get() {
        if (_jellyfin != null) {
            return _jellyfin!!
        }
        _jellyfin = Builder(name = "Jellyfin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.002f)
                curveTo(8.826f, 0.002f, -1.398f, 18.537f, 0.16f, 21.666f)
                curveToRelative(1.56f, 3.129f, 22.14f, 3.094f, 23.682f, 0.0f)
                curveTo(25.384f, 18.573f, 15.177f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(19.76f, 18.951f)
                curveToRelative(-1.008f, 2.028f, -14.493f, 2.05f, -15.514f, 0.0f)
                curveTo(3.224f, 16.9f, 9.92f, 4.755f, 12.003f, 4.755f)
                curveToRelative(2.081f, 0.0f, 8.77f, 12.166f, 7.759f, 14.196f)
                close()
                moveTo(12.0f, 9.198f)
                curveToRelative(-1.054f, 0.0f, -4.446f, 6.15f, -3.93f, 7.189f)
                curveToRelative(0.518f, 1.04f, 7.348f, 1.027f, 7.86f, 0.0f)
                curveToRelative(0.511f, -1.027f, -2.874f, -7.19f, -3.93f, -7.19f)
                close()
            }
        }
        .build()
        return _jellyfin!!
    }

private var _jellyfin: ImageVector? = null
