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

public val LineAwesomeIcons.ProceduresSolid: ImageVector
    get() {
        if (_proceduresSolid != null) {
            return _proceduresSolid!!
        }
        _proceduresSolid = Builder(name = "ProceduresSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.125f, 0.4375f)
                lineTo(14.375f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 8.0f)
                lineTo(15.625f, 8.0f)
                lineTo(16.875f, 5.4375f)
                lineTo(19.7188f, 13.0f)
                lineTo(23.5f, 8.0f)
                lineTo(28.0f, 8.0f)
                lineTo(28.0f, 6.0f)
                lineTo(22.5f, 6.0f)
                lineTo(20.2813f, 8.875f)
                lineTo(17.125f, 0.4375f)
                close()
                moveTo(6.5f, 11.0f)
                curveTo(5.117f, 11.0f, 4.0f, 12.117f, 4.0f, 13.5f)
                lineTo(4.0f, 28.0f)
                lineTo(9.0f, 28.0f)
                lineTo(9.0f, 26.0f)
                lineTo(23.0f, 26.0f)
                lineTo(23.0f, 28.0f)
                lineTo(28.0f, 28.0f)
                lineTo(28.0f, 17.0f)
                curveTo(28.0f, 15.355f, 26.645f, 14.0f, 25.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 14.5625f)
                curveTo(12.406f, 14.2145f, 11.734f, 14.0f, 11.0f, 14.0f)
                curveTo(10.266f, 14.0f, 9.594f, 14.2145f, 9.0f, 14.5625f)
                lineTo(9.0f, 13.5f)
                curveTo(9.0f, 12.117f, 7.883f, 11.0f, 6.5f, 11.0f)
                close()
                moveTo(6.5f, 13.0f)
                curveTo(6.715f, 13.0f, 7.0f, 13.285f, 7.0f, 13.5f)
                lineTo(7.0f, 22.0f)
                lineTo(26.0f, 22.0f)
                lineTo(26.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 26.0f)
                lineTo(6.0f, 26.0f)
                lineTo(6.0f, 13.5f)
                curveTo(6.0f, 13.285f, 6.285f, 13.0f, 6.5f, 13.0f)
                close()
                moveTo(11.0f, 16.0f)
                curveTo(12.117f, 16.0f, 13.0f, 16.883f, 13.0f, 18.0f)
                curveTo(13.0f, 19.117f, 12.117f, 20.0f, 11.0f, 20.0f)
                curveTo(9.883f, 20.0f, 9.0f, 19.117f, 9.0f, 18.0f)
                curveTo(9.0f, 16.883f, 9.883f, 16.0f, 11.0f, 16.0f)
                close()
                moveTo(15.0f, 16.0f)
                lineTo(25.0f, 16.0f)
                curveTo(25.555f, 16.0f, 26.0f, 16.445f, 26.0f, 17.0f)
                lineTo(26.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 16.0f)
                close()
            }
        }
        .build()
        return _proceduresSolid!!
    }

private var _proceduresSolid: ImageVector? = null
