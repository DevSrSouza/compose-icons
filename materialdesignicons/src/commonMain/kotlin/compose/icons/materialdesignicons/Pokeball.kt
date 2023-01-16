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

public val MaterialDesignIcons.Pokeball: ImageVector
    get() {
        if (_pokeball != null) {
            return _pokeball!!
        }
        _pokeball = Builder(name = "Pokeball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                moveTo(12.0f, 4.0f)
                curveTo(7.92f, 4.0f, 4.55f, 7.05f, 4.06f, 11.0f)
                horizontalLineTo(8.13f)
                curveTo(8.57f, 9.27f, 10.14f, 8.0f, 12.0f, 8.0f)
                curveTo(13.86f, 8.0f, 15.43f, 9.27f, 15.87f, 11.0f)
                horizontalLineTo(19.94f)
                curveTo(19.45f, 7.05f, 16.08f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 20.0f)
                curveTo(16.08f, 20.0f, 19.45f, 16.95f, 19.94f, 13.0f)
                horizontalLineTo(15.87f)
                curveTo(15.43f, 14.73f, 13.86f, 16.0f, 12.0f, 16.0f)
                curveTo(10.14f, 16.0f, 8.57f, 14.73f, 8.13f, 13.0f)
                horizontalLineTo(4.06f)
                curveTo(4.55f, 16.95f, 7.92f, 20.0f, 12.0f, 20.0f)
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                close()
            }
        }
        .build()
        return _pokeball!!
    }

private var _pokeball: ImageVector? = null
