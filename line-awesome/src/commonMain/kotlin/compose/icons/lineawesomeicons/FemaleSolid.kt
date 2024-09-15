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

public val LineAwesomeIcons.FemaleSolid: ImageVector
    get() {
        if (_femaleSolid != null) {
            return _femaleSolid!!
        }
        _femaleSolid = Builder(name = "FemaleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.801f, 2.0f, 12.0f, 3.801f, 12.0f, 6.0f)
                curveTo(12.0f, 7.129f, 12.488f, 8.145f, 13.25f, 8.875f)
                curveTo(13.012f, 9.047f, 12.793f, 9.227f, 12.594f, 9.438f)
                curveTo(11.754f, 10.328f, 11.23f, 11.516f, 11.0f, 12.813f)
                lineTo(11.031f, 12.813f)
                lineTo(9.031f, 22.813f)
                lineTo(8.781f, 24.0f)
                lineTo(13.0f, 24.0f)
                lineTo(13.0f, 30.0f)
                lineTo(15.0f, 30.0f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 30.0f)
                lineTo(19.0f, 30.0f)
                lineTo(19.0f, 24.0f)
                lineTo(23.219f, 24.0f)
                lineTo(22.969f, 22.813f)
                lineTo(20.969f, 12.813f)
                curveTo(20.738f, 11.578f, 20.238f, 10.402f, 19.406f, 9.5f)
                curveTo(19.199f, 9.273f, 18.969f, 9.059f, 18.719f, 8.875f)
                curveTo(19.492f, 8.145f, 20.0f, 7.137f, 20.0f, 6.0f)
                curveTo(20.0f, 3.801f, 18.199f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.117f, 4.0f, 18.0f, 4.883f, 18.0f, 6.0f)
                curveTo(18.0f, 7.117f, 17.117f, 8.0f, 16.0f, 8.0f)
                curveTo(14.883f, 8.0f, 14.0f, 7.117f, 14.0f, 6.0f)
                curveTo(14.0f, 4.883f, 14.883f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(16.828f, 10.0f, 17.422f, 10.316f, 17.938f, 10.875f)
                curveTo(18.453f, 11.434f, 18.859f, 12.262f, 19.031f, 13.188f)
                lineTo(20.781f, 22.0f)
                lineTo(11.219f, 22.0f)
                lineTo(12.969f, 13.188f)
                lineTo(13.0f, 13.188f)
                curveTo(13.176f, 12.188f, 13.559f, 11.348f, 14.063f, 10.813f)
                curveTo(14.566f, 10.277f, 15.152f, 10.0f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _femaleSolid!!
    }

private var _femaleSolid: ImageVector? = null
