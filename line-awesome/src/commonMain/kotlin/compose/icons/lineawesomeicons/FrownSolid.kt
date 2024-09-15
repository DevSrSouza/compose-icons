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

public val LineAwesomeIcons.FrownSolid: ImageVector
    get() {
        if (_frownSolid != null) {
            return _frownSolid!!
        }
        _frownSolid = Builder(name = "FrownSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(11.5f, 12.0f)
                curveTo(10.672f, 12.0f, 10.0f, 12.672f, 10.0f, 13.5f)
                curveTo(10.0f, 14.328f, 10.672f, 15.0f, 11.5f, 15.0f)
                curveTo(12.328f, 15.0f, 13.0f, 14.328f, 13.0f, 13.5f)
                curveTo(13.0f, 12.672f, 12.328f, 12.0f, 11.5f, 12.0f)
                close()
                moveTo(20.5f, 12.0f)
                curveTo(19.672f, 12.0f, 19.0f, 12.672f, 19.0f, 13.5f)
                curveTo(19.0f, 14.328f, 19.672f, 15.0f, 20.5f, 15.0f)
                curveTo(21.328f, 15.0f, 22.0f, 14.328f, 22.0f, 13.5f)
                curveTo(22.0f, 12.672f, 21.328f, 12.0f, 20.5f, 12.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(13.332f, 18.0f, 10.98f, 19.336f, 9.531f, 21.344f)
                lineTo(11.156f, 22.5f)
                curveTo(12.246f, 20.984f, 13.992f, 20.0f, 16.0f, 20.0f)
                curveTo(18.008f, 20.0f, 19.754f, 20.984f, 20.844f, 22.5f)
                lineTo(22.469f, 21.344f)
                curveTo(21.02f, 19.336f, 18.668f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _frownSolid!!
    }

private var _frownSolid: ImageVector? = null
