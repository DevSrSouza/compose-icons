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

public val LineAwesomeIcons.DollarSignSolid: ImageVector
    get() {
        if (_dollarSignSolid != null) {
            return _dollarSignSolid!!
        }
        _dollarSignSolid = Builder(name = "DollarSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.094f)
                curveTo(12.164f, 5.57f, 10.0f, 8.051f, 10.0f, 11.0f)
                curveTo(10.0f, 12.777f, 10.832f, 14.148f, 11.938f, 15.031f)
                curveTo(13.043f, 15.914f, 14.375f, 16.406f, 15.625f, 16.906f)
                curveTo(16.875f, 17.406f, 18.043f, 17.914f, 18.813f, 18.531f)
                curveTo(19.582f, 19.148f, 20.0f, 19.773f, 20.0f, 21.0f)
                curveTo(20.0f, 23.156f, 18.207f, 25.0f, 16.0f, 25.0f)
                curveTo(13.781f, 25.0f, 12.0f, 23.219f, 12.0f, 21.0f)
                lineTo(12.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 21.0f)
                curveTo(10.0f, 23.965f, 12.164f, 26.43f, 15.0f, 26.906f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 26.906f)
                curveTo(19.844f, 26.426f, 22.0f, 23.926f, 22.0f, 21.0f)
                curveTo(22.0f, 19.219f, 21.168f, 17.855f, 20.063f, 16.969f)
                curveTo(18.957f, 16.082f, 17.625f, 15.563f, 16.375f, 15.063f)
                curveTo(15.125f, 14.563f, 13.957f, 14.082f, 13.188f, 13.469f)
                curveTo(12.418f, 12.855f, 12.0f, 12.219f, 12.0f, 11.0f)
                curveTo(12.0f, 8.809f, 13.785f, 7.0f, 16.0f, 7.0f)
                curveTo(18.219f, 7.0f, 20.0f, 8.781f, 20.0f, 11.0f)
                lineTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.0f)
                curveTo(22.0f, 8.035f, 19.836f, 5.57f, 17.0f, 5.094f)
                lineTo(17.0f, 3.0f)
                close()
            }
        }
        .build()
        return _dollarSignSolid!!
    }

private var _dollarSignSolid: ImageVector? = null
