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

public val RegularGroup.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) {
            return _appStoreLogo!!
        }
        _appStoreLogo = Builder(name = "AppStoreLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.3f, 204.1f)
                lineToRelative(-9.4f, 16.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 48.0f, 224.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, true, -4.1f, -1.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -2.8f, -11.0f)
                lineToRelative(9.5f, -16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 13.7f, 8.2f)
                close()
                moveTo(232.0f, 160.0f)
                lineTo(184.2f, 160.0f)
                lineToRelative(-30.7f, -52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, -2.8f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -2.8f, 10.9f)
                lineToRelative(61.4f, 104.0f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.7f, 8.7f, 0.0f, false, false, 4.1f, -1.1f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.8f, -11.0f)
                lineTo(193.7f, 176.0f)
                lineTo(232.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(142.5f, 160.0f)
                lineTo(90.4f, 160.0f)
                lineToRelative(44.4f, -75.2f)
                horizontalLineToRelative(0.1f)
                lineToRelative(24.0f, -40.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -13.8f, -8.2f)
                lineTo(128.0f, 64.9f)
                lineToRelative(-17.1f, -29.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -13.8f, 8.2f)
                lineToRelative(21.6f, 36.5f)
                lineTo(71.8f, 160.0f)
                lineTo(24.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(142.5f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
