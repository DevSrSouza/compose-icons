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

public val LightGroup.Bell: ImageVector
    get() {
        if (_bell != null) {
            return _bell!!
        }
        _bell = Builder(name = "Bell", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.1f, 176.9f)
                curveToRelative(-6.1f, -10.4f, -13.3f, -30.1f, -13.3f, -64.9f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -43.2f, -34.6f, -78.6f, -77.2f, -78.9f)
                lineTo(128.0f, 26.0f)
                arcToRelative(77.8f, 77.8f, 0.0f, false, false, -77.8f, 78.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 34.8f, -7.2f, 54.5f, -13.3f, 64.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 14.1f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 49.0f, 198.0f)
                lineTo(90.0f, 198.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(41.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 12.1f, -7.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 219.1f, 176.9f)
                close()
                moveTo(154.0f, 200.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -52.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(52.0f)
                close()
                moveTo(208.7f, 185.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, 1.0f)
                lineTo(49.0f, 186.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.7f, -1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.0f)
                curveToRelative(6.8f, -11.8f, 14.9f, -33.6f, 14.9f, -71.0f)
                verticalLineToRelative(-8.0f)
                arcTo(65.9f, 65.9f, 0.0f, false, true, 128.0f, 38.0f)
                horizontalLineToRelative(0.5f)
                curveToRelative(36.0f, 0.2f, 65.3f, 30.3f, 65.3f, 66.9f)
                lineTo(193.8f, 112.0f)
                curveToRelative(0.0f, 37.4f, 8.1f, 59.2f, 14.9f, 71.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.7f, 185.0f)
                close()
            }
        }
        .build()
        return _bell!!
    }

private var _bell: ImageVector? = null
