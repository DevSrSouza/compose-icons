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

public val LineAwesomeIcons.SuitcaseRollingSolid: ImageVector
    get() {
        if (_suitcaseRollingSolid != null) {
            return _suitcaseRollingSolid!!
        }
        _suitcaseRollingSolid = Builder(name = "SuitcaseRollingSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(12.346f, 3.0f, 11.0f, 4.346f, 11.0f, 6.0f)
                lineTo(11.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                lineTo(13.0f, 6.0f)
                curveTo(13.0f, 5.448f, 13.448f, 5.0f, 14.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                curveTo(18.552f, 5.0f, 19.0f, 5.448f, 19.0f, 6.0f)
                lineTo(19.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 4.346f, 19.654f, 3.0f, 18.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(7.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                lineTo(9.0f, 28.0f)
                lineTo(11.0f, 28.0f)
                lineTo(11.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 26.0f)
                lineTo(25.0f, 26.0f)
                lineTo(25.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                close()
                moveTo(9.0f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 13.0f)
                close()
                moveTo(11.0f, 16.0f)
                lineTo(11.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                lineTo(21.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                close()
                moveTo(11.0f, 20.0f)
                lineTo(11.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                close()
            }
        }
        .build()
        return _suitcaseRollingSolid!!
    }

private var _suitcaseRollingSolid: ImageVector? = null
