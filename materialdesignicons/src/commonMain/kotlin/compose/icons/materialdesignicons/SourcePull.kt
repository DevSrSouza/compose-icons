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

public val MaterialDesignIcons.SourcePull: ImageVector
    get() {
        if (_sourcePull != null) {
            return _sourcePull!!
        }
        _sourcePull = Builder(name = "SourcePull", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 9.0f, 6.0f)
                curveTo(9.0f, 7.31f, 8.17f, 8.42f, 7.0f, 8.83f)
                verticalLineTo(15.17f)
                curveTo(8.17f, 15.58f, 9.0f, 16.69f, 9.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 3.0f, 18.0f)
                curveTo(3.0f, 16.69f, 3.83f, 15.58f, 5.0f, 15.17f)
                verticalLineTo(8.83f)
                curveTo(3.83f, 8.42f, 3.0f, 7.31f, 3.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 6.0f, 3.0f)
                moveTo(6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 5.0f)
                moveTo(6.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 17.0f)
                moveTo(21.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 18.0f, 21.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 15.0f, 18.0f)
                curveTo(15.0f, 16.69f, 15.83f, 15.58f, 17.0f, 15.17f)
                verticalLineTo(7.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.25f)
                lineTo(10.75f, 6.0f)
                lineTo(15.0f, 1.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 7.0f)
                verticalLineTo(15.17f)
                curveTo(20.17f, 15.58f, 21.0f, 16.69f, 21.0f, 18.0f)
                moveTo(18.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 17.0f)
                close()
            }
        }
        .build()
        return _sourcePull!!
    }

private var _sourcePull: ImageVector? = null
