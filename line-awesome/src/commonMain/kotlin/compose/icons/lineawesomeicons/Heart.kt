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

public val LineAwesomeIcons.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 5.0f)
                curveTo(5.363f, 5.0f, 2.0f, 8.402f, 2.0f, 12.5f)
                curveTo(2.0f, 13.93f, 2.648f, 15.168f, 3.25f, 16.063f)
                curveTo(3.852f, 16.957f, 4.469f, 17.531f, 4.469f, 17.531f)
                lineTo(15.281f, 28.375f)
                lineTo(16.0f, 29.094f)
                lineTo(16.719f, 28.375f)
                lineTo(27.531f, 17.531f)
                curveTo(27.531f, 17.531f, 30.0f, 15.355f, 30.0f, 12.5f)
                curveTo(30.0f, 8.402f, 26.637f, 5.0f, 22.5f, 5.0f)
                curveTo(19.066f, 5.0f, 16.855f, 7.066f, 16.0f, 7.938f)
                curveTo(15.145f, 7.066f, 12.934f, 5.0f, 9.5f, 5.0f)
                close()
                moveTo(9.5f, 7.0f)
                curveTo(12.488f, 7.0f, 15.25f, 9.906f, 15.25f, 9.906f)
                lineTo(16.0f, 10.75f)
                lineTo(16.75f, 9.906f)
                curveTo(16.75f, 9.906f, 19.512f, 7.0f, 22.5f, 7.0f)
                curveTo(25.543f, 7.0f, 28.0f, 9.496f, 28.0f, 12.5f)
                curveTo(28.0f, 14.043f, 26.125f, 16.125f, 26.125f, 16.125f)
                lineTo(16.0f, 26.25f)
                lineTo(5.875f, 16.125f)
                curveTo(5.875f, 16.125f, 5.391f, 15.66f, 4.906f, 14.938f)
                curveTo(4.422f, 14.215f, 4.0f, 13.273f, 4.0f, 12.5f)
                curveTo(4.0f, 9.496f, 6.457f, 7.0f, 9.5f, 7.0f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
