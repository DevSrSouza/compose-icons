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

public val BoldGroup.BellZ: ImageVector
    get() {
        if (_bellZ != null) {
            return _bellZ!!
        }
        _bellZ = Builder(name = "BellZ", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(108.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -10.9f, -6.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 1.7f, -12.8f)
                lineTo(122.4f, 108.0f)
                lineTo(108.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.9f, 6.9f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -1.7f, 12.8f)
                lineTo(133.6f, 132.0f)
                lineTo(148.0f, 132.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 144.0f)
                close()
                moveTo(224.3f, 194.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 207.0f, 204.0f)
                lineTo(171.8f, 204.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, -87.6f, 0.0f)
                lineTo(49.0f, 204.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -17.3f, -10.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 0.0f, -20.1f)
                curveToRelative(5.7f, -9.8f, 12.5f, -28.5f, 12.5f, -61.9f)
                verticalLineToRelative(-8.0f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 128.0f, 20.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(45.9f, 0.3f, 83.2f, 38.4f, 83.2f, 84.9f)
                lineTo(211.8f, 112.0f)
                curveToRelative(0.0f, 33.4f, 6.8f, 52.1f, 12.5f, 61.9f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 224.3f, 194.0f)
                close()
                moveTo(147.6f, 204.0f)
                lineTo(108.4f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 39.2f, 0.0f)
                close()
                moveTo(200.4f, 180.0f)
                curveToRelative(-10.3f, -21.5f, -12.6f, -48.4f, -12.6f, -68.0f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -33.3f, -26.6f, -60.7f, -59.3f, -60.9f)
                lineTo(128.0f, 44.0f)
                arcTo(59.3f, 59.3f, 0.0f, false, false, 85.9f, 61.3f)
                arcTo(60.1f, 60.1f, 0.0f, false, false, 68.2f, 104.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 19.6f, -2.3f, 46.5f, -12.6f, 68.0f)
                close()
            }
        }
        .build()
        return _bellZ!!
    }

private var _bellZ: ImageVector? = null
