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

public val LightGroup.FileJpg: ImageVector
    get() {
        if (_fileJpg != null) {
            return _fileJpg!!
        }
        _fileJpg = Builder(name = "FileJpg", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(120.0f, 162.0f)
                lineTo(104.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(110.0f, 206.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                close()
                moveTo(120.0f, 194.0f)
                lineTo(110.0f, 194.0f)
                lineTo(110.0f, 174.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(78.0f, 168.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, true, -44.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(66.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(206.0f, 194.0f)
                verticalLineToRelative(11.8f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -1.0f, 3.3f)
                arcTo(27.4f, 27.4f, 0.0f, false, true, 182.0f, 222.0f)
                curveToRelative(-15.4f, 0.0f, -28.0f, -13.5f, -28.0f, -30.0f)
                reflectiveCurveToRelative(12.6f, -30.0f, 28.0f, -30.0f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, 15.5f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.0f, 9.8f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 182.0f, 174.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 8.1f, -16.0f, 18.0f)
                reflectiveCurveToRelative(7.2f, 18.0f, 16.0f, 18.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 12.0f, -6.1f)
                lineTo(194.0f, 200.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 206.0f, 194.0f)
                close()
                moveTo(214.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -1.8f, -4.3f)
                lineToRelative(-56.0f, -55.9f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 152.0f, 26.0f)
                lineTo(56.0f, 26.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 40.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(54.0f, 40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(90.0f)
                lineTo(146.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(50.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return _fileJpg!!
    }

private var _fileJpg: ImageVector? = null
