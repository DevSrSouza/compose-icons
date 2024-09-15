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

public val LineAwesomeIcons.ThermometerSolid: ImageVector
    get() {
        if (_thermometerSolid != null) {
            return _thermometerSolid!!
        }
        _thermometerSolid = Builder(name = "ThermometerSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.75f, 4.0f)
                curveTo(20.148f, 4.0f, 18.531f, 4.625f, 17.313f, 5.844f)
                lineTo(9.656f, 13.469f)
                lineTo(9.531f, 13.625f)
                curveTo(8.555f, 14.602f, 8.0f, 15.934f, 8.0f, 17.313f)
                lineTo(8.0f, 19.625f)
                lineTo(4.906f, 22.688f)
                lineTo(4.875f, 22.75f)
                curveTo(3.723f, 23.957f, 3.719f, 25.906f, 4.906f, 27.094f)
                curveTo(6.109f, 28.297f, 8.109f, 28.297f, 9.313f, 27.094f)
                lineTo(12.375f, 24.0f)
                lineTo(14.688f, 24.0f)
                curveTo(16.066f, 24.0f, 17.398f, 23.445f, 18.375f, 22.469f)
                lineTo(26.156f, 14.688f)
                curveTo(28.59f, 12.254f, 28.59f, 8.277f, 26.156f, 5.844f)
                curveTo(24.938f, 4.625f, 23.352f, 4.0f, 21.75f, 4.0f)
                close()
                moveTo(21.75f, 6.0f)
                curveTo(22.836f, 6.0f, 23.914f, 6.414f, 24.75f, 7.25f)
                curveTo(26.422f, 8.922f, 26.422f, 11.609f, 24.75f, 13.281f)
                lineTo(16.969f, 21.063f)
                curveTo(16.367f, 21.664f, 15.539f, 22.0f, 14.688f, 22.0f)
                lineTo(11.563f, 22.0f)
                lineTo(7.875f, 25.688f)
                curveTo(7.438f, 26.125f, 6.75f, 26.125f, 6.313f, 25.688f)
                curveTo(5.875f, 25.25f, 5.875f, 24.563f, 6.313f, 24.125f)
                lineTo(10.0f, 20.438f)
                lineTo(10.0f, 17.313f)
                curveTo(10.0f, 16.461f, 10.336f, 15.633f, 10.938f, 15.031f)
                lineTo(11.781f, 14.188f)
                lineTo(12.781f, 15.219f)
                lineTo(14.219f, 13.781f)
                lineTo(13.219f, 12.781f)
                lineTo(14.781f, 11.219f)
                lineTo(15.781f, 12.219f)
                lineTo(17.219f, 10.781f)
                lineTo(16.219f, 9.781f)
                lineTo(17.781f, 8.219f)
                lineTo(18.781f, 9.219f)
                lineTo(20.219f, 7.781f)
                lineTo(19.25f, 6.813f)
                curveTo(20.0f, 6.27f, 20.875f, 6.0f, 21.75f, 6.0f)
                close()
                moveTo(22.281f, 8.281f)
                lineTo(10.063f, 20.5f)
                lineTo(11.5f, 21.938f)
                lineTo(23.719f, 9.719f)
                close()
            }
        }
        .build()
        return _thermometerSolid!!
    }

private var _thermometerSolid: ImageVector? = null
