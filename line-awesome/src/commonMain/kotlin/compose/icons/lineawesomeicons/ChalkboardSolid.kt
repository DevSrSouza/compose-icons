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

public val LineAwesomeIcons.ChalkboardSolid: ImageVector
    get() {
        if (_chalkboardSolid != null) {
            return _chalkboardSolid!!
        }
        _chalkboardSolid = Builder(name = "ChalkboardSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                lineTo(5.0f, 23.0f)
                lineTo(3.0f, 23.0f)
                lineTo(3.0f, 25.0f)
                lineTo(29.0f, 25.0f)
                lineTo(29.0f, 23.0f)
                lineTo(27.0f, 23.0f)
                lineTo(27.0f, 7.0f)
                close()
                moveTo(7.0f, 9.0f)
                lineTo(25.0f, 9.0f)
                lineTo(25.0f, 23.0f)
                lineTo(7.0f, 23.0f)
                close()
                moveTo(21.2813f, 12.2813f)
                lineTo(17.0f, 16.5625f)
                lineTo(13.7188f, 13.2813f)
                lineTo(13.0f, 12.5938f)
                lineTo(12.2813f, 13.2813f)
                lineTo(9.2813f, 16.2813f)
                lineTo(10.7188f, 17.7188f)
                lineTo(13.0f, 15.4375f)
                lineTo(16.2813f, 18.7188f)
                lineTo(17.0f, 19.4063f)
                lineTo(17.7188f, 18.7188f)
                lineTo(22.7188f, 13.7188f)
                close()
                moveTo(20.0f, 20.0f)
                lineTo(19.0f, 21.0f)
                lineTo(20.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(24.0f, 20.0f)
                close()
            }
        }
        .build()
        return _chalkboardSolid!!
    }

private var _chalkboardSolid: ImageVector? = null
