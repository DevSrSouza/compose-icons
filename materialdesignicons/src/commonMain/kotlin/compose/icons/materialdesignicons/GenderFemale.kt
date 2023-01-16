package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.GenderFemale: ImageVector
    get() {
        if (_genderFemale != null) {
            return _genderFemale!!
        }
        _genderFemale = Builder(name = "GenderFemale", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 10.0f)
                curveTo(18.0f, 12.97f, 15.84f, 15.44f, 13.0f, 15.92f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.92f)
                curveTo(8.16f, 15.44f, 6.0f, 12.97f, 6.0f, 10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 4.0f)
                moveTo(12.0f, 6.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 10.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 6.0f)
                close()
            }
        }
        .build()
        return _genderFemale!!
    }

private var _genderFemale: ImageVector? = null
