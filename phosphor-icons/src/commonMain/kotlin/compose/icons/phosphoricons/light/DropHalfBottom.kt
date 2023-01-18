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

public val LightGroup.DropHalfBottom: ImageVector
    get() {
        if (_dropHalfBottom != null) {
            return _dropHalfBottom!!
        }
        _dropHalfBottom = Builder(name = "DropHalfBottom", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.5f, 49.1f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, -38.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, -6.8f, 0.0f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, -41.1f, 38.0f)
                curveTo(56.3f, 80.3f, 42.0f, 113.1f, 42.0f, 144.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                curveTo(214.0f, 113.1f, 199.7f, 80.3f, 172.5f, 49.1f)
                close()
                moveTo(128.0f, 23.5f)
                curveToRelative(13.1f, 10.1f, 59.8f, 49.0f, 71.4f, 98.5f)
                lineTo(56.6f, 122.0f)
                curveTo(68.2f, 72.5f, 114.9f, 33.6f, 128.0f, 23.5f)
                close()
                moveTo(202.0f, 144.0f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, true, -0.7f, 10.0f)
                lineTo(54.7f, 154.0f)
                arcToRelative(77.3f, 77.3f, 0.0f, false, true, -0.1f, -20.0f)
                lineTo(201.4f, 134.0f)
                arcTo(82.6f, 82.6f, 0.0f, false, true, 202.0f, 144.0f)
                close()
                moveTo(67.1f, 186.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -9.8f, -20.0f)
                lineTo(198.7f, 166.0f)
                arcToRelative(75.9f, 75.9f, 0.0f, false, true, -9.8f, 20.0f)
                close()
                moveTo(77.5f, 198.0f)
                horizontalLineToRelative(101.0f)
                arcToRelative(73.8f, 73.8f, 0.0f, false, true, -101.0f, 0.0f)
                close()
            }
        }
        .build()
        return _dropHalfBottom!!
    }

private var _dropHalfBottom: ImageVector? = null
