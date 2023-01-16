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

public val MaterialDesignIcons.CodeJson: ImageVector
    get() {
        if (_codeJson != null) {
            return _codeJson!!
        }
        _codeJson = Builder(name = "CodeJson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 14.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.93f, 20.73f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 1.0f, 13.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 9.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 23.0f, 11.0f)
                horizontalLineTo(24.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 15.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                moveTo(12.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 15.0f)
                moveTo(8.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 15.0f)
                moveTo(16.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _codeJson!!
    }

private var _codeJson: ImageVector? = null
