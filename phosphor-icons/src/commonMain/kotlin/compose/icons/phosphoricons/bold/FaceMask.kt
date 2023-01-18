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

public val BoldGroup.FaceMask: ImageVector
    get() {
        if (_faceMask != null) {
            return _faceMask!!
        }
        _faceMask = Builder(name = "FaceMask", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(88.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.0f, 108.0f)
                close()
                moveTo(168.0f, 132.0f)
                lineTo(88.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(256.0f, 104.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                horizontalLineToRelative(-6.2f)
                curveToRelative(-6.4f, 13.8f, -17.9f, 26.0f, -34.1f, 36.1f)
                curveToRelative(-19.1f, 11.8f, -39.3f, 17.3f, -47.1f, 19.2f)
                arcToRelative(21.4f, 21.4f, 0.0f, false, true, -9.2f, 0.0f)
                curveToRelative(-12.0f, -2.8f, -63.5f, -17.0f, -81.3f, -55.3f)
                lineTo(36.0f, 164.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 0.0f, 128.0f)
                lineTo(0.0f, 104.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 36.0f, 68.0f)
                horizontalLineToRelative(2.3f)
                arcToRelative(20.2f, 20.2f, 0.0f, false, true, 10.3f, -9.2f)
                lineToRelative(72.0f, -28.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 14.8f, 0.0f)
                lineToRelative(72.0f, 28.8f)
                arcTo(20.2f, 20.2f, 0.0f, false, true, 217.7f, 68.0f)
                lineTo(220.0f, 68.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 256.0f, 104.0f)
                close()
                moveTo(36.1f, 140.0f)
                curveToRelative(0.0f, -1.3f, -0.1f, -2.6f, -0.1f, -4.0f)
                lineTo(36.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                close()
                moveTo(193.6f, 150.2f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, 1.0f, -3.5f)
                arcTo(41.8f, 41.8f, 0.0f, false, false, 196.0f, 136.0f)
                lineTo(196.0f, 80.1f)
                lineTo(128.0f, 52.9f)
                lineTo(60.0f, 80.1f)
                lineTo(60.0f, 136.0f)
                arcToRelative(41.8f, 41.8f, 0.0f, false, false, 1.4f, 10.7f)
                arcToRelative(10.8f, 10.8f, 0.0f, false, true, 1.0f, 3.5f)
                curveToRelative(4.0f, 11.1f, 12.9f, 21.0f, 26.5f, 29.4f)
                curveToRelative(15.7f, 9.8f, 32.9f, 14.6f, 39.1f, 16.1f)
                curveToRelative(6.2f, -1.5f, 23.3f, -6.3f, 39.1f, -16.1f)
                curveTo(180.7f, 171.2f, 189.6f, 161.3f, 193.6f, 150.2f)
                close()
                moveTo(232.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                verticalLineToRelative(44.0f)
                curveToRelative(0.0f, 1.3f, 0.0f, 2.7f, -0.1f, 4.0f)
                horizontalLineToRelative(0.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _faceMask!!
    }

private var _faceMask: ImageVector? = null
