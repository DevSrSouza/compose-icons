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

public val MaterialDesignIcons.Translate: ImageVector
    get() {
        if (_translate != null) {
            return _translate!!
        }
        _translate = Builder(name = "Translate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.87f, 15.07f)
                lineTo(10.33f, 12.56f)
                lineTo(10.36f, 12.53f)
                curveTo(12.1f, 10.59f, 13.34f, 8.36f, 14.07f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(12.17f)
                curveTo(11.5f, 7.92f, 10.44f, 9.75f, 9.0f, 11.35f)
                curveTo(8.07f, 10.32f, 7.3f, 9.19f, 6.69f, 8.0f)
                horizontalLineTo(4.69f)
                curveTo(5.42f, 9.63f, 6.42f, 11.17f, 7.67f, 12.56f)
                lineTo(2.58f, 17.58f)
                lineTo(4.0f, 19.0f)
                lineTo(9.0f, 14.0f)
                lineTo(12.11f, 17.11f)
                lineTo(12.87f, 15.07f)
                moveTo(18.5f, 10.0f)
                horizontalLineTo(16.5f)
                lineTo(12.0f, 22.0f)
                horizontalLineTo(14.0f)
                lineTo(15.12f, 19.0f)
                horizontalLineTo(19.87f)
                lineTo(21.0f, 22.0f)
                horizontalLineTo(23.0f)
                lineTo(18.5f, 10.0f)
                moveTo(15.88f, 17.0f)
                lineTo(17.5f, 12.67f)
                lineTo(19.12f, 17.0f)
                horizontalLineTo(15.88f)
                close()
            }
        }
        .build()
        return _translate!!
    }

private var _translate: ImageVector? = null
