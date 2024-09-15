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

public val LineAwesomeIcons.GasPumpSolid: ImageVector
    get() {
        if (_gasPumpSolid != null) {
            return _gasPumpSolid!!
        }
        _gasPumpSolid = Builder(name = "GasPumpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 5.0f)
                curveTo(6.355f, 5.0f, 5.0f, 6.355f, 5.0f, 8.0f)
                lineTo(5.0f, 27.0f)
                lineTo(19.0f, 27.0f)
                lineTo(19.0f, 20.0f)
                lineTo(21.0f, 20.0f)
                lineTo(21.0f, 24.0f)
                curveTo(21.0f, 25.645f, 22.355f, 27.0f, 24.0f, 27.0f)
                curveTo(25.645f, 27.0f, 27.0f, 25.645f, 27.0f, 24.0f)
                lineTo(27.0f, 13.813f)
                curveTo(27.0f, 13.016f, 26.688f, 12.281f, 26.125f, 11.719f)
                lineTo(21.406f, 7.0f)
                lineTo(20.0f, 8.406f)
                lineTo(22.844f, 11.25f)
                curveTo(21.77f, 11.707f, 21.0f, 12.766f, 21.0f, 14.0f)
                curveTo(21.0f, 15.645f, 22.355f, 17.0f, 24.0f, 17.0f)
                curveTo(24.352f, 17.0f, 24.684f, 16.926f, 25.0f, 16.813f)
                lineTo(25.0f, 24.0f)
                curveTo(25.0f, 24.566f, 24.566f, 25.0f, 24.0f, 25.0f)
                curveTo(23.434f, 25.0f, 23.0f, 24.566f, 23.0f, 24.0f)
                lineTo(23.0f, 20.0f)
                curveTo(23.0f, 18.906f, 22.094f, 18.0f, 21.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 8.0f)
                curveTo(19.0f, 6.355f, 17.645f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(16.0f, 7.0f)
                curveTo(16.566f, 7.0f, 17.0f, 7.434f, 17.0f, 8.0f)
                lineTo(17.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                lineTo(7.0f, 8.0f)
                curveTo(7.0f, 7.434f, 7.434f, 7.0f, 8.0f, 7.0f)
                close()
                moveTo(24.0f, 13.0f)
                curveTo(24.563f, 13.0f, 25.0f, 13.438f, 25.0f, 14.0f)
                curveTo(25.0f, 14.563f, 24.563f, 15.0f, 24.0f, 15.0f)
                curveTo(23.438f, 15.0f, 23.0f, 14.563f, 23.0f, 14.0f)
                curveTo(23.0f, 13.438f, 23.438f, 13.0f, 24.0f, 13.0f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(17.0f, 14.0f)
                lineTo(17.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
            }
        }
        .build()
        return _gasPumpSolid!!
    }

private var _gasPumpSolid: ImageVector? = null
