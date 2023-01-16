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

public val MaterialDesignIcons.StoreCheckOutline: ImageVector
    get() {
        if (_storeCheckOutline != null) {
            return _storeCheckOutline!!
        }
        _storeCheckOutline = Builder(name = "StoreCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 13.0f)
                curveTo(19.7f, 13.0f, 20.37f, 13.13f, 21.0f, 13.35f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 7.0f)
                horizontalLineTo(4.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                curveTo(13.04f, 19.67f, 13.0f, 19.34f, 13.0f, 19.0f)
                curveTo(13.0f, 17.77f, 13.37f, 16.64f, 14.0f, 15.69f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.69f)
                curveTo(16.64f, 13.37f, 17.77f, 13.0f, 19.0f, 13.0f)
                moveTo(12.0f, 18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                moveTo(5.04f, 12.0f)
                lineTo(5.64f, 9.0f)
                horizontalLineTo(18.36f)
                lineTo(18.96f, 12.0f)
                horizontalLineTo(5.04f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(22.5f, 17.25f)
                lineTo(17.75f, 22.0f)
                lineTo(15.0f, 19.0f)
                lineTo(16.16f, 17.84f)
                lineTo(17.75f, 19.43f)
                lineTo(21.34f, 15.84f)
                lineTo(22.5f, 17.25f)
            }
        }
        .build()
        return _storeCheckOutline!!
    }

private var _storeCheckOutline: ImageVector? = null
