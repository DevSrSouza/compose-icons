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

public val LineAwesomeIcons.FireExtinguisherSolid: ImageVector
    get() {
        if (_fireExtinguisherSolid != null) {
            return _fireExtinguisherSolid!!
        }
        _fireExtinguisherSolid = Builder(name = "FireExtinguisherSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(14.707f, 4.0f, 13.6055f, 4.8438f, 13.1875f, 6.0f)
                lineTo(12.0f, 6.0f)
                curveTo(9.2539f, 6.0f, 7.0f, 8.2539f, 7.0f, 11.0f)
                lineTo(9.0f, 11.0f)
                curveTo(9.0f, 9.3438f, 10.3438f, 8.0f, 12.0f, 8.0f)
                lineTo(13.0f, 8.0f)
                lineTo(13.0f, 10.4688f)
                curveTo(12.6797f, 10.707f, 12.2656f, 11.0469f, 11.7813f, 11.5313f)
                curveTo(10.9531f, 12.3594f, 10.0f, 13.5f, 10.0f, 15.0f)
                lineTo(10.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 15.0f)
                curveTo(22.0f, 13.5f, 21.0469f, 12.3594f, 20.2188f, 11.5313f)
                curveTo(19.7344f, 11.0469f, 19.3203f, 10.707f, 19.0f, 10.4688f)
                lineTo(19.0f, 10.1875f)
                lineTo(23.8438f, 11.0f)
                lineTo(25.0f, 11.1875f)
                lineTo(25.0f, 4.8125f)
                lineTo(23.8438f, 5.0f)
                lineTo(18.75f, 5.8438f)
                curveTo(18.293f, 4.7695f, 17.2344f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.5547f, 6.0f, 17.0f, 6.4453f, 17.0f, 7.0f)
                lineTo(17.0f, 10.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 7.0f)
                curveTo(15.0f, 6.4453f, 15.4453f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(23.0f, 7.1875f)
                lineTo(23.0f, 8.8125f)
                lineTo(19.0f, 8.125f)
                lineTo(19.0f, 7.875f)
                close()
                moveTo(14.375f, 12.0f)
                lineTo(17.625f, 12.0f)
                curveTo(17.7773f, 12.1055f, 18.2031f, 12.3906f, 18.7813f, 12.9688f)
                curveTo(19.4531f, 13.6406f, 20.0f, 14.5f, 20.0f, 15.0f)
                lineTo(20.0f, 26.0f)
                lineTo(12.0f, 26.0f)
                lineTo(12.0f, 15.0f)
                curveTo(12.0f, 14.5f, 12.5469f, 13.6406f, 13.2188f, 12.9688f)
                curveTo(13.7969f, 12.3906f, 14.2227f, 12.1055f, 14.375f, 12.0f)
                close()
                moveTo(14.0f, 17.0f)
                lineTo(14.0f, 19.0f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _fireExtinguisherSolid!!
    }

private var _fireExtinguisherSolid: ImageVector? = null
