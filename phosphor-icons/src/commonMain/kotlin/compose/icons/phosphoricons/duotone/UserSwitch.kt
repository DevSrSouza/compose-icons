package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -31.8f, 71.4f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 128.0f, 160.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, -40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 40.0f, 40.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -64.2f, 39.4f)
                horizontalLineToRelative(0.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.7f, 133.7f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, -11.4f)
                lineTo(216.0f, 132.7f)
                lineTo(216.0f, 128.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, false, 54.1f, 80.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 43.0f, 82.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -2.4f, -11.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 232.0f, 128.0f)
                verticalLineToRelative(4.7f)
                lineToRelative(10.3f, -10.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 11.4f)
                close()
                moveTo(215.4f, 184.4f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 24.0f, 128.0f)
                verticalLineToRelative(-4.7f)
                lineTo(13.7f, 133.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -11.4f, 0.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, -11.4f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 11.4f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, 0.0f, 11.4f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -11.4f, 0.0f)
                lineTo(40.0f, 123.3f)
                lineTo(40.0f, 128.0f)
                arcToRelative(87.6f, 87.6f, 0.0f, false, false, 22.2f, 58.4f)
                arcToRelative(79.2f, 79.2f, 0.0f, false, true, 36.1f, -28.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 59.4f, 0.0f)
                arcToRelative(79.4f, 79.4f, 0.0f, false, true, 36.1f, 28.8f)
                arcToRelative(86.9f, 86.9f, 0.0f, false, false, 8.1f, -10.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.1f, -2.3f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 215.4f, 184.4f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, false, 54.0f, -18.4f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -107.9f, -0.1f)
                arcTo(87.4f, 87.4f, 0.0f, false, false, 128.0f, 216.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
