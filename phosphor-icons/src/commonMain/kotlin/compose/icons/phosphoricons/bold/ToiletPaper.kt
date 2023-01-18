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

public val BoldGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 120.0f)
                close()
                moveTo(244.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(112.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-9.6f)
                curveTo(84.0f, 207.1f, 74.5f, 212.0f, 64.0f, 212.0f)
                curveToRelative(-29.6f, 0.0f, -52.0f, -39.6f, -52.0f, -92.0f)
                reflectiveCurveTo(34.4f, 28.0f, 64.0f, 28.0f)
                lineTo(192.0f, 28.0f)
                curveTo(221.6f, 28.0f, 244.0f, 67.6f, 244.0f, 120.0f)
                close()
                moveTo(92.0f, 120.0f)
                curveToRelative(0.0f, -19.3f, -3.8f, -37.9f, -10.4f, -51.2f)
                curveTo(76.3f, 58.3f, 69.7f, 52.0f, 64.0f, 52.0f)
                reflectiveCurveTo(51.7f, 58.3f, 46.4f, 68.8f)
                curveTo(39.8f, 82.1f, 36.0f, 100.7f, 36.0f, 120.0f)
                reflectiveCurveToRelative(3.8f, 37.9f, 10.4f, 51.2f)
                curveTo(51.7f, 181.7f, 58.3f, 188.0f, 64.0f, 188.0f)
                reflectiveCurveToRelative(12.3f, -6.3f, 17.6f, -16.8f)
                curveTo(88.2f, 157.9f, 92.0f, 139.3f, 92.0f, 120.0f)
                close()
                moveTo(220.0f, 204.0f)
                lineTo(220.0f, 132.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(7.5f)
                curveToRelative(-1.2f, -14.9f, -4.7f, -28.7f, -9.9f, -39.2f)
                reflectiveCurveTo(197.7f, 52.0f, 192.0f, 52.0f)
                lineTo(99.7f, 52.0f)
                curveToRelative(8.7f, 14.1f, 14.4f, 33.6f, 15.9f, 56.0f)
                lineTo(124.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(72.0f)
                close()
                moveTo(172.0f, 108.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
