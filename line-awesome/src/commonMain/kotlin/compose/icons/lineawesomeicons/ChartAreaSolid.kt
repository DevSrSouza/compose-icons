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

public val LineAwesomeIcons.ChartAreaSolid: ImageVector
    get() {
        if (_chartAreaSolid != null) {
            return _chartAreaSolid!!
        }
        _chartAreaSolid = Builder(name = "ChartAreaSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(28.0f, 4.063f)
                lineTo(26.375f, 5.313f)
                lineTo(21.75f, 8.938f)
                lineTo(16.156f, 8.0f)
                lineTo(15.781f, 7.938f)
                lineTo(15.438f, 8.156f)
                lineTo(9.75f, 11.938f)
                lineTo(5.188f, 11.031f)
                lineTo(4.0f, 10.781f)
                lineTo(4.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                close()
                moveTo(26.0f, 8.156f)
                lineTo(26.0f, 13.531f)
                lineTo(21.781f, 16.875f)
                lineTo(16.313f, 15.063f)
                lineTo(15.844f, 14.906f)
                lineTo(15.438f, 15.156f)
                lineTo(9.875f, 18.875f)
                lineTo(6.0f, 17.313f)
                lineTo(6.0f, 13.219f)
                lineTo(9.813f, 13.969f)
                lineTo(10.219f, 14.063f)
                lineTo(10.563f, 13.844f)
                lineTo(16.219f, 10.063f)
                lineTo(21.844f, 11.0f)
                lineTo(22.281f, 11.063f)
                lineTo(22.625f, 10.781f)
                close()
                moveTo(26.0f, 16.094f)
                lineTo(26.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 19.5f)
                lineTo(9.625f, 20.938f)
                lineTo(10.125f, 21.125f)
                lineTo(10.563f, 20.844f)
                lineTo(16.188f, 17.094f)
                lineTo(21.688f, 18.938f)
                lineTo(22.188f, 19.125f)
                lineTo(22.625f, 18.781f)
                close()
            }
        }
        .build()
        return _chartAreaSolid!!
    }

private var _chartAreaSolid: ImageVector? = null
