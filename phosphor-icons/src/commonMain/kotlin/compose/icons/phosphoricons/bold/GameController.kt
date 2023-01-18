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

public val BoldGroup.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 120.0f)
                lineTo(152.0f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(104.0f, 96.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(100.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                lineTo(72.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(219.0f, 227.4f)
                arcToRelative(42.3f, 42.3f, 0.0f, false, true, -7.0f, 0.6f)
                arcToRelative(40.4f, 40.4f, 0.0f, false, true, -28.3f, -11.7f)
                lineToRelative(-0.6f, -0.7f)
                lineToRelative(-39.4f, -43.7f)
                lineTo(112.4f, 171.9f)
                lineTo(72.9f, 215.7f)
                lineToRelative(-0.6f, 0.6f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 4.6f, 181.0f)
                verticalLineToRelative(-0.2f)
                lineTo(20.9f, 97.1f)
                verticalLineToRelative(-0.2f)
                arcTo(63.7f, 63.7f, 0.0f, false, true, 84.0f, 44.0f)
                lineToRelative(88.0f, -0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, 63.0f, 52.5f)
                verticalLineToRelative(0.2f)
                lineToRelative(16.4f, 84.5f)
                horizontalLineToRelative(0.0f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 219.0f, 227.4f)
                close()
                moveTo(172.0f, 147.7f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                lineTo(84.0f, 68.0f)
                arcToRelative(39.9f, 39.9f, 0.0f, false, false, -39.3f, 32.6f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.1f, 0.7f)
                lineToRelative(-16.4f, 84.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.9f, 14.2f)
                lineToRelative(43.0f, -47.5f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 8.9f, -4.0f)
                close()
                moveTo(227.8f, 185.3f)
                lineTo(220.8f, 149.1f)
                arcToRelative(63.5f, 63.5f, 0.0f, false, true, -45.0f, 22.5f)
                lineToRelative(25.1f, 27.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 26.9f, -14.2f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
