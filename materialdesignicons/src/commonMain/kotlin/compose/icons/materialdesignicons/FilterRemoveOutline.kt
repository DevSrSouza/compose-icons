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

public val MaterialDesignIcons.FilterRemoveOutline: ImageVector
    get() {
        if (_filterRemoveOutline != null) {
            return _filterRemoveOutline!!
        }
        _filterRemoveOutline = Builder(name = "FilterRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.73f, 20.83f)
                lineTo(17.58f, 18.0f)
                lineTo(14.73f, 15.17f)
                lineTo(16.15f, 13.76f)
                lineTo(19.0f, 16.57f)
                lineTo(21.8f, 13.76f)
                lineTo(23.22f, 15.17f)
                lineTo(20.41f, 18.0f)
                lineTo(23.22f, 20.83f)
                lineTo(21.8f, 22.24f)
                lineTo(19.0f, 19.4f)
                lineTo(16.15f, 22.24f)
                lineTo(14.73f, 20.83f)
                moveTo(13.0f, 19.88f)
                curveTo(13.04f, 20.18f, 12.94f, 20.5f, 12.71f, 20.71f)
                curveTo(12.32f, 21.1f, 11.69f, 21.1f, 11.3f, 20.71f)
                lineTo(7.29f, 16.7f)
                curveTo(7.06f, 16.47f, 6.96f, 16.16f, 7.0f, 15.87f)
                verticalLineTo(10.75f)
                lineTo(2.21f, 4.62f)
                curveTo(1.87f, 4.19f, 1.95f, 3.56f, 2.38f, 3.22f)
                curveTo(2.57f, 3.08f, 2.78f, 3.0f, 3.0f, 3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(3.0f)
                curveTo(17.22f, 3.0f, 17.43f, 3.08f, 17.62f, 3.22f)
                curveTo(18.05f, 3.56f, 18.13f, 4.19f, 17.79f, 4.62f)
                lineTo(13.0f, 10.75f)
                verticalLineTo(19.88f)
                moveTo(5.04f, 5.0f)
                lineTo(9.0f, 10.06f)
                verticalLineTo(15.58f)
                lineTo(11.0f, 17.58f)
                verticalLineTo(10.05f)
                lineTo(14.96f, 5.0f)
                horizontalLineTo(5.04f)
                close()
            }
        }
        .build()
        return _filterRemoveOutline!!
    }

private var _filterRemoveOutline: ImageVector? = null
