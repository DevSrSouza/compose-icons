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

public val LineAwesomeIcons.Usps: ImageVector
    get() {
        if (_usps != null) {
            return _usps!!
        }
        _usps = Builder(name = "Usps", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.5996f, 7.0f)
                curveTo(19.1996f, 9.9f, 23.3004f, 10.5f, 23.4004f, 11.5f)
                curveTo(25.4004f, 11.5f, 25.8992f, 11.5004f, 26.1992f, 11.9004f)
                curveTo(27.2992f, 12.9004f, 25.4004f, 15.5f, 25.4004f, 15.5f)
                curveTo(25.2004f, 15.6f, 3.6992f, 24.0f, 3.6992f, 24.0f)
                lineTo(26.4004f, 24.0f)
                lineTo(30.0f, 7.0f)
                lineTo(5.5996f, 7.0f)
                close()
                moveTo(4.8008f, 11.0f)
                lineTo(2.0f, 24.0f)
                curveTo(12.5f, 18.8f, 15.8992f, 17.1004f, 19.1992f, 15.9004f)
                curveTo(22.6992f, 14.8004f, 24.3992f, 14.6996f, 24.6992f, 14.5996f)
                curveTo(24.8992f, 14.3996f, 24.5008f, 14.2008f, 23.3008f, 14.3008f)
                curveTo(20.5008f, 14.4008f, 15.9f, 16.2992f, 14.0f, 17.1992f)
                lineTo(12.4004f, 12.1992f)
                lineTo(22.9004f, 12.1992f)
                curveTo(22.8004f, 11.1992f, 17.4992f, 11.1f, 10.1992f, 11.0f)
                lineTo(4.8008f, 11.0f)
                close()
                moveTo(23.1992f, 12.0996f)
                curveTo(23.1992f, 12.0996f, 23.0996f, 12.0f, 22.5996f, 12.5f)
                curveTo(21.9996f, 12.8f, 20.5996f, 12.8f, 20.5996f, 13.0f)
                curveTo(20.5996f, 13.2f, 24.4008f, 12.8f, 25.3008f, 13.0f)
                curveTo(25.8008f, 13.1f, 25.1996f, 14.0992f, 25.0996f, 14.6992f)
                curveTo(24.9996f, 14.9992f, 25.1992f, 14.8992f, 25.1992f, 14.6992f)
                curveTo(26.5992f, 12.4992f, 25.9996f, 12.0996f, 24.5996f, 12.0996f)
                lineTo(23.1992f, 12.0996f)
                close()
            }
        }
        .build()
        return _usps!!
    }

private var _usps: ImageVector? = null
