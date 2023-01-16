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

public val MaterialDesignIcons.StorePlus: ImageVector
    get() {
        if (_storePlus != null) {
            return _storePlus!!
        }
        _storePlus = Builder(name = "StorePlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(4.0f)
                moveTo(4.0f, 7.0f)
                lineTo(3.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.0f)
                curveTo(12.95f, 19.66f, 12.92f, 19.31f, 12.92f, 18.95f)
                curveTo(12.92f, 17.73f, 13.3f, 16.53f, 14.0f, 15.53f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.54f)
                curveTo(16.54f, 13.33f, 17.71f, 12.96f, 18.91f, 12.96f)
                curveTo(19.62f, 12.96f, 20.33f, 13.09f, 21.0f, 13.34f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 7.0f)
                moveTo(6.0f, 14.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
            }
        }
        .build()
        return _storePlus!!
    }

private var _storePlus: ImageVector? = null
