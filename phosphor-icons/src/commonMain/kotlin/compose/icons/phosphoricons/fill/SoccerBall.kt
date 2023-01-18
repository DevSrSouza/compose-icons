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

public val FillGroup.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) {
            return _soccerBall!!
        }
        _soccerBall = Builder(name = "SoccerBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.8f, 134.8f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 0.0f, -1.2f)
                curveToRelative(0.1f, -1.9f, 0.2f, -3.7f, 0.2f, -5.6f)
                arcToRelative(103.2f, 103.2f, 0.0f, false, false, -23.0f, -65.1f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, -1.4f, -1.7f)
                arcToRelative(103.9f, 103.9f, 0.0f, false, false, -41.1f, -29.8f)
                lineToRelative(-1.1f, -0.4f)
                arcToRelative(103.4f, 103.4f, 0.0f, false, false, -74.8f, 0.0f)
                lineToRelative(-1.1f, 0.4f)
                arcTo(103.9f, 103.9f, 0.0f, false, false, 48.4f, 61.2f)
                arcTo(5.5f, 5.5f, 0.0f, false, false, 47.0f, 62.9f)
                arcTo(103.2f, 103.2f, 0.0f, false, false, 24.0f, 128.0f)
                curveToRelative(0.0f, 1.9f, 0.1f, 3.7f, 0.2f, 5.6f)
                arcToRelative(4.8f, 4.8f, 0.0f, false, false, 0.0f, 1.2f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, false, 15.7f, 48.4f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, 1.1f, 1.7f)
                arcToRelative(104.3f, 104.3f, 0.0f, false, false, 60.3f, 43.6f)
                horizontalLineToRelative(0.3f)
                arcToRelative(104.2f, 104.2f, 0.0f, false, false, 52.8f, 0.0f)
                horizontalLineToRelative(0.3f)
                arcTo(104.3f, 104.3f, 0.0f, false, false, 215.0f, 184.9f)
                arcToRelative(9.9f, 9.9f, 0.0f, false, false, 1.1f, -1.7f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 231.8f, 134.8f)
                close()
                moveTo(68.5f, 117.1f)
                lineToRelative(13.2f, 4.3f)
                lineToRelative(12.7f, 39.2f)
                lineToRelative(-8.1f, 11.2f)
                lineTo(51.7f, 171.8f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -11.2f, -34.3f)
                close()
                moveTo(187.5f, 117.1f)
                lineTo(215.5f, 137.5f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -11.2f, 34.3f)
                lineTo(169.7f, 171.8f)
                lineToRelative(-8.1f, -11.2f)
                lineToRelative(12.7f, -39.2f)
                close()
                moveTo(193.2f, 69.0f)
                lineToRelative(-10.7f, 32.9f)
                lineToRelative(-13.2f, 4.3f)
                lineTo(136.0f, 81.9f)
                lineTo(136.0f, 68.1f)
                lineToRelative(28.0f, -20.4f)
                arcTo(87.0f, 87.0f, 0.0f, false, true, 193.2f, 69.0f)
                close()
                moveTo(92.0f, 47.7f)
                lineToRelative(28.0f, 20.4f)
                lineTo(120.0f, 81.9f)
                lineTo(86.7f, 106.2f)
                lineToRelative(-13.2f, -4.3f)
                lineTo(62.8f, 69.0f)
                arcTo(87.0f, 87.0f, 0.0f, false, true, 92.0f, 47.7f)
                close()
                moveTo(110.0f, 214.1f)
                lineTo(99.3f, 181.2f)
                lineToRelative(8.1f, -11.2f)
                horizontalLineToRelative(41.2f)
                lineToRelative(8.1f, 11.2f)
                lineTo(146.0f, 214.1f)
                arcToRelative(86.2f, 86.2f, 0.0f, false, true, -36.0f, 0.0f)
                close()
            }
        }
        .build()
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
