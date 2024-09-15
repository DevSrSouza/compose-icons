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

public val LineAwesomeIcons.GamepadSolid: ImageVector
    get() {
        if (_gamepadSolid != null) {
            return _gamepadSolid!!
        }
        _gamepadSolid = Builder(name = "GamepadSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 7.0f)
                curveTo(9.617f, 7.0f, 4.031f, 9.063f, 4.031f, 9.063f)
                lineTo(3.438f, 9.281f)
                lineTo(3.375f, 9.875f)
                lineTo(2.031f, 20.125f)
                curveTo(1.668f, 22.961f, 3.695f, 25.605f, 6.531f, 25.969f)
                curveTo(9.172f, 26.309f, 11.539f, 24.527f, 12.156f, 22.0f)
                lineTo(19.844f, 22.0f)
                curveTo(20.465f, 24.527f, 22.828f, 26.309f, 25.469f, 25.969f)
                curveTo(28.305f, 25.605f, 30.332f, 22.961f, 29.969f, 20.125f)
                lineTo(28.625f, 9.875f)
                lineTo(28.563f, 9.281f)
                lineTo(27.969f, 9.063f)
                curveTo(27.969f, 9.063f, 22.383f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(21.484f, 9.0f, 26.008f, 10.523f, 26.75f, 10.781f)
                lineTo(27.969f, 20.406f)
                curveTo(28.195f, 22.168f, 26.98f, 23.742f, 25.219f, 23.969f)
                curveTo(23.457f, 24.195f, 21.852f, 22.98f, 21.625f, 21.219f)
                lineTo(21.594f, 20.875f)
                lineTo(21.469f, 20.0f)
                lineTo(10.531f, 20.0f)
                lineTo(10.406f, 20.875f)
                lineTo(10.375f, 21.219f)
                curveTo(10.148f, 22.98f, 8.543f, 24.195f, 6.781f, 23.969f)
                curveTo(5.02f, 23.742f, 3.805f, 22.168f, 4.031f, 20.406f)
                lineTo(5.25f, 10.781f)
                curveTo(5.992f, 10.523f, 10.516f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(9.0f, 14.0f)
                lineTo(7.0f, 14.0f)
                lineTo(7.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                lineTo(9.0f, 18.0f)
                lineTo(11.0f, 18.0f)
                lineTo(11.0f, 16.0f)
                lineTo(13.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(21.449f, 12.0f, 21.0f, 12.449f, 21.0f, 13.0f)
                curveTo(21.0f, 13.551f, 21.449f, 14.0f, 22.0f, 14.0f)
                curveTo(22.551f, 14.0f, 23.0f, 13.551f, 23.0f, 13.0f)
                curveTo(23.0f, 12.449f, 22.551f, 12.0f, 22.0f, 12.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveTo(19.449f, 14.0f, 19.0f, 14.449f, 19.0f, 15.0f)
                curveTo(19.0f, 15.551f, 19.449f, 16.0f, 20.0f, 16.0f)
                curveTo(20.551f, 16.0f, 21.0f, 15.551f, 21.0f, 15.0f)
                curveTo(21.0f, 14.449f, 20.551f, 14.0f, 20.0f, 14.0f)
                close()
                moveTo(24.0f, 14.0f)
                curveTo(23.449f, 14.0f, 23.0f, 14.449f, 23.0f, 15.0f)
                curveTo(23.0f, 15.551f, 23.449f, 16.0f, 24.0f, 16.0f)
                curveTo(24.551f, 16.0f, 25.0f, 15.551f, 25.0f, 15.0f)
                curveTo(25.0f, 14.449f, 24.551f, 14.0f, 24.0f, 14.0f)
                close()
                moveTo(22.0f, 16.0f)
                curveTo(21.449f, 16.0f, 21.0f, 16.449f, 21.0f, 17.0f)
                curveTo(21.0f, 17.551f, 21.449f, 18.0f, 22.0f, 18.0f)
                curveTo(22.551f, 18.0f, 23.0f, 17.551f, 23.0f, 17.0f)
                curveTo(23.0f, 16.449f, 22.551f, 16.0f, 22.0f, 16.0f)
                close()
            }
        }
        .build()
        return _gamepadSolid!!
    }

private var _gamepadSolid: ImageVector? = null
