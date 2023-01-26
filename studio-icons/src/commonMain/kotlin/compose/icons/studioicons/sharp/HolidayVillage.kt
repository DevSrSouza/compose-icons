package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.HolidayVillage: ImageVector
    get() {
        if (_holidayVillage != null) {
            return _holidayVillage!!
        }
        _holidayVillage = Builder(name = "HolidayVillage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 20.0f)
                verticalLineTo(8.35f)
                lineTo(13.65f, 4.0f)
                horizontalLineToRelative(-2.83f)
                lineTo(16.0f, 9.18f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                close()
                moveTo(22.0f, 20.0f)
                verticalLineTo(6.69f)
                lineTo(19.31f, 4.0f)
                horizontalLineToRelative(-2.83f)
                lineTo(20.0f, 7.52f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                close()
                moveTo(8.0f, 4.0f)
                lineToRelative(-6.0f, 6.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(5.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(10.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _holidayVillage!!
    }

private var _holidayVillage: ImageVector? = null
