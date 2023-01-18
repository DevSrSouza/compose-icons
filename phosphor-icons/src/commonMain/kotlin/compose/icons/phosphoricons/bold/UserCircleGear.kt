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

public val BoldGroup.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) {
            return _userCircleGear!!
        }
        _userCircleGear = Builder(name = "UserCircleGear", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(169.6f, 46.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 15.1f, -7.7f)
                lineToRelative(3.3f, 1.1f)
                lineTo(188.0f, 36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(3.5f)
                lineToRelative(3.3f, -1.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.4f, 22.8f)
                lineToRelative(-3.3f, 1.1f)
                lineToRelative(2.1f, 2.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -2.7f, 16.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 202.0f, 79.2f)
                lineToRelative(-2.0f, -2.8f)
                lineToRelative(-2.0f, 2.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.5f, -14.1f)
                lineToRelative(2.1f, -2.8f)
                lineToRelative(-3.3f, -1.1f)
                arcTo(11.9f, 11.9f, 0.0f, false, true, 169.6f, 46.1f)
                close()
                moveTo(201.0f, 207.5f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -1.6f, 1.5f)
                arcToRelative(107.9f, 107.9f, 0.0f, false, true, -142.8f, 0.0f)
                arcToRelative(11.4f, 11.4f, 0.0f, false, true, -1.6f, -1.5f)
                arcTo(107.9f, 107.9f, 0.0f, false, true, 128.0f, 20.0f)
                curveToRelative(3.3f, 0.0f, 6.7f, 0.2f, 10.0f, 0.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.9f, 13.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -13.1f, 10.9f)
                arcTo(67.9f, 67.9f, 0.0f, false, false, 128.0f, 44.0f)
                arcTo(83.9f, 83.9f, 0.0f, false, false, 62.1f, 179.9f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 91.0f, 156.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 28.9f, 23.4f)
                arcTo(83.4f, 83.4f, 0.0f, false, false, 212.0f, 128.0f)
                arcToRelative(84.3f, 84.3f, 0.0f, false, false, -0.6f, -10.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.8f, -2.8f)
                arcTo(110.3f, 110.3f, 0.0f, false, true, 236.0f, 128.0f)
                arcTo(107.7f, 107.7f, 0.0f, false, true, 201.0f, 207.5f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, false, 48.4f, -15.4f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, -96.8f, 0.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
