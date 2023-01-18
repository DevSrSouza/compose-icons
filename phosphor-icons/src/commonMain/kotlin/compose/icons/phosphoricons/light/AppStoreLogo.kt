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

public val LightGroup.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) {
            return _appStoreLogo!!
        }
        _appStoreLogo = Builder(name = "AppStoreLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(62.6f, 203.1f)
                lineToRelative(-9.4f, 16.0f)
                arcTo(6.4f, 6.4f, 0.0f, false, true, 48.0f, 222.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, true, -3.1f, -0.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.1f, -8.3f)
                lineToRelative(9.5f, -16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 10.3f, 6.2f)
                close()
                moveTo(232.0f, 162.0f)
                lineTo(183.1f, 162.0f)
                lineToRelative(-31.3f, -53.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -8.3f, -2.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -2.1f, 8.2f)
                lineToRelative(61.4f, 104.0f)
                arcTo(6.4f, 6.4f, 0.0f, false, false, 208.0f, 222.0f)
                arcToRelative(7.1f, 7.1f, 0.0f, false, false, 3.1f, -0.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 2.1f, -8.3f)
                lineToRelative(-23.0f, -38.9f)
                lineTo(232.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(142.5f, 162.0f)
                lineTo(86.9f, 162.0f)
                lineTo(157.2f, 43.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -10.4f, -6.2f)
                lineTo(128.0f, 68.8f)
                lineTo(109.2f, 36.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, true, false, -10.4f, 6.2f)
                lineTo(121.0f, 80.6f)
                lineTo(72.9f, 162.0f)
                lineTo(24.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(142.5f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
