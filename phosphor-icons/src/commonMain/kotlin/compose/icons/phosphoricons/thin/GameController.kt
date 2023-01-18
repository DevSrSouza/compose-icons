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

public val ThinGroup.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 112.0f)
                lineTo(152.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(104.0f, 104.0f)
                lineTo(92.0f, 104.0f)
                lineTo(92.0f, 92.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineToRelative(12.0f)
                lineTo(72.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(84.0f, 112.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(92.0f, 112.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(217.6f, 219.5f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, -5.6f, 0.5f)
                arcToRelative(31.7f, 31.7f, 0.0f, false, true, -22.6f, -9.4f)
                lineToRelative(-0.3f, -0.2f)
                lineToRelative(-41.9f, -46.6f)
                lineToRelative(-38.4f, 0.2f)
                lineTo(66.9f, 210.4f)
                lineToRelative(-0.3f, 0.2f)
                arcTo(31.7f, 31.7f, 0.0f, false, true, 44.0f, 220.0f)
                arcToRelative(35.3f, 35.3f, 0.0f, false, true, -5.6f, -0.5f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -25.9f, -37.1f)
                lineTo(28.8f, 98.5f)
                verticalLineToRelative(-0.2f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 84.0f, 52.0f)
                lineToRelative(88.0f, -0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(56.1f, 56.1f, 0.0f, false, true, 55.1f, 46.1f)
                curveToRelative(0.0f, 0.1f, 0.0f, 0.1f, 0.1f, 0.1f)
                lineToRelative(16.3f, 84.5f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 217.6f, 219.5f)
                close()
                moveTo(172.0f, 155.7f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 0.0f, -96.0f)
                lineTo(84.0f, 60.0f)
                arcTo(47.9f, 47.9f, 0.0f, false, false, 36.8f, 99.4f)
                curveToRelative(0.0f, 0.1f, -0.1f, 0.2f, -0.1f, 0.3f)
                lineTo(20.4f, 183.9f)
                arcToRelative(23.9f, 23.9f, 0.0f, false, false, 19.4f, 27.7f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, false, 21.1f, -6.5f)
                lineToRelative(43.2f, -47.8f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 107.0f, 156.0f)
                close()
                moveTo(235.6f, 183.8f)
                lineTo(224.6f, 126.9f)
                arcTo(55.9f, 55.9f, 0.0f, false, true, 172.0f, 163.7f)
                lineTo(158.0f, 163.7f)
                lineToRelative(37.1f, 41.3f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 40.5f, -21.3f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
