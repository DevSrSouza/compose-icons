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

public val LineAwesomeIcons.WeightSolid: ImageVector
    get() {
        if (_weightSolid != null) {
            return _weightSolid!!
        }
        _weightSolid = Builder(name = "WeightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(11.668f, 10.0f, 8.438f, 12.156f, 8.438f, 12.156f)
                lineTo(7.656f, 12.688f)
                lineTo(8.156f, 13.5f)
                lineTo(11.156f, 18.5f)
                lineTo(11.438f, 19.0f)
                lineTo(20.563f, 19.0f)
                lineTo(20.844f, 18.5f)
                lineTo(23.844f, 13.5f)
                lineTo(24.344f, 12.688f)
                lineTo(23.563f, 12.156f)
                curveTo(23.563f, 12.156f, 20.332f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.824f, 12.0f, 20.688f, 12.906f, 21.594f, 13.406f)
                lineTo(19.469f, 17.0f)
                lineTo(17.625f, 17.0f)
                lineTo(18.906f, 14.438f)
                lineTo(17.094f, 13.563f)
                lineTo(15.375f, 17.0f)
                lineTo(12.531f, 17.0f)
                lineTo(10.406f, 13.406f)
                curveTo(11.313f, 12.906f, 13.176f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _weightSolid!!
    }

private var _weightSolid: ImageVector? = null
