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

public val LightGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 39.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.6f, -5.6f)
                curveToRelative(-75.6f, -4.4f, -136.0f, 18.2f, -161.7f, 60.6f)
                curveToRelative(-17.5f, 28.8f, -16.8f, 62.9f, 1.8f, 96.4f)
                lineTo(35.8f, 211.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, false, 8.4f, 8.4f)
                lineTo(65.0f, 199.5f)
                curveToRelative(17.3f, 9.6f, 34.8f, 14.4f, 51.6f, 14.4f)
                arcToRelative(85.8f, 85.8f, 0.0f, false, false, 44.8f, -12.6f)
                curveTo(203.8f, 175.6f, 226.4f, 115.2f, 222.0f, 39.6f)
                close()
                moveTo(155.2f, 191.0f)
                curveToRelative(-24.1f, 14.6f, -52.8f, 14.4f, -81.3f, -0.4f)
                lineToRelative(90.3f, -90.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -8.4f, -8.4f)
                lineTo(65.4f, 182.1f)
                curveToRelative(-14.8f, -28.5f, -15.0f, -57.2f, -0.4f, -81.3f)
                curveToRelative(22.7f, -37.5f, 76.8f, -57.9f, 145.3f, -55.1f)
                curveTo(213.1f, 114.2f, 192.7f, 168.3f, 155.2f, 191.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
