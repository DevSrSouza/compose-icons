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

public val LightGroup.FireSimple: ImageVector
    get() {
        if (_fireSimple != null) {
            return _fireSimple!!
        }
        _fireSimple = Builder(name = "FireSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.1f, 14.6f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -9.7f, 1.7f)
                lineTo(109.6f, 83.2f)
                lineTo(75.4f, 60.4f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 67.0f, 62.0f)
                curveToRelative(-19.2f, 29.1f, -29.0f, 55.3f, -29.0f, 78.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, false, 180.0f, 0.0f)
                curveTo(218.0f, 88.5f, 185.8f, 49.3f, 151.1f, 14.6f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(78.1f, 78.1f, 0.0f, false, true, -78.0f, -78.0f)
                curveToRelative(0.0f, -19.0f, 8.0f, -41.3f, 23.8f, -66.3f)
                lineTo(108.7f, 97.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.9f, 0.8f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.8f, -3.2f)
                lineToRelative(31.2f, -65.4f)
                curveTo(179.1f, 60.5f, 206.0f, 95.8f, 206.0f, 140.0f)
                arcTo(78.1f, 78.1f, 0.0f, false, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _fireSimple!!
    }

private var _fireSimple: ImageVector? = null
