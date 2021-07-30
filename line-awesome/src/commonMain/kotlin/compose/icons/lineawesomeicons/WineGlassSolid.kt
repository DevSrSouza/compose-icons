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

public val LineAwesomeIcons.WineGlassSolid: ImageVector
    get() {
        if (_wineGlassSolid != null) {
            return _wineGlassSolid!!
        }
        _wineGlassSolid = Builder(name = "WineGlassSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.3008f, 5.0f)
                lineTo(8.0f, 5.5996f)
                curveTo(7.4f, 6.8996f, 7.0f, 8.7f, 7.0f, 11.0f)
                curveTo(7.0f, 15.6f, 10.5f, 19.4004f, 15.0f, 19.9004f)
                lineTo(15.0f, 26.0f)
                lineTo(10.0f, 26.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 19.9004f)
                curveTo(21.5f, 19.4004f, 25.0f, 15.6f, 25.0f, 11.0f)
                curveTo(25.0f, 8.7f, 24.6f, 6.8996f, 24.0f, 5.5996f)
                lineTo(23.8008f, 5.0f)
                lineTo(8.3008f, 5.0f)
                close()
                moveTo(9.5996f, 7.0f)
                lineTo(22.4004f, 7.0f)
                curveTo(22.8004f, 8.2f, 23.0f, 9.6f, 23.0f, 11.0f)
                curveTo(23.0f, 13.1f, 22.0992f, 14.8992f, 20.6992f, 16.1992f)
                lineTo(20.5996f, 16.3008f)
                curveTo(20.4996f, 16.4008f, 20.4008f, 16.5f, 20.3008f, 16.5f)
                curveTo(20.2008f, 16.6f, 20.0996f, 16.5992f, 20.0996f, 16.6992f)
                curveTo(19.9996f, 16.7992f, 19.9008f, 16.8004f, 19.8008f, 16.9004f)
                curveTo(19.7008f, 17.0004f, 19.6f, 16.9996f, 19.5f, 17.0996f)
                curveTo(19.4f, 17.0996f, 19.3008f, 17.1992f, 19.3008f, 17.1992f)
                curveTo(19.2008f, 17.2992f, 19.1004f, 17.3004f, 18.9004f, 17.4004f)
                curveTo(18.8004f, 17.4004f, 18.6992f, 17.5f, 18.6992f, 17.5f)
                curveTo(18.5992f, 17.6f, 18.4008f, 17.5996f, 18.3008f, 17.5996f)
                curveTo(18.2008f, 17.5996f, 18.1996f, 17.6992f, 18.0996f, 17.6992f)
                curveTo(17.9996f, 17.6992f, 17.7992f, 17.8008f, 17.6992f, 17.8008f)
                curveTo(17.5992f, 17.8008f, 17.6f, 17.8004f, 17.5f, 17.9004f)
                lineTo(16.9004f, 17.9004f)
                lineTo(16.6992f, 17.9004f)
                lineTo(16.0f, 17.9004f)
                curveTo(12.1f, 17.9004f, 9.0f, 14.8004f, 9.0f, 10.9004f)
                lineTo(9.0f, 9.8008f)
                lineTo(9.0f, 9.4004f)
                lineTo(9.5996f, 7.0f)
                close()
            }
        }
        .build()
        return _wineGlassSolid!!
    }

private var _wineGlassSolid: ImageVector? = null
