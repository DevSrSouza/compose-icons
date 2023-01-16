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

public val MaterialDesignIcons.AccountEyeOutline: ImageVector
    get() {
        if (_accountEyeOutline != null) {
            return _accountEyeOutline!!
        }
        _accountEyeOutline = Builder(name = "AccountEyeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(12.21f, 12.0f, 14.0f, 10.21f, 14.0f, 8.0f)
                reflectiveCurveTo(12.21f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(6.0f, 5.79f, 6.0f, 8.0f)
                reflectiveCurveTo(7.79f, 12.0f, 10.0f, 12.0f)
                moveTo(10.0f, 6.0f)
                curveTo(11.11f, 6.0f, 12.0f, 6.9f, 12.0f, 8.0f)
                reflectiveCurveTo(11.11f, 10.0f, 10.0f, 10.0f)
                reflectiveCurveTo(8.0f, 9.11f, 8.0f, 8.0f)
                reflectiveCurveTo(8.9f, 6.0f, 10.0f, 6.0f)
                moveTo(9.27f, 20.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 14.33f, 7.33f, 13.0f, 10.0f, 13.0f)
                curveTo(11.04f, 13.0f, 12.5f, 13.21f, 13.86f, 13.61f)
                curveTo(13.0f, 13.95f, 12.2f, 14.42f, 11.5f, 15.0f)
                curveTo(11.0f, 14.94f, 10.5f, 14.9f, 10.0f, 14.9f)
                curveTo(7.03f, 14.9f, 3.9f, 16.36f, 3.9f, 17.0f)
                verticalLineTo(18.1f)
                horizontalLineTo(9.22f)
                curveTo(9.2f, 18.15f, 9.17f, 18.2f, 9.14f, 18.25f)
                lineTo(8.85f, 19.0f)
                lineTo(9.14f, 19.75f)
                curveTo(9.18f, 19.83f, 9.23f, 19.91f, 9.27f, 20.0f)
                moveTo(17.0f, 18.0f)
                curveTo(17.56f, 18.0f, 18.0f, 18.44f, 18.0f, 19.0f)
                reflectiveCurveTo(17.56f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.56f, 16.0f, 19.0f)
                reflectiveCurveTo(16.44f, 18.0f, 17.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                curveTo(14.27f, 15.0f, 11.94f, 16.66f, 11.0f, 19.0f)
                curveTo(11.94f, 21.34f, 14.27f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(22.06f, 21.34f, 23.0f, 19.0f)
                curveTo(22.06f, 16.66f, 19.73f, 15.0f, 17.0f, 15.0f)
                moveTo(17.0f, 21.5f)
                curveTo(15.62f, 21.5f, 14.5f, 20.38f, 14.5f, 19.0f)
                reflectiveCurveTo(15.62f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(19.5f, 17.62f, 19.5f, 19.0f)
                reflectiveCurveTo(18.38f, 21.5f, 17.0f, 21.5f)
                close()
            }
        }
        .build()
        return _accountEyeOutline!!
    }

private var _accountEyeOutline: ImageVector? = null
