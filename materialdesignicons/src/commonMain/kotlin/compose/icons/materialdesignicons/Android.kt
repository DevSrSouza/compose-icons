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

public val MaterialDesignIcons.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.61f, 15.15f)
                curveTo(16.15f, 15.15f, 15.77f, 14.78f, 15.77f, 14.32f)
                reflectiveCurveTo(16.15f, 13.5f, 16.61f, 13.5f)
                horizontalLineTo(16.61f)
                curveTo(17.07f, 13.5f, 17.45f, 13.86f, 17.45f, 14.32f)
                curveTo(17.45f, 14.78f, 17.07f, 15.15f, 16.61f, 15.15f)
                moveTo(7.41f, 15.15f)
                curveTo(6.95f, 15.15f, 6.57f, 14.78f, 6.57f, 14.32f)
                curveTo(6.57f, 13.86f, 6.95f, 13.5f, 7.41f, 13.5f)
                horizontalLineTo(7.41f)
                curveTo(7.87f, 13.5f, 8.24f, 13.86f, 8.24f, 14.32f)
                curveTo(8.24f, 14.78f, 7.87f, 15.15f, 7.41f, 15.15f)
                moveTo(16.91f, 10.14f)
                lineTo(18.58f, 7.26f)
                curveTo(18.67f, 7.09f, 18.61f, 6.88f, 18.45f, 6.79f)
                curveTo(18.28f, 6.69f, 18.07f, 6.75f, 18.0f, 6.92f)
                lineTo(16.29f, 9.83f)
                curveTo(14.95f, 9.22f, 13.5f, 8.9f, 12.0f, 8.91f)
                curveTo(10.47f, 8.91f, 9.0f, 9.24f, 7.73f, 9.82f)
                lineTo(6.04f, 6.91f)
                curveTo(5.95f, 6.74f, 5.74f, 6.68f, 5.57f, 6.78f)
                curveTo(5.4f, 6.87f, 5.35f, 7.08f, 5.44f, 7.25f)
                lineTo(7.1f, 10.13f)
                curveTo(4.25f, 11.69f, 2.29f, 14.58f, 2.0f, 18.0f)
                horizontalLineTo(22.0f)
                curveTo(21.72f, 14.59f, 19.77f, 11.7f, 16.91f, 10.14f)
                horizontalLineTo(16.91f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
