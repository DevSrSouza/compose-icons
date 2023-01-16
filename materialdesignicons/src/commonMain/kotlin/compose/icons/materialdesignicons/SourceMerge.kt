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

public val MaterialDesignIcons.SourceMerge: ImageVector
    get() {
        if (_sourceMerge != null) {
            return _sourceMerge!!
        }
        _sourceMerge = Builder(name = "SourceMerge", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 10.0f, 6.0f)
                curveTo(10.0f, 7.29f, 9.19f, 8.39f, 8.04f, 8.81f)
                curveTo(8.58f, 13.81f, 13.08f, 14.77f, 15.19f, 14.96f)
                curveTo(15.61f, 13.81f, 16.71f, 13.0f, 18.0f, 13.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 19.0f)
                curveTo(16.69f, 19.0f, 15.57f, 18.16f, 15.16f, 17.0f)
                curveTo(10.91f, 16.8f, 9.44f, 15.19f, 8.0f, 13.39f)
                verticalLineTo(15.17f)
                curveTo(9.17f, 15.58f, 10.0f, 16.69f, 10.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 4.0f, 18.0f)
                curveTo(4.0f, 16.69f, 4.83f, 15.58f, 6.0f, 15.17f)
                verticalLineTo(8.83f)
                curveTo(4.83f, 8.42f, 4.0f, 7.31f, 4.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 7.0f, 3.0f)
                moveTo(7.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 5.0f)
                moveTo(7.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 8.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 17.0f)
                moveTo(18.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 15.0f)
                close()
            }
        }
        .build()
        return _sourceMerge!!
    }

private var _sourceMerge: ImageVector? = null
