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

public val BoldGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(40.0f, 228.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(44.0f, 204.0f)
                lineTo(192.0f, 204.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 216.0f)
                close()
                moveTo(233.3f, 111.6f)
                lineTo(233.6f, 111.1f)
                lineTo(234.0f, 110.7f)
                lineTo(234.3f, 110.1f)
                lineTo(234.6f, 109.7f)
                lineTo(234.9f, 109.1f)
                curveToRelative(0.0f, -0.2f, 0.1f, -0.3f, 0.2f, -0.5f)
                reflectiveCurveToRelative(0.1f, -0.4f, 0.2f, -0.6f)
                reflectiveCurveToRelative(0.1f, -0.3f, 0.2f, -0.5f)
                reflectiveCurveToRelative(0.1f, -0.4f, 0.1f, -0.6f)
                reflectiveCurveToRelative(0.1f, -0.4f, 0.2f, -0.6f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, 0.1f, -0.6f)
                verticalLineToRelative(-0.5f)
                arcToRelative(9.6f, 9.6f, 0.0f, false, false, 0.0f, -2.4f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.3f, 1.3f, 0.0f, false, true, -0.1f, -0.6f)
                curveToRelative(-0.1f, -0.2f, -0.1f, -0.4f, -0.2f, -0.6f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.1f, -0.6f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.2f, -0.5f)
                reflectiveCurveToRelative(-0.1f, -0.4f, -0.2f, -0.6f)
                reflectiveCurveToRelative(-0.2f, -0.3f, -0.2f, -0.5f)
                lineToRelative(-0.3f, -0.6f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-0.3f, -0.6f)
                lineToRelative(-0.4f, -0.4f)
                lineToRelative(-0.3f, -0.5f)
                lineToRelative(-0.7f, -0.8f)
                horizontalLineToRelative(-0.1f)
                lineToRelative(-48.0f, -48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(195.0f, 92.0f)
                lineTo(168.0f, 92.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 63.4f, 173.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.0f, 187.6f)
                arcToRelative(10.3f, 10.3f, 0.0f, false, false, 3.0f, 0.4f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 11.6f, -9.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 168.0f, 116.0f)
                horizontalLineToRelative(27.0f)
                lineToRelative(-27.5f, 27.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineToRelative(48.0f, -48.0f)
                horizontalLineToRelative(0.1f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
