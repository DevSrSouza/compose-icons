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

public val LineAwesomeIcons.GripVerticalSolid: ImageVector
    get() {
        if (_gripVerticalSolid != null) {
            return _gripVerticalSolid!!
        }
        _gripVerticalSolid = Builder(name = "GripVerticalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                lineTo(7.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 2.0f)
                lineTo(7.0f, 2.0f)
                close()
                moveTo(17.0f, 2.0f)
                lineTo(17.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 2.0f)
                lineTo(17.0f, 2.0f)
                close()
                moveTo(9.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 4.0f)
                close()
                moveTo(19.0f, 4.0f)
                lineTo(23.0f, 4.0f)
                lineTo(23.0f, 8.0f)
                lineTo(19.0f, 8.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(7.0f, 20.0f)
                lineTo(15.0f, 20.0f)
                lineTo(15.0f, 12.0f)
                lineTo(7.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(17.0f, 20.0f)
                lineTo(25.0f, 20.0f)
                lineTo(25.0f, 12.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(9.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                lineTo(13.0f, 18.0f)
                lineTo(9.0f, 18.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 14.0f)
                close()
                moveTo(7.0f, 22.0f)
                lineTo(7.0f, 30.0f)
                lineTo(15.0f, 30.0f)
                lineTo(15.0f, 22.0f)
                lineTo(7.0f, 22.0f)
                close()
                moveTo(17.0f, 22.0f)
                lineTo(17.0f, 30.0f)
                lineTo(25.0f, 30.0f)
                lineTo(25.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                close()
                moveTo(9.0f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 28.0f)
                lineTo(9.0f, 28.0f)
                lineTo(9.0f, 24.0f)
                close()
                moveTo(19.0f, 24.0f)
                lineTo(23.0f, 24.0f)
                lineTo(23.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 24.0f)
                close()
            }
        }
        .build()
        return _gripVerticalSolid!!
    }

private var _gripVerticalSolid: ImageVector? = null
