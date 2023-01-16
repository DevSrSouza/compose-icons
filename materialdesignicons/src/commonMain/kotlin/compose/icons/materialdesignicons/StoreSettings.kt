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

public val MaterialDesignIcons.StoreSettings: ImageVector
    get() {
        if (_storeSettings != null) {
            return _storeSettings!!
        }
        _storeSettings = Builder(name = "StoreSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(21.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 12.0f)
                moveTo(12.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _storeSettings!!
    }

private var _storeSettings: ImageVector? = null
