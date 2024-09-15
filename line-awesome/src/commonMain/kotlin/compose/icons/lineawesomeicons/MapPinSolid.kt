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

public val LineAwesomeIcons.MapPinSolid: ImageVector
    get() {
        if (_mapPinSolid != null) {
            return _mapPinSolid!!
        }
        _mapPinSolid = Builder(name = "MapPinSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(12.145f, 5.0f, 9.0f, 8.145f, 9.0f, 12.0f)
                curveTo(9.0f, 15.516f, 11.617f, 18.418f, 15.0f, 18.906f)
                lineTo(15.0f, 28.0f)
                lineTo(17.0f, 28.0f)
                lineTo(17.0f, 18.906f)
                curveTo(20.383f, 18.418f, 23.0f, 15.516f, 23.0f, 12.0f)
                curveTo(23.0f, 8.145f, 19.855f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.773f, 7.0f, 21.0f, 9.227f, 21.0f, 12.0f)
                curveTo(21.0f, 14.773f, 18.773f, 17.0f, 16.0f, 17.0f)
                curveTo(13.227f, 17.0f, 11.0f, 14.773f, 11.0f, 12.0f)
                curveTo(11.0f, 9.227f, 13.227f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(13.801f, 8.0f, 12.0f, 9.801f, 12.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                curveTo(14.0f, 10.883f, 14.883f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _mapPinSolid!!
    }

private var _mapPinSolid: ImageVector? = null
