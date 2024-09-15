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

public val LineAwesomeIcons.PillsSolid: ImageVector
    get() {
        if (_pillsSolid != null) {
            return _pillsSolid!!
        }
        _pillsSolid = Builder(name = "PillsSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                curveTo(5.467f, 5.0f, 3.0f, 7.468f, 3.0f, 10.5f)
                lineTo(3.0f, 21.5f)
                curveTo(3.0f, 24.532f, 5.467f, 27.0f, 8.5f, 27.0f)
                curveTo(11.533f, 27.0f, 14.0f, 24.532f, 14.0f, 21.5f)
                lineTo(14.0f, 10.5f)
                curveTo(14.0f, 7.468f, 11.533f, 5.0f, 8.5f, 5.0f)
                close()
                moveTo(8.5f, 7.0f)
                curveTo(10.43f, 7.0f, 12.0f, 8.57f, 12.0f, 10.5f)
                lineTo(12.0f, 15.0f)
                lineTo(5.0f, 15.0f)
                lineTo(5.0f, 10.5f)
                curveTo(5.0f, 8.57f, 6.57f, 7.0f, 8.5f, 7.0f)
                close()
                moveTo(22.5f, 14.0f)
                curveTo(18.916f, 14.0f, 16.0f, 16.916f, 16.0f, 20.5f)
                curveTo(16.0f, 24.084f, 18.916f, 27.0f, 22.5f, 27.0f)
                curveTo(26.084f, 27.0f, 29.0f, 24.084f, 29.0f, 20.5f)
                curveTo(29.0f, 16.916f, 26.084f, 14.0f, 22.5f, 14.0f)
                close()
                moveTo(22.5f, 16.0f)
                curveTo(24.981f, 16.0f, 27.0f, 18.019f, 27.0f, 20.5f)
                curveTo(27.0f, 21.379f, 26.738f, 22.193f, 26.301f, 22.887f)
                lineTo(20.113f, 16.699f)
                curveTo(20.807f, 16.262f, 21.621f, 16.0f, 22.5f, 16.0f)
                close()
                moveTo(5.0f, 17.0f)
                lineTo(12.0f, 17.0f)
                lineTo(12.0f, 21.5f)
                curveTo(12.0f, 23.43f, 10.43f, 25.0f, 8.5f, 25.0f)
                curveTo(6.57f, 25.0f, 5.0f, 23.43f, 5.0f, 21.5f)
                lineTo(5.0f, 17.0f)
                close()
                moveTo(18.699f, 18.113f)
                lineTo(24.887f, 24.301f)
                curveTo(24.193f, 24.738f, 23.379f, 25.0f, 22.5f, 25.0f)
                curveTo(20.019f, 25.0f, 18.0f, 22.981f, 18.0f, 20.5f)
                curveTo(18.0f, 19.621f, 18.262f, 18.807f, 18.699f, 18.113f)
                close()
            }
        }
        .build()
        return _pillsSolid!!
    }

private var _pillsSolid: ImageVector? = null
