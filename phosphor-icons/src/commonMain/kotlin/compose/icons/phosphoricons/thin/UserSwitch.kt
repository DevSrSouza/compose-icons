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

public val ThinGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(250.8f, 130.8f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, -5.6f)
                lineTo(220.0f, 142.3f)
                lineTo(220.0f, 128.0f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 50.7f, 78.1f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 44.0f, 73.7f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 228.0f, 128.0f)
                verticalLineToRelative(14.3f)
                lineToRelative(17.2f, -17.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                close()
                moveTo(212.0f, 182.3f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 28.0f, 128.0f)
                lineTo(28.0f, 113.7f)
                lineTo(10.8f, 130.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineTo(36.0f, 113.7f)
                lineTo(36.0f, 128.0f)
                arcToRelative(92.1f, 92.1f, 0.0f, false, false, 26.8f, 64.9f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, 44.5f, -34.1f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 41.4f, 0.0f)
                arcToRelative(76.2f, 76.2f, 0.0f, false, true, 44.5f, 34.1f)
                arcToRelative(93.4f, 93.4f, 0.0f, false, false, 12.1f, -15.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.7f, 4.4f)
                close()
                moveTo(128.0f, 156.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.0f, 156.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(92.2f, 92.2f, 0.0f, false, false, 59.2f, -21.5f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, false, -118.3f, -0.1f)
                arcTo(91.3f, 91.3f, 0.0f, false, false, 128.0f, 220.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
