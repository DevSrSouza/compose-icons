package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) {
            return _appStoreLogo!!
        }
        _appStoreLogo = Builder(name = "AppStoreLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.9f, 202.0f)
                lineToRelative(-9.5f, 16.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -3.4f, 2.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, true, -2.0f, -0.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -1.4f, -5.4f)
                lineTo(54.0f, 198.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.9f, 4.0f)
                close()
                moveTo(232.0f, 164.0f)
                lineTo(181.9f, 164.0f)
                lineTo(150.0f, 110.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -6.9f, 4.1f)
                lineTo(204.6f, 218.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 3.4f, 2.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.0f, -0.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 1.4f, -5.4f)
                lineToRelative(-24.8f, -42.0f)
                lineTo(232.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(142.5f, 164.0f)
                lineTo(83.4f, 164.0f)
                lineToRelative(72.0f, -122.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, true, false, -6.8f, -4.0f)
                lineTo(128.0f, 72.8f)
                lineTo(107.4f, 38.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, true, false, -6.8f, 4.0f)
                lineToRelative(22.8f, 38.6f)
                lineTo(74.1f, 164.0f)
                lineTo(24.0f, 164.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(142.5f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
            }
        }
        .build()
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
