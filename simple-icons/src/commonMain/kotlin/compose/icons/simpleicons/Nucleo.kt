package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Nucleo: ImageVector
    get() {
        if (_nucleo != null) {
            return _nucleo!!
        }
        _nucleo = Builder(name = "Nucleo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.025f, 0.0f)
                arcToRelative(3.868f, 3.868f, 0.0f, false, false, -1.964f, 0.525f)
                lineTo(1.354f, 5.55f)
                lineTo(1.354f, 6.5f)
                horizontalLineToRelative(15.853f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 3.463f, -2.115f)
                lineTo(13.922f, 0.508f)
                arcTo(3.868f, 3.868f, 0.0f, false, false, 12.025f, 0.0f)
                close()
                moveTo(21.835f, 5.072f)
                lineTo(13.91f, 18.801f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.1f, 4.056f)
                lineToRelative(6.734f, -3.908f)
                arcToRelative(3.865f, 3.865f, 0.0f, false, false, 1.914f, -3.35f)
                lineTo(22.658f, 5.55f)
                lineToRelative(-0.822f, -0.477f)
                close()
                moveTo(1.46f, 7.848f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -0.117f, 0.004f)
                lineToRelative(0.017f, 7.787f)
                arcToRelative(3.868f, 3.868f, 0.0f, false, false, 1.946f, 3.334f)
                lineTo(12.008f, 24.0f)
                lineToRelative(0.824f, -0.475f)
                lineToRelative(-7.926f, -13.73f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 1.46f, 7.848f)
                close()
                moveTo(11.992f, 9.1f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -2.584f, 2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 2.6f, 2.599f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, 2.6f, -2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -2.6f, -2.6f)
                arcToRelative(2.6f, 2.6f, 0.0f, false, false, -0.016f, 0.0f)
                close()
            }
        }
        .build()
        return _nucleo!!
    }

private var _nucleo: ImageVector? = null
