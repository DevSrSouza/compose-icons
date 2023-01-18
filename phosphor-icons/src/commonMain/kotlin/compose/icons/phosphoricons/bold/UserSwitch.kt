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

public val BoldGroup.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) {
            return _userSwitch!!
        }
        _userSwitch = Builder(name = "UserSwitch", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.5f, 140.5f)
                lineToRelative(-20.0f, 20.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.3f, -17.6f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 61.5f, 76.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 42.5f, 62.0f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, 193.4f, 61.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 16.6f, 17.3f)
                close()
                moveTo(213.5f, 194.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, true, 20.1f, 132.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 3.5f, 115.5f)
                lineToRelative(20.0f, -20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 0.0f)
                lineToRelative(20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcTo(12.2f, 12.2f, 0.0f, false, true, 52.0f, 136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -7.8f, -2.9f)
                arcToRelative(82.2f, 82.2f, 0.0f, false, false, 17.9f, 46.8f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 91.0f, 156.5f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 74.0f, 0.0f)
                arcTo(84.4f, 84.4f, 0.0f, false, true, 194.0f, 180.0f)
                lineToRelative(0.5f, -0.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 19.0f, 14.7f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 128.0f, 148.0f)
                close()
                moveTo(128.0f, 212.0f)
                arcToRelative(83.0f, 83.0f, 0.0f, false, false, 48.5f, -15.4f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -96.9f, 0.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, false, 128.0f, 212.0f)
                close()
            }
        }
        .build()
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
