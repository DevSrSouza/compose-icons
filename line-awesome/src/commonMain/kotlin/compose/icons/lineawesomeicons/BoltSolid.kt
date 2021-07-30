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
                lineTo(16.1016f, 26.0f)
                lineTo(16.0f, 26.0f)
                lineTo(16.0f, 17.9688f)
                lineTo(12.0f, 16.9688f)
                lineTo(15.8984f, 6.0f)
                lineTo(16.0f, 6.0f)
                moveTo(18.0f, 4.0f)
                lineTo(14.4883f, 4.0f)
                lineTo(14.0156f, 5.3281f)
                lineTo(10.1133f, 16.3008f)
                lineTo(9.3789f, 18.375f)
                lineTo(11.5156f, 18.9102f)
                lineTo(14.0f, 19.5313f)
                lineTo(14.0f, 28.0f)
                lineTo(17.4688f, 28.0f)
                lineTo(17.9648f, 26.7266f)
                lineTo(21.8633f, 16.7266f)
                lineTo(22.6875f, 14.6094f)
                lineTo(18.0f, 13.4375f)
                close()
            }
        }
        .build()
        return _boltSolid!!
    }

private var _boltSolid: ImageVector? = null
