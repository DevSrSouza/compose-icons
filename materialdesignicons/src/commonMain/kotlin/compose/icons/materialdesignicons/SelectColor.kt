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

public val MaterialDesignIcons.SelectColor: ImageVector
    get() {
        if (_selectColor != null) {
            return _selectColor!!
        }
        _selectColor = Builder(name = "SelectColor", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.88f, 3.0f)
                curveTo(3.38f, 3.06f, 3.0f, 3.5f, 3.0f, 4.0f)
                verticalLineTo(4.0f)
                lineTo(3.0f, 5.0f)
                horizontalLineTo(4.0f)
                lineTo(5.0f, 5.0f)
                verticalLineTo(4.0f)
                lineTo(5.0f, 3.0f)
                horizontalLineTo(4.0f)
                lineTo(3.88f, 3.0f)
                moveTo(7.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(7.0f)
                moveTo(11.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(11.0f)
                moveTo(15.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(15.0f)
                moveTo(19.0f, 3.0f)
                verticalLineTo(4.0f)
                lineTo(19.0f, 5.0f)
                horizontalLineTo(20.0f)
                lineTo(21.0f, 5.0f)
                verticalLineTo(4.0f)
                lineTo(21.0f, 3.88f)
                curveTo(20.94f, 3.38f, 20.5f, 3.0f, 20.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(3.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(3.0f)
                moveTo(19.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(19.0f)
                moveTo(3.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(3.0f)
                moveTo(19.31f, 12.0f)
                curveTo(19.18f, 12.0f, 19.05f, 12.05f, 18.95f, 12.14f)
                lineTo(17.39f, 13.71f)
                lineTo(16.43f, 12.75f)
                lineTo(15.72f, 13.46f)
                lineTo(16.43f, 14.17f)
                lineTo(11.97f, 18.63f)
                verticalLineTo(21.0f)
                horizontalLineTo(14.35f)
                lineTo(18.8f, 16.54f)
                lineTo(19.5f, 17.25f)
                lineTo(20.22f, 16.54f)
                lineTo(19.26f, 15.58f)
                lineTo(20.82f, 14.03f)
                curveTo(21.0f, 13.83f, 21.0f, 13.5f, 20.82f, 13.31f)
                lineTo(19.65f, 12.14f)
                curveTo(19.56f, 12.05f, 19.44f, 12.0f, 19.31f, 12.0f)
                moveTo(3.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                moveTo(17.0f, 15.0f)
                lineTo(17.97f, 15.97f)
                lineTo(13.93f, 20.0f)
                lineTo(12.97f, 19.04f)
                lineTo(17.0f, 15.0f)
                moveTo(3.0f, 19.0f)
                verticalLineTo(20.0f)
                lineTo(3.0f, 20.12f)
                curveTo(3.06f, 20.62f, 3.5f, 21.0f, 4.0f, 21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                lineTo(5.0f, 19.0f)
                horizontalLineTo(4.0f)
                lineTo(3.0f, 19.0f)
                moveTo(7.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _selectColor!!
    }

private var _selectColor: ImageVector? = null
