package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(172.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(88.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(80.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 172.0f, 112.0f)
                close()
                moveTo(168.0f, 140.0f)
                lineTo(88.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(252.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                horizontalLineToRelative(-7.9f)
                curveToRelative(-5.8f, 14.6f, -18.3f, 27.4f, -36.9f, 37.7f)
                curveToRelative(-20.5f, 11.4f, -42.5f, 16.6f, -48.8f, 17.9f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, true, -4.8f, 0.0f)
                curveToRelative(-6.3f, -1.3f, -28.3f, -6.5f, -48.8f, -17.9f)
                curveTo(58.2f, 183.4f, 45.7f, 170.6f, 39.9f, 156.0f)
                lineTo(32.0f, 156.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 4.0f, 128.0f)
                lineTo(4.0f, 104.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 32.0f, 76.0f)
                horizontalLineToRelative(4.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 7.8f, -9.7f)
                lineToRelative(80.0f, -29.1f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, 8.2f, 0.0f)
                lineToRelative(80.0f, 29.1f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, 7.8f, 9.7f)
                lineTo(224.0f, 76.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 252.0f, 104.0f)
                close()
                moveTo(37.4f, 148.0f)
                arcTo(53.2f, 53.2f, 0.0f, false, true, 36.0f, 136.0f)
                lineTo(36.0f, 84.0f)
                lineTo(32.0f, 84.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, 20.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                close()
                moveTo(212.0f, 136.0f)
                lineTo(212.0f, 77.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -2.6f, -3.8f)
                lineToRelative(-80.0f, -29.0f)
                arcToRelative(3.4f, 3.4f, 0.0f, false, false, -2.8f, 0.0f)
                lineToRelative(-80.0f, 29.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 44.0f, 77.6f)
                lineTo(44.0f, 136.0f)
                curveToRelative(0.0f, 20.1f, 12.3f, 37.2f, 36.7f, 50.7f)
                curveToRelative(19.5f, 10.9f, 40.5f, 15.8f, 46.5f, 17.1f)
                horizontalLineToRelative(1.6f)
                curveToRelative(6.0f, -1.3f, 27.0f, -6.2f, 46.5f, -17.1f)
                curveTo(199.7f, 173.2f, 212.0f, 156.1f, 212.0f, 136.0f)
                close()
                moveTo(244.0f, 104.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(53.2f, 53.2f, 0.0f, false, true, -1.4f, 12.0f)
                lineTo(224.0f, 148.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
