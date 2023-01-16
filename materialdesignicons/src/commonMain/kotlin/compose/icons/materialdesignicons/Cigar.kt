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

public val MaterialDesignIcons.Cigar: ImageVector
    get() {
        if (_cigar != null) {
            return _cigar!!
        }
        _cigar = Builder(name = "Cigar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.2f)
                horizontalLineTo(14.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.65f, 8.2f)
                arcTo(1.78f, 1.78f, 0.0f, false, true, 14.5f, 6.45f)
                verticalLineTo(5.0f)
                arcTo(3.35f, 3.35f, 0.0f, true, false, 14.5f, 11.7f)
                horizontalLineTo(16.0f)
                arcTo(1.93f, 1.93f, 0.0f, false, true, 18.0f, 13.7f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.36f)
                arcTo(3.31f, 3.31f, 0.0f, false, false, 16.0f, 10.2f)
                moveTo(18.82f, 7.73f)
                arcTo(3.34f, 3.34f, 0.0f, false, false, 16.5f, 2.0f)
                verticalLineTo(3.5f)
                arcTo(1.85f, 1.85f, 0.0f, true, true, 16.5f, 7.2f)
                verticalLineTo(8.7f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 20.5f, 12.77f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.76f)
                arcTo(5.55f, 5.55f, 0.0f, false, false, 18.85f, 7.73f)
                moveTo(18.0f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(16.0f)
                moveTo(20.5f, 16.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                moveTo(12.0f, 16.0f)
                verticalLineTo(17.27f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 20.73f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                moveTo(2.88f, 16.88f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 5.0f, 22.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.73f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 17.27f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.88f, 16.88f)
                moveTo(12.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 11.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cigar!!
    }

private var _cigar: ImageVector? = null
