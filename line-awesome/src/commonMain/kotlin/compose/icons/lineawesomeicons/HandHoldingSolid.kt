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

public val LineAwesomeIcons.HandHoldingSolid: ImageVector
    get() {
        if (_handHoldingSolid != null) {
            return _handHoldingSolid!!
        }
        _handHoldingSolid = Builder(name = "HandHoldingSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.516f, 18.0f)
                curveTo(9.485f, 18.004f, 8.699f, 18.266f, 8.699f, 18.266f)
                lineTo(8.68f, 18.273f)
                lineTo(3.008f, 20.449f)
                lineTo(4.992f, 26.02f)
                lineTo(9.922f, 24.129f)
                lineTo(17.059f, 28.059f)
                lineTo(29.383f, 22.953f)
                lineTo(28.617f, 21.109f)
                lineTo(17.18f, 25.844f)
                lineTo(10.078f, 21.934f)
                lineTo(6.188f, 23.422f)
                lineTo(5.547f, 21.615f)
                lineTo(9.344f, 20.158f)
                curveTo(9.353f, 20.155f, 9.82f, 20.0f, 10.516f, 20.0f)
                curveTo(11.219f, 20.0f, 12.038f, 20.156f, 12.738f, 20.789f)
                lineTo(12.752f, 20.797f)
                lineTo(12.756f, 20.801f)
                curveTo(13.787f, 21.696f, 14.564f, 22.321f, 15.646f, 22.66f)
                curveTo(16.728f, 23.0f, 17.956f, 23.039f, 20.006f, 23.031f)
                lineTo(19.996f, 21.031f)
                curveTo(17.984f, 21.039f, 16.933f, 20.968f, 16.246f, 20.75f)
                curveTo(15.558f, 20.539f, 15.07f, 20.16f, 14.078f, 19.301f)
                lineTo(14.066f, 19.293f)
                curveTo(12.909f, 18.254f, 11.535f, 17.996f, 10.516f, 18.0f)
                close()
            }
        }
        .build()
        return _handHoldingSolid!!
    }

private var _handHoldingSolid: ImageVector? = null
