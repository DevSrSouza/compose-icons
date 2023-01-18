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

public val LightGroup.FilePng: ImageVector
    get() {
        if (_filePng != null) {
            return _filePng!!
        }
        _filePng = Builder(name = "FilePng", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.0f, 162.0f)
                lineTo(44.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(50.0f, 206.0f)
                lineTo(60.0f, 206.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 0.0f, -44.0f)
                close()
                moveTo(60.0f, 194.0f)
                lineTo(50.0f, 194.0f)
                lineTo(50.0f, 174.0f)
                lineTo(60.0f, 174.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 0.0f, 20.0f)
                close()
                moveTo(150.0f, 168.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.1f, 5.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, 0.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -4.8f, -2.4f)
                lineTo(114.0f, 186.0f)
                verticalLineToRelative(30.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(102.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 10.8f, -3.6f)
                lineTo(138.0f, 198.0f)
                lineTo(138.0f, 168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(222.0f, 205.8f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, -1.0f, 3.3f)
                arcTo(27.4f, 27.4f, 0.0f, false, true, 198.0f, 222.0f)
                curveToRelative(-15.4f, 0.0f, -28.0f, -13.5f, -28.0f, -30.0f)
                reflectiveCurveToRelative(12.6f, -30.0f, 28.0f, -30.0f)
                arcToRelative(26.5f, 26.5f, 0.0f, false, true, 15.5f, 5.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -7.0f, 9.8f)
                arcTo(14.7f, 14.7f, 0.0f, false, false, 198.0f, 174.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 8.1f, -16.0f, 18.0f)
                reflectiveCurveToRelative(7.2f, 18.0f, 16.0f, 18.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, false, 12.0f, -6.1f)
                lineTo(210.0f, 200.0f)
                horizontalLineToRelative(-6.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                close()
                moveTo(202.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(214.0f, 88.0f)
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
                close()
                moveTo(158.0f, 46.5f)
                lineTo(193.5f, 82.0f)
                lineTo(158.0f, 82.0f)
                close()
            }
        }
        .build()
        return _filePng!!
    }

private var _filePng: ImageVector? = null
