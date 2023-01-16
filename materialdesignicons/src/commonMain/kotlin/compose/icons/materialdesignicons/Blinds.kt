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

public val MaterialDesignIcons.Blinds: ImageVector
    get() {
        if (_blinds != null) {
            return _blinds!!
        }
        _blinds = Builder(name = "Blinds", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 2.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 3.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.17f)
                curveTo(14.17f, 16.58f, 15.0f, 17.69f, 15.0f, 19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 19.0f)
                curveTo(9.0f, 17.69f, 9.83f, 16.58f, 11.0f, 16.17f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 5.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 2.0f)
                moveTo(12.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 12.0f, 18.0f)
                close()
            }
        }
        .build()
        return _blinds!!
    }

private var _blinds: ImageVector? = null
