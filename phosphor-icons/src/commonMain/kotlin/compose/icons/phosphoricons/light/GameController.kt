package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.GameController: ImageVector
    get() {
        if (_gameController != null) {
            return _gameController!!
        }
        _gameController = Builder(name = "GameController", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 114.0f)
                lineTo(152.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                close()
                moveTo(104.0f, 102.0f)
                lineTo(94.0f, 102.0f)
                lineTo(94.0f, 92.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(10.0f)
                lineTo(72.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(82.0f, 114.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 114.0f)
                horizontalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(217.9f, 221.5f)
                arcToRelative(39.2f, 39.2f, 0.0f, false, true, -5.9f, 0.5f)
                arcToRelative(33.7f, 33.7f, 0.0f, false, true, -24.0f, -10.0f)
                lineToRelative(-0.4f, -0.3f)
                lineToRelative(-41.3f, -45.9f)
                lineToRelative(-36.6f, 0.2f)
                lineTo(68.4f, 211.7f)
                lineToRelative(-0.4f, 0.3f)
                arcToRelative(33.7f, 33.7f, 0.0f, false, true, -24.0f, 10.0f)
                arcToRelative(39.2f, 39.2f, 0.0f, false, true, -5.9f, -0.5f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, -27.6f, -39.4f)
                horizontalLineToRelative(0.0f)
                lineTo(26.8f, 98.1f)
                curveToRelative(0.1f, 0.0f, 0.1f, -0.1f, 0.1f, -0.2f)
                arcTo(57.9f, 57.9f, 0.0f, false, true, 84.0f, 50.0f)
                lineToRelative(88.0f, -0.3f)
                horizontalLineToRelative(0.0f)
                arcToRelative(58.1f, 58.1f, 0.0f, false, true, 57.1f, 47.7f)
                verticalLineToRelative(0.2f)
                lineTo(245.5f, 182.0f)
                horizontalLineToRelative(0.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, true, 217.9f, 221.5f)
                close()
                moveTo(172.0f, 153.7f)
                arcToRelative(46.0f, 46.0f, 0.0f, true, false, 0.0f, -92.0f)
                lineTo(84.0f, 62.0f)
                arcTo(45.9f, 45.9f, 0.0f, false, false, 38.7f, 99.7f)
                verticalLineToRelative(0.4f)
                lineTo(22.3f, 184.2f)
                arcToRelative(22.2f, 22.2f, 0.0f, false, false, 17.9f, 25.5f)
                arcToRelative(21.9f, 21.9f, 0.0f, false, false, 19.2f, -6.0f)
                lineTo(102.6f, 156.0f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 4.4f, -2.0f)
                close()
                moveTo(233.7f, 184.2f)
                lineTo(223.9f, 133.7f)
                arcToRelative(58.0f, 58.0f, 0.0f, false, true, -51.9f, 32.0f)
                horizontalLineToRelative(-9.6f)
                lineToRelative(34.2f, 37.9f)
                arcToRelative(22.0f, 22.0f, 0.0f, false, false, 37.1f, -19.5f)
                close()
            }
        }
        .build()
        return _gameController!!
    }

private var _gameController: ImageVector? = null
