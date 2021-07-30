package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongLeftC: ImageVector
    get() {
        if (_arrowLongLeftC != null) {
            return _arrowLongLeftC!!
        }
        _arrowLongLeftC = Builder(name = "ArrowLongLeftC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.27f, 7.7574f)
                lineTo(1.0202f, 11.9928f)
                lineTo(5.2558f, 16.2426f)
                lineTo(6.6724f, 14.8308f)
                lineTo(4.858f, 13.0103f)
                lineTo(17.1463f, 13.0525f)
                curveTo(17.5532f, 14.219f, 18.6604f, 15.0583f, 19.9663f, 15.0642f)
                curveTo(21.6231f, 15.0717f, 22.9723f, 13.7346f, 22.9798f, 12.0777f)
                curveTo(22.9872f, 10.4209f, 21.6501f, 9.0717f, 19.9933f, 9.0643f)
                curveTo(18.6867f, 9.0584f, 17.5715f, 9.8886f, 17.1547f, 11.0525f)
                lineTo(4.8393f, 11.0102f)
                lineTo(6.6818f, 9.174f)
                lineTo(5.27f, 7.7574f)
                close()
                moveTo(18.9798f, 12.0598f)
                curveTo(18.9823f, 11.5075f, 19.432f, 11.0618f, 19.9843f, 11.0643f)
                curveTo(20.5366f, 11.0667f, 20.9823f, 11.5165f, 20.9798f, 12.0687f)
                curveTo(20.9773f, 12.621f, 20.5276f, 13.0667f, 19.9753f, 13.0642f)
                curveTo(19.423f, 13.0618f, 18.9773f, 12.612f, 18.9798f, 12.0598f)
                close()
            }
        }
        .build()
        return _arrowLongLeftC!!
    }

private var _arrowLongLeftC: ImageVector? = null
