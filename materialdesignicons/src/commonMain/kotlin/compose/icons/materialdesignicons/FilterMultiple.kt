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

public val MaterialDesignIcons.FilterMultiple: ImageVector
    get() {
        if (_filterMultiple != null) {
            return _filterMultiple!!
        }
        _filterMultiple = Builder(name = "FilterMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.46f, 5.0f)
                curveTo(3.25f, 5.0f, 3.04f, 5.08f, 2.87f, 5.21f)
                curveTo(2.43f, 5.55f, 2.35f, 6.18f, 2.69f, 6.61f)
                lineTo(2.69f, 6.62f)
                lineTo(8.0f, 13.42f)
                verticalLineTo(19.41f)
                lineTo(10.29f, 21.71f)
                curveTo(10.68f, 22.1f, 11.32f, 22.1f, 11.71f, 21.71f)
                curveTo(12.1f, 21.32f, 12.1f, 20.68f, 11.71f, 20.29f)
                lineTo(10.0f, 18.59f)
                verticalLineTo(12.73f)
                lineTo(4.27f, 5.39f)
                curveTo(4.08f, 5.14f, 3.78f, 5.0f, 3.46f, 5.0f)
                moveTo(16.0f, 12.0f)
                verticalLineTo(19.88f)
                curveTo(16.04f, 20.18f, 15.94f, 20.5f, 15.71f, 20.71f)
                curveTo(15.32f, 21.1f, 14.69f, 21.1f, 14.3f, 20.71f)
                lineTo(12.29f, 18.7f)
                curveTo(12.06f, 18.47f, 11.96f, 18.16f, 12.0f, 17.87f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.97f)
                lineTo(6.21f, 4.62f)
                curveTo(5.87f, 4.19f, 5.95f, 3.56f, 6.38f, 3.22f)
                curveTo(6.57f, 3.08f, 6.78f, 3.0f, 7.0f, 3.0f)
                horizontalLineTo(21.0f)
                curveTo(21.22f, 3.0f, 21.43f, 3.08f, 21.62f, 3.22f)
                curveTo(22.05f, 3.56f, 22.13f, 4.19f, 21.79f, 4.62f)
                lineTo(16.03f, 12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _filterMultiple!!
    }

private var _filterMultiple: ImageVector? = null
