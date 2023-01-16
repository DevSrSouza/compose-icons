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

public val MaterialDesignIcons.AlphabetTengwar: ImageVector
    get() {
        if (_alphabetTengwar != null) {
            return _alphabetTengwar!!
        }
        _alphabetTengwar = Builder(name = "AlphabetTengwar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 7.0f)
                lineTo(12.5f, 3.0f)
                horizontalLineTo(15.0f)
                lineTo(11.0f, 7.0f)
                horizontalLineTo(10.0f)
                moveTo(12.5f, 9.0f)
                curveTo(11.96f, 9.0f, 11.46f, 9.13f, 11.0f, 9.35f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.5f)
                curveTo(11.0f, 11.67f, 11.67f, 11.0f, 12.5f, 11.0f)
                curveTo(13.33f, 11.0f, 14.0f, 11.67f, 14.0f, 12.5f)
                verticalLineTo(14.5f)
                curveTo(14.0f, 15.33f, 13.33f, 16.0f, 12.5f, 16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.5f)
                curveTo(14.43f, 18.0f, 16.0f, 16.43f, 16.0f, 14.5f)
                verticalLineTo(12.5f)
                curveTo(16.0f, 10.57f, 14.43f, 9.0f, 12.5f, 9.0f)
                close()
            }
        }
        .build()
        return _alphabetTengwar!!
    }

private var _alphabetTengwar: ImageVector? = null
