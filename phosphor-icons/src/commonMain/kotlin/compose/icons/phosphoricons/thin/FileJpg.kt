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

public val ThinGroup.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) {
            return _fileJpg!!
        }
        _fileJpg = Builder(name = "FileJpg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 164.0f)
                lineTo(104.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(108.0f, 204.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                close()
                moveTo(120.0f, 196.0f)
                lineTo(108.0f, 196.0f)
                lineTo(108.0f, 172.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(76.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(204.0f, 194.0f)
                verticalLineToRelative(11.8f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, true, -0.6f, 2.2f)
                arcTo(25.7f, 25.7f, 0.0f, false, true, 182.0f, 220.0f)
                curveToRelative(-14.3f, 0.0f, -26.0f, -12.6f, -26.0f, -28.0f)
                reflectiveCurveToRelative(11.7f, -28.0f, 26.0f, -28.0f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, true, 14.3f, 4.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 1.0f, 5.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.6f, 0.9f)
                arcTo(17.2f, 17.2f, 0.0f, false, false, 182.0f, 172.0f)
                curveToRelative(-9.9f, 0.0f, -18.0f, 9.0f, -18.0f, 20.0f)
                reflectiveCurveToRelative(8.1f, 20.0f, 18.0f, 20.0f)
                arcToRelative(17.6f, 17.6f, 0.0f, false, false, 14.0f, -7.4f)
                lineTo(196.0f, 198.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 204.0f, 194.0f)
                close()
                moveTo(212.0f, 88.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 88.1f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
