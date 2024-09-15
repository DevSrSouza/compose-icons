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

public val LineAwesomeIcons.SortNumericDownSolid: ImageVector
    get() {
        if (_sortNumericDownSolid != null) {
            return _sortNumericDownSolid!!
        }
        _sortNumericDownSolid = Builder(name = "SortNumericDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.594f, 5.0f)
                lineTo(8.438f, 5.781f)
                curveTo(8.438f, 5.781f, 8.273f, 6.355f, 7.875f, 6.938f)
                curveTo(7.477f, 7.52f, 6.98f, 8.0f, 6.0f, 8.0f)
                lineTo(6.0f, 10.0f)
                curveTo(7.375f, 10.0f, 8.32f, 9.324f, 9.0f, 8.594f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 5.0f)
                close()
                moveTo(22.0f, 5.0f)
                lineTo(22.0f, 23.688f)
                lineTo(19.406f, 21.094f)
                lineTo(18.0f, 22.5f)
                lineTo(22.281f, 26.813f)
                lineTo(23.0f, 27.5f)
                lineTo(23.719f, 26.813f)
                lineTo(28.0f, 22.5f)
                lineTo(26.594f, 21.094f)
                lineTo(24.0f, 23.688f)
                lineTo(24.0f, 5.0f)
                close()
                moveTo(8.5f, 17.0f)
                curveTo(6.578f, 17.0f, 5.0f, 18.578f, 5.0f, 20.5f)
                lineTo(5.0f, 21.0f)
                lineTo(7.0f, 21.0f)
                lineTo(7.0f, 20.5f)
                curveTo(7.0f, 19.625f, 7.625f, 19.0f, 8.5f, 19.0f)
                lineTo(9.5f, 19.0f)
                curveTo(10.375f, 19.0f, 11.0f, 19.625f, 11.0f, 20.5f)
                curveTo(11.0f, 20.957f, 10.648f, 21.48f, 10.063f, 21.844f)
                curveTo(8.828f, 22.602f, 7.746f, 23.086f, 6.844f, 23.594f)
                curveTo(6.391f, 23.848f, 5.977f, 24.09f, 5.625f, 24.469f)
                curveTo(5.273f, 24.848f, 5.0f, 25.418f, 5.0f, 26.0f)
                lineTo(5.0f, 27.0f)
                lineTo(13.0f, 27.0f)
                lineTo(13.0f, 25.0f)
                lineTo(8.438f, 25.0f)
                curveTo(9.172f, 24.621f, 10.02f, 24.242f, 11.125f, 23.563f)
                curveTo(12.141f, 22.926f, 13.0f, 21.844f, 13.0f, 20.5f)
                curveTo(13.0f, 18.578f, 11.422f, 17.0f, 9.5f, 17.0f)
                close()
            }
        }
        .build()
        return _sortNumericDownSolid!!
    }

private var _sortNumericDownSolid: ImageVector? = null
