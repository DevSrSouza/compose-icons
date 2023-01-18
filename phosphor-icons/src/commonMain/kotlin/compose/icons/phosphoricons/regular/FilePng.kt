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

public val RegularGroup.FilePng: ImageVector
    get() {
        if (_filePng != null) {
            return _filePng!!
        }
        _filePng = Builder(name = "FilePng", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 160.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
                moveTo(60.0f, 192.0f)
                lineTo(52.0f, 192.0f)
                lineTo(52.0f, 176.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(152.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.5f, 7.6f)
                arcToRelative(7.3f, 7.3f, 0.0f, false, true, -2.5f, 0.4f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, -6.4f, -3.2f)
                lineTo(116.0f, 192.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(100.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 5.5f, -7.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 8.9f, 2.8f)
                lineTo(136.0f, 192.0f)
                lineTo(136.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(224.0f, 205.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -1.3f, 4.3f)
                arcTo(29.4f, 29.4f, 0.0f, false, true, 198.0f, 224.0f)
                curveToRelative(-16.5f, 0.0f, -30.0f, -14.4f, -30.0f, -32.0f)
                reflectiveCurveToRelative(13.5f, -32.0f, 30.0f, -32.0f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, 16.6f, 5.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.2f, 13.0f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 198.0f, 176.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, 7.2f, -14.0f, 16.0f)
                reflectiveCurveToRelative(6.3f, 16.0f, 14.0f, 16.0f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 10.0f, -4.8f)
                lineTo(208.0f, 202.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                close()
                moveTo(200.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, -2.4f, -5.7f)
                lineToRelative(-55.9f, -56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(56.0f, 40.0f)
                horizontalLineToRelative(88.0f)
                lineTo(144.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(48.0f)
                close()
                moveTo(160.0f, 51.3f)
                lineTo(188.7f, 80.0f)
                lineTo(160.0f, 80.0f)
                close()
            }
        }
        .build()
        return _filePng!!
    }

private var _filePng: ImageVector? = null
