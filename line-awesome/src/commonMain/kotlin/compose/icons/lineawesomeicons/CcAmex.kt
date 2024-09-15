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

public val LineAwesomeIcons.CcAmex: ImageVector
    get() {
        if (_ccAmex != null) {
            return _ccAmex!!
        }
        _ccAmex = Builder(name = "CcAmex", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.566f, 8.0f, 28.0f, 8.434f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.566f, 27.566f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.434f, 24.0f, 4.0f, 23.566f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.434f, 4.434f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(7.063f, 13.25f)
                lineTo(5.0f, 18.75f)
                lineTo(6.25f, 18.75f)
                lineTo(6.656f, 17.5f)
                lineTo(9.0f, 17.5f)
                lineTo(9.406f, 18.75f)
                lineTo(11.75f, 18.75f)
                lineTo(11.75f, 14.625f)
                lineTo(13.25f, 18.75f)
                lineTo(14.344f, 18.75f)
                lineTo(15.875f, 14.75f)
                lineTo(15.875f, 18.75f)
                lineTo(16.969f, 18.75f)
                lineTo(16.969f, 13.25f)
                lineTo(15.188f, 13.25f)
                lineTo(13.813f, 16.969f)
                lineTo(12.438f, 13.25f)
                lineTo(10.5f, 13.25f)
                lineTo(10.5f, 18.469f)
                lineTo(8.563f, 13.25f)
                close()
                moveTo(18.469f, 13.25f)
                lineTo(18.469f, 18.75f)
                lineTo(22.875f, 18.75f)
                lineTo(24.25f, 16.969f)
                lineTo(25.625f, 18.75f)
                lineTo(27.0f, 18.75f)
                lineTo(24.938f, 16.0f)
                lineTo(27.0f, 13.25f)
                lineTo(25.5f, 13.25f)
                lineTo(24.125f, 14.906f)
                lineTo(23.0f, 13.25f)
                close()
                moveTo(7.75f, 14.344f)
                lineTo(8.438f, 16.281f)
                lineTo(7.063f, 16.281f)
                close()
                moveTo(19.563f, 14.5f)
                lineTo(22.313f, 14.5f)
                lineTo(23.438f, 16.0f)
                lineTo(22.188f, 17.656f)
                lineTo(19.563f, 17.656f)
                lineTo(19.563f, 16.563f)
                lineTo(22.063f, 16.563f)
                lineTo(22.063f, 15.438f)
                lineTo(19.563f, 15.438f)
                close()
            }
        }
        .build()
        return _ccAmex!!
    }

private var _ccAmex: ImageVector? = null
