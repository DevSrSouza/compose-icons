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

public val MaterialDesignIcons.StadiumVariant: ImageVector
    get() {
        if (_stadiumVariant != null) {
            return _stadiumVariant!!
        }
        _stadiumVariant = Builder(name = "StadiumVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                horizontalLineTo(7.0f)
                lineTo(10.0f, 5.0f)
                lineTo(7.0f, 7.0f)
                verticalLineTo(8.33f)
                curveTo(8.47f, 8.12f, 10.18f, 8.0f, 12.0f, 8.0f)
                curveTo(13.82f, 8.0f, 15.53f, 8.12f, 17.0f, 8.33f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                lineTo(22.0f, 5.0f)
                lineTo(19.0f, 7.0f)
                verticalLineTo(8.71f)
                curveTo(20.85f, 9.17f, 22.0f, 9.8f, 22.0f, 10.5f)
                curveTo(22.0f, 11.88f, 17.5f, 13.0f, 12.0f, 13.0f)
                curveTo(6.5f, 13.0f, 2.0f, 11.88f, 2.0f, 10.5f)
                curveTo(2.0f, 9.8f, 3.15f, 9.17f, 5.0f, 8.71f)
                verticalLineTo(3.0f)
                moveTo(12.0f, 9.5f)
                curveTo(8.69f, 9.5f, 7.0f, 9.67f, 7.0f, 10.5f)
                curveTo(7.0f, 11.33f, 8.69f, 11.5f, 12.0f, 11.5f)
                curveTo(15.31f, 11.5f, 17.0f, 11.33f, 17.0f, 10.5f)
                curveTo(17.0f, 9.67f, 15.31f, 9.5f, 12.0f, 9.5f)
                moveTo(12.0f, 14.75f)
                curveTo(15.81f, 14.75f, 19.2f, 14.08f, 21.4f, 13.05f)
                lineTo(20.0f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 13.0f, 17.0f)
                horizontalLineTo(11.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 9.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(4.0f)
                lineTo(2.6f, 13.05f)
                curveTo(4.8f, 14.08f, 8.19f, 14.75f, 12.0f, 14.75f)
                close()
            }
        }
        .build()
        return _stadiumVariant!!
    }

private var _stadiumVariant: ImageVector? = null
