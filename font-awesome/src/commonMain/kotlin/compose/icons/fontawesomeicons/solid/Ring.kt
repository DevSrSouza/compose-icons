package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Ring: ImageVector
    get() {
        if (_ring != null) {
            return _ring!!
        }
        _ring = Builder(name = "Ring", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 64.0f)
                curveTo(110.06f, 64.0f, 0.0f, 125.91f, 0.0f, 208.0f)
                verticalLineToRelative(98.13f)
                curveTo(0.0f, 384.48f, 114.62f, 448.0f, 256.0f, 448.0f)
                reflectiveCurveToRelative(256.0f, -63.52f, 256.0f, -141.87f)
                lineTo(512.0f, 208.0f)
                curveToRelative(0.0f, -82.09f, -110.06f, -144.0f, -256.0f, -144.0f)
                close()
                moveTo(256.0f, 128.0f)
                curveToRelative(106.04f, 0.0f, 192.0f, 35.82f, 192.0f, 80.0f)
                curveToRelative(0.0f, 9.26f, -3.97f, 18.12f, -10.91f, 26.39f)
                curveTo(392.15f, 208.21f, 328.23f, 192.0f, 256.0f, 192.0f)
                reflectiveCurveToRelative(-136.15f, 16.21f, -181.09f, 42.39f)
                curveTo(67.97f, 226.12f, 64.0f, 217.26f, 64.0f, 208.0f)
                curveToRelative(0.0f, -44.18f, 85.96f, -80.0f, 192.0f, -80.0f)
                close()
                moveTo(120.43f, 264.64f)
                curveTo(155.04f, 249.93f, 201.64f, 240.0f, 256.0f, 240.0f)
                reflectiveCurveToRelative(100.96f, 9.93f, 135.57f, 24.64f)
                curveTo(356.84f, 279.07f, 308.93f, 288.0f, 256.0f, 288.0f)
                reflectiveCurveToRelative(-100.84f, -8.93f, -135.57f, -23.36f)
                close()
            }
        }
        .build()
        return _ring!!
    }

private var _ring: ImageVector? = null
