package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BaseballBatBall: ImageVector
    get() {
        if (_baseballBatBall != null) {
            return _baseballBatBall!!
        }
        _baseballBatBall = Builder(name = "BaseballBatBall", defaultWidth = 640.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(550.3f, 0.0f)
                curveToRelative(-10.9f, 0.0f, -21.4f, 3.4f, -30.2f, 9.8f)
                lineTo(279.7f, 184.6f)
                curveToRelative(-13.9f, 10.1f, -26.8f, 21.4f, -38.7f, 33.8f)
                lineTo(138.7f, 325.3f)
                curveToRelative(-9.2f, 9.6f, -19.3f, 18.4f, -30.1f, 26.3f)
                lineTo(79.3f, 372.9f)
                curveToRelative(1.3f, 1.5f, 2.6f, 3.0f, 3.9f, 4.7f)
                lineToRelative(48.0f, 64.0f)
                curveToRelative(1.6f, 2.2f, 3.1f, 4.4f, 4.4f, 6.6f)
                lineToRelative(27.3f, -19.9f)
                curveToRelative(11.6f, -8.4f, 24.0f, -15.8f, 37.0f, -21.8f)
                lineToRelative(135.3f, -63.1f)
                curveToRelative(16.7f, -7.8f, 32.7f, -17.2f, 47.6f, -28.1f)
                lineTo(619.0f, 143.6f)
                curveToRelative(13.2f, -9.6f, 21.0f, -24.9f, 21.0f, -41.2f)
                curveToRelative(0.0f, -11.0f, -3.6f, -21.8f, -10.2f, -30.6f)
                lineTo(609.6f, 44.8f)
                lineTo(591.4f, 20.6f)
                curveTo(581.7f, 7.6f, 566.5f, 0.0f, 550.3f, 0.0f)
                close()
                moveTo(496.0f, 512.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, -35.8f, 80.0f, -80.0f)
                reflectiveCurveToRelative(-35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                reflectiveCurveToRelative(35.8f, 80.0f, 80.0f, 80.0f)
                close()
                moveTo(57.6f, 396.8f)
                curveToRelative(-10.6f, -14.1f, -30.7f, -17.0f, -44.8f, -6.4f)
                reflectiveCurveToRelative(-17.0f, 30.7f, -6.4f, 44.8f)
                lineToRelative(48.0f, 64.0f)
                curveToRelative(10.6f, 14.1f, 30.7f, 17.0f, 44.8f, 6.4f)
                reflectiveCurveToRelative(17.0f, -30.7f, 6.4f, -44.8f)
                lineToRelative(-48.0f, -64.0f)
                close()
            }
        }
        .build()
        return _baseballBatBall!!
    }

private var _baseballBatBall: ImageVector? = null
