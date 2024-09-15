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

public val LineAwesomeIcons.AnkhSolid: ImageVector
    get() {
        if (_ankhSolid != null) {
            return _ankhSolid!!
        }
        _ankhSolid = Builder(name = "AnkhSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.25f, 2.0f, 11.0f, 4.25f, 11.0f, 7.0f)
                curveTo(11.0f, 8.957f, 12.113f, 10.875f, 13.156f, 12.438f)
                curveTo(13.289f, 12.641f, 13.43f, 12.813f, 13.563f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 16.156f)
                lineTo(9.156f, 16.0f)
                lineTo(14.906f, 15.188f)
                lineTo(14.0f, 28.938f)
                lineTo(13.938f, 30.0f)
                lineTo(18.063f, 30.0f)
                lineTo(18.0f, 28.938f)
                lineTo(17.094f, 15.188f)
                lineTo(22.844f, 16.0f)
                lineTo(24.0f, 16.156f)
                lineTo(24.0f, 13.0f)
                lineTo(18.438f, 13.0f)
                curveTo(18.57f, 12.813f, 18.711f, 12.641f, 18.844f, 12.438f)
                curveTo(19.887f, 10.875f, 21.0f, 8.957f, 21.0f, 7.0f)
                curveTo(21.0f, 4.25f, 18.75f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.668f, 4.0f, 19.0f, 5.332f, 19.0f, 7.0f)
                curveTo(19.0f, 8.078f, 18.113f, 9.914f, 17.156f, 11.344f)
                curveTo(16.574f, 12.219f, 16.367f, 12.43f, 16.0f, 12.875f)
                curveTo(15.633f, 12.43f, 15.426f, 12.219f, 14.844f, 11.344f)
                curveTo(13.887f, 9.914f, 13.0f, 8.078f, 13.0f, 7.0f)
                curveTo(13.0f, 5.332f, 14.332f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ankhSolid!!
    }

private var _ankhSolid: ImageVector? = null
