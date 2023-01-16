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

public val MaterialDesignIcons.Leek: ImageVector
    get() {
        if (_leek != null) {
            return _leek!!
        }
        _leek = Builder(name = "Leek", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                verticalLineTo(5.55f)
                lineTo(12.0f, 7.55f)
                lineTo(14.0f, 5.55f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                moveTo(6.34f, 4.0f)
                lineTo(3.87f, 6.5f)
                lineTo(15.0f, 17.62f)
                verticalLineTo(12.67f)
                lineTo(6.34f, 4.0f)
                moveTo(17.66f, 4.0f)
                lineTo(13.06f, 8.61f)
                lineTo(15.54f, 11.09f)
                lineTo(20.13f, 6.5f)
                lineTo(17.66f, 4.0f)
                moveTo(9.0f, 13.74f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 15.0f, 20.0f)
                verticalLineTo(19.74f)
                lineTo(13.0f, 17.74f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.74f)
                lineTo(9.0f, 13.74f)
                close()
            }
        }
        .build()
        return _leek!!
    }

private var _leek: ImageVector? = null
