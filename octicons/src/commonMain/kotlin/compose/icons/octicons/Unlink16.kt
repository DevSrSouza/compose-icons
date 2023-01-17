package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Unlink16: ImageVector
    get() {
        if (_unlink16 != null) {
            return _unlink16!!
        }
        _unlink16 = Builder(name = "Unlink16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.914f, 5.914f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.828f, -2.828f)
                lineToRelative(-0.837f, 0.837f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -1.06f, -1.061f)
                lineToRelative(0.836f, -0.837f)
                arcToRelative(3.5f, 3.5f, 0.0f, true, true, 4.95f, 4.95f)
                lineToRelative(-0.195f, 0.194f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.06f, -1.06f)
                lineToRelative(0.194f, -0.195f)
                close()
                moveTo(11.044f, 9.396f)
                arcToRelative(0.759f, 0.759f, 0.0f, false, true, -0.07f, 0.079f)
                curveToRelative(-0.63f, 0.63f, -1.468f, 1.108f, -2.343f, 1.263f)
                curveToRelative(-0.89f, 0.159f, -1.86f, -0.017f, -2.606f, -0.763f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 1.06f, -1.06f)
                curveToRelative(0.329f, 0.327f, 0.767f, 0.438f, 1.284f, 0.347f)
                curveToRelative(0.493f, -0.088f, 1.018f, -0.36f, 1.445f, -0.752f)
                lineToRelative(-1.247f, -0.897f)
                arcToRelative(0.709f, 0.709f, 0.0f, false, true, -0.01f, -0.008f)
                lineToRelative(-0.295f, -0.212f)
                curveToRelative(-0.94f, -0.597f, -1.984f, -0.499f, -2.676f, 0.193f)
                lineToRelative(-2.5f, 2.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 2.828f, 2.828f)
                lineToRelative(0.837f, -0.836f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 1.06f, 1.06f)
                lineToRelative(-0.836f, 0.837f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -4.95f, -4.95f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(3.472f, 3.472f, 0.0f, false, true, 1.354f, -0.848f)
                lineTo(2.312f, 3.109f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.876f, -1.218f)
                lineToRelative(5.93f, 4.27f)
                curveToRelative(0.115f, 0.074f, 0.226f, 0.155f, 0.335f, 0.24f)
                lineToRelative(6.235f, 4.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -0.876f, 1.218f)
                lineToRelative(-3.768f, -2.713f)
                close()
            }
        }
        .build()
        return _unlink16!!
    }

private var _unlink16: ImageVector? = null
