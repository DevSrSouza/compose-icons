package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.LocationSharp: ImageVector
    get() {
        if (_locationSharp != null) {
            return _locationSharp!!
        }
        _locationSharp = Builder(name = "LocationSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveTo(167.67f, 32.0f, 96.0f, 96.51f, 96.0f, 176.0f)
                curveToRelative(0.0f, 128.0f, 160.0f, 304.0f, 160.0f, 304.0f)
                reflectiveCurveTo(416.0f, 304.0f, 416.0f, 176.0f)
                curveTo(416.0f, 96.51f, 344.33f, 32.0f, 256.0f, 32.0f)
                close()
                moveTo(256.0f, 256.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 64.0f, -64.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, true, 256.0f, 256.0f)
                close()
            }
        }
        .build()
        return _locationSharp!!
    }

private var _locationSharp: ImageVector? = null
