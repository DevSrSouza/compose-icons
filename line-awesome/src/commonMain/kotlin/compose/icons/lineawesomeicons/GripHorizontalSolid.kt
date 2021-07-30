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

public val LineAwesomeIcons.GripHorizontalSolid: ImageVector
    get() {
        if (_gripHorizontalSolid != null) {
            return _gripHorizontalSolid!!
        }
        _gripHorizontalSolid = Builder(name = "GripHorizontalSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 15.0f)
                lineTo(10.0f, 15.0f)
                lineTo(10.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(12.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                lineTo(20.0f, 7.0f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(22.0f, 7.0f)
                lineTo(22.0f, 15.0f)
                lineTo(30.0f, 15.0f)
                lineTo(30.0f, 7.0f)
                lineTo(22.0f, 7.0f)
                close()
                moveTo(4.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                lineTo(8.0f, 13.0f)
                lineTo(4.0f, 13.0f)
                lineTo(4.0f, 9.0f)
                close()
                moveTo(14.0f, 9.0f)
                lineTo(18.0f, 9.0f)
                lineTo(18.0f, 13.0f)
                lineTo(14.0f, 13.0f)
                lineTo(14.0f, 9.0f)
                close()
                moveTo(24.0f, 9.0f)
                lineTo(28.0f, 9.0f)
                lineTo(28.0f, 13.0f)
                lineTo(24.0f, 13.0f)
                lineTo(24.0f, 9.0f)
                close()
                moveTo(2.0f, 17.0f)
                lineTo(2.0f, 25.0f)
                lineTo(10.0f, 25.0f)
                lineTo(10.0f, 17.0f)
                lineTo(2.0f, 17.0f)
                close()
                moveTo(12.0f, 17.0f)
                lineTo(12.0f, 25.0f)
                lineTo(20.0f, 25.0f)
                lineTo(20.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                close()
                moveTo(22.0f, 17.0f)
                lineTo(22.0f, 25.0f)
                lineTo(30.0f, 25.0f)
                lineTo(30.0f, 17.0f)
                lineTo(22.0f, 17.0f)
                close()
                moveTo(4.0f, 19.0f)
                lineTo(8.0f, 19.0f)
                lineTo(8.0f, 23.0f)
                lineTo(4.0f, 23.0f)
                lineTo(4.0f, 19.0f)
                close()
                moveTo(14.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 23.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 19.0f)
                close()
                moveTo(24.0f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 23.0f)
                lineTo(24.0f, 23.0f)
                lineTo(24.0f, 19.0f)
                close()
            }
        }
        .build()
        return _gripHorizontalSolid!!
    }

private var _gripHorizontalSolid: ImageVector? = null
