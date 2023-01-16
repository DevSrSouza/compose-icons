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

public val MaterialDesignIcons.WeightGram: ImageVector
    get() {
        if (_weightGram != null) {
            return _weightGram!!
        }
        _weightGram = Builder(name = "WeightGram", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.95f, 10.56f)
                curveTo(19.75f, 9.67f, 18.95f, 9.0f, 18.0f, 9.0f)
                horizontalLineTo(15.46f)
                curveTo(15.81f, 8.41f, 16.0f, 7.73f, 16.0f, 7.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 3.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 7.0f)
                curveTo(8.0f, 7.73f, 8.19f, 8.41f, 8.54f, 9.0f)
                horizontalLineTo(6.0f)
                curveTo(5.05f, 9.0f, 4.25f, 9.67f, 4.05f, 10.56f)
                curveTo(2.04f, 18.57f, 2.0f, 18.78f, 2.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 19.0f)
                curveTo(22.0f, 18.78f, 21.96f, 18.57f, 19.95f, 10.56f)
                moveTo(12.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 5.0f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                curveTo(9.89f, 19.0f, 9.0f, 18.11f, 9.0f, 17.0f)
                verticalLineTo(13.0f)
                curveTo(9.0f, 11.89f, 9.89f, 11.0f, 11.0f, 11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _weightGram!!
    }

private var _weightGram: ImageVector? = null
