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

public val ThinGroup.FileJs: ImageVector
    get() {
        if (_fileJs != null) {
            return _fileJs!!
        }
        _fileJs = Builder(name = "FileJs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(76.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(68.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(120.6f, 187.7f)
                curveToRelative(-8.6f, -2.3f, -12.6f, -3.8f, -12.6f, -7.7f)
                curveToRelative(0.0f, -5.6f, 4.1f, -9.0f, 11.0f, -9.0f)
                arcToRelative(20.7f, 20.7f, 0.0f, false, true, 12.4f, 4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.2f, -6.2f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 119.0f, 163.0f)
                curveToRelative(-11.4f, 0.0f, -19.0f, 6.8f, -19.0f, 17.0f)
                reflectiveCurveToRelative(10.3f, 13.2f, 18.6f, 15.4f)
                reflectiveCurveToRelative(13.4f, 4.0f, 13.4f, 8.6f)
                curveToRelative(0.0f, 2.5f, 0.0f, 9.0f, -13.0f, 9.0f)
                arcToRelative(21.5f, 21.5f, 0.0f, false, true, -12.5f, -4.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 0.5f, 5.7f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 119.0f, 221.0f)
                curveToRelative(13.3f, 0.0f, 21.0f, -6.2f, 21.0f, -17.0f)
                reflectiveCurveTo(129.3f, 189.9f, 120.6f, 187.7f)
                close()
                moveTo(212.0f, 88.1f)
                lineTo(212.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(176.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(204.0f, 92.0f)
                lineTo(152.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(148.0f, 36.0f)
                lineTo(56.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(52.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 28.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, 2.8f, 1.2f)
                lineToRelative(56.0f, 55.9f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 212.0f, 88.0f)
                close()
                moveTo(156.0f, 84.0f)
                horizontalLineToRelative(42.3f)
                lineTo(156.0f, 41.7f)
                close()
            }
        }
        .build()
        return _fileJs!!
    }

private var _fileJs: ImageVector? = null
