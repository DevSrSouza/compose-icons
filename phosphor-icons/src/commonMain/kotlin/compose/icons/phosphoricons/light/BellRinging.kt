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

public val LightGroup.BellRinging: ImageVector
    get() {
        if (_bellRinging != null) {
            return _bellRinging!!
        }
        _bellRinging = Builder(name = "BellRinging", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.8f, 112.0f)
                arcToRelative(77.7f, 77.7f, 0.0f, false, false, -77.2f, -78.0f)
                lineTo(128.0f, 34.0f)
                arcToRelative(78.0f, 78.0f, 0.0f, false, false, -77.8f, 78.0f)
                curveToRelative(0.0f, 34.8f, -7.2f, 54.5f, -13.3f, 64.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, 14.1f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 49.0f, 198.0f)
                lineTo(90.0f, 198.0f)
                verticalLineToRelative(2.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 76.0f, 0.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(41.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 12.1f, -7.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -14.1f)
                curveTo(213.0f, 166.5f, 205.8f, 146.8f, 205.8f, 112.0f)
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
                curveToRelative(6.8f, -11.7f, 14.9f, -33.5f, 14.9f, -71.0f)
                arcTo(65.9f, 65.9f, 0.0f, false, true, 128.0f, 46.0f)
                horizontalLineToRelative(0.5f)
                arcToRelative(65.2f, 65.2f, 0.0f, false, true, 46.3f, 19.4f)
                arcToRelative(66.3f, 66.3f, 0.0f, false, true, 19.0f, 46.6f)
                curveToRelative(0.0f, 37.5f, 8.1f, 59.3f, 14.9f, 71.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 208.7f, 185.0f)
                close()
                moveTo(224.0f, 71.5f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.6f, 0.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -5.4f, -3.3f)
                arcToRelative(97.9f, 97.9f, 0.0f, false, false, -35.8f, -39.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.8f, -8.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.2f, -1.9f)
                arcToRelative(109.9f, 109.9f, 0.0f, false, true, 40.1f, 44.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 224.0f, 71.5f)
                close()
                moveTo(34.6f, 72.1f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, true, -2.6f, -0.6f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -2.7f, -8.0f)
                arcTo(109.9f, 109.9f, 0.0f, false, true, 69.4f, 18.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.2f, 1.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -1.8f, 8.3f)
                arcTo(97.9f, 97.9f, 0.0f, false, false, 40.0f, 68.8f)
                arcTo(5.9f, 5.9f, 0.0f, false, true, 34.6f, 72.1f)
                close()
            }
        }
        .build()
        return _bellRinging!!
    }

private var _bellRinging: ImageVector? = null
