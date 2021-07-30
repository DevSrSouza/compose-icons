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

public val SolidGroup.FileWord: ImageVector
    get() {
        if (_fileWord != null) {
            return _fileWord!!
        }
        _fileWord = Builder(name = "FileWord", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 136.0f)
                lineTo(224.0f, 0.0f)
                lineTo(24.0f, 0.0f)
                curveTo(10.7f, 0.0f, 0.0f, 10.7f, 0.0f, 24.0f)
                verticalLineToRelative(464.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(336.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                lineTo(384.0f, 160.0f)
                lineTo(248.0f, 160.0f)
                curveToRelative(-13.2f, 0.0f, -24.0f, -10.8f, -24.0f, -24.0f)
                close()
                moveTo(281.1f, 256.0f)
                lineTo(305.0f, 256.0f)
                curveToRelative(7.7f, 0.0f, 13.4f, 7.1f, 11.7f, 14.7f)
                lineToRelative(-38.0f, 168.0f)
                curveToRelative(-1.2f, 5.5f, -6.1f, 9.3f, -11.7f, 9.3f)
                horizontalLineToRelative(-38.0f)
                curveToRelative(-5.5f, 0.0f, -10.3f, -3.8f, -11.6f, -9.1f)
                curveToRelative(-25.8f, -103.5f, -20.8f, -81.2f, -25.6f, -110.5f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.1f, 14.3f, -2.4f, 17.4f, -25.6f, 110.5f)
                curveToRelative(-1.3f, 5.3f, -6.1f, 9.1f, -11.6f, 9.1f)
                lineTo(117.0f, 448.0f)
                curveToRelative(-5.6f, 0.0f, -10.5f, -3.9f, -11.7f, -9.4f)
                lineToRelative(-37.8f, -168.0f)
                curveToRelative(-1.7f, -7.5f, 4.0f, -14.6f, 11.7f, -14.6f)
                horizontalLineToRelative(24.5f)
                curveToRelative(5.7f, 0.0f, 10.7f, 4.0f, 11.8f, 9.7f)
                curveToRelative(15.6f, 78.0f, 20.1f, 109.5f, 21.0f, 122.2f)
                curveToRelative(1.6f, -10.2f, 7.3f, -32.7f, 29.4f, -122.7f)
                curveToRelative(1.3f, -5.4f, 6.1f, -9.1f, 11.7f, -9.1f)
                horizontalLineToRelative(29.1f)
                curveToRelative(5.6f, 0.0f, 10.4f, 3.8f, 11.7f, 9.2f)
                curveToRelative(24.0f, 100.4f, 28.8f, 124.0f, 29.6f, 129.4f)
                curveToRelative(-0.2f, -11.2f, -2.6f, -17.8f, 21.6f, -129.2f)
                curveToRelative(1.0f, -5.6f, 5.9f, -9.5f, 11.5f, -9.5f)
                close()
                moveTo(384.0f, 121.9f)
                verticalLineToRelative(6.1f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 0.0f)
                horizontalLineToRelative(6.1f)
                curveToRelative(6.4f, 0.0f, 12.5f, 2.5f, 17.0f, 7.0f)
                lineToRelative(97.9f, 98.0f)
                curveToRelative(4.5f, 4.5f, 7.0f, 10.6f, 7.0f, 16.9f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
