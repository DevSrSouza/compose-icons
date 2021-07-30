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

public val LineAwesomeIcons.VolumeUpSolid: ImageVector
    get() {
        if (_volumeUpSolid != null) {
            return _volumeUpSolid!!
        }
        _volumeUpSolid = Builder(name = "VolumeUpSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.5938f)
                lineTo(15.2813f, 5.2813f)
                lineTo(9.5625f, 11.0f)
                lineTo(5.0f, 11.0f)
                lineTo(5.0f, 21.0f)
                lineTo(9.5625f, 21.0f)
                lineTo(15.2813f, 26.7188f)
                lineTo(17.0f, 28.4063f)
                close()
                moveTo(23.8125f, 8.1875f)
                lineTo(22.4063f, 9.5938f)
                curveTo(25.9258f, 13.1133f, 25.9258f, 18.7617f, 22.4063f, 22.2813f)
                lineTo(23.8125f, 23.7188f)
                curveTo(28.0938f, 19.4375f, 28.0938f, 12.4688f, 23.8125f, 8.1875f)
                close()
                moveTo(15.0f, 8.4375f)
                lineTo(15.0f, 23.5625f)
                lineTo(10.7188f, 19.2813f)
                lineTo(10.4063f, 19.0f)
                lineTo(7.0f, 19.0f)
                lineTo(7.0f, 13.0f)
                lineTo(10.4063f, 13.0f)
                lineTo(10.7188f, 12.7188f)
                close()
                moveTo(20.9063f, 11.0938f)
                lineTo(19.5f, 12.5f)
                curveTo(21.4102f, 14.4102f, 21.4023f, 17.5742f, 19.4688f, 19.5938f)
                lineTo(20.9375f, 21.0f)
                curveTo(23.6016f, 18.2188f, 23.5938f, 13.7813f, 20.9063f, 11.0938f)
                close()
            }
        }
        .build()
        return _volumeUpSolid!!
    }

private var _volumeUpSolid: ImageVector? = null
