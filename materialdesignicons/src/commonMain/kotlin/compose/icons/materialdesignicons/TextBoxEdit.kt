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

public val MaterialDesignIcons.TextBoxEdit: ImageVector
    get() {
        if (_textBoxEdit != null) {
            return _textBoxEdit!!
        }
        _textBoxEdit = Builder(name = "TextBoxEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 19.11f)
                lineTo(12.11f, 17.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.12f)
                lineTo(16.12f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.12f)
                lineTo(18.24f, 10.89f)
                curveTo(18.72f, 10.41f, 19.35f, 10.14f, 20.04f, 10.14f)
                curveTo(20.37f, 10.14f, 20.7f, 10.21f, 21.0f, 10.33f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.11f)
                moveTo(7.0f, 7.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                moveTo(21.7f, 14.35f)
                lineTo(20.7f, 15.35f)
                lineTo(18.65f, 13.3f)
                lineTo(19.65f, 12.3f)
                curveTo(19.86f, 12.09f, 20.21f, 12.09f, 20.42f, 12.3f)
                lineTo(21.7f, 13.58f)
                curveTo(21.91f, 13.79f, 21.91f, 14.14f, 21.7f, 14.35f)
                moveTo(12.0f, 19.94f)
                lineTo(18.06f, 13.88f)
                lineTo(20.11f, 15.93f)
                lineTo(14.06f, 22.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.94f)
                close()
            }
        }
        .build()
        return _textBoxEdit!!
    }

private var _textBoxEdit: ImageVector? = null
