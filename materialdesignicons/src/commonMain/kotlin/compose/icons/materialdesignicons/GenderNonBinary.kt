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

public val MaterialDesignIcons.GenderNonBinary: ImageVector
    get() {
        if (_genderNonBinary != null) {
            return _genderNonBinary!!
        }
        _genderNonBinary = Builder(name = "GenderNonBinary", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 3.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.27f)
                lineTo(9.04f, 4.13f)
                lineTo(8.04f, 5.87f)
                lineTo(10.0f, 7.0f)
                lineTo(8.04f, 8.13f)
                lineTo(9.04f, 9.87f)
                lineTo(11.0f, 8.73f)
                verticalLineTo(12.1f)
                curveTo(8.72f, 12.56f, 7.0f, 14.58f, 7.0f, 17.0f)
                curveTo(7.0f, 19.76f, 9.24f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(17.0f, 19.76f, 17.0f, 17.0f)
                curveTo(17.0f, 14.58f, 15.28f, 12.56f, 13.0f, 12.1f)
                verticalLineTo(8.73f)
                lineTo(14.96f, 9.87f)
                lineTo(15.96f, 8.13f)
                lineTo(14.0f, 7.0f)
                lineTo(15.96f, 5.87f)
                lineTo(14.96f, 4.13f)
                lineTo(13.0f, 5.27f)
                verticalLineTo(3.0f)
                moveTo(12.0f, 20.0f)
                curveTo(10.35f, 20.0f, 9.0f, 18.65f, 9.0f, 17.0f)
                reflectiveCurveTo(10.35f, 14.0f, 12.0f, 14.0f)
                reflectiveCurveTo(15.0f, 15.35f, 15.0f, 17.0f)
                reflectiveCurveTo(13.65f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _genderNonBinary!!
    }

private var _genderNonBinary: ImageVector? = null
