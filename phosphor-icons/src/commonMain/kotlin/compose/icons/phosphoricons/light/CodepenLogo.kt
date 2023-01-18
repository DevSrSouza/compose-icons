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

public val LightGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.0f, 95.8f)
                lineTo(134.9f, 39.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -13.8f, 0.0f)
                lineTo(21.0f, 95.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.0f, 5.2f)
                verticalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, 5.2f)
                lineTo(121.1f, 227.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 13.8f, 0.0f)
                lineTo(235.0f, 170.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.0f, -5.2f)
                lineTo(238.0f, 101.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 235.0f, 95.8f)
                close()
                moveTo(226.0f, 154.7f)
                lineTo(187.8f, 133.0f)
                lineTo(226.0f, 111.3f)
                close()
                moveTo(219.8f, 101.0f)
                lineToRelative(-44.2f, 25.1f)
                lineTo(134.0f, 102.5f)
                lineTo(134.0f, 52.3f)
                close()
                moveTo(128.0f, 153.1f)
                lineTo(92.6f, 133.0f)
                lineTo(128.0f, 112.9f)
                lineTo(163.4f, 133.0f)
                close()
                moveTo(122.0f, 52.3f)
                verticalLineToRelative(50.2f)
                lineTo(80.4f, 126.1f)
                lineTo(36.2f, 101.0f)
                close()
                moveTo(30.0f, 111.3f)
                lineTo(68.2f, 133.0f)
                lineTo(30.0f, 154.7f)
                close()
                moveTo(36.2f, 165.0f)
                lineToRelative(44.2f, -25.1f)
                lineTo(122.0f, 163.5f)
                verticalLineToRelative(50.2f)
                close()
                moveTo(134.0f, 213.7f)
                lineTo(134.0f, 163.5f)
                lineToRelative(41.6f, -23.6f)
                lineTo(219.8f, 165.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
