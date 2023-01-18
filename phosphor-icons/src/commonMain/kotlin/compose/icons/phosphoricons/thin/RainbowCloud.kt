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

public val ThinGroup.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) {
            return _rainbowCloud!!
        }
        _rainbowCloud = Builder(name = "RainbowCloud", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 116.0f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, false, -42.0f, 30.9f)
                arcToRelative(24.6f, 24.6f, 0.0f, false, false, -6.0f, -0.7f)
                curveToRelative(-15.4f, 0.0f, -28.0f, 13.0f, -28.0f, 28.9f)
                reflectiveCurveTo(136.6f, 204.0f, 152.0f, 204.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                close()
                moveTo(200.0f, 196.0f)
                lineTo(152.0f, 196.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, -9.4f, -20.0f, -20.9f)
                reflectiveCurveToRelative(9.0f, -20.9f, 20.0f, -20.9f)
                arcToRelative(18.3f, 18.3f, 0.0f, false, true, 7.3f, 1.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 3.4f, -0.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.0f, -2.7f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 200.0f, 196.0f)
                close()
                moveTo(20.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(12.0f, 160.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 181.7f, 88.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -5.6f, 5.7f)
                arcTo(91.2f, 91.2f, 0.0f, false, false, 112.0f, 68.0f)
                arcTo(92.1f, 92.1f, 0.0f, false, false, 20.0f, 160.0f)
                close()
                moveTo(112.0f, 100.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -60.0f, 60.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(44.0f, 160.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 108.2f, -54.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.9f, 5.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.6f, 0.8f)
                arcTo(59.4f, 59.4f, 0.0f, false, false, 112.0f, 100.0f)
                close()
                moveTo(123.3f, 129.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.8f, 3.0f)
                arcTo(27.9f, 27.9f, 0.0f, false, false, 84.0f, 160.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(76.0f, 160.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcToRelative(33.1f, 33.1f, 0.0f, false, true, 8.3f, 1.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 123.3f, 129.8f)
                close()
            }
        }
        .build()
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
