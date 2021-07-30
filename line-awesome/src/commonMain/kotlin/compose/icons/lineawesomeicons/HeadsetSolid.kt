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

public val LineAwesomeIcons.HeadsetSolid: ImageVector
    get() {
        if (_headsetSolid != null) {
            return _headsetSolid!!
        }
        _headsetSolid = Builder(name = "HeadsetSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(9.9531f, 3.0f, 5.0f, 7.9531f, 5.0f, 14.0f)
                lineTo(5.0f, 20.0f)
                curveTo(5.0f, 21.293f, 5.8438f, 22.3945f, 7.0f, 22.8125f)
                lineTo(7.0f, 23.0f)
                curveTo(7.0f, 25.7461f, 9.2539f, 28.0f, 12.0f, 28.0f)
                lineTo(13.2813f, 28.0f)
                curveTo(13.6289f, 28.5977f, 14.2617f, 29.0f, 15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                curveTo(18.1016f, 29.0f, 19.0f, 28.1016f, 19.0f, 27.0f)
                curveTo(19.0f, 25.8984f, 18.1016f, 25.0f, 17.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                curveTo(14.2617f, 25.0f, 13.6289f, 25.4023f, 13.2813f, 26.0f)
                lineTo(12.0f, 26.0f)
                curveTo(10.3438f, 26.0f, 9.0f, 24.6563f, 9.0f, 23.0f)
                lineTo(11.0f, 23.0f)
                lineTo(11.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                curveTo(7.0f, 9.0469f, 11.0469f, 5.0f, 16.0f, 5.0f)
                curveTo(20.9531f, 5.0f, 25.0f, 9.0469f, 25.0f, 14.0f)
                lineTo(21.0f, 14.0f)
                lineTo(21.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                curveTo(25.6445f, 23.0f, 27.0f, 21.6445f, 27.0f, 20.0f)
                lineTo(27.0f, 14.0f)
                curveTo(27.0f, 7.9531f, 22.0469f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(7.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                curveTo(7.4453f, 21.0f, 7.0f, 20.5547f, 7.0f, 20.0f)
                close()
                moveTo(23.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 20.0f)
                curveTo(25.0f, 20.5547f, 24.5547f, 21.0f, 24.0f, 21.0f)
                lineTo(23.0f, 21.0f)
                close()
            }
        }
        .build()
        return _headsetSolid!!
    }

private var _headsetSolid: ImageVector? = null
