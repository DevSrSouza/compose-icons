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

public val LineAwesomeIcons.DollyFlatbedSolid: ImageVector
    get() {
        if (_dollyFlatbedSolid != null) {
            return _dollyFlatbedSolid!!
        }
        _dollyFlatbedSolid = Builder(name = "DollyFlatbedSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                curveTo(17.355f, 6.0f, 16.0f, 7.355f, 16.0f, 9.0f)
                lineTo(10.0f, 9.0f)
                lineTo(10.0f, 21.0f)
                lineTo(28.0f, 21.0f)
                lineTo(28.0f, 9.0f)
                lineTo(22.0f, 9.0f)
                curveTo(22.0f, 7.355f, 20.645f, 6.0f, 19.0f, 6.0f)
                close()
                moveTo(4.0f, 7.0f)
                lineTo(4.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                curveTo(5.555f, 9.0f, 6.0f, 9.445f, 6.0f, 10.0f)
                lineTo(6.0f, 21.0f)
                curveTo(6.0f, 23.211f, 7.789f, 25.0f, 10.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                lineTo(10.0f, 23.0f)
                curveTo(8.809f, 23.0f, 8.0f, 22.191f, 8.0f, 21.0f)
                lineTo(8.0f, 10.0f)
                curveTo(8.0f, 8.355f, 6.645f, 7.0f, 5.0f, 7.0f)
                close()
                moveTo(24.5f, 25.0f)
                curveTo(23.672f, 25.0f, 23.0f, 25.672f, 23.0f, 26.5f)
                curveTo(23.0f, 27.328f, 23.672f, 28.0f, 24.5f, 28.0f)
                curveTo(25.328f, 28.0f, 26.0f, 27.328f, 26.0f, 26.5f)
                curveTo(26.0f, 25.672f, 25.328f, 25.0f, 24.5f, 25.0f)
                close()
                moveTo(12.5f, 25.0f)
                curveTo(11.672f, 25.0f, 11.0f, 25.672f, 11.0f, 26.5f)
                curveTo(11.0f, 27.328f, 11.672f, 28.0f, 12.5f, 28.0f)
                curveTo(13.328f, 28.0f, 14.0f, 27.328f, 14.0f, 26.5f)
                curveTo(14.0f, 25.672f, 13.328f, 25.0f, 12.5f, 25.0f)
                close()
                moveTo(19.0f, 8.0f)
                curveTo(19.555f, 8.0f, 20.0f, 8.445f, 20.0f, 9.0f)
                lineTo(18.0f, 9.0f)
                curveTo(18.0f, 8.445f, 18.445f, 8.0f, 19.0f, 8.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(26.0f, 11.0f)
                lineTo(26.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _dollyFlatbedSolid!!
    }

private var _dollyFlatbedSolid: ImageVector? = null
