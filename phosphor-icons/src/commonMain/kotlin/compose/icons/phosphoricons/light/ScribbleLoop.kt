package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.ScribbleLoop: ImageVector
    get() {
        if (_scribbleLoop != null) {
            return _scribbleLoop!!
        }
        _scribbleLoop = Builder(name = "ScribbleLoop", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.6f, 156.2f)
                curveToRelative(-1.2f, -1.5f, -23.0f, -27.2f, -60.1f, -41.2f)
                curveToRelative(-1.9f, -17.9f, -8.6f, -34.3f, -19.3f, -46.8f)
                curveTo(150.5f, 51.1f, 129.4f, 42.0f, 104.0f, 42.0f)
                curveTo(53.5f, 42.0f, 20.5f, 87.4f, 19.1f, 89.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.8f, 7.0f)
                curveTo(29.2f, 95.9f, 59.7f, 54.0f, 104.0f, 54.0f)
                curveToRelative(21.8f, 0.0f, 39.8f, 7.6f, 52.1f, 22.0f)
                curveToRelative(8.0f, 9.4f, 13.4f, 21.5f, 15.7f, 34.8f)
                arcTo(134.7f, 134.7f, 0.0f, false, false, 136.0f, 106.0f)
                curveToRelative(-25.6f, 0.0f, -47.0f, 6.6f, -62.0f, 19.2f)
                curveToRelative(-13.1f, 11.0f, -20.6f, 26.4f, -20.6f, 42.0f)
                arcToRelative(45.5f, 45.5f, 0.0f, false, false, 13.3f, 32.7f)
                curveTo(76.0f, 209.1f, 88.9f, 214.0f, 104.0f, 214.0f)
                curveToRelative(24.6f, 0.0f, 45.5f, -9.7f, 60.5f, -28.1f)
                curveToRelative(12.5f, -15.4f, 19.9f, -36.2f, 20.5f, -57.7f)
                arcToRelative(149.2f, 149.2f, 0.0f, false, true, 50.4f, 35.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 9.2f, -7.6f)
                close()
                moveTo(104.0f, 202.0f)
                curveToRelative(-18.6f, 0.0f, -38.6f, -10.9f, -38.6f, -34.8f)
                reflectiveCurveTo(87.5f, 118.0f, 136.0f, 118.0f)
                arcToRelative(122.6f, 122.6f, 0.0f, false, true, 37.0f, 5.8f)
                verticalLineToRelative(1.8f)
                curveTo(173.0f, 175.8f, 138.3f, 202.0f, 104.0f, 202.0f)
                close()
            }
        }
        .build()
        return _scribbleLoop!!
    }

private var _scribbleLoop: ImageVector? = null
