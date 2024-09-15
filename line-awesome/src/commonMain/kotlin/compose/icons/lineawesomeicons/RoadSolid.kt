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

public val LineAwesomeIcons.RoadSolid: ImageVector
    get() {
        if (_roadSolid != null) {
            return _roadSolid!!
        }
        _roadSolid = Builder(name = "RoadSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.469f, 6.0f)
                lineTo(5.281f, 6.75f)
                lineTo(0.625f, 24.75f)
                lineTo(0.281f, 26.0f)
                lineTo(31.719f, 26.0f)
                lineTo(31.375f, 24.75f)
                lineTo(26.719f, 6.75f)
                lineTo(26.531f, 6.0f)
                close()
                moveTo(7.031f, 8.0f)
                lineTo(15.125f, 8.0f)
                lineTo(15.063f, 11.0f)
                lineTo(16.938f, 11.0f)
                lineTo(16.875f, 8.0f)
                lineTo(24.969f, 8.0f)
                lineTo(29.125f, 24.0f)
                lineTo(17.281f, 24.0f)
                lineTo(17.188f, 20.0f)
                lineTo(14.813f, 20.0f)
                lineTo(14.719f, 24.0f)
                lineTo(2.875f, 24.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(14.875f, 18.0f)
                lineTo(17.125f, 18.0f)
                lineTo(17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _roadSolid!!
    }

private var _roadSolid: ImageVector? = null
