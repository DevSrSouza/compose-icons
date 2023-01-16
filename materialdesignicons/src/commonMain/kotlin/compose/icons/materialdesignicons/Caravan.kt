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

public val MaterialDesignIcons.Caravan: ImageVector
    get() {
        if (_caravan != null) {
            return _caravan!!
        }
        _caravan = Builder(name = "Caravan", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 17.0f)
                horizontalLineTo(7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 10.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 13.0f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 7.0f)
                horizontalLineTo(5.0f)
                moveTo(5.0f, 9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(9.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(10.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 16.0f)
                close()
            }
        }
        .build()
        return _caravan!!
    }

private var _caravan: ImageVector? = null
