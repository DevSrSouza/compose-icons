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

public val MaterialDesignIcons.FridgeAlert: ImageVector
    get() {
        if (_fridgeAlert != null) {
            return _fridgeAlert!!
        }
        _fridgeAlert = Builder(name = "FridgeAlert", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 2.0f, 17.0f, 2.9f, 17.0f, 4.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                curveTo(3.0f, 2.9f, 3.9f, 2.0f, 5.0f, 2.0f)
                moveTo(17.0f, 19.0f)
                curveTo(17.0f, 20.11f, 16.11f, 21.0f, 15.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(21.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                moveTo(6.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 12.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.0f)
                moveTo(19.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                moveTo(19.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _fridgeAlert!!
    }

private var _fridgeAlert: ImageVector? = null
