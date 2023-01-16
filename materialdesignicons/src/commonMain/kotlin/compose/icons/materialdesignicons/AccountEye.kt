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

public val MaterialDesignIcons.AccountEye: ImageVector
    get() {
        if (_accountEye != null) {
            return _accountEye!!
        }
        _accountEye = Builder(name = "AccountEye", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 8.0f)
                curveTo(6.0f, 5.79f, 7.79f, 4.0f, 10.0f, 4.0f)
                reflectiveCurveTo(14.0f, 5.79f, 14.0f, 8.0f)
                reflectiveCurveTo(12.21f, 12.0f, 10.0f, 12.0f)
                reflectiveCurveTo(6.0f, 10.21f, 6.0f, 8.0f)
                moveTo(9.14f, 19.75f)
                lineTo(8.85f, 19.0f)
                lineTo(9.14f, 18.25f)
                curveTo(9.84f, 16.5f, 11.08f, 15.14f, 12.61f, 14.22f)
                curveTo(11.79f, 14.08f, 10.92f, 14.0f, 10.0f, 14.0f)
                curveTo(5.58f, 14.0f, 2.0f, 15.79f, 2.0f, 18.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.27f)
                curveTo(9.23f, 19.91f, 9.18f, 19.83f, 9.14f, 19.75f)
                moveTo(17.0f, 18.0f)
                curveTo(16.44f, 18.0f, 16.0f, 18.44f, 16.0f, 19.0f)
                reflectiveCurveTo(16.44f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(18.0f, 19.56f, 18.0f, 19.0f)
                reflectiveCurveTo(17.56f, 18.0f, 17.0f, 18.0f)
                moveTo(23.0f, 19.0f)
                curveTo(22.06f, 21.34f, 19.73f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(11.94f, 21.34f, 11.0f, 19.0f)
                curveTo(11.94f, 16.66f, 14.27f, 15.0f, 17.0f, 15.0f)
                reflectiveCurveTo(22.06f, 16.66f, 23.0f, 19.0f)
                moveTo(19.5f, 19.0f)
                curveTo(19.5f, 17.62f, 18.38f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(14.5f, 17.62f, 14.5f, 19.0f)
                reflectiveCurveTo(15.62f, 21.5f, 17.0f, 21.5f)
                reflectiveCurveTo(19.5f, 20.38f, 19.5f, 19.0f)
                close()
            }
        }
        .build()
        return _accountEye!!
    }

private var _accountEye: ImageVector? = null
