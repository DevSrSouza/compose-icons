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

public val BoldGroup.FilePng: ImageVector
    get() {
        if (_filePng != null) {
            return _filePng!!
        }
        _filePng = Builder(name = "FilePng", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 164.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -21.8f, 7.0f)
                lineTo(120.0f, 201.4f)
                lineTo(120.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(96.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 21.8f, -7.0f)
                lineTo(136.0f, 182.6f)
                lineTo(136.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(32.0f, 124.0f)
                lineTo(32.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 52.0f, 24.0f)
                lineTo(156.0f, 24.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, true, 8.5f, 3.5f)
                lineToRelative(56.0f, 56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, true, 224.0f, 92.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(200.0f, 112.0f)
                lineTo(148.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(136.0f, 48.0f)
                lineTo(56.0f, 48.0f)
                verticalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(160.0f, 57.0f)
                lineTo(160.0f, 88.0f)
                horizontalLineToRelative(31.0f)
                close()
                moveTo(84.0f, 184.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(48.0f, 216.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(24.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                lineTo(52.0f, 152.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 84.0f, 184.0f)
                close()
                moveTo(60.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(48.0f, 176.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 60.0f, 184.0f)
                close()
                moveTo(228.0f, 186.9f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 3.1f, 8.0f)
                arcTo(12.6f, 12.6f, 0.0f, false, true, 206.0f, 208.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, -7.2f, -14.0f, -16.0f)
                reflectiveCurveToRelative(6.3f, -16.0f, 14.0f, -16.0f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, true, 7.2f, 2.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 13.6f, -19.8f)
                arcTo(37.1f, 37.1f, 0.0f, false, false, 206.0f, 152.0f)
                curveToRelative(-21.0f, 0.0f, -38.0f, 17.9f, -38.0f, 40.0f)
                reflectiveCurveToRelative(17.0f, 40.0f, 38.0f, 40.0f)
                curveToRelative(13.3f, 0.0f, 25.4f, -7.1f, 32.4f, -19.0f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, 1.6f, -6.1f)
                verticalLineToRelative(-8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 228.0f, 186.9f)
                close()
            }
        }
        .build()
        return _filePng!!
    }

private var _filePng: ImageVector? = null
