package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) {
            return _fileDoc!!
        }
        _fileDoc = Builder(name = "FileDoc", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 162.0f)
                lineTo(44.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                lineTo(58.0f, 222.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 0.0f, -60.0f)
                close()
                moveTo(58.0f, 210.0f)
                lineTo(50.0f, 210.0f)
                lineTo(50.0f, 174.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                close()
                moveTo(130.0f, 162.0f)
                curveToRelative(-15.4f, 0.0f, -28.0f, 13.5f, -28.0f, 30.0f)
                reflectiveCurveToRelative(12.6f, 30.0f, 28.0f, 30.0f)
                reflectiveCurveToRelative(28.0f, -13.5f, 28.0f, -30.0f)
                reflectiveCurveTo(145.4f, 162.0f, 130.0f, 162.0f)
                close()
                moveTo(130.0f, 210.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -8.1f, -16.0f, -18.0f)
                reflectiveCurveToRelative(7.2f, -18.0f, 16.0f, -18.0f)
                reflectiveCurveToRelative(16.0f, 8.1f, 16.0f, 18.0f)
                reflectiveCurveTo(138.8f, 210.0f, 130.0f, 210.0f)
                close()
                moveTo(216.5f, 206.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.5f, 8.5f)
                arcToRelative(26.9f, 26.9f, 0.0f, false, true, -18.0f, 7.0f)
                curveToRelative(-15.4f, 0.0f, -28.0f, -13.5f, -28.0f, -30.0f)
                reflectiveCurveToRelative(12.6f, -30.0f, 28.0f, -30.0f)
                arcToRelative(26.9f, 26.9f, 0.0f, false, true, 18.0f, 7.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.5f, 8.5f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.5f, 0.4f)
                arcToRelative(15.1f, 15.1f, 0.0f, false, false, -10.0f, -3.9f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 8.1f, -16.0f, 18.0f)
                reflectiveCurveToRelative(7.2f, 18.0f, 16.0f, 18.0f)
                arcToRelative(15.1f, 15.1f, 0.0f, false, false, 10.0f, -3.9f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 216.5f, 206.5f)
                close()
                moveTo(48.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.8f, -4.3f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 48.0f, 134.0f)
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
