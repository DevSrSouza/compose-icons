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

public val MaterialDesignIcons.Baby: ImageVector
    get() {
        if (_baby != null) {
            return _baby!!
        }
        _baby = Builder(name = "Baby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 4.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 21.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 9.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 4.0f)
                moveTo(4.5f, 20.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 3.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 17.0f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 13.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 20.0f)
                horizontalLineTo(4.5f)
                moveTo(16.09f, 19.0f)
                lineTo(14.69f, 15.0f)
                horizontalLineTo(11.0f)
                lineTo(6.75f, 10.75f)
                curveTo(6.75f, 10.75f, 9.0f, 8.25f, 12.5f, 8.25f)
                curveTo(15.5f, 8.25f, 15.85f, 9.25f, 16.06f, 9.87f)
                lineTo(18.92f, 18.0f)
                curveTo(19.2f, 18.78f, 18.78f, 19.64f, 18.0f, 19.92f)
                curveTo(17.22f, 20.19f, 16.36f, 19.78f, 16.09f, 19.0f)
                close()
            }
        }
        .build()
        return _baby!!
    }

private var _baby: ImageVector? = null
