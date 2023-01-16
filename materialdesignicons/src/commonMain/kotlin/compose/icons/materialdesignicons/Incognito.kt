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

public val MaterialDesignIcons.Incognito: ImageVector
    get() {
        if (_incognito != null) {
            return _incognito!!
        }
        _incognito = Builder(name = "Incognito", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.06f, 13.0f)
                curveTo(15.2f, 13.0f, 13.64f, 14.33f, 13.24f, 16.1f)
                curveTo(12.29f, 15.69f, 11.42f, 15.8f, 10.76f, 16.09f)
                curveTo(10.35f, 14.31f, 8.79f, 13.0f, 6.94f, 13.0f)
                curveTo(4.77f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                curveTo(3.0f, 19.21f, 4.77f, 21.0f, 6.94f, 21.0f)
                curveTo(9.0f, 21.0f, 10.68f, 19.38f, 10.84f, 17.32f)
                curveTo(11.18f, 17.08f, 12.07f, 16.63f, 13.16f, 17.34f)
                curveTo(13.34f, 19.39f, 15.0f, 21.0f, 17.06f, 21.0f)
                curveTo(19.23f, 21.0f, 21.0f, 19.21f, 21.0f, 17.0f)
                curveTo(21.0f, 14.79f, 19.23f, 13.0f, 17.06f, 13.0f)
                moveTo(6.94f, 19.86f)
                curveTo(5.38f, 19.86f, 4.13f, 18.58f, 4.13f, 17.0f)
                reflectiveCurveTo(5.39f, 14.14f, 6.94f, 14.14f)
                curveTo(8.5f, 14.14f, 9.75f, 15.42f, 9.75f, 17.0f)
                reflectiveCurveTo(8.5f, 19.86f, 6.94f, 19.86f)
                moveTo(17.06f, 19.86f)
                curveTo(15.5f, 19.86f, 14.25f, 18.58f, 14.25f, 17.0f)
                reflectiveCurveTo(15.5f, 14.14f, 17.06f, 14.14f)
                curveTo(18.62f, 14.14f, 19.88f, 15.42f, 19.88f, 17.0f)
                reflectiveCurveTo(18.61f, 19.86f, 17.06f, 19.86f)
                moveTo(22.0f, 10.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(10.5f)
                moveTo(15.53f, 2.63f)
                curveTo(15.31f, 2.14f, 14.75f, 1.88f, 14.22f, 2.05f)
                lineTo(12.0f, 2.79f)
                lineTo(9.77f, 2.05f)
                lineTo(9.72f, 2.04f)
                curveTo(9.19f, 1.89f, 8.63f, 2.17f, 8.43f, 2.68f)
                lineTo(6.0f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(15.56f, 2.68f)
                lineTo(15.53f, 2.63f)
                close()
            }
        }
        .build()
        return _incognito!!
    }

private var _incognito: ImageVector? = null
