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

public val SolidGroup.PiggyBank: ImageVector
    get() {
        if (_piggyBank != null) {
            return _piggyBank!!
        }
        _piggyBank = Builder(name = "PiggyBank", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 96.0f)
                lineToRelative(0.0f, 0.7f)
                curveToRelative(-5.3f, -0.4f, -10.6f, -0.7f, -16.0f, -0.7f)
                lineTo(256.0f, 96.0f)
                curveToRelative(-16.5f, 0.0f, -32.5f, 2.1f, -47.8f, 6.0f)
                curveToRelative(-0.1f, -2.0f, -0.2f, -4.0f, -0.2f, -6.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                reflectiveCurveToRelative(96.0f, 43.0f, 96.0f, 96.0f)
                close()
                moveTo(384.0f, 128.0f)
                curveToRelative(3.5f, 0.0f, 7.0f, 0.1f, 10.4f, 0.3f)
                curveToRelative(4.2f, 0.3f, 8.4f, 0.7f, 12.6f, 1.3f)
                curveTo(424.6f, 109.1f, 450.8f, 96.0f, 480.0f, 96.0f)
                horizontalLineToRelative(11.5f)
                curveToRelative(10.4f, 0.0f, 18.0f, 9.8f, 15.5f, 19.9f)
                lineToRelative(-13.8f, 55.2f)
                curveToRelative(15.8f, 14.8f, 28.7f, 32.8f, 37.5f, 52.9f)
                lineTo(544.0f, 224.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(512.0f, 384.0f)
                curveToRelative(-9.1f, 12.1f, -19.9f, 22.9f, -32.0f, 32.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(384.0f, 448.0f)
                lineTo(256.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(192.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(160.0f, 416.0f)
                curveToRelative(-34.9f, -26.2f, -58.7f, -66.3f, -63.2f, -112.0f)
                lineTo(68.0f, 304.0f)
                curveToRelative(-37.6f, 0.0f, -68.0f, -30.4f, -68.0f, -68.0f)
                reflectiveCurveToRelative(30.4f, -68.0f, 68.0f, -68.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                lineTo(68.0f, 216.0f)
                curveToRelative(-11.0f, 0.0f, -20.0f, 9.0f, -20.0f, 20.0f)
                reflectiveCurveToRelative(9.0f, 20.0f, 20.0f, 20.0f)
                lineTo(99.2f, 256.0f)
                curveToRelative(12.1f, -59.8f, 57.7f, -107.5f, 116.3f, -122.8f)
                curveToRelative(12.9f, -3.4f, 26.5f, -5.2f, 40.5f, -5.2f)
                lineTo(384.0f, 128.0f)
                close()
                moveTo(448.0f, 264.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -48.0f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, 48.0f, 0.0f)
                close()
            }
        }
        .build()
        return _piggyBank!!
    }

private var _piggyBank: ImageVector? = null
