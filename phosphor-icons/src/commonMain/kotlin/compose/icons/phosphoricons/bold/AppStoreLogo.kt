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

public val BoldGroup.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) {
            return _appStoreLogo!!
        }
        _appStoreLogo = Builder(name = "AppStoreLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(200.7f)
                lineToRelative(17.6f, 29.9f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -4.2f, 16.4f)
                arcTo(11.3f, 11.3f, 0.0f, false, true, 208.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -10.3f, -5.9f)
                lineTo(140.9f, 126.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 20.7f, -12.2f)
                lineTo(186.5f, 156.0f)
                horizontalLineTo(232.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 244.0f, 168.0f)
                close()
                moveTo(133.2f, 156.0f)
                horizontalLineTo(97.4f)
                lineTo(162.3f, 46.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.6f, -12.2f)
                lineTo(128.0f, 57.0f)
                lineTo(114.3f, 33.9f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 93.7f, 46.1f)
                lineToRelative(20.4f, 34.5f)
                lineTo(69.5f, 156.0f)
                horizontalLineTo(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(133.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(58.8f, 197.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.4f, 4.2f)
                lineToRelative(-4.7f, 8.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 4.2f, 16.4f)
                arcTo(11.3f, 11.3f, 0.0f, false, false, 48.0f, 228.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.3f, -5.9f)
                lineToRelative(4.8f, -8.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 58.8f, 197.7f)
                close()
            }
        }
        .build()
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
