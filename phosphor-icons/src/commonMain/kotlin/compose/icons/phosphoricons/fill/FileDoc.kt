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

public val FillGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 160.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                lineTo(58.0f, 224.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.0f, -64.0f)
                close()
                moveTo(58.0f, 208.0f)
                lineTo(52.0f, 208.0f)
                lineTo(52.0f, 176.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                close()
                moveTo(130.0f, 160.0f)
                curveToRelative(-16.5f, 0.0f, -30.0f, 14.4f, -30.0f, 32.0f)
                reflectiveCurveToRelative(13.5f, 32.0f, 30.0f, 32.0f)
                reflectiveCurveToRelative(30.0f, -14.4f, 30.0f, -32.0f)
                reflectiveCurveTo(146.5f, 160.0f, 130.0f, 160.0f)
                close()
                moveTo(130.0f, 208.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, -7.2f, -14.0f, -16.0f)
                reflectiveCurveToRelative(6.3f, -16.0f, 14.0f, -16.0f)
                reflectiveCurveToRelative(14.0f, 7.2f, 14.0f, 16.0f)
                reflectiveCurveTo(137.7f, 208.0f, 130.0f, 208.0f)
                close()
                moveTo(217.9f, 205.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.5f, 11.3f)
                arcTo(29.3f, 29.3f, 0.0f, false, true, 198.0f, 224.0f)
                curveToRelative(-16.5f, 0.0f, -30.0f, -14.4f, -30.0f, -32.0f)
                reflectiveCurveToRelative(13.5f, -32.0f, 30.0f, -32.0f)
                arcToRelative(29.3f, 29.3f, 0.0f, false, true, 19.4f, 7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.5f, 11.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, 0.6f)
                arcTo(12.9f, 12.9f, 0.0f, false, false, 198.0f, 176.0f)
                curveToRelative(-7.7f, 0.0f, -14.0f, 7.2f, -14.0f, 16.0f)
                reflectiveCurveToRelative(6.3f, 16.0f, 14.0f, 16.0f)
                arcToRelative(12.9f, 12.9f, 0.0f, false, false, 8.6f, -3.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 217.9f, 205.2f)
                close()
                moveTo(48.0f, 136.0f)
                lineTo(208.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(216.0f, 88.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -2.3f, -5.7f)
                lineToRelative(-56.0f, -56.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 152.0f, 24.0f)
                lineTo(56.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 48.0f, 136.0f)
                close()
                moveTo(152.0f, 44.0f)
                lineToRelative(44.0f, 44.0f)
                lineTo(152.0f, 88.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
