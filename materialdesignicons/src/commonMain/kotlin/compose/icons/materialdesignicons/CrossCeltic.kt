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

public val MaterialDesignIcons.CrossCeltic: ImageVector
    get() {
        if (_crossCeltic != null) {
            return _crossCeltic!!
        }
        _crossCeltic = Builder(name = "CrossCeltic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 8.0f)
                curveTo(17.26f, 5.89f, 15.61f, 4.24f, 13.5f, 3.7f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(3.7f)
                curveTo(8.39f, 4.24f, 6.74f, 5.89f, 6.2f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(6.2f)
                curveTo(6.74f, 13.11f, 8.39f, 14.76f, 10.5f, 15.3f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.3f)
                curveTo(15.61f, 14.76f, 17.26f, 13.11f, 17.8f, 11.0f)
                horizontalLineTo(19.97f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.8f)
                moveTo(12.04f, 9.53f)
                lineTo(14.5f, 11.0f)
                horizontalLineTo(15.76f)
                curveTo(15.35f, 12.03f, 14.53f, 12.84f, 13.5f, 13.26f)
                verticalLineTo(12.0f)
                lineTo(12.06f, 9.56f)
                lineTo(12.0f, 9.5f)
                lineTo(11.94f, 9.56f)
                lineTo(10.5f, 12.0f)
                verticalLineTo(13.26f)
                curveTo(9.47f, 12.84f, 8.66f, 12.03f, 8.24f, 11.0f)
                horizontalLineTo(9.5f)
                lineTo(11.96f, 9.53f)
                lineTo(12.0f, 9.5f)
                horizontalLineTo(11.96f)
                lineTo(9.5f, 8.0f)
                horizontalLineTo(8.24f)
                curveTo(8.65f, 6.97f, 9.47f, 6.16f, 10.5f, 5.74f)
                verticalLineTo(7.0f)
                lineTo(11.94f, 9.44f)
                lineTo(12.0f, 9.5f)
                lineTo(12.06f, 9.44f)
                lineTo(13.5f, 7.0f)
                verticalLineTo(5.74f)
                curveTo(14.53f, 6.16f, 15.35f, 6.97f, 15.76f, 8.0f)
                horizontalLineTo(14.5f)
                lineTo(12.04f, 9.5f)
                horizontalLineTo(12.0f)
                lineTo(12.04f, 9.53f)
                close()
            }
        }
        .build()
        return _crossCeltic!!
    }

private var _crossCeltic: ImageVector? = null
