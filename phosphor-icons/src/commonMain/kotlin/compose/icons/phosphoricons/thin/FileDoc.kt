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

public val ThinGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 164.0f)
                lineTo(44.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(58.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(58.0f, 212.0f)
                lineTo(48.0f, 212.0f)
                lineTo(48.0f, 172.0f)
                lineTo(58.0f, 172.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, 40.0f)
                close()
                moveTo(130.0f, 164.0f)
                curveToRelative(-14.3f, 0.0f, -26.0f, 12.6f, -26.0f, 28.0f)
                reflectiveCurveToRelative(11.7f, 28.0f, 26.0f, 28.0f)
                reflectiveCurveToRelative(26.0f, -12.6f, 26.0f, -28.0f)
                reflectiveCurveTo(144.3f, 164.0f, 130.0f, 164.0f)
                close()
                moveTo(130.0f, 212.0f)
                curveToRelative(-9.9f, 0.0f, -18.0f, -9.0f, -18.0f, -20.0f)
                reflectiveCurveToRelative(8.1f, -20.0f, 18.0f, -20.0f)
                reflectiveCurveToRelative(18.0f, 9.0f, 18.0f, 20.0f)
                reflectiveCurveTo(139.9f, 212.0f, 130.0f, 212.0f)
                close()
                moveTo(215.0f, 207.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -0.3f, 5.7f)
                arcTo(25.0f, 25.0f, 0.0f, false, true, 198.0f, 220.0f)
                curveToRelative(-14.3f, 0.0f, -26.0f, -12.6f, -26.0f, -28.0f)
                reflectiveCurveToRelative(11.7f, -28.0f, 26.0f, -28.0f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, true, 16.7f, 6.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.3f, 5.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -5.7f, 0.3f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 198.0f, 172.0f)
                curveToRelative(-9.9f, 0.0f, -18.0f, 9.0f, -18.0f, 20.0f)
                reflectiveCurveToRelative(8.1f, 20.0f, 18.0f, 20.0f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, false, 11.3f, -4.5f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 215.0f, 207.8f)
                close()
                moveTo(48.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(52.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(92.0f)
                lineTo(148.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(212.0f, 88.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, -1.2f, -2.9f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(3.6f, 3.6f, 0.0f, false, false, 152.0f, 28.0f)
                lineTo(56.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 48.0f, 132.0f)
                close()
                moveTo(156.0f, 41.7f)
                lineTo(198.3f, 84.0f)
                lineTo(156.0f, 84.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
