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

public val MaterialDesignIcons.DatabaseAlert: ImageVector
    get() {
        if (_databaseAlert != null) {
            return _databaseAlert!!
        }
        _databaseAlert = Builder(name = "DatabaseAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 7.0f)
                curveTo(18.0f, 9.21f, 14.42f, 11.0f, 10.0f, 11.0f)
                reflectiveCurveTo(2.0f, 9.21f, 2.0f, 7.0f)
                reflectiveCurveTo(5.58f, 3.0f, 10.0f, 3.0f)
                reflectiveCurveTo(18.0f, 4.79f, 18.0f, 7.0f)
                moveTo(10.0f, 18.0f)
                curveTo(5.58f, 18.0f, 2.0f, 16.21f, 2.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(2.0f, 19.21f, 5.58f, 21.0f, 10.0f, 21.0f)
                reflectiveCurveTo(18.0f, 19.21f, 18.0f, 17.0f)
                verticalLineTo(14.0f)
                curveTo(18.0f, 16.21f, 14.42f, 18.0f, 10.0f, 18.0f)
                moveTo(10.0f, 13.0f)
                curveTo(5.58f, 13.0f, 2.0f, 11.21f, 2.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(2.0f, 14.21f, 5.58f, 16.0f, 10.0f, 16.0f)
                reflectiveCurveTo(18.0f, 14.21f, 18.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 11.21f, 14.42f, 13.0f, 10.0f, 13.0f)
                moveTo(20.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                moveTo(20.0f, 7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _databaseAlert!!
    }

private var _databaseAlert: ImageVector? = null
