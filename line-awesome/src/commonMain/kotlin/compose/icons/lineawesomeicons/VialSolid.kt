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

public val LineAwesomeIcons.VialSolid: ImageVector
    get() {
        if (_vialSolid != null) {
            return _vialSolid!!
        }
        _vialSolid = Builder(name = "VialSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6875f, 3.2734f)
                lineTo(17.2715f, 4.6875f)
                lineTo(18.5918f, 6.0078f)
                lineTo(5.5f, 19.0996f)
                curveTo(3.5f, 21.0996f, 3.5f, 24.5f, 5.5f, 26.5f)
                curveTo(6.5f, 27.5f, 7.8992f, 28.0f, 9.1992f, 28.0f)
                curveTo(10.5992f, 28.0f, 11.9004f, 27.5f, 12.9004f, 26.5f)
                lineTo(25.9922f, 13.4082f)
                lineTo(27.2422f, 14.6563f)
                lineTo(28.6563f, 13.2422f)
                lineTo(18.6875f, 3.2734f)
                close()
                moveTo(19.9922f, 7.4082f)
                lineTo(24.5918f, 12.0078f)
                lineTo(20.5996f, 16.0f)
                lineTo(11.4004f, 16.0f)
                lineTo(19.9922f, 7.4082f)
                close()
                moveTo(9.4004f, 18.0f)
                lineTo(18.5996f, 18.0f)
                lineTo(11.5f, 25.0996f)
                curveTo(10.2f, 26.3996f, 8.2004f, 26.3996f, 6.9004f, 25.0996f)
                curveTo(5.6004f, 23.7996f, 5.6004f, 21.8f, 6.9004f, 20.5f)
                lineTo(9.4004f, 18.0f)
                close()
            }
        }
        .build()
        return _vialSolid!!
    }

private var _vialSolid: ImageVector? = null
