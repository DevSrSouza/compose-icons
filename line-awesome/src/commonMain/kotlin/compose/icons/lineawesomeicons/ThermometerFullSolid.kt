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

public val LineAwesomeIcons.ThermometerFullSolid: ImageVector
    get() {
        if (_thermometerFullSolid != null) {
            return _thermometerFullSolid!!
        }
        _thermometerFullSolid = Builder(name = "ThermometerFullSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                lineTo(12.0f, 15.469f)
                curveTo(10.25f, 16.738f, 9.0f, 18.676f, 9.0f, 21.0f)
                curveTo(9.0f, 24.855f, 12.145f, 28.0f, 16.0f, 28.0f)
                curveTo(19.855f, 28.0f, 23.0f, 24.855f, 23.0f, 21.0f)
                curveTo(23.0f, 18.676f, 21.75f, 16.738f, 20.0f, 15.469f)
                lineTo(20.0f, 14.0f)
                lineTo(22.0f, 14.0f)
                lineTo(22.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 10.0f)
                lineTo(22.0f, 10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                lineTo(20.0f, 6.0f)
                lineTo(22.0f, 6.0f)
                lineTo(22.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 16.406f)
                lineTo(18.5f, 16.688f)
                curveTo(19.996f, 17.555f, 21.0f, 19.148f, 21.0f, 21.0f)
                curveTo(21.0f, 23.773f, 18.773f, 26.0f, 16.0f, 26.0f)
                curveTo(13.227f, 26.0f, 11.0f, 23.773f, 11.0f, 21.0f)
                curveTo(11.0f, 19.148f, 12.004f, 17.555f, 13.5f, 16.688f)
                lineTo(14.0f, 16.406f)
                close()
                moveTo(15.0f, 8.0f)
                lineTo(15.0f, 18.188f)
                curveTo(13.84f, 18.602f, 13.0f, 19.699f, 13.0f, 21.0f)
                curveTo(13.0f, 22.656f, 14.344f, 24.0f, 16.0f, 24.0f)
                curveTo(17.656f, 24.0f, 19.0f, 22.656f, 19.0f, 21.0f)
                curveTo(19.0f, 19.699f, 18.16f, 18.602f, 17.0f, 18.188f)
                lineTo(17.0f, 8.0f)
                close()
            }
        }
        .build()
        return _thermometerFullSolid!!
    }

private var _thermometerFullSolid: ImageVector? = null
