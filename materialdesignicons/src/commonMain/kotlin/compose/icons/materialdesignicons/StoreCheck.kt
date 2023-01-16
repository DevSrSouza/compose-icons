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

public val MaterialDesignIcons.StoreCheck: ImageVector
    get() {
        if (_storeCheck != null) {
            return _storeCheck!!
        }
        _storeCheck = Builder(name = "StoreCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(15.69f, 14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.69f)
                curveTo(13.37f, 16.64f, 13.0f, 17.77f, 13.0f, 19.0f)
                curveTo(13.0f, 19.34f, 13.04f, 19.67f, 13.09f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(12.0f)
                lineTo(4.0f, 7.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 12.0f)
                verticalLineTo(13.35f)
                curveTo(20.37f, 13.13f, 19.7f, 13.0f, 19.0f, 13.0f)
                curveTo(17.77f, 13.0f, 16.64f, 13.37f, 15.69f, 14.0f)
                moveTo(12.0f, 14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                moveTo(21.34f, 15.84f)
                lineTo(17.75f, 19.43f)
                lineTo(16.16f, 17.84f)
                lineTo(15.0f, 19.0f)
                lineTo(17.75f, 22.0f)
                lineTo(22.5f, 17.25f)
                lineTo(21.34f, 15.84f)
                close()
            }
        }
        .build()
        return _storeCheck!!
    }

private var _storeCheck: ImageVector? = null
