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

public val LightGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(218.7f, 42.6f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.3f, 0.6f)
                curveToRelative(-29.2f, 21.9f, -54.9f, 10.9f, -82.0f, -0.7f)
                reflectiveCurveToRelative(-59.2f, -25.4f, -94.0f, 0.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 34.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(34.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(46.0f, 171.1f)
                curveToRelative(28.2f, -19.6f, 53.2f, -8.9f, 79.6f, 2.4f)
                curveToRelative(16.1f, 6.9f, 33.3f, 14.3f, 51.7f, 14.3f)
                curveToRelative(13.5f, 0.0f, 27.6f, -4.0f, 42.3f, -15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 222.0f, 168.0f)
                lineTo(222.0f, 48.0f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 218.7f, 42.6f)
                close()
                moveTo(210.0f, 59.1f)
                verticalLineToRelative(44.0f)
                curveToRelative(-16.8f, 11.6f, -32.5f, 12.5f, -48.0f, 9.0f)
                lineTo(162.0f, 66.2f)
                curveTo(177.2f, 69.2f, 193.2f, 68.5f, 210.0f, 59.1f)
                close()
                moveTo(150.0f, 63.0f)
                verticalLineToRelative(45.5f)
                curveToRelative(-6.5f, -2.2f, -13.0f, -5.0f, -19.6f, -7.9f)
                reflectiveCurveToRelative(-16.0f, -6.8f, -24.4f, -9.5f)
                lineTo(106.0f, 45.6f)
                curveToRelative(6.5f, 2.3f, 13.0f, 5.1f, 19.6f, 7.9f)
                arcTo(246.7f, 246.7f, 0.0f, false, false, 150.0f, 63.0f)
                close()
                moveTo(94.0f, 42.1f)
                lineTo(94.0f, 88.0f)
                curveToRelative(-15.2f, -3.1f, -31.2f, -2.3f, -48.0f, 7.1f)
                verticalLineToRelative(-44.0f)
                curveTo(62.8f, 39.4f, 78.5f, 38.5f, 94.0f, 42.1f)
                close()
                moveTo(46.0f, 156.9f)
                lineTo(46.0f, 109.2f)
                curveToRelative(16.8f, -11.6f, 32.5f, -12.6f, 48.0f, -9.0f)
                verticalLineToRelative(49.6f)
                curveTo(78.8f, 146.8f, 62.8f, 147.5f, 46.0f, 156.9f)
                close()
                moveTo(106.0f, 153.0f)
                lineTo(106.0f, 103.7f)
                curveToRelative(6.5f, 2.3f, 13.0f, 5.1f, 19.6f, 8.0f)
                reflectiveCurveToRelative(16.0f, 6.8f, 24.4f, 9.5f)
                verticalLineToRelative(49.2f)
                curveToRelative(-6.5f, -2.3f, -13.0f, -5.1f, -19.6f, -7.9f)
                reflectiveCurveTo(114.4f, 155.7f, 106.0f, 153.0f)
                close()
                moveTo(162.0f, 174.0f)
                lineTo(162.0f, 124.3f)
                arcToRelative(77.9f, 77.9f, 0.0f, false, false, 15.3f, 1.6f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, 32.7f, -8.7f)
                verticalLineToRelative(47.7f)
                curveTo(193.2f, 176.6f, 177.5f, 177.5f, 162.0f, 174.0f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
