package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.FlagCheckered: ImageVector
    get() {
        if (_flagCheckered != null) {
            return _flagCheckered!!
        }
        _flagCheckered = Builder(name = "FlagCheckered", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.6f, 40.8f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -8.4f, 0.8f)
                curveToRelative(-28.3f, 21.2f, -52.3f, 11.0f, -80.0f, -0.9f)
                reflectiveCurveToRelative(-60.3f, -25.9f, -96.0f, 0.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 48.0f)
                horizontalLineToRelative(0.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(48.0f, 172.1f)
                curveToRelative(26.9f, -18.1f, 50.1f, -8.2f, 76.8f, 3.3f)
                curveToRelative(16.3f, 6.9f, 33.8f, 14.4f, 52.6f, 14.4f)
                curveToRelative(13.8f, 0.0f, 28.3f, -4.0f, 43.4f, -15.4f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 224.0f, 168.0f)
                lineTo(224.0f, 48.0f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 219.6f, 40.8f)
                close()
                moveTo(208.0f, 62.4f)
                lineTo(208.0f, 102.0f)
                curveToRelative(-15.4f, 10.4f, -29.6f, 11.6f, -44.0f, 8.6f)
                verticalLineToRelative(-42.0f)
                curveTo(177.9f, 71.1f, 192.6f, 70.2f, 208.0f, 62.4f)
                close()
                moveTo(148.0f, 64.5f)
                verticalLineToRelative(41.2f)
                quadToRelative(-8.2f, -3.2f, -16.8f, -6.9f)
                curveToRelative(-7.5f, -3.2f, -15.2f, -6.5f, -23.2f, -9.2f)
                lineTo(108.0f, 48.4f)
                curveToRelative(5.5f, 2.1f, 11.1f, 4.5f, 16.8f, 7.0f)
                curveTo(132.3f, 58.6f, 140.0f, 61.9f, 148.0f, 64.5f)
                close()
                moveTo(92.0f, 43.6f)
                lineTo(92.0f, 85.5f)
                curveTo(78.1f, 83.1f, 63.4f, 84.0f, 48.0f, 91.7f)
                lineTo(48.0f, 52.1f)
                curveTo(63.4f, 41.7f, 77.6f, 40.5f, 92.0f, 43.6f)
                close()
                moveTo(48.0f, 153.6f)
                lineTo(48.0f, 110.3f)
                curveToRelative(15.4f, -10.4f, 29.6f, -11.6f, 44.0f, -8.6f)
                verticalLineToRelative(45.7f)
                curveTo(78.1f, 145.0f, 63.4f, 145.8f, 48.0f, 153.6f)
                close()
                moveTo(108.0f, 151.5f)
                lineTo(108.0f, 106.6f)
                curveToRelative(5.5f, 2.0f, 11.1f, 4.4f, 16.8f, 6.9f)
                curveToRelative(7.5f, 3.2f, 15.2f, 6.5f, 23.2f, 9.1f)
                verticalLineToRelative(45.0f)
                curveToRelative(-5.5f, -2.1f, -11.1f, -4.5f, -16.8f, -6.9f)
                curveTo(123.7f, 157.5f, 116.0f, 154.1f, 108.0f, 151.5f)
                close()
                moveTo(164.0f, 172.4f)
                lineTo(164.0f, 126.8f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, false, 13.4f, 1.2f)
                arcToRelative(66.0f, 66.0f, 0.0f, false, false, 30.6f, -7.5f)
                verticalLineToRelative(43.4f)
                curveTo(192.6f, 174.3f, 178.4f, 175.5f, 164.0f, 172.4f)
                close()
            }
        }
        .build()
        return _flagCheckered!!
    }

private var _flagCheckered: ImageVector? = null
