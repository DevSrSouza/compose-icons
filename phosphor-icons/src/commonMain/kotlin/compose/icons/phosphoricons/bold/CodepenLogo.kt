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

public val BoldGroup.CodepenLogo: ImageVector
    get() {
        if (_codepenLogo != null) {
            return _codepenLogo!!
        }
        _codepenLogo = Builder(name = "CodepenLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.9f, 90.6f)
                lineToRelative(-100.0f, -56.8f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -19.8f, 0.0f)
                lineTo(18.1f, 90.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 12.0f, 101.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 6.1f, 10.4f)
                lineToRelative(100.0f, 56.8f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 19.8f, 0.0f)
                lineToRelative(100.0f, -56.8f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 244.0f, 165.0f)
                lineTo(244.0f, 101.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 237.9f, 90.6f)
                close()
                moveTo(220.0f, 144.4f)
                lineTo(199.9f, 133.0f)
                lineTo(220.0f, 121.6f)
                close()
                moveTo(175.6f, 119.2f)
                lineTo(140.0f, 99.0f)
                lineTo(140.0f, 62.6f)
                lineTo(207.7f, 101.0f)
                close()
                moveTo(128.0f, 146.2f)
                lineTo(104.7f, 133.0f)
                lineTo(128.0f, 119.8f)
                lineTo(151.3f, 133.0f)
                close()
                moveTo(116.0f, 62.6f)
                lineTo(116.0f, 99.0f)
                lineTo(80.4f, 119.2f)
                lineTo(48.3f, 101.0f)
                close()
                moveTo(36.0f, 121.6f)
                lineTo(56.1f, 133.0f)
                lineTo(36.0f, 144.4f)
                close()
                moveTo(80.4f, 146.8f)
                lineTo(116.0f, 167.0f)
                verticalLineToRelative(36.4f)
                lineTo(48.3f, 165.0f)
                close()
                moveTo(140.0f, 203.4f)
                lineTo(140.0f, 167.0f)
                lineToRelative(35.6f, -20.2f)
                lineTo(207.7f, 165.0f)
                close()
            }
        }
        .build()
        return _codepenLogo!!
    }

private var _codepenLogo: ImageVector? = null
