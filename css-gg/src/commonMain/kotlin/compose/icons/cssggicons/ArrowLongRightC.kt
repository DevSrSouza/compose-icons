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

public val CssGgIcons.ArrowLongRightC: ImageVector
    get() {
        if (_arrowLongRightC != null) {
            return _arrowLongRightC!!
        }
        _arrowLongRightC = Builder(name = "ArrowLongRightC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.73f, 7.7574f)
                lineTo(22.9798f, 11.9929f)
                lineTo(18.7443f, 16.2426f)
                lineTo(17.3277f, 14.8308f)
                lineTo(19.142f, 13.0103f)
                lineTo(6.8536f, 13.0525f)
                curveTo(6.4468f, 14.219f, 5.3395f, 15.0584f, 4.0337f, 15.0642f)
                curveTo(2.3768f, 15.0717f, 1.0277f, 13.7346f, 1.0202f, 12.0777f)
                curveTo(1.0128f, 10.4209f, 2.3499f, 9.0717f, 4.0067f, 9.0643f)
                curveTo(5.3133f, 9.0584f, 6.4285f, 9.8887f, 6.8453f, 11.0525f)
                lineTo(19.1607f, 11.0103f)
                lineTo(17.3182f, 9.174f)
                lineTo(18.73f, 7.7574f)
                close()
                moveTo(5.0202f, 12.0598f)
                curveTo(5.0177f, 11.5075f, 4.568f, 11.0618f, 4.0157f, 11.0643f)
                curveTo(3.4634f, 11.0667f, 3.0177f, 11.5165f, 3.0202f, 12.0687f)
                curveTo(3.0227f, 12.621f, 3.4724f, 13.0667f, 4.0247f, 13.0642f)
                curveTo(4.577f, 13.0618f, 5.0227f, 12.612f, 5.0202f, 12.0598f)
                close()
            }
        }
        .build()
        return _arrowLongRightC!!
    }

private var _arrowLongRightC: ImageVector? = null
