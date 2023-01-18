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

public val LightGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(88.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(80.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 174.0f, 112.0f)
                close()
                moveTo(168.0f, 138.0f)
                lineTo(88.0f, 138.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(254.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(30.1f, 30.1f, 0.0f, false, true, -30.0f, 30.0f)
                horizontalLineToRelative(-6.5f)
                curveToRelative(-6.2f, 14.5f, -18.8f, 27.2f, -37.3f, 37.5f)
                curveToRelative(-20.8f, 11.5f, -43.0f, 16.7f, -49.4f, 18.1f)
                lineToRelative(-2.8f, 0.2f)
                lineToRelative(-2.8f, -0.2f)
                curveToRelative(-6.4f, -1.4f, -28.6f, -6.6f, -49.4f, -18.1f)
                curveToRelative(-18.5f, -10.3f, -31.1f, -23.0f, -37.3f, -37.5f)
                lineTo(32.0f, 158.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 2.0f, 128.0f)
                lineTo(2.0f, 104.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 32.0f, 74.0f)
                horizontalLineToRelative(2.5f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 8.7f, -9.6f)
                lineToRelative(80.0f, -29.0f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, true, 9.6f, 0.0f)
                lineToRelative(80.0f, 29.0f)
                arcToRelative(14.4f, 14.4f, 0.0f, false, true, 8.7f, 9.6f)
                lineTo(224.0f, 74.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, true, 254.0f, 104.0f)
                close()
                moveTo(34.9f, 146.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, true, -0.9f, -10.0f)
                lineTo(34.0f, 86.0f)
                lineTo(32.0f, 86.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, -18.0f, 18.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, 18.0f)
                close()
                moveTo(210.0f, 136.0f)
                lineTo(210.0f, 77.6f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.3f, -1.9f)
                lineToRelative(-80.0f, -29.1f)
                horizontalLineToRelative(-1.4f)
                lineToRelative(-80.0f, 29.1f)
                arcTo(2.1f, 2.1f, 0.0f, false, false, 46.0f, 77.6f)
                lineTo(46.0f, 136.0f)
                curveToRelative(0.0f, 47.3f, 73.3f, 64.1f, 81.6f, 65.8f)
                horizontalLineToRelative(0.8f)
                curveTo(136.7f, 200.1f, 210.0f, 183.3f, 210.0f, 136.0f)
                close()
                moveTo(242.0f, 104.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, -18.0f, -18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(50.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, true, -0.9f, 10.0f)
                lineTo(224.0f, 146.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, false, 18.0f, -18.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
