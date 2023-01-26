package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.HolidayVillage: ImageVector
    get() {
        if (_holidayVillage != null) {
            return _holidayVillage!!
        }
        _holidayVillage = Builder(name = "HolidayVillage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 6.83f)
                lineToRelative(-4.0f, 4.0f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-7.17f)
                lineTo(8.0f, 6.83f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 4.0f)
                lineToRelative(-6.0f, 6.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(10.0f)
                lineTo(8.0f, 4.0f)
                close()
                moveTo(12.0f, 18.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(-7.17f)
                lineToRelative(4.0f, -4.0f)
                lineToRelative(4.0f, 4.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(9.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(13.0f)
                close()
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
            }
        }
        .build()
        return _holidayVillage!!
    }

private var _holidayVillage: ImageVector? = null
