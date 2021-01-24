package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BaseballBall: ImageVector
    get() {
        if (_baseballBall != null) {
            return _baseballBall!!
        }
        _baseballBall = Builder(name = "BaseballBall", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.5f, 363.9f)
                lineToRelative(28.8f, -13.9f)
                curveToRelative(11.1f, 22.9f, 26.0f, 43.2f, 44.1f, 60.9f)
                curveToRelative(34.0f, -42.5f, 54.5f, -96.3f, 54.5f, -154.9f)
                curveToRelative(0.0f, -58.5f, -20.4f, -112.2f, -54.2f, -154.6f)
                curveToRelative(-17.8f, 17.3f, -32.6f, 37.1f, -43.6f, 59.5f)
                lineToRelative(-28.7f, -14.1f)
                curveToRelative(12.8f, -26.0f, 30.0f, -49.0f, 50.8f, -69.0f)
                curveTo(375.6f, 34.7f, 315.0f, 8.0f, 248.0f, 8.0f)
                curveTo(181.1f, 8.0f, 120.5f, 34.6f, 75.9f, 77.7f)
                curveToRelative(20.7f, 19.9f, 37.9f, 42.9f, 50.7f, 68.8f)
                lineToRelative(-28.7f, 14.1f)
                curveToRelative(-11.0f, -22.3f, -25.7f, -42.1f, -43.5f, -59.4f)
                curveTo(20.4f, 143.7f, 0.0f, 197.4f, 0.0f, 256.0f)
                curveToRelative(0.0f, 58.6f, 20.4f, 112.3f, 54.4f, 154.7f)
                curveToRelative(18.2f, -17.7f, 33.2f, -38.0f, 44.3f, -61.0f)
                lineToRelative(28.8f, 13.9f)
                curveToRelative(-12.9f, 26.7f, -30.3f, 50.3f, -51.5f, 70.7f)
                curveToRelative(44.5f, 43.1f, 105.1f, 69.7f, 172.0f, 69.7f)
                curveToRelative(66.8f, 0.0f, 127.3f, -26.5f, 171.9f, -69.5f)
                curveToRelative(-21.1f, -20.4f, -38.5f, -43.9f, -51.4f, -70.6f)
                close()
                moveTo(140.2f, 331.9f)
                lineToRelative(-30.5f, -9.8f)
                curveToRelative(14.9f, -46.4f, 12.7f, -93.8f, -0.6f, -134.0f)
                lineToRelative(30.4f, -10.0f)
                curveToRelative(15.0f, 45.6f, 18.0f, 99.9f, 0.7f, 153.8f)
                close()
                moveTo(356.5f, 178.5f)
                lineToRelative(30.4f, 10.0f)
                curveToRelative(-13.2f, 40.1f, -15.5f, 87.5f, -0.6f, 134.0f)
                lineToRelative(-30.5f, 9.8f)
                curveToRelative(-17.3f, -54.0f, -14.3f, -108.3f, 0.7f, -153.8f)
                close()
            }
        }
        .build()
        return _baseballBall!!
    }

private var _baseballBall: ImageVector? = null
