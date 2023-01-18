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

public val RegularGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.9f, 94.0f)
                lineToRelative(-100.0f, -56.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -15.8f, 0.0f)
                lineTo(20.1f, 94.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.1f, 7.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.1f, 7.0f)
                lineToRelative(100.0f, 56.7f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 15.8f, 0.0f)
                lineToRelative(100.0f, -56.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.1f, -7.0f)
                lineTo(240.0f, 101.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 235.9f, 94.0f)
                close()
                moveTo(224.0f, 151.3f)
                lineTo(191.8f, 133.0f)
                lineTo(224.0f, 114.7f)
                close()
                moveTo(175.6f, 123.8f)
                lineTo(136.0f, 101.3f)
                lineTo(136.0f, 55.7f)
                lineTo(215.8f, 101.0f)
                close()
                moveTo(128.0f, 150.8f)
                lineTo(96.6f, 133.0f)
                lineTo(128.0f, 115.2f)
                lineTo(159.4f, 133.0f)
                close()
                moveTo(120.0f, 55.7f)
                verticalLineToRelative(45.6f)
                lineTo(80.4f, 123.8f)
                lineTo(40.2f, 101.0f)
                close()
                moveTo(32.0f, 114.7f)
                lineTo(64.2f, 133.0f)
                lineTo(32.0f, 151.3f)
                close()
                moveTo(80.4f, 142.2f)
                lineTo(120.0f, 164.7f)
                verticalLineToRelative(45.6f)
                lineTo(40.2f, 165.0f)
                close()
                moveTo(136.0f, 210.3f)
                lineTo(136.0f, 164.7f)
                lineToRelative(39.6f, -22.5f)
                lineTo(215.8f, 165.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
