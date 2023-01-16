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

public val MaterialDesignIcons.AccountInjury: ImageVector
    get() {
        if (_accountInjury != null) {
            return _accountInjury!!
        }
        _accountInjury = Builder(name = "AccountInjury", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 6.0f)
                curveTo(8.0f, 3.79f, 9.79f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(16.0f, 3.79f, 16.0f, 6.0f)
                reflectiveCurveTo(14.21f, 10.0f, 12.0f, 10.0f)
                reflectiveCurveTo(8.0f, 8.21f, 8.0f, 6.0f)
                moveTo(17.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(15.22f)
                curveTo(20.0f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f)
                curveTo(17.96f, 12.34f, 17.5f, 12.13f, 17.0f, 11.94f)
                verticalLineTo(22.0f)
                moveTo(12.34f, 17.0f)
                lineTo(15.0f, 11.33f)
                curveTo(14.07f, 11.12f, 13.07f, 11.0f, 12.0f, 11.0f)
                curveTo(9.47f, 11.0f, 7.29f, 11.7f, 5.61f, 12.56f)
                curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.34f)
                curveTo(6.12f, 21.55f, 6.0f, 21.04f, 6.0f, 20.5f)
                curveTo(6.0f, 18.57f, 7.57f, 17.0f, 9.5f, 17.0f)
                horizontalLineTo(12.34f)
                moveTo(10.0f, 22.0f)
                lineTo(11.41f, 19.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 19.0f, 8.0f, 19.67f, 8.0f, 20.5f)
                reflectiveCurveTo(8.67f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _accountInjury!!
    }

private var _accountInjury: ImageVector? = null
