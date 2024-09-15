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

public val LineAwesomeIcons.StarAndCrescentSolid: ImageVector
    get() {
        if (_starAndCrescentSolid != null) {
            return _starAndCrescentSolid!!
        }
        _starAndCrescentSolid = Builder(name = "StarAndCrescentSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 4.0f)
                curveTo(8.145f, 4.0f, 3.031f, 9.41f, 3.031f, 16.0f)
                curveTo(3.031f, 22.59f, 8.145f, 28.0f, 14.5f, 28.0f)
                curveTo(18.367f, 28.0f, 20.977f, 26.445f, 22.938f, 24.594f)
                lineTo(22.25f, 23.875f)
                lineTo(21.75f, 23.0f)
                curveTo(20.594f, 23.684f, 19.535f, 24.0f, 17.0f, 24.0f)
                curveTo(12.574f, 24.0f, 9.0f, 20.66f, 9.0f, 16.0f)
                curveTo(9.0f, 11.34f, 12.578f, 8.0f, 17.0f, 8.0f)
                curveTo(19.148f, 8.0f, 20.645f, 8.34f, 21.719f, 8.938f)
                lineTo(21.938f, 8.531f)
                lineTo(22.0f, 8.469f)
                lineTo(21.75f, 8.938f)
                curveTo(21.77f, 8.949f, 21.785f, 8.953f, 21.813f, 8.969f)
                lineTo(22.313f, 8.125f)
                lineTo(23.031f, 7.406f)
                curveTo(21.031f, 5.52f, 18.176f, 4.0f, 14.5f, 4.0f)
                close()
                moveTo(14.5f, 6.0f)
                curveTo(14.961f, 6.0f, 15.387f, 6.043f, 15.813f, 6.094f)
                curveTo(10.906f, 6.668f, 7.0f, 10.719f, 7.0f, 16.0f)
                curveTo(7.0f, 21.293f, 10.926f, 25.344f, 15.844f, 25.906f)
                curveTo(15.418f, 25.953f, 14.98f, 26.0f, 14.5f, 26.0f)
                curveTo(9.277f, 26.0f, 5.031f, 21.559f, 5.031f, 16.0f)
                curveTo(5.031f, 10.438f, 9.277f, 6.0f, 14.5f, 6.0f)
                close()
                moveTo(25.594f, 11.0f)
                lineTo(23.438f, 14.094f)
                lineTo(20.031f, 12.875f)
                lineTo(22.125f, 16.0f)
                lineTo(20.0f, 19.063f)
                lineTo(23.438f, 17.906f)
                lineTo(25.563f, 21.0f)
                lineTo(25.563f, 17.188f)
                lineTo(29.0f, 16.0f)
                lineTo(25.563f, 14.813f)
                close()
            }
        }
        .build()
        return _starAndCrescentSolid!!
    }

private var _starAndCrescentSolid: ImageVector? = null
