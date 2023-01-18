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

public val LightGroup.CodesandboxLogo: ImageVector
    get() {
        if (_codesandboxLogo != null) {
            return _codesandboxLogo!!
        }
        _codesandboxLogo = Builder(name = "CodesandboxLogo", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 78.7f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, -1.8f, -6.9f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -5.2f, -5.1f)
                lineTo(134.9f, 17.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineToRelative(-88.0f, 49.5f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -4.9f, 4.7f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-0.3f, 0.4f)
                horizontalLineToRelative(-0.1f)
                arcTo(13.7f, 13.7f, 0.0f, false, false, 26.0f, 78.7f)
                verticalLineToRelative(98.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, 12.2f)
                lineToRelative(88.0f, 49.5f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.1f, 1.8f)
                horizontalLineToRelative(1.6f)
                arcToRelative(14.8f, 14.8f, 0.0f, false, false, 6.1f, -1.8f)
                lineToRelative(88.0f, -49.5f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.1f, -12.2f)
                close()
                moveTo(128.9f, 121.1f)
                lineTo(44.3f, 74.0f)
                lineTo(79.0f, 54.4f)
                lineToRelative(46.1f, 25.9f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, false, 5.8f, 0.0f)
                lineTo(177.0f, 54.4f)
                lineTo(211.8f, 74.0f)
                close()
                moveTo(127.0f, 27.4f)
                lineToRelative(1.0f, -0.2f)
                lineToRelative(1.0f, 0.2f)
                lineToRelative(35.7f, 20.1f)
                lineTo(128.0f, 68.2f)
                lineTo(91.3f, 47.5f)
                close()
                moveTo(38.0f, 177.3f)
                lineTo(38.0f, 137.2f)
                lineToRelative(36.0f, 20.2f)
                verticalLineToRelative(41.3f)
                lineTo(39.0f, 179.1f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 38.0f, 177.3f)
                close()
                moveTo(86.0f, 205.5f)
                lineTo(86.0f, 153.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.1f, -5.2f)
                lineTo(38.0f, 123.4f)
                lineTo(38.0f, 84.2f)
                lineToRelative(84.9f, 47.3f)
                lineToRelative(-0.8f, 94.3f)
                close()
                moveTo(134.1f, 225.7f)
                lineTo(134.9f, 131.5f)
                lineTo(218.0f, 84.3f)
                verticalLineToRelative(39.1f)
                lineToRelative(-44.9f, 25.3f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -3.1f, 5.2f)
                verticalLineToRelative(51.6f)
                close()
                moveTo(217.0f, 179.1f)
                lineToRelative(-35.0f, 19.6f)
                lineTo(182.0f, 157.4f)
                lineToRelative(36.0f, -20.2f)
                verticalLineToRelative(40.1f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 217.0f, 179.1f)
                close()
            }
        }
        .build()
        return _codesandboxLogo!!
    }

private var _codesandboxLogo: ImageVector? = null
