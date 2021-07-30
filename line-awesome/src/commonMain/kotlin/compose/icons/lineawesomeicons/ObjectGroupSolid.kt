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

public val LineAwesomeIcons.ObjectGroupSolid: ImageVector
    get() {
        if (_objectGroupSolid != null) {
            return _objectGroupSolid!!
        }
        _objectGroupSolid = Builder(name = "ObjectGroupSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                lineTo(6.0f, 23.0f)
                lineTo(5.0f, 23.0f)
                lineTo(5.0f, 27.0f)
                lineTo(9.0f, 27.0f)
                lineTo(9.0f, 26.0f)
                lineTo(23.0f, 26.0f)
                lineTo(23.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 23.0f)
                lineTo(26.0f, 23.0f)
                lineTo(26.0f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 5.0f)
                lineTo(23.0f, 5.0f)
                lineTo(23.0f, 6.0f)
                lineTo(9.0f, 6.0f)
                lineTo(9.0f, 5.0f)
                close()
                moveTo(9.0f, 8.0f)
                lineTo(23.0f, 8.0f)
                lineTo(23.0f, 9.0f)
                lineTo(24.0f, 9.0f)
                lineTo(24.0f, 23.0f)
                lineTo(23.0f, 23.0f)
                lineTo(23.0f, 24.0f)
                lineTo(9.0f, 24.0f)
                lineTo(9.0f, 23.0f)
                lineTo(8.0f, 23.0f)
                lineTo(8.0f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(10.0f, 10.0f)
                lineTo(10.0f, 18.0f)
                lineTo(14.0f, 18.0f)
                lineTo(14.0f, 22.0f)
                lineTo(22.0f, 22.0f)
                lineTo(22.0f, 14.0f)
                lineTo(18.0f, 14.0f)
                lineTo(18.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(16.0f, 12.0f)
                lineTo(16.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                close()
                moveTo(18.0f, 16.0f)
                lineTo(20.0f, 16.0f)
                lineTo(20.0f, 20.0f)
                lineTo(16.0f, 20.0f)
                lineTo(16.0f, 18.0f)
                lineTo(18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _objectGroupSolid!!
    }

private var _objectGroupSolid: ImageVector? = null
