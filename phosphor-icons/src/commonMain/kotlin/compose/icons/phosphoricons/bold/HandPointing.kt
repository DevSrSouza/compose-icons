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

public val BoldGroup.HandPointing: ImageVector
    get() {
        if (_handPointing != null) {
            return _handPointing!!
        }
        _handPointing = Builder(name = "HandPointing", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 80.0f)
                arcToRelative(31.3f, 31.3f, 0.0f, false, false, -13.0f, 2.8f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 148.0f, 68.0f)
                arcToRelative(35.0f, 35.0f, 0.0f, false, false, -8.0f, 1.0f)
                lineTo(140.0f, 36.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(76.5f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -43.2f, -10.9f)
                arcToRelative(31.5f, 31.5f, 0.0f, false, false, -15.0f, 19.4f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, 3.0f, 23.8f)
                curveToRelative(15.7f, 33.1f, 29.5f, 58.5f, 46.1f, 75.1f)
                reflectiveCurveTo(102.3f, 244.0f, 128.0f, 244.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 92.0f, -92.0f)
                lineTo(220.0f, 112.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 188.0f, 80.0f)
                close()
                moveTo(196.0f, 152.0f)
                arcToRelative(68.1f, 68.1f, 0.0f, false, true, -68.0f, 68.0f)
                curveToRelative(-36.2f, 0.0f, -53.0f, -16.8f, -85.7f, -85.9f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -0.5f, -0.8f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, true, -0.8f, -6.1f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 3.8f, -4.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, 6.0f, -0.8f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, 4.9f, 3.7f)
                lineToRelative(21.9f, 38.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.4f, -6.0f)
                lineTo(100.0f, 36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
