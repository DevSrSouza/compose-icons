package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.4f, 37.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.6f, 1.1f)
                curveToRelative(-26.4f, 19.8f, -48.3f, 10.5f, -76.1f, -1.4f)
                reflectiveCurveTo(70.3f, 10.2f, 32.8f, 38.4f)
                arcTo(12.2f, 12.2f, 0.0f, false, false, 28.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(28.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(52.0f, 174.3f)
                curveToRelative(24.3f, -15.4f, 45.2f, -6.4f, 71.3f, 4.7f)
                curveToRelative(16.7f, 7.2f, 34.7f, 14.9f, 54.1f, 14.9f)
                curveToRelative(14.5f, 0.0f, 29.8f, -4.3f, 45.8f, -16.3f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 228.0f, 168.0f)
                lineTo(228.0f, 48.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 221.4f, 37.3f)
                close()
                moveTo(204.0f, 68.7f)
                lineTo(204.0f, 99.9f)
                curveToRelative(-12.5f, 7.9f, -24.1f, 9.3f, -36.0f, 7.4f)
                verticalLineToRelative(-34.0f)
                arcTo(70.6f, 70.6f, 0.0f, false, false, 204.0f, 68.7f)
                close()
                moveTo(144.0f, 67.4f)
                lineTo(144.0f, 99.9f)
                lineToRelative(-11.3f, -4.8f)
                curveToRelative(-6.7f, -2.9f, -13.6f, -5.8f, -20.7f, -8.3f)
                lineTo(112.0f, 54.3f)
                lineTo(123.3f, 59.0f)
                curveTo(130.0f, 61.9f, 136.9f, 64.9f, 144.0f, 67.4f)
                close()
                moveTo(88.0f, 46.9f)
                lineTo(88.0f, 80.8f)
                arcToRelative(69.6f, 69.6f, 0.0f, false, false, -36.0f, 4.7f)
                lineTo(52.0f, 54.3f)
                curveTo(64.5f, 46.4f, 76.1f, 44.9f, 88.0f, 46.9f)
                close()
                moveTo(52.0f, 147.3f)
                lineTo(52.0f, 112.4f)
                curveToRelative(12.5f, -7.9f, 24.1f, -9.3f, 36.0f, -7.4f)
                verticalLineToRelative(37.7f)
                arcTo(70.6f, 70.6f, 0.0f, false, false, 52.0f, 147.3f)
                close()
                moveTo(112.0f, 148.6f)
                lineTo(112.0f, 112.4f)
                lineToRelative(11.3f, 4.8f)
                curveToRelative(6.7f, 2.8f, 13.6f, 5.8f, 20.7f, 8.3f)
                verticalLineToRelative(36.2f)
                lineTo(132.7f, 157.0f)
                curveTo(126.0f, 154.1f, 119.1f, 151.1f, 112.0f, 148.6f)
                close()
                moveTo(168.0f, 169.1f)
                lineTo(168.0f, 131.5f)
                curveToRelative(3.1f, 0.3f, 6.3f, 0.6f, 9.4f, 0.6f)
                arcToRelative(70.0f, 70.0f, 0.0f, false, false, 26.6f, -5.3f)
                verticalLineToRelative(34.9f)
                curveTo(191.5f, 169.6f, 179.9f, 171.1f, 168.0f, 169.1f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
