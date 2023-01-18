package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) {
            return _bellSimple!!
        }
        _bellSimple = Builder(name = "BellSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(96.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 172.0f, 228.0f)
                close()
                moveTo(224.3f, 190.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, true, 207.0f, 200.0f)
                lineTo(49.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -17.3f, -30.1f)
                curveToRelative(5.7f, -9.8f, 12.5f, -28.5f, 12.5f, -61.9f)
                verticalLineToRelative(-4.0f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 128.0f, 20.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(45.9f, 0.3f, 83.2f, 38.4f, 83.2f, 84.9f)
                lineTo(211.8f, 108.0f)
                curveToRelative(0.0f, 33.4f, 6.8f, 52.1f, 12.5f, 61.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 224.3f, 190.0f)
                close()
                moveTo(200.4f, 176.0f)
                curveToRelative(-10.3f, -21.6f, -12.6f, -48.5f, -12.6f, -68.0f)
                verticalLineToRelative(-3.1f)
                curveToRelative(0.0f, -33.4f, -26.6f, -60.7f, -59.3f, -60.9f)
                lineTo(128.0f, 44.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, -59.8f, 60.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 19.5f, -2.3f, 46.4f, -12.6f, 68.0f)
                close()
            }
        }
        .build()
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
