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

public val LightGroup.BellSimple: ImageVector
    get() {
        if (_bellSimple != null) {
            return _bellSimple!!
        }
        _bellSimple = Builder(name = "BellSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(165.9f, 224.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(-64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 165.9f, 224.0f)
                close()
                moveTo(219.1f, 191.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -12.1f, 7.0f)
                lineTo(49.0f, 198.0f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -12.1f, -7.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 0.0f, -14.1f)
                curveTo(43.0f, 166.5f, 50.2f, 146.8f, 50.2f, 112.0f)
                verticalLineToRelative(-8.0f)
                arcTo(77.8f, 77.8f, 0.0f, false, true, 128.0f, 26.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(42.6f, 0.3f, 77.2f, 35.7f, 77.2f, 78.9f)
                lineTo(205.8f, 112.0f)
                curveToRelative(0.0f, 34.8f, 7.2f, 54.5f, 13.3f, 64.9f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 219.1f, 191.0f)
                close()
                moveTo(208.7f, 183.0f)
                curveToRelative(-6.8f, -11.8f, -14.9f, -33.6f, -14.9f, -71.0f)
                verticalLineToRelative(-7.1f)
                curveToRelative(0.0f, -36.6f, -29.3f, -66.7f, -65.3f, -66.9f)
                lineTo(128.0f, 38.0f)
                arcToRelative(65.9f, 65.9f, 0.0f, false, false, -65.8f, 66.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 37.4f, -8.1f, 59.2f, -14.9f, 71.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 2.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.7f, 1.0f)
                lineTo(207.0f, 186.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, false, 1.7f, -1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 208.7f, 183.0f)
                close()
            }
        }
        .build()
        return _bellSimple!!
    }

private var _bellSimple: ImageVector? = null
