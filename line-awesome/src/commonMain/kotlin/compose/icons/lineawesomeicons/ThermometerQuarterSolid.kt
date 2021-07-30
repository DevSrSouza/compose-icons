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

public val LineAwesomeIcons.ThermometerQuarterSolid: ImageVector
    get() {
        if (_thermometerQuarterSolid != null) {
            return _thermometerQuarterSolid!!
        }
        _thermometerQuarterSolid = Builder(name = "ThermometerQuarterSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(12.0f, 15.5f)
                curveTo(10.2f, 16.8f, 9.0f, 18.7f, 9.0f, 21.0f)
                curveTo(9.0f, 24.9f, 12.1f, 28.0f, 16.0f, 28.0f)
                curveTo(19.9f, 28.0f, 23.0f, 24.9f, 23.0f, 21.0f)
                curveTo(23.0f, 18.7f, 21.8f, 16.7f, 20.0f, 15.5f)
                lineTo(20.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 16.4004f)
                lineTo(18.5f, 16.6992f)
                curveTo(20.0f, 17.4992f, 21.0f, 19.2f, 21.0f, 21.0f)
                curveTo(21.0f, 23.8f, 18.8f, 26.0f, 16.0f, 26.0f)
                curveTo(13.2f, 26.0f, 11.0f, 23.8f, 11.0f, 21.0f)
                curveTo(11.0f, 19.2f, 12.0f, 17.4992f, 13.5f, 16.6992f)
                lineTo(14.0f, 16.4004f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(13.8008f, 19.0f)
                curveTo(13.3008f, 19.5f, 13.0f, 20.2f, 13.0f, 21.0f)
                curveTo(13.0f, 22.7f, 14.3f, 24.0f, 16.0f, 24.0f)
                curveTo(17.7f, 24.0f, 19.0f, 22.7f, 19.0f, 21.0f)
                curveTo(19.0f, 20.2f, 18.6992f, 19.5f, 18.1992f, 19.0f)
                lineTo(13.8008f, 19.0f)
                close()
            }
        }
        .build()
        return _thermometerQuarterSolid!!
    }

private var _thermometerQuarterSolid: ImageVector? = null
