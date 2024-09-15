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

public val LineAwesomeIcons.BongSolid: ImageVector
    get() {
        if (_bongSolid != null) {
            return _bongSolid!!
        }
        _bongSolid = Builder(name = "BongSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(12.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 4.0f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(13.0f, 14.678f)
                curveTo(10.091f, 15.875f, 8.0f, 18.661f, 8.0f, 22.0f)
                curveTo(8.0f, 24.236f, 8.925f, 26.276f, 10.414f, 27.719f)
                lineTo(10.705f, 28.0f)
                lineTo(21.295f, 28.0f)
                lineTo(21.586f, 27.719f)
                curveTo(23.075f, 26.276f, 24.0f, 24.236f, 24.0f, 22.0f)
                curveTo(24.0f, 20.547f, 23.531f, 19.235f, 22.854f, 18.061f)
                lineTo(24.768f, 16.146f)
                lineTo(25.475f, 16.854f)
                lineTo(26.889f, 15.439f)
                lineTo(24.061f, 12.611f)
                lineTo(22.646f, 14.025f)
                lineTo(23.354f, 14.732f)
                lineTo(21.633f, 16.453f)
                curveTo(20.883f, 15.692f, 20.004f, 15.091f, 19.0f, 14.678f)
                lineTo(19.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 16.035f)
                lineTo(17.715f, 16.248f)
                curveTo(19.552f, 16.795f, 21.015f, 18.197f, 21.65f, 20.0f)
                lineTo(10.35f, 20.0f)
                curveTo(10.985f, 18.197f, 12.448f, 16.795f, 14.285f, 16.248f)
                lineTo(15.0f, 16.035f)
                lineTo(15.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(10.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                curveTo(22.0f, 23.561f, 21.358f, 24.943f, 20.387f, 26.0f)
                lineTo(11.613f, 26.0f)
                curveTo(10.642f, 24.943f, 10.0f, 23.561f, 10.0f, 22.0f)
                close()
            }
        }
        .build()
        return _bongSolid!!
    }

private var _bongSolid: ImageVector? = null
