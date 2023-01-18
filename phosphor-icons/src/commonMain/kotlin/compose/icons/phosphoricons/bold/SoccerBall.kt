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

public val BoldGroup.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) {
            return _soccerBall!!
        }
        _soccerBall = Builder(name = "SoccerBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 63.8f, 214.8f)
                lineToRelative(0.7f, 0.6f)
                lineToRelative(0.9f, 0.5f)
                arcToRelative(107.5f, 107.5f, 0.0f, false, false, 125.2f, 0.0f)
                lineToRelative(0.9f, -0.5f)
                lineToRelative(0.7f, -0.6f)
                arcTo(107.8f, 107.8f, 0.0f, false, false, 236.0f, 128.0f)
                close()
                moveTo(186.5f, 188.2f)
                lineTo(173.0f, 169.5f)
                lineToRelative(15.8f, -48.7f)
                lineToRelative(22.0f, -7.1f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, -24.3f, 74.5f)
                close()
                moveTo(105.0f, 159.7f)
                lineTo(90.8f, 115.9f)
                lineToRelative(37.2f, -27.0f)
                lineToRelative(37.2f, 27.0f)
                lineTo(151.0f, 159.7f)
                close()
                moveTo(203.3f, 90.9f)
                lineTo(181.4f, 98.0f)
                lineTo(140.0f, 67.9f)
                verticalLineToRelative(-23.0f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 203.3f, 90.9f)
                close()
                moveTo(116.0f, 44.9f)
                verticalLineToRelative(23.0f)
                lineTo(74.6f, 98.0f)
                lineTo(52.7f, 90.9f)
                arcTo(84.2f, 84.2f, 0.0f, false, true, 116.0f, 44.9f)
                close()
                moveTo(44.0f, 128.0f)
                arcToRelative(84.5f, 84.5f, 0.0f, false, true, 1.2f, -14.3f)
                lineToRelative(22.0f, 7.1f)
                lineTo(83.0f, 169.5f)
                lineTo(69.5f, 188.2f)
                arcTo(83.8f, 83.8f, 0.0f, false, true, 44.0f, 128.0f)
                close()
                moveTo(88.9f, 202.3f)
                lineTo(102.4f, 183.7f)
                horizontalLineToRelative(51.2f)
                lineToRelative(13.5f, 18.6f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, -78.2f, 0.0f)
                close()
            }
        }
        .build()
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
