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

public val LineAwesomeIcons.TaxiSolid: ImageVector
    get() {
        if (_taxiSolid != null) {
            return _taxiSolid!!
        }
        _taxiSolid = Builder(name = "TaxiSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.0f)
                lineTo(12.344f, 6.0f)
                lineTo(9.5f, 6.0f)
                curveTo(8.18f, 6.0f, 7.004f, 6.859f, 6.625f, 8.125f)
                lineTo(5.25f, 12.719f)
                lineTo(3.313f, 12.063f)
                lineTo(2.688f, 13.938f)
                lineTo(4.656f, 14.594f)
                lineTo(4.031f, 16.719f)
                curveTo(4.008f, 16.809f, 3.996f, 16.906f, 4.0f, 17.0f)
                lineTo(4.0f, 24.0f)
                curveTo(4.0f, 24.031f, 4.0f, 24.063f, 4.0f, 24.094f)
                lineTo(4.0f, 25.0f)
                curveTo(4.0f, 25.551f, 4.449f, 26.0f, 5.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.344f, 25.0f)
                lineTo(23.656f, 25.0f)
                lineTo(24.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(27.551f, 26.0f, 28.0f, 25.551f, 28.0f, 25.0f)
                lineTo(28.0f, 24.156f)
                curveTo(28.004f, 24.105f, 28.004f, 24.051f, 28.0f, 24.0f)
                lineTo(28.0f, 17.0f)
                curveTo(28.004f, 16.906f, 27.992f, 16.809f, 27.969f, 16.719f)
                lineTo(27.344f, 14.594f)
                lineTo(29.313f, 13.938f)
                lineTo(28.688f, 12.063f)
                lineTo(26.75f, 12.719f)
                lineTo(25.375f, 8.125f)
                curveTo(24.996f, 6.859f, 23.82f, 6.0f, 22.5f, 6.0f)
                lineTo(19.656f, 6.0f)
                lineTo(19.0f, 4.0f)
                close()
                moveTo(9.5f, 8.0f)
                lineTo(22.5f, 8.0f)
                curveTo(22.945f, 8.0f, 23.34f, 8.293f, 23.469f, 8.719f)
                lineTo(24.75f, 13.0f)
                lineTo(7.25f, 13.0f)
                lineTo(8.531f, 8.719f)
                curveTo(8.66f, 8.289f, 9.055f, 8.0f, 9.5f, 8.0f)
                close()
                moveTo(6.656f, 15.0f)
                lineTo(25.344f, 15.0f)
                lineTo(26.0f, 17.188f)
                lineTo(26.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 17.188f)
                close()
                moveTo(8.5f, 16.0f)
                curveTo(7.672f, 16.0f, 7.0f, 16.672f, 7.0f, 17.5f)
                curveTo(7.0f, 18.328f, 7.672f, 19.0f, 8.5f, 19.0f)
                curveTo(9.328f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                curveTo(10.0f, 16.672f, 9.328f, 16.0f, 8.5f, 16.0f)
                close()
                moveTo(23.5f, 16.0f)
                curveTo(22.672f, 16.0f, 22.0f, 16.672f, 22.0f, 17.5f)
                curveTo(22.0f, 18.328f, 22.672f, 19.0f, 23.5f, 19.0f)
                curveTo(24.328f, 19.0f, 25.0f, 18.328f, 25.0f, 17.5f)
                curveTo(25.0f, 16.672f, 24.328f, 16.0f, 23.5f, 16.0f)
                close()
                moveTo(12.0f, 19.0f)
                lineTo(10.75f, 22.0f)
                lineTo(12.906f, 22.0f)
                lineTo(13.344f, 21.0f)
                lineTo(18.656f, 21.0f)
                lineTo(19.094f, 22.0f)
                lineTo(21.25f, 22.0f)
                lineTo(20.0f, 19.0f)
                close()
            }
        }
        .build()
        return _taxiSolid!!
    }

private var _taxiSolid: ImageVector? = null
