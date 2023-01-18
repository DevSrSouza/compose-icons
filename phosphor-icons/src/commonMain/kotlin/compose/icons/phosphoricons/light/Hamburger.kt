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

public val LightGroup.Hamburger: ImageVector
    get() {
        if (_hamburger != null) {
            return _hamburger!!
        }
        _hamburger = Builder(name = "Hamburger", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.8f, 102.0f)
                lineTo(207.2f, 102.0f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 218.0f, 96.8f)
                arcTo(14.3f, 14.3f, 0.0f, false, false, 220.9f, 85.0f)
                curveToRelative(-3.5f, -16.5f, -14.9f, -31.6f, -32.1f, -42.5f)
                reflectiveCurveTo(150.3f, 26.0f, 128.0f, 26.0f)
                reflectiveCurveTo(84.1f, 31.9f, 67.2f, 42.5f)
                reflectiveCurveTo(38.6f, 68.5f, 35.1f, 85.0f)
                arcTo(14.3f, 14.3f, 0.0f, false, false, 38.0f, 96.8f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 48.8f, 102.0f)
                close()
                moveTo(46.9f, 87.5f)
                curveTo(52.8f, 59.3f, 87.7f, 38.0f, 128.0f, 38.0f)
                reflectiveCurveToRelative(75.2f, 21.3f, 81.1f, 49.5f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.4f, 1.8f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.5f, 0.7f)
                lineTo(48.8f, 90.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.5f, -0.7f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 46.9f, 87.5f)
                close()
                moveTo(225.8f, 154.4f)
                lineTo(188.0f, 169.5f)
                lineToRelative(-37.8f, -15.1f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -4.4f, 0.0f)
                lineTo(108.0f, 169.5f)
                lineTo(70.2f, 154.4f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, -4.4f, 0.0f)
                lineToRelative(-40.0f, 16.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.4f, 7.8f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 28.0f, 182.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 2.2f, -0.4f)
                lineTo(42.0f, 176.9f)
                lineTo(42.0f, 184.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(214.0f, 172.1f)
                lineToRelative(16.2f, -6.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.4f, -11.2f)
                close()
                moveTo(202.0f, 184.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(80.0f, 210.0f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(54.0f, 172.1f)
                lineToRelative(14.0f, -5.6f)
                lineToRelative(37.8f, 15.1f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 4.4f, 0.0f)
                lineTo(148.0f, 166.5f)
                lineToRelative(37.8f, 15.1f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 4.4f, 0.0f)
                lineToRelative(11.8f, -4.7f)
                close()
                moveTo(238.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(24.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                lineTo(232.0f, 122.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 128.0f)
                close()
            }
        }
        .build()
        return _hamburger!!
    }

private var _hamburger: ImageVector? = null
