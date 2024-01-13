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
                moveTo(48.0f, 448.0f)
                lineTo(48.0f, 64.0f)
                curveToRelative(0.0f, -8.8f, 7.2f, -16.0f, 16.0f, -16.0f)
                lineTo(224.0f, 48.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(80.0f)
                lineTo(336.0f, 448.0f)
                curveToRelative(0.0f, 8.8f, -7.2f, 16.0f, -16.0f, 16.0f)
                lineTo(64.0f, 464.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                close()
                moveTo(64.0f, 0.0f)
                curveTo(28.7f, 0.0f, 0.0f, 28.7f, 0.0f, 64.0f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(320.0f, 512.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(384.0f, 154.5f)
                curveToRelative(0.0f, -17.0f, -6.7f, -33.3f, -18.7f, -45.3f)
                lineTo(274.7f, 18.7f)
                curveTo(262.7f, 6.7f, 246.5f, 0.0f, 229.5f, 0.0f)
                lineTo(64.0f, 0.0f)
                close()
                moveTo(119.0f, 241.1f)
                curveToRelative(-3.8f, -12.7f, -17.2f, -19.9f, -29.9f, -16.1f)
                reflectiveCurveToRelative(-19.9f, 17.2f, -16.1f, 29.9f)
                lineToRelative(48.0f, 160.0f)
                curveToRelative(3.0f, 10.2f, 12.4f, 17.1f, 23.0f, 17.1f)
                reflectiveCurveToRelative(19.9f, -7.0f, 23.0f, -17.1f)
                lineToRelative(25.0f, -83.4f)
                lineToRelative(25.0f, 83.4f)
                curveToRelative(3.0f, 10.2f, 12.4f, 17.1f, 23.0f, 17.1f)
                reflectiveCurveToRelative(19.9f, -7.0f, 23.0f, -17.1f)
                lineToRelative(48.0f, -160.0f)
                curveToRelative(3.8f, -12.7f, -3.4f, -26.1f, -16.1f, -29.9f)
                reflectiveCurveToRelative(-26.1f, 3.4f, -29.9f, 16.1f)
                lineToRelative(-25.0f, 83.4f)
                lineToRelative(-25.0f, -83.4f)
                curveToRelative(-3.0f, -10.2f, -12.4f, -17.1f, -23.0f, -17.1f)
                reflectiveCurveToRelative(-19.9f, 7.0f, -23.0f, 17.1f)
                lineToRelative(-25.0f, 83.4f)
                lineToRelative(-25.0f, -83.4f)
                close()
            }
        }
        .build()
        return _fileWord!!
    }

private var _fileWord: ImageVector? = null
