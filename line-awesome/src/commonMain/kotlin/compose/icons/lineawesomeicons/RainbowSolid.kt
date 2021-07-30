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

public val LineAwesomeIcons.RainbowSolid: ImageVector
    get() {
        if (_rainbowSolid != null) {
            return _rainbowSolid!!
        }
        _rainbowSolid = Builder(name = "RainbowSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(8.28f, 5.0f, 2.0f, 11.28f, 2.0f, 19.0f)
                lineTo(2.0f, 27.0f)
                lineTo(4.0f, 27.0f)
                lineTo(4.0f, 19.0f)
                curveTo(4.0f, 12.383f, 9.383f, 7.0f, 16.0f, 7.0f)
                curveTo(22.617f, 7.0f, 28.0f, 12.383f, 28.0f, 19.0f)
                lineTo(28.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 19.0f)
                curveTo(30.0f, 11.28f, 23.72f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(10.486f, 9.0f, 6.0f, 13.486f, 6.0f, 19.0f)
                lineTo(6.0f, 27.0f)
                lineTo(8.0f, 27.0f)
                lineTo(8.0f, 19.0f)
                curveTo(8.0f, 14.589f, 11.589f, 11.0f, 16.0f, 11.0f)
                curveTo(20.411f, 11.0f, 24.0f, 14.589f, 24.0f, 19.0f)
                lineTo(24.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                lineTo(26.0f, 19.0f)
                curveTo(26.0f, 13.486f, 21.514f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(12.691f, 13.0f, 10.0f, 15.691f, 10.0f, 19.0f)
                lineTo(10.0f, 27.0f)
                lineTo(12.0f, 27.0f)
                lineTo(12.0f, 19.0f)
                curveTo(12.0f, 16.794f, 13.794f, 15.0f, 16.0f, 15.0f)
                curveTo(18.206f, 15.0f, 20.0f, 16.794f, 20.0f, 19.0f)
                lineTo(20.0f, 27.0f)
                lineTo(22.0f, 27.0f)
                lineTo(22.0f, 19.0f)
                curveTo(22.0f, 15.691f, 19.309f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _rainbowSolid!!
    }

private var _rainbowSolid: ImageVector? = null
