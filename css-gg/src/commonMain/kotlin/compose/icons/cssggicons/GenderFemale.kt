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

public val CssGgIcons.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) {
            return _genderFemale!!
        }
        _genderFemale = Builder(name = "GenderFemale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 3.0f)
                curveTo(9.239f, 3.0f, 7.0f, 5.239f, 7.0f, 8.0f)
                curveTo(7.0f, 10.419f, 8.718f, 12.437f, 11.0f, 12.9f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.9f)
                curveTo(15.282f, 12.437f, 17.0f, 10.419f, 17.0f, 8.0f)
                curveTo(17.0f, 5.239f, 14.761f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(9.0f, 8.0f)
                curveTo(9.0f, 9.657f, 10.343f, 11.0f, 12.0f, 11.0f)
                curveTo(13.657f, 11.0f, 15.0f, 9.657f, 15.0f, 8.0f)
                curveTo(15.0f, 6.343f, 13.657f, 5.0f, 12.0f, 5.0f)
                curveTo(10.343f, 5.0f, 9.0f, 6.343f, 9.0f, 8.0f)
                close()
            }
        }
        .build()
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
