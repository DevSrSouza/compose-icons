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

public val FillGroup.FileJs: ImageVector
    get() {
        if (_fileJs != null) {
            return _fileJs!!
        }
        _fileJs = Builder(name = "FileJs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(144.0f, 204.0f)
                curveToRelative(0.0f, 13.1f, -9.3f, 21.0f, -25.0f, 21.0f)
                arcToRelative(33.4f, 33.4f, 0.0f, false, true, -20.1f, -6.8f)
                horizontalLineToRelative(0.0f)
                arcTo(7.6f, 7.6f, 0.0f, false, true, 96.0f, 212.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 5.1f, 1.8f)
                lineTo(109.0f, 205.8f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, 10.0f, 3.2f)
                curveToRelative(9.0f, 0.0f, 9.0f, -3.0f, 9.0f, -5.0f)
                reflectiveCurveToRelative(0.0f, -0.9f, -1.2f, -1.6f)
                reflectiveCurveToRelative(-5.8f, -2.2f, -9.2f, -3.1f)
                curveTo(109.0f, 197.0f, 96.0f, 193.5f, 96.0f, 180.0f)
                reflectiveCurveToRelative(9.5f, -21.0f, 23.0f, -21.0f)
                arcToRelative(33.4f, 33.4f, 0.0f, false, true, 20.1f, 6.8f)
                horizontalLineToRelative(0.0f)
                arcTo(7.6f, 7.6f, 0.0f, false, true, 142.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -5.1f, -1.8f)
                horizontalLineToRelative(0.1f)
                arcToRelative(18.4f, 18.4f, 0.0f, false, false, -10.0f, -3.2f)
                curveToRelative(-4.6f, 0.0f, -7.0f, 1.7f, -7.0f, 5.0f)
                verticalLineToRelative(0.2f)
                curveToRelative(1.1f, 1.3f, 6.6f, 2.8f, 9.7f, 3.6f)
                curveTo(130.0f, 186.0f, 144.0f, 189.7f, 144.0f, 204.0f)
                close()
                moveTo(72.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 48.0f, 0.0f)
                lineTo(80.0f, 168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 160.0f)
                close()
                moveTo(216.0f, 88.0f)
                lineTo(216.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(168.0f, 144.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(48.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(40.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 24.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 5.7f, 2.3f)
                lineToRelative(56.0f, 56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 216.0f, 88.0f)
                close()
                moveTo(196.0f, 88.0f)
                lineTo(152.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _fileJs!!
    }

private var _fileJs: ImageVector? = null
