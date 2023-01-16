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

public val MaterialDesignIcons.AccountInjuryOutline: ImageVector
    get() {
        if (_accountInjuryOutline != null) {
            return _accountInjuryOutline!!
        }
        _accountInjuryOutline = Builder(name = "AccountInjuryOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(14.21f, 10.0f, 16.0f, 8.21f, 16.0f, 6.0f)
                reflectiveCurveTo(14.21f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(8.0f, 3.79f, 8.0f, 6.0f)
                reflectiveCurveTo(9.79f, 10.0f, 12.0f, 10.0f)
                moveTo(12.0f, 4.0f)
                curveTo(13.1f, 4.0f, 14.0f, 4.9f, 14.0f, 6.0f)
                reflectiveCurveTo(13.1f, 8.0f, 12.0f, 8.0f)
                reflectiveCurveTo(10.0f, 7.1f, 10.0f, 6.0f)
                reflectiveCurveTo(10.9f, 4.0f, 12.0f, 4.0f)
                moveTo(18.39f, 12.56f)
                curveTo(16.71f, 11.7f, 14.53f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(7.29f, 11.7f, 5.61f, 12.56f)
                curveTo(4.61f, 13.07f, 4.0f, 14.1f, 4.0f, 15.22f)
                verticalLineTo(22.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.22f)
                curveTo(6.0f, 14.84f, 6.2f, 14.5f, 6.5f, 14.34f)
                curveTo(7.71f, 13.73f, 9.63f, 13.0f, 12.0f, 13.0f)
                curveTo(12.76f, 13.0f, 13.47f, 13.07f, 14.13f, 13.2f)
                lineTo(12.58f, 16.5f)
                horizontalLineTo(9.75f)
                curveTo(8.23f, 16.5f, 7.0f, 17.73f, 7.0f, 19.25f)
                reflectiveCurveTo(8.23f, 22.0f, 9.75f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1f, 22.0f, 20.0f, 21.1f, 20.0f, 20.0f)
                verticalLineTo(15.22f)
                curveTo(20.0f, 14.1f, 19.39f, 13.07f, 18.39f, 12.56f)
                moveTo(10.94f, 20.0f)
                horizontalLineTo(9.75f)
                curveTo(9.34f, 20.0f, 9.0f, 19.66f, 9.0f, 19.25f)
                reflectiveCurveTo(9.34f, 18.5f, 9.75f, 18.5f)
                horizontalLineTo(11.64f)
                lineTo(10.94f, 20.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(13.15f)
                lineTo(16.09f, 13.73f)
                curveTo(16.63f, 13.93f, 17.1f, 14.14f, 17.5f, 14.34f)
                curveTo(17.8f, 14.5f, 18.0f, 14.84f, 18.0f, 15.22f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _accountInjuryOutline!!
    }

private var _accountInjuryOutline: ImageVector? = null
