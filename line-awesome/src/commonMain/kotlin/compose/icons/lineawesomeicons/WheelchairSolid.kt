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

public val LineAwesomeIcons.WheelchairSolid: ImageVector
    get() {
        if (_wheelchairSolid != null) {
            return _wheelchairSolid!!
        }
        _wheelchairSolid = Builder(name = "WheelchairSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                curveTo(18.355f, 3.0f, 17.0f, 4.355f, 17.0f, 6.0f)
                curveTo(17.0f, 7.645f, 18.355f, 9.0f, 20.0f, 9.0f)
                curveTo(21.645f, 9.0f, 23.0f, 7.645f, 23.0f, 6.0f)
                curveTo(23.0f, 4.355f, 21.645f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 5.0f)
                curveTo(20.563f, 5.0f, 21.0f, 5.438f, 21.0f, 6.0f)
                curveTo(21.0f, 6.563f, 20.563f, 7.0f, 20.0f, 7.0f)
                curveTo(19.438f, 7.0f, 19.0f, 6.563f, 19.0f, 6.0f)
                curveTo(19.0f, 5.438f, 19.438f, 5.0f, 20.0f, 5.0f)
                close()
                moveTo(14.531f, 7.781f)
                lineTo(10.938f, 8.188f)
                curveTo(10.344f, 8.254f, 9.824f, 8.59f, 9.5f, 9.094f)
                lineTo(7.0f, 12.969f)
                lineTo(8.688f, 14.031f)
                lineTo(11.188f, 10.188f)
                lineTo(13.469f, 9.938f)
                lineTo(12.0f, 14.094f)
                curveTo(8.617f, 14.582f, 6.0f, 17.484f, 6.0f, 21.0f)
                curveTo(6.0f, 24.855f, 9.145f, 28.0f, 13.0f, 28.0f)
                curveTo(16.855f, 28.0f, 20.0f, 24.855f, 20.0f, 21.0f)
                curveTo(20.0f, 20.66f, 19.953f, 20.328f, 19.906f, 20.0f)
                lineTo(21.188f, 20.0f)
                lineTo(22.531f, 26.094f)
                lineTo(24.469f, 25.656f)
                lineTo(23.156f, 19.563f)
                curveTo(22.957f, 18.648f, 22.121f, 18.0f, 21.188f, 18.0f)
                lineTo(19.313f, 18.0f)
                curveTo(18.914f, 17.16f, 18.34f, 16.43f, 17.656f, 15.813f)
                lineTo(18.813f, 12.594f)
                curveTo(19.316f, 11.199f, 18.711f, 9.637f, 17.406f, 8.938f)
                lineTo(15.719f, 8.0f)
                lineTo(15.719f, 8.031f)
                curveTo(15.359f, 7.84f, 14.934f, 7.734f, 14.531f, 7.781f)
                close()
                moveTo(15.531f, 10.188f)
                lineTo(16.469f, 10.688f)
                curveTo(16.914f, 10.926f, 17.109f, 11.434f, 16.938f, 11.906f)
                lineTo(15.938f, 14.656f)
                curveTo(15.359f, 14.387f, 14.742f, 14.195f, 14.094f, 14.094f)
                close()
                moveTo(13.0f, 16.0f)
                curveTo(15.773f, 16.0f, 18.0f, 18.227f, 18.0f, 21.0f)
                curveTo(18.0f, 23.773f, 15.773f, 26.0f, 13.0f, 26.0f)
                curveTo(10.227f, 26.0f, 8.0f, 23.773f, 8.0f, 21.0f)
                curveTo(8.0f, 18.227f, 10.227f, 16.0f, 13.0f, 16.0f)
                close()
            }
        }
        .build()
        return _wheelchairSolid!!
    }

private var _wheelchairSolid: ImageVector? = null
