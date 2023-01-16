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

public val MaterialDesignIcons.CodeBraces: ImageVector
    get() {
        if (_codeBraces != null) {
            return _codeBraces!!
        }
        _codeBraces = Builder(name = "CodeBraces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 5.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 11.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 6.0f, 15.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(3.0f)
                moveTo(16.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 5.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 15.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 21.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 16.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _codeBraces!!
    }

private var _codeBraces: ImageVector? = null
