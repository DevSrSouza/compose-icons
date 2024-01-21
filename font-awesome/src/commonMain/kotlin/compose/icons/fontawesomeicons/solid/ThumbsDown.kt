package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) {
            return _thumbsDown!!
        }
        _thumbsDown = Builder(name = "ThumbsDown", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(313.4f, 479.1f)
                curveToRelative(26.0f, -5.2f, 42.9f, -30.5f, 37.7f, -56.5f)
                lineToRelative(-2.3f, -11.4f)
                curveToRelative(-5.3f, -26.7f, -15.1f, -52.1f, -28.8f, -75.2f)
                horizontalLineTo(464.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                curveToRelative(0.0f, -18.5f, -10.5f, -34.6f, -25.9f, -42.6f)
                curveTo(497.0f, 236.6f, 504.0f, 223.1f, 504.0f, 208.0f)
                curveToRelative(0.0f, -23.4f, -16.8f, -42.9f, -38.9f, -47.1f)
                curveToRelative(4.4f, -7.3f, 6.9f, -15.8f, 6.9f, -24.9f)
                curveToRelative(0.0f, -21.3f, -13.9f, -39.4f, -33.1f, -45.6f)
                curveToRelative(0.7f, -3.3f, 1.1f, -6.8f, 1.1f, -10.4f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                horizontalLineTo(294.5f)
                curveToRelative(-19.0f, 0.0f, -37.5f, 5.6f, -53.3f, 16.1f)
                lineTo(202.7f, 73.8f)
                curveTo(176.0f, 91.6f, 160.0f, 121.6f, 160.0f, 153.7f)
                verticalLineTo(192.0f)
                verticalLineToRelative(48.0f)
                verticalLineToRelative(24.9f)
                curveToRelative(0.0f, 29.2f, 13.3f, 56.7f, 36.0f, 75.0f)
                lineToRelative(7.4f, 5.9f)
                curveToRelative(26.5f, 21.2f, 44.6f, 51.0f, 51.2f, 84.2f)
                lineToRelative(2.3f, 11.4f)
                curveToRelative(5.2f, 26.0f, 30.5f, 42.9f, 56.5f, 37.7f)
                close()
                moveTo(32.0f, 384.0f)
                horizontalLineTo(96.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(128.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 96.0f, 0.0f, 110.3f, 0.0f, 128.0f)
                verticalLineTo(352.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
