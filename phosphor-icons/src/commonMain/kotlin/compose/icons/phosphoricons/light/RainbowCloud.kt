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

public val LightGroup.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) {
            return _rainbowCloud!!
        }
        _rainbowCloud = Builder(name = "RainbowCloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 114.0f)
                arcToRelative(46.3f, 46.3f, 0.0f, false, false, -43.4f, 30.6f)
                arcToRelative(23.2f, 23.2f, 0.0f, false, false, -4.6f, -0.4f)
                curveToRelative(-16.5f, 0.0f, -30.0f, 13.9f, -30.0f, 30.9f)
                reflectiveCurveTo(135.5f, 206.0f, 152.0f, 206.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 0.0f, -92.0f)
                close()
                moveTo(200.0f, 194.0f)
                lineTo(152.0f, 194.0f)
                curveToRelative(-9.9f, 0.0f, -18.0f, -8.5f, -18.0f, -18.9f)
                reflectiveCurveToRelative(8.1f, -18.9f, 18.0f, -18.9f)
                arcToRelative(17.5f, 17.5f, 0.0f, false, true, 6.5f, 1.3f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 5.1f, -0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.1f, -4.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, true, 200.0f, 194.0f)
                close()
                moveTo(22.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(10.0f, 160.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, true, 183.1f, 86.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.1f, 8.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -8.5f, 0.1f)
                arcTo(88.9f, 88.9f, 0.0f, false, false, 112.0f, 70.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, false, 22.0f, 160.0f)
                close()
                moveTo(112.0f, 102.0f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, false, -58.0f, 58.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(42.0f, 160.0f)
                arcToRelative(70.1f, 70.1f, 0.0f, false, true, 70.0f, -70.0f)
                arcToRelative(69.4f, 69.4f, 0.0f, false, true, 41.4f, 13.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 1.3f, 8.4f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.4f, 1.2f)
                arcTo(57.7f, 57.7f, 0.0f, false, false, 112.0f, 102.0f)
                close()
                moveTo(118.0f, 134.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -6.0f, -0.7f)
                arcToRelative(26.1f, 26.1f, 0.0f, false, false, -26.0f, 26.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(74.0f, 160.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, true, 38.0f, -38.0f)
                arcToRelative(37.1f, 37.1f, 0.0f, false, true, 8.8f, 1.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 4.5f, 7.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 118.0f, 134.7f)
                close()
            }
        }
        .build()
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
