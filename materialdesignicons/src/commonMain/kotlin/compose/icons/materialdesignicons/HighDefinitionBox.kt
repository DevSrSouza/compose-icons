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

public val MaterialDesignIcons.HighDefinitionBox: ImageVector
    get() {
        if (_highDefinitionBox != null) {
            return _highDefinitionBox!!
        }
        _highDefinitionBox = Builder(name = "HighDefinitionBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                moveTo(13.0f, 9.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _highDefinitionBox!!
    }

private var _highDefinitionBox: ImageVector? = null
