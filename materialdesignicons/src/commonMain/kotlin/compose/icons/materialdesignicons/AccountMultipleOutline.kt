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

public val MaterialDesignIcons.AccountMultipleOutline: ImageVector
    get() {
        if (_accountMultipleOutline != null) {
            return _accountMultipleOutline!!
        }
        _accountMultipleOutline = Builder(name = "AccountMultipleOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.07f, 10.41f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 13.07f, 4.59f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 15.0f, 4.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.0f, 11.0f)
                arcTo(3.39f, 3.39f, 0.0f, false, true, 13.07f, 10.41f)
                moveTo(5.5f, 7.5f)
                arcTo(3.5f, 3.5f, 0.0f, true, true, 9.0f, 11.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.5f, 7.5f)
                moveTo(7.5f, 7.5f)
                arcTo(1.5f, 1.5f, 0.0f, true, false, 9.0f, 6.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.5f, 7.5f)
                moveTo(16.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                reflectiveCurveTo(2.0f, 13.0f, 9.0f, 13.0f)
                reflectiveCurveTo(16.0f, 17.0f, 16.0f, 17.0f)
                moveTo(14.0f, 17.0f)
                curveTo(13.86f, 16.22f, 12.67f, 15.0f, 9.0f, 15.0f)
                reflectiveCurveTo(4.07f, 16.31f, 4.0f, 17.0f)
                moveTo(15.95f, 13.0f)
                arcTo(5.32f, 5.32f, 0.0f, false, true, 18.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                reflectiveCurveTo(22.0f, 13.37f, 15.94f, 13.0f)
                close()
            }
        }
        .build()
        return _accountMultipleOutline!!
    }

private var _accountMultipleOutline: ImageVector? = null
