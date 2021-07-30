package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.UserCheckSolid: ImageVector
    get() {
        if (_userCheckSolid != null) {
            return _userCheckSolid!!
        }
        _userCheckSolid = Builder(name = "UserCheckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(8.1445f, 2.0f, 5.0f, 5.1445f, 5.0f, 9.0f)
                curveTo(5.0f, 11.4102f, 6.2305f, 13.5508f, 8.0938f, 14.8125f)
                curveTo(4.5273f, 16.3438f, 2.0f, 19.8828f, 2.0f, 24.0f)
                lineTo(4.0f, 24.0f)
                curveTo(4.0f, 19.5703f, 7.5703f, 16.0f, 12.0f, 16.0f)
                curveTo(13.375f, 16.0f, 14.6563f, 16.3594f, 15.7813f, 16.9688f)
                curveTo(14.6719f, 18.3438f, 14.0f, 20.1016f, 14.0f, 22.0f)
                curveTo(14.0f, 26.4063f, 17.5938f, 30.0f, 22.0f, 30.0f)
                curveTo(26.4063f, 30.0f, 30.0f, 26.4063f, 30.0f, 22.0f)
                curveTo(30.0f, 17.5938f, 26.4063f, 14.0f, 22.0f, 14.0f)
                curveTo(20.2539f, 14.0f, 18.6289f, 14.5742f, 17.3125f, 15.5313f)
                curveTo(16.8711f, 15.2539f, 16.3906f, 15.0195f, 15.9063f, 14.8125f)
                curveTo(17.7695f, 13.5508f, 19.0f, 11.4102f, 19.0f, 9.0f)
                curveTo(19.0f, 5.1445f, 15.8555f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(14.7734f, 4.0f, 17.0f, 6.2266f, 17.0f, 9.0f)
                curveTo(17.0f, 11.7734f, 14.7734f, 14.0f, 12.0f, 14.0f)
                curveTo(9.2266f, 14.0f, 7.0f, 11.7734f, 7.0f, 9.0f)
                curveTo(7.0f, 6.2266f, 9.2266f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveTo(25.3242f, 16.0f, 28.0f, 18.6758f, 28.0f, 22.0f)
                curveTo(28.0f, 25.3242f, 25.3242f, 28.0f, 22.0f, 28.0f)
                curveTo(18.6758f, 28.0f, 16.0f, 25.3242f, 16.0f, 22.0f)
                curveTo(16.0f, 18.6758f, 18.6758f, 16.0f, 22.0f, 16.0f)
                close()
                moveTo(25.2813f, 19.2813f)
                lineTo(22.0f, 22.5625f)
                lineTo(19.7188f, 20.2813f)
                lineTo(18.2813f, 21.7188f)
                lineTo(21.2813f, 24.7188f)
                lineTo(22.0f, 25.4063f)
                lineTo(22.7188f, 24.7188f)
                lineTo(26.7188f, 20.7188f)
                close()
            }
        }
        .build()
        return _userCheckSolid!!
    }

private var _userCheckSolid: ImageVector? = null
