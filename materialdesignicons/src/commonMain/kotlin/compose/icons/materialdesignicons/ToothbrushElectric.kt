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

public val MaterialDesignIcons.ToothbrushElectric: ImageVector
    get() {
        if (_toothbrushElectric != null) {
            return _toothbrushElectric!!
        }
        _toothbrushElectric = Builder(name = "ToothbrushElectric", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.5f)
                verticalLineTo(14.0f)
                curveTo(10.34f, 14.0f, 9.0f, 15.34f, 9.0f, 17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(17.0f)
                curveTo(17.0f, 15.34f, 15.66f, 14.0f, 14.0f, 14.0f)
                verticalLineTo(3.5f)
                curveTo(14.0f, 2.4f, 13.11f, 1.5f, 12.0f, 1.5f)
                moveTo(7.5f, 2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.5f)
                moveTo(13.0f, 17.5f)
                curveTo(13.83f, 17.5f, 14.5f, 18.17f, 14.5f, 19.0f)
                curveTo(14.5f, 19.83f, 13.83f, 20.5f, 13.0f, 20.5f)
                curveTo(12.17f, 20.5f, 11.5f, 19.83f, 11.5f, 19.0f)
                curveTo(11.5f, 18.17f, 12.17f, 17.5f, 13.0f, 17.5f)
                close()
            }
        }
        .build()
        return _toothbrushElectric!!
    }

private var _toothbrushElectric: ImageVector? = null
