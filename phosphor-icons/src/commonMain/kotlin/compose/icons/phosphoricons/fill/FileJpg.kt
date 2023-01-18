package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) {
            return _fileJpg!!
        }
        _fileJpg = Builder(name = "FileJpg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 160.0f)
                lineTo(104.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                close()
                moveTo(120.0f, 192.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(112.0f, 176.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(80.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -48.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(208.0f, 194.0f)
                verticalLineToRelative(11.8f)
                arcToRelative(7.5f, 7.5f, 0.0f, false, true, -1.3f, 4.3f)
                arcTo(29.4f, 29.4f, 0.0f, false, true, 182.0f, 224.0f)
                curveToRelative(-16.5f, 0.0f, -30.0f, -14.4f, -30.0f, -32.0f)
                reflectiveCurveToRelative(13.5f, -32.0f, 30.0f, -32.0f)
                arcToRelative(28.4f, 28.4f, 0.0f, false, true, 16.6f, 5.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -9.2f, 13.0f)
                arcTo(12.6f, 12.6f, 0.0f, false, false, 182.0f, 176.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, 7.2f, -14.0f, 16.0f)
                reflectiveCurveToRelative(6.3f, 16.0f, 14.0f, 16.0f)
                arcToRelative(13.3f, 13.3f, 0.0f, false, false, 10.0f, -4.8f)
                lineTo(192.0f, 202.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 208.0f, 194.0f)
                close()
                moveTo(213.7f, 82.3f)
                lineTo(157.7f, 26.3f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(208.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 88.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 213.7f, 82.3f)
                close()
                moveTo(152.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                close()
            }
        }
        .build()
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
