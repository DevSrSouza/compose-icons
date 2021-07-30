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

public val SolidGroup.Coins: ImageVector
    get() {
        if (_coins != null) {
            return _coins!!
        }
        _coins = Builder(name = "Coins", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 405.3f)
                lineTo(0.0f, 448.0f)
                curveToRelative(0.0f, 35.3f, 86.0f, 64.0f, 192.0f, 64.0f)
                reflectiveCurveToRelative(192.0f, -28.7f, 192.0f, -64.0f)
                verticalLineToRelative(-42.7f)
                curveTo(342.7f, 434.4f, 267.2f, 448.0f, 192.0f, 448.0f)
                reflectiveCurveTo(41.3f, 434.4f, 0.0f, 405.3f)
                close()
                moveTo(320.0f, 128.0f)
                curveToRelative(106.0f, 0.0f, 192.0f, -28.7f, 192.0f, -64.0f)
                reflectiveCurveTo(426.0f, 0.0f, 320.0f, 0.0f)
                reflectiveCurveTo(128.0f, 28.7f, 128.0f, 64.0f)
                reflectiveCurveToRelative(86.0f, 64.0f, 192.0f, 64.0f)
                close()
                moveTo(0.0f, 300.4f)
                lineTo(0.0f, 352.0f)
                curveToRelative(0.0f, 35.3f, 86.0f, 64.0f, 192.0f, 64.0f)
                reflectiveCurveToRelative(192.0f, -28.7f, 192.0f, -64.0f)
                verticalLineToRelative(-51.6f)
                curveToRelative(-41.3f, 34.0f, -116.9f, 51.6f, -192.0f, 51.6f)
                reflectiveCurveTo(41.3f, 334.4f, 0.0f, 300.4f)
                close()
                moveTo(416.0f, 311.4f)
                curveToRelative(57.3f, -11.1f, 96.0f, -31.7f, 96.0f, -55.4f)
                verticalLineToRelative(-42.7f)
                curveToRelative(-23.2f, 16.4f, -57.3f, 27.6f, -96.0f, 34.5f)
                verticalLineToRelative(63.6f)
                close()
                moveTo(192.0f, 160.0f)
                curveTo(86.0f, 160.0f, 0.0f, 195.8f, 0.0f, 240.0f)
                reflectiveCurveToRelative(86.0f, 80.0f, 192.0f, 80.0f)
                reflectiveCurveToRelative(192.0f, -35.8f, 192.0f, -80.0f)
                reflectiveCurveToRelative(-86.0f, -80.0f, -192.0f, -80.0f)
                close()
                moveTo(411.3f, 216.3f)
                curveToRelative(60.0f, -10.8f, 100.7f, -32.0f, 100.7f, -56.3f)
                verticalLineToRelative(-42.7f)
                curveToRelative(-35.5f, 25.1f, -96.5f, 38.6f, -160.7f, 41.8f)
                curveToRelative(29.5f, 14.3f, 51.2f, 33.5f, 60.0f, 57.2f)
                close()
            }
        }
        .build()
        return _coins!!
    }

private var _coins: ImageVector? = null
