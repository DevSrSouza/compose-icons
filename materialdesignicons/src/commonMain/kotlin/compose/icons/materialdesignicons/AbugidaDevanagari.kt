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

public val MaterialDesignIcons.AbugidaDevanagari: ImageVector
    get() {
        if (_abugidaDevanagari != null) {
            return _abugidaDevanagari!!
        }
        _abugidaDevanagari = Builder(name = "AbugidaDevanagari", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                curveTo(12.32f, 5.0f, 13.41f, 5.83f, 13.82f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(12.0f)
                curveTo(9.25f, 10.0f, 7.0f, 12.25f, 7.0f, 15.0f)
                curveTo(7.0f, 17.75f, 9.25f, 20.0f, 12.0f, 20.0f)
                curveTo(12.77f, 20.0f, 13.45f, 19.73f, 14.0f, 19.3f)
                verticalLineTo(21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                curveTo(13.55f, 17.62f, 12.83f, 18.0f, 12.0f, 18.0f)
                curveTo(10.33f, 18.0f, 9.0f, 16.67f, 9.0f, 15.0f)
                curveTo(9.0f, 13.33f, 10.33f, 12.0f, 12.0f, 12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.9f)
                curveTo(15.43f, 4.72f, 13.41f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _abugidaDevanagari!!
    }

private var _abugidaDevanagari: ImageVector? = null
