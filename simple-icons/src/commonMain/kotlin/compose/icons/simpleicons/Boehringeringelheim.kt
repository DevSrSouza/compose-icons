package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Boehringeringelheim: ImageVector
    get() {
        if (_boehringeringelheim != null) {
            return _boehringeringelheim!!
        }
        _boehringeringelheim = Builder(name = "Boehringeringelheim", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5303f, 7.3263f)
                verticalLineToRelative(16.6485f)
                curveTo(12.3285f, 24.0f, 12.2272f, 24.0f, 12.0001f, 24.0f)
                curveToRelative(-0.2274f, 0.0f, -0.3539f, 0.0f, -0.5561f, -0.0253f)
                lineTo(11.444f, 7.3263f)
                horizontalLineToRelative(1.0863f)
                close()
                moveTo(10.1306f, 7.3263f)
                verticalLineToRelative(16.5728f)
                curveToRelative(-0.4296f, -0.076f, -0.8592f, -0.2022f, -1.0863f, -0.2779f)
                lineTo(9.0444f, 7.3263f)
                horizontalLineToRelative(1.0863f)
                close()
                moveTo(14.9304f, 7.3263f)
                verticalLineToRelative(16.2694f)
                curveToRelative(-0.5558f, 0.1769f, -0.7832f, 0.2526f, -1.0863f, 0.3034f)
                lineTo(13.8441f, 7.3263f)
                horizontalLineToRelative(1.0863f)
                close()
                moveTo(7.7306f, 15.0569f)
                verticalLineToRelative(8.16f)
                curveToRelative(-0.2274f, -0.0757f, -0.3286f, -0.1262f, -0.5558f, -0.2274f)
                curveToRelative(-0.1769f, -0.0757f, -0.3031f, -0.1262f, -0.5305f, -0.2526f)
                verticalLineToRelative(-7.6799f)
                horizontalLineToRelative(1.0863f)
                close()
                moveTo(17.3556f, 15.0569f)
                verticalLineToRelative(7.6798f)
                curveToRelative(-0.4293f, 0.2022f, -0.7324f, 0.3539f, -1.1115f, 0.48f)
                lineTo(16.2441f, 15.0569f)
                horizontalLineToRelative(1.1115f)
                close()
                moveTo(12.0001f, 0.0f)
                curveToRelative(6.644f, 0.0f, 11.9999f, 5.3811f, 11.9999f, 12.0506f)
                curveToRelative(0.0f, 2.6527f, -0.8589f, 5.2294f, -2.4253f, 7.225f)
                curveToRelative(-0.7075f, 0.9349f, -1.3894f, 1.5411f, -2.9306f, 2.7031f)
                verticalLineToRelative(-6.9219f)
                horizontalLineToRelative(1.0863f)
                verticalLineToRelative(4.901f)
                curveToRelative(2.2739f, -2.6022f, 3.2589f, -4.9767f, 3.2589f, -7.9325f)
                curveTo(22.9893f, 5.8611f, 18.0884f, 0.8841f, 12.0001f, 0.8841f)
                curveTo(5.9115f, 0.8841f, 0.9853f, 5.8863f, 0.9853f, 12.0758f)
                curveToRelative(0.0f, 2.8293f, 0.9094f, 5.0272f, 3.2589f, 7.882f)
                verticalLineToRelative(-4.901f)
                horizontalLineToRelative(1.1115f)
                verticalLineToRelative(6.9219f)
                curveToRelative(-1.2379f, -0.7324f, -2.4f, -1.92f, -3.4106f, -3.4103f)
                curveTo(0.6567f, 16.6233f, 0.0f, 14.4507f, 0.0f, 12.1263f)
                curveTo(0.0f, 5.3811f, 5.3306f, 0.0f, 12.0002f, 0.0f)
                close()
                moveTo(12.0002f, 2.6527f)
                lineToRelative(3.6378f, 2.8545f)
                lineToRelative(-0.6315f, 0.7328f)
                lineToRelative(-3.0063f, -2.3496f)
                lineToRelative(-3.0066f, 2.3496f)
                lineToRelative(-0.6314f, -0.7075f)
                lineToRelative(3.638f, -2.8798f)
                close()
            }
        }
        .build()
        return _boehringeringelheim!!
    }

private var _boehringeringelheim: ImageVector? = null
