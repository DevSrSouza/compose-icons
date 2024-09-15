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

public val LineAwesomeIcons.ClosedCaptioning: ImageVector
    get() {
        if (_closedCaptioning != null) {
            return _closedCaptioning!!
        }
        _closedCaptioning = Builder(name = "ClosedCaptioning", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                lineTo(2.0f, 23.906f)
                lineTo(30.0f, 23.906f)
                lineTo(30.0f, 6.0f)
                close()
                moveTo(4.0f, 8.0f)
                lineTo(28.0f, 8.0f)
                lineTo(28.0f, 21.906f)
                lineTo(4.0f, 21.906f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(9.25f, 10.0f, 7.0f, 12.25f, 7.0f, 15.0f)
                curveTo(7.0f, 17.75f, 9.25f, 20.0f, 12.0f, 20.0f)
                curveTo(13.195f, 20.0f, 14.277f, 19.559f, 15.125f, 18.875f)
                lineTo(13.875f, 17.313f)
                curveTo(13.348f, 17.738f, 12.707f, 18.0f, 12.0f, 18.0f)
                curveTo(10.332f, 18.0f, 9.0f, 16.668f, 9.0f, 15.0f)
                curveTo(9.0f, 13.332f, 10.332f, 12.0f, 12.0f, 12.0f)
                curveTo(12.707f, 12.0f, 13.348f, 12.262f, 13.875f, 12.688f)
                lineTo(15.125f, 11.125f)
                curveTo(14.277f, 10.441f, 13.195f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(22.0f, 10.0f)
                curveTo(19.25f, 10.0f, 17.0f, 12.25f, 17.0f, 15.0f)
                curveTo(17.0f, 17.75f, 19.25f, 20.0f, 22.0f, 20.0f)
                curveTo(23.195f, 20.0f, 24.277f, 19.559f, 25.125f, 18.875f)
                lineTo(23.875f, 17.313f)
                curveTo(23.348f, 17.738f, 22.707f, 18.0f, 22.0f, 18.0f)
                curveTo(20.332f, 18.0f, 19.0f, 16.668f, 19.0f, 15.0f)
                curveTo(19.0f, 13.332f, 20.332f, 12.0f, 22.0f, 12.0f)
                curveTo(22.707f, 12.0f, 23.348f, 12.262f, 23.875f, 12.688f)
                lineTo(25.125f, 11.125f)
                curveTo(24.277f, 10.441f, 23.195f, 10.0f, 22.0f, 10.0f)
                close()
            }
        }
        .build()
        return _closedCaptioning!!
    }

private var _closedCaptioning: ImageVector? = null
