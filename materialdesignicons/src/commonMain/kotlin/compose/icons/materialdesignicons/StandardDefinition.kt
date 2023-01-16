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

public val MaterialDesignIcons.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) {
            return _standardDefinition!!
        }
        _standardDefinition = Builder(name = "StandardDefinition", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 7.0f)
                horizontalLineTo(16.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 19.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 16.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(7.0f)
                moveTo(16.0f, 15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 13.0f)
                verticalLineTo(15.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 11.0f)
                verticalLineTo(9.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
