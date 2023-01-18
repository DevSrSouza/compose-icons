package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Campfire: ImageVector
    get() {
        if (_campfire != null) {
            return _campfire!!
        }
        _campfire = Builder(name = "Campfire", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.6f, 226.4f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.0f, 232.0f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.4f, -0.4f)
                lineTo(128.0f, 204.4f)
                lineTo(42.4f, 231.6f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, true, -2.4f, 0.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.6f, -5.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 5.2f, -10.0f)
                lineToRelative(64.0f, -20.4f)
                lineToRelative(-64.0f, -20.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.8f, -15.2f)
                lineTo(128.0f, 187.6f)
                lineToRelative(85.6f, -27.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 4.8f, 15.2f)
                lineToRelative(-64.0f, 20.4f)
                lineToRelative(64.0f, 20.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 223.6f, 226.4f)
                close()
                moveTo(68.0f, 108.0f)
                curveToRelative(0.0f, -20.1f, 9.8f, -40.9f, 28.2f, -60.0f)
                arcToRelative(153.5f, 153.5f, 0.0f, false, true, 27.6f, -22.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.4f, 0.0f)
                curveTo(134.5f, 26.6f, 188.0f, 60.1f, 188.0f, 108.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -120.0f, 0.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                curveToRelative(0.0f, -13.6f, -10.0f, -24.5f, -16.0f, -29.8f)
                curveToRelative(-6.0f, 5.3f, -16.0f, 16.2f, -16.0f, 29.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(84.0f, 108.0f)
                arcToRelative(43.5f, 43.5f, 0.0f, false, false, 12.1f, 30.2f)
                arcTo(15.5f, 15.5f, 0.0f, false, true, 96.0f, 136.0f)
                curveToRelative(0.0f, -28.0f, 26.4f, -45.9f, 27.6f, -46.7f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 8.8f, 0.0f)
                curveToRelative(1.2f, 0.8f, 27.6f, 18.7f, 27.6f, 46.7f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -0.1f, 2.2f)
                arcTo(43.5f, 43.5f, 0.0f, false, false, 172.0f, 108.0f)
                curveToRelative(0.0f, -32.0f, -32.3f, -58.0f, -44.0f, -66.3f)
                curveTo(116.3f, 50.0f, 84.0f, 76.0f, 84.0f, 108.0f)
                close()
            }
        }
        .build()
        return _campfire!!
    }

private var _campfire: ImageVector? = null
