package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.9f, 97.9f)
                lineTo(286.0f, 14.0f)
                curveTo(277.0f, 5.0f, 264.8f, -0.1f, 252.1f, -0.1f)
                lineTo(48.0f, -0.1f)
                curveTo(21.5f, 0.0f, 0.0f, 21.5f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(384.0f, 131.9f)
                curveToRelative(0.0f, -12.7f, -5.1f, -25.0f, -14.1f, -34.0f)
                close()
                moveTo(332.1f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.9f)
                lineToRelative(76.1f, 76.1f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(268.1f, 256.0f)
                curveToRelative(-5.7f, 0.0f, -10.6f, 4.0f, -11.7f, 9.5f)
                curveToRelative(-20.6f, 97.7f, -20.4f, 95.4f, -21.0f, 103.5f)
                curveToRelative(-0.2f, -1.2f, -0.4f, -2.6f, -0.7f, -4.3f)
                curveToRelative(-0.8f, -5.1f, 0.3f, 0.2f, -23.6f, -99.5f)
                curveToRelative(-1.3f, -5.4f, -6.1f, -9.2f, -11.7f, -9.2f)
                horizontalLineToRelative(-13.3f)
                curveToRelative(-5.5f, 0.0f, -10.3f, 3.8f, -11.7f, 9.1f)
                curveToRelative(-24.4f, 99.0f, -24.0f, 96.2f, -24.8f, 103.7f)
                curveToRelative(-0.1f, -1.1f, -0.2f, -2.5f, -0.5f, -4.2f)
                curveToRelative(-0.7f, -5.2f, -14.1f, -73.3f, -19.1f, -99.0f)
                curveToRelative(-1.1f, -5.6f, -6.0f, -9.7f, -11.8f, -9.7f)
                horizontalLineToRelative(-16.8f)
                curveToRelative(-7.8f, 0.0f, -13.5f, 7.3f, -11.7f, 14.8f)
                curveToRelative(8.0f, 32.6f, 26.7f, 109.5f, 33.2f, 136.0f)
                curveToRelative(1.3f, 5.4f, 6.1f, 9.1f, 11.7f, 9.1f)
                horizontalLineToRelative(25.2f)
                curveToRelative(5.5f, 0.0f, 10.3f, -3.7f, 11.6f, -9.1f)
                lineToRelative(17.9f, -71.4f)
                curveToRelative(1.5f, -6.2f, 2.5f, -12.0f, 3.0f, -17.3f)
                lineToRelative(2.9f, 17.3f)
                curveToRelative(0.1f, 0.4f, 12.6f, 50.5f, 17.9f, 71.4f)
                curveToRelative(1.3f, 5.3f, 6.1f, 9.1f, 11.6f, 9.1f)
                horizontalLineToRelative(24.7f)
                curveToRelative(5.5f, 0.0f, 10.3f, -3.7f, 11.6f, -9.1f)
                curveToRelative(20.8f, -81.9f, 30.2f, -119.0f, 34.5f, -136.0f)
                curveToRelative(1.9f, -7.6f, -3.8f, -14.9f, -11.6f, -14.9f)
                horizontalLineToRelative(-15.8f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
