package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.5f, 181.7f)
                horizontalLineToRelative(-0.1f)
                lineTo(231.1f, 97.2f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.1f, -0.1f, -0.2f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -59.0f, -49.3f)
                horizontalLineToRelative(0.0f)
                lineTo(84.0f, 48.0f)
                arcTo(59.9f, 59.9f, 0.0f, false, false, 24.9f, 97.6f)
                verticalLineToRelative(0.2f)
                lineTo(8.6f, 181.6f)
                horizontalLineToRelative(0.0f)
                arcToRelative(35.9f, 35.9f, 0.0f, false, false, 29.2f, 41.7f)
                arcToRelative(31.8f, 31.8f, 0.0f, false, false, 6.2f, 0.6f)
                arcToRelative(36.4f, 36.4f, 0.0f, false, false, 25.5f, -10.5f)
                lineToRelative(0.4f, -0.5f)
                lineToRelative(40.7f, -45.0f)
                lineToRelative(34.9f, -0.2f)
                lineTo(186.1f, 213.0f)
                lineToRelative(0.5f, 0.5f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 212.0f, 224.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, false, 6.3f, -0.6f)
                arcTo(36.1f, 36.1f, 0.0f, false, false, 247.5f, 181.7f)
                close()
                moveTo(104.0f, 116.0f)
                lineTo(96.0f, 116.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                lineTo(72.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(8.0f)
                lineTo(80.0f, 92.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(144.0f, 108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(152.0f, 116.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 108.0f)
                close()
                moveTo(215.5f, 207.7f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -17.5f, -5.4f)
                lineToRelative(-31.1f, -34.5f)
                lineTo(172.0f, 167.8f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, 51.0f, -28.3f)
                lineToRelative(8.7f, 45.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 215.5f, 207.7f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
