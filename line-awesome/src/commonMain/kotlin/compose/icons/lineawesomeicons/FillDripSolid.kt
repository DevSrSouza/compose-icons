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

public val LineAwesomeIcons.FillDripSolid: ImageVector
    get() {
        if (_fillDripSolid != null) {
            return _fillDripSolid!!
        }
        _fillDripSolid = Builder(name = "FillDripSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3008f, 3.3008f)
                lineTo(9.9004f, 4.6992f)
                lineTo(11.6992f, 6.5f)
                lineTo(4.8008f, 13.4004f)
                curveTo(3.6008f, 14.6004f, 3.6008f, 16.4992f, 4.8008f, 17.6992f)
                lineTo(4.9004f, 17.8008f)
                lineTo(11.1992f, 24.0996f)
                curveTo(12.3992f, 25.2996f, 14.3f, 25.2996f, 15.5f, 24.0996f)
                lineTo(23.0996f, 16.5f)
                lineTo(23.8008f, 15.8008f)
                lineTo(14.0996f, 6.0996f)
                lineTo(13.3008f, 5.3008f)
                lineTo(13.0996f, 5.0996f)
                lineTo(11.3008f, 3.3008f)
                close()
                moveTo(13.0996f, 7.9004f)
                lineTo(21.0f, 15.8008f)
                lineTo(18.8008f, 18.0f)
                lineTo(7.8984f, 18.0f)
                lineTo(6.1992f, 16.3008f)
                curveTo(5.7992f, 15.9008f, 5.7992f, 15.2008f, 6.1992f, 14.8008f)
                lineTo(13.0996f, 7.9004f)
                close()
                moveTo(25.0f, 19.3008f)
                lineTo(24.1992f, 20.5f)
                curveTo(24.1992f, 20.5f, 23.6996f, 21.2992f, 23.0996f, 22.1992f)
                curveTo(22.7996f, 22.6992f, 22.6004f, 23.0996f, 22.4004f, 23.5996f)
                curveTo(22.2004f, 24.0996f, 22.0f, 24.4f, 22.0f, 25.0f)
                curveTo(22.0f, 26.6f, 23.4f, 28.0f, 25.0f, 28.0f)
                curveTo(26.6f, 28.0f, 28.0f, 26.6f, 28.0f, 25.0f)
                curveTo(28.0f, 24.4f, 27.7996f, 24.0f, 27.5996f, 23.5f)
                curveTo(27.3996f, 23.0f, 27.1004f, 22.4996f, 26.9004f, 22.0996f)
                curveTo(26.4004f, 21.1996f, 25.8008f, 20.4004f, 25.8008f, 20.4004f)
                lineTo(25.0f, 19.3008f)
                close()
            }
        }
        .build()
        return _fillDripSolid!!
    }

private var _fillDripSolid: ImageVector? = null
