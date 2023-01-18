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

public val LightGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.7f, 225.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 216.0f, 230.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -1.8f, -0.3f)
                lineTo(128.0f, 202.3f)
                lineTo(41.8f, 229.7f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, -1.8f, 0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.8f, -11.7f)
                lineToRelative(70.0f, -22.3f)
                lineToRelative(-70.0f, -22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.6f, -11.4f)
                lineTo(128.0f, 189.7f)
                lineToRelative(86.2f, -27.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 3.6f, 11.4f)
                lineToRelative(-70.0f, 22.3f)
                lineToRelative(70.0f, 22.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 221.7f, 225.8f)
                close()
                moveTo(70.0f, 108.0f)
                curveToRelative(0.0f, -46.8f, 52.6f, -79.7f, 54.9f, -81.1f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 6.2f, 0.0f)
                curveTo(133.4f, 28.3f, 186.0f, 61.2f, 186.0f, 108.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -116.0f, 0.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, -18.0f)
                curveToRelative(0.0f, -15.5f, -12.0f, -27.4f, -18.0f, -32.4f)
                curveToRelative(-6.0f, 5.0f, -18.0f, 17.0f, -18.0f, 32.4f)
                arcTo(18.1f, 18.1f, 0.0f, false, false, 128.0f, 154.0f)
                close()
                moveTo(82.0f, 108.0f)
                arcToRelative(45.9f, 45.9f, 0.0f, false, false, 17.0f, 35.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -1.0f, -7.7f)
                curveToRelative(0.0f, -26.9f, 25.6f, -44.3f, 26.7f, -45.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 6.6f, 0.0f)
                curveToRelative(1.1f, 0.7f, 26.7f, 18.1f, 26.7f, 45.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -1.0f, 7.7f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 174.0f, 108.0f)
                curveToRelative(0.0f, -34.1f, -35.1f, -61.2f, -46.0f, -68.8f)
                curveTo(117.2f, 46.8f, 82.0f, 73.9f, 82.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
