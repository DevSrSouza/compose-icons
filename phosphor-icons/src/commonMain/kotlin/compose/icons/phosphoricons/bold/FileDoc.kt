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

public val BoldGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(44.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(56.0f, 48.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(52.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(224.0f, 92.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 156.0f, 24.0f)
                lineTo(52.0f, 24.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 32.0f, 44.0f)
                verticalLineToRelative(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 136.0f)
                close()
                moveTo(191.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                lineTo(160.0f, 57.0f)
                close()
                moveTo(44.0f, 152.0f)
                lineTo(28.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(44.0f, 232.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 0.0f, -80.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(40.0f, 208.0f)
                lineTo(40.0f, 176.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(237.9f, 208.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.1f, 16.7f)
                arcTo(37.1f, 37.1f, 0.0f, false, true, 214.0f, 232.0f)
                curveToRelative(-21.0f, 0.0f, -38.0f, -17.9f, -38.0f, -40.0f)
                reflectiveCurveToRelative(17.0f, -40.0f, 38.0f, -40.0f)
                arcToRelative(37.1f, 37.1f, 0.0f, false, true, 20.8f, 6.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -13.6f, 19.8f)
                arcTo(12.8f, 12.8f, 0.0f, false, false, 214.0f, 176.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, 7.2f, -14.0f, 16.0f)
                reflectiveCurveToRelative(6.3f, 16.0f, 14.0f, 16.0f)
                arcToRelative(12.8f, 12.8f, 0.0f, false, false, 7.2f, -2.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 237.9f, 208.8f)
                close()
                moveTo(130.0f, 152.0f)
                curveToRelative(-21.0f, 0.0f, -38.0f, 17.9f, -38.0f, 40.0f)
                reflectiveCurveToRelative(17.0f, 40.0f, 38.0f, 40.0f)
                reflectiveCurveToRelative(38.0f, -17.9f, 38.0f, -40.0f)
                reflectiveCurveTo(151.0f, 152.0f, 130.0f, 152.0f)
                close()
                moveTo(130.0f, 208.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, -7.2f, -14.0f, -16.0f)
                reflectiveCurveToRelative(6.3f, -16.0f, 14.0f, -16.0f)
                reflectiveCurveToRelative(14.0f, 7.2f, 14.0f, 16.0f)
                reflectiveCurveTo(137.7f, 208.0f, 130.0f, 208.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
