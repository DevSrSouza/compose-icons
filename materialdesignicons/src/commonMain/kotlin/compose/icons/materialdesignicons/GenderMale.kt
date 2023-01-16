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

public val MaterialDesignIcons.GenderMale: ImageVector
    get() {
        if (_genderMale != null) {
            return _genderMale!!
        }
        _genderMale = Builder(name = "GenderMale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                curveTo(10.29f, 9.0f, 11.5f, 9.41f, 12.47f, 10.11f)
                lineTo(17.58f, 5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.41f)
                lineTo(13.89f, 11.5f)
                curveTo(14.59f, 12.5f, 15.0f, 13.7f, 15.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 9.0f, 21.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 3.0f, 15.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 9.0f, 9.0f)
                moveTo(9.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 5.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 13.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 9.0f, 11.0f)
                close()
            }
        }
        .build()
        return _genderMale!!
    }

private var _genderMale: ImageVector? = null
