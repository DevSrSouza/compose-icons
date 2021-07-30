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

public val LineAwesomeIcons.SprayCanSolid: ImageVector
    get() {
        if (_sprayCanSolid != null) {
            return _sprayCanSolid!!
        }
        _sprayCanSolid = Builder(name = "SprayCanSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                lineTo(12.0f, 8.0f)
                lineTo(14.0f, 8.0f)
                lineTo(14.0f, 9.0625f)
                curveTo(9.8984f, 9.5f, 8.125f, 12.5313f, 8.125f, 12.5313f)
                lineTo(8.0f, 12.75f)
                lineTo(8.0f, 30.0f)
                lineTo(22.0f, 30.0f)
                lineTo(22.0f, 12.75f)
                lineTo(21.875f, 12.5313f)
                curveTo(21.875f, 12.5313f, 20.1016f, 9.5f, 16.0f, 9.0625f)
                lineTo(16.0f, 8.0f)
                lineTo(18.0f, 8.0f)
                lineTo(18.0f, 2.0f)
                close()
                moveTo(24.0f, 2.0f)
                curveTo(23.4492f, 2.0f, 23.0f, 2.4492f, 23.0f, 3.0f)
                curveTo(23.0f, 3.5508f, 23.4492f, 4.0f, 24.0f, 4.0f)
                curveTo(24.5508f, 4.0f, 25.0f, 3.5508f, 25.0f, 3.0f)
                curveTo(25.0f, 2.4492f, 24.5508f, 2.0f, 24.0f, 2.0f)
                close()
                moveTo(14.0f, 4.0f)
                lineTo(16.0f, 4.0f)
                lineTo(16.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                close()
                moveTo(21.0f, 4.0f)
                curveTo(20.4492f, 4.0f, 20.0f, 4.4492f, 20.0f, 5.0f)
                curveTo(20.0f, 5.5508f, 20.4492f, 6.0f, 21.0f, 6.0f)
                curveTo(21.5508f, 6.0f, 22.0f, 5.5508f, 22.0f, 5.0f)
                curveTo(22.0f, 4.4492f, 21.5508f, 4.0f, 21.0f, 4.0f)
                close()
                moveTo(24.0f, 6.0f)
                curveTo(23.4492f, 6.0f, 23.0f, 6.4492f, 23.0f, 7.0f)
                curveTo(23.0f, 7.5508f, 23.4492f, 8.0f, 24.0f, 8.0f)
                curveTo(24.5508f, 8.0f, 25.0f, 7.5508f, 25.0f, 7.0f)
                curveTo(25.0f, 6.4492f, 24.5508f, 6.0f, 24.0f, 6.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(16.7383f, 11.0f, 17.9102f, 11.4805f, 18.6875f, 12.0f)
                lineTo(11.3125f, 12.0f)
                curveTo(12.0898f, 11.4805f, 13.2617f, 11.0f, 15.0f, 11.0f)
                close()
                moveTo(10.0f, 14.0f)
                lineTo(20.0f, 14.0f)
                lineTo(20.0f, 28.0f)
                lineTo(10.0f, 28.0f)
                close()
                moveTo(15.0f, 18.0f)
                curveTo(13.3555f, 18.0f, 12.0f, 19.3555f, 12.0f, 21.0f)
                curveTo(12.0f, 22.6445f, 13.3555f, 24.0f, 15.0f, 24.0f)
                curveTo(16.6445f, 24.0f, 18.0f, 22.6445f, 18.0f, 21.0f)
                curveTo(18.0f, 19.3555f, 16.6445f, 18.0f, 15.0f, 18.0f)
                close()
                moveTo(15.0f, 20.0f)
                curveTo(15.5625f, 20.0f, 16.0f, 20.4375f, 16.0f, 21.0f)
                curveTo(16.0f, 21.5625f, 15.5625f, 22.0f, 15.0f, 22.0f)
                curveTo(14.4375f, 22.0f, 14.0f, 21.5625f, 14.0f, 21.0f)
                curveTo(14.0f, 20.4375f, 14.4375f, 20.0f, 15.0f, 20.0f)
                close()
            }
        }
        .build()
        return _sprayCanSolid!!
    }

private var _sprayCanSolid: ImageVector? = null
