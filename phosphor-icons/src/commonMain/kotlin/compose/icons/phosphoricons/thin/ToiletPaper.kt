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

public val ThinGroup.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) {
            return _toiletPaper!!
        }
        _toiletPaper = Builder(name = "ToiletPaper", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 72.0f, 120.0f)
                close()
                moveTo(236.0f, 120.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(112.0f, 220.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(100.0f, 168.9f)
                curveTo(92.1f, 190.3f, 79.1f, 204.0f, 64.0f, 204.0f)
                curveToRelative(-24.7f, 0.0f, -44.0f, -36.9f, -44.0f, -84.0f)
                reflectiveCurveTo(39.3f, 36.0f, 64.0f, 36.0f)
                lineTo(192.0f, 36.0f)
                curveTo(216.7f, 36.0f, 236.0f, 72.9f, 236.0f, 120.0f)
                close()
                moveTo(100.0f, 120.0f)
                curveToRelative(0.0f, -41.2f, -16.5f, -76.0f, -36.0f, -76.0f)
                reflectiveCurveTo(28.0f, 78.8f, 28.0f, 120.0f)
                reflectiveCurveToRelative(16.5f, 76.0f, 36.0f, 76.0f)
                reflectiveCurveTo(100.0f, 161.2f, 100.0f, 120.0f)
                close()
                moveTo(228.0f, 208.0f)
                lineTo(228.0f, 124.0f)
                lineTo(208.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(19.9f)
                curveToRelative(-1.0f, -39.4f, -17.0f, -72.0f, -35.9f, -72.0f)
                lineTo(83.0f, 44.0f)
                curveToRelative(14.3f, 12.8f, 24.2f, 39.8f, 24.9f, 72.0f)
                lineTo(128.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(108.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                lineTo(224.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 228.0f, 208.0f)
                close()
                moveTo(176.0f, 116.0f)
                lineTo(160.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
