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

public val MaterialDesignIcons.CodeString: ImageVector
    get() {
        if (_codeString != null) {
            return _codeString!!
        }
        _codeString = Builder(name = "CodeString", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                moveTo(12.5f, 11.0f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 9.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.5f, 8.0f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 9.5f)
                horizontalLineTo(16.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 6.0f)
                horizontalLineTo(11.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 9.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 13.0f)
                horizontalLineTo(12.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 14.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 12.5f, 16.0f)
                horizontalLineTo(11.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 10.0f, 14.5f)
                horizontalLineTo(8.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 11.5f, 18.0f)
                horizontalLineTo(12.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 16.0f, 14.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 12.5f, 11.0f)
                close()
            }
        }
        .build()
        return _codeString!!
    }

private var _codeString: ImageVector? = null
