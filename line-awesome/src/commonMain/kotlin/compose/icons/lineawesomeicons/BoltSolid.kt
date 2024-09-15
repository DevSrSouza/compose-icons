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

public val LineAwesomeIcons.BoltSolid: ImageVector
    get() {
        if (_boltSolid != null) {
            return _boltSolid!!
        }
        _boltSolid = Builder(name = "BoltSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                lineTo(16.0f, 15.0f)
                lineTo(20.0f, 16.0f)
                lineTo(16.102f, 26.0f)
                lineTo(16.0f, 26.0f)
                lineTo(16.0f, 17.969f)
                lineTo(12.0f, 16.969f)
                lineTo(15.898f, 6.0f)
                lineTo(16.0f, 6.0f)
                moveTo(18.0f, 4.0f)
                lineTo(14.488f, 4.0f)
                lineTo(14.016f, 5.328f)
                lineTo(10.113f, 16.301f)
                lineTo(9.379f, 18.375f)
                lineTo(11.516f, 18.91f)
                lineTo(14.0f, 19.531f)
                lineTo(14.0f, 28.0f)
                lineTo(17.469f, 28.0f)
                lineTo(17.965f, 26.727f)
                lineTo(21.863f, 16.727f)
                lineTo(22.688f, 14.609f)
                lineTo(18.0f, 13.438f)
                close()
            }
        }
        .build()
        return _boltSolid!!
    }

private var _boltSolid: ImageVector? = null
