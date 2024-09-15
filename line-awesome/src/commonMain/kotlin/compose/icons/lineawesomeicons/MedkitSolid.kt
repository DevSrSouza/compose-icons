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

public val LineAwesomeIcons.MedkitSolid: ImageVector
    get() {
        if (_medkitSolid != null) {
            return _medkitSolid!!
        }
        _medkitSolid = Builder(name = "MedkitSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                curveTo(12.906f, 5.0f, 12.0f, 5.906f, 12.0f, 7.0f)
                lineTo(12.0f, 8.0f)
                lineTo(6.0f, 8.0f)
                curveTo(4.355f, 8.0f, 3.0f, 9.355f, 3.0f, 11.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 11.0f)
                curveTo(29.0f, 9.355f, 27.645f, 8.0f, 26.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 7.0f)
                curveTo(20.0f, 5.906f, 19.094f, 5.0f, 18.0f, 5.0f)
                close()
                moveTo(14.0f, 7.0f)
                lineTo(18.0f, 7.0f)
                lineTo(18.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                close()
                moveTo(6.0f, 10.0f)
                lineTo(26.0f, 10.0f)
                curveTo(26.566f, 10.0f, 27.0f, 10.434f, 27.0f, 11.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 11.0f)
                curveTo(5.0f, 10.434f, 5.434f, 10.0f, 6.0f, 10.0f)
                close()
                moveTo(15.0f, 13.0f)
                lineTo(15.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                lineTo(17.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 13.0f)
                close()
            }
        }
        .build()
        return _medkitSolid!!
    }

private var _medkitSolid: ImageVector? = null
