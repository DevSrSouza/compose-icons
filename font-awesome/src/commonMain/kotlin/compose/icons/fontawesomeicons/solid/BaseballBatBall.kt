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
        _baseballBatBall = Builder(name = "BaseballBatBall", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(424.0f, 0.0f)
                curveToRelative(-12.4f, 0.0f, -24.2f, 4.9f, -33.0f, 13.7f)
                lineTo(233.5f, 171.2f)
                curveToRelative(-10.5f, 10.5f, -19.8f, 22.1f, -27.7f, 34.6f)
                lineTo(132.7f, 321.6f)
                curveToRelative(-7.3f, 11.5f, -15.8f, 22.2f, -25.5f, 31.9f)
                lineTo(69.9f, 390.7f)
                lineToRelative(51.3f, 51.3f)
                lineToRelative(37.3f, -37.3f)
                curveToRelative(9.6f, -9.6f, 20.3f, -18.2f, 31.9f, -25.5f)
                lineToRelative(115.8f, -73.1f)
                curveToRelative(12.5f, -7.9f, 24.1f, -17.2f, 34.6f, -27.7f)
                lineTo(498.3f, 121.0f)
                curveToRelative(8.7f, -8.7f, 13.7f, -20.6f, 13.7f, -33.0f)
                reflectiveCurveToRelative(-4.9f, -24.2f, -13.7f, -33.0f)
                lineTo(457.0f, 13.7f)
                curveTo(448.2f, 4.9f, 436.4f, 0.0f, 424.0f, 0.0f)
                close()
                moveTo(512.0f, 432.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 160.0f, 0.0f)
                close()
                moveTo(15.0f, 399.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(64.0f, 64.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                reflectiveCurveToRelative(9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(49.0f, 399.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                close()
            }
        }
        .build()
        return _baseballBatBall!!
    }

private var _baseballBatBall: ImageVector? = null
