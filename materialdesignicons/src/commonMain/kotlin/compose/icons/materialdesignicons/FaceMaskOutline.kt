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

public val MaterialDesignIcons.FaceMaskOutline: ImageVector
    get() {
        if (_faceMaskOutline != null) {
            return _faceMaskOutline!!
        }
        _faceMaskOutline = Builder(name = "FaceMaskOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 12.0f)
                lineTo(12.4f, 11.3f)
                curveTo(12.1f, 11.2f, 11.8f, 11.2f, 11.6f, 11.3f)
                lineTo(9.0f, 12.0f)
                verticalLineTo(11.0f)
                lineTo(11.3f, 10.3f)
                curveTo(11.7f, 10.2f, 12.2f, 10.2f, 12.7f, 10.3f)
                lineTo(15.0f, 11.0f)
                verticalLineTo(12.0f)
                moveTo(20.25f, 6.0f)
                curveTo(18.79f, 6.0f, 17.61f, 7.14f, 17.5f, 8.58f)
                lineTo(12.55f, 7.16f)
                curveTo(12.37f, 7.11f, 12.19f, 7.08f, 12.0f, 7.08f)
                curveTo(11.82f, 7.08f, 11.63f, 7.11f, 11.45f, 7.16f)
                lineTo(6.5f, 8.58f)
                curveTo(6.39f, 7.14f, 5.21f, 6.0f, 3.75f, 6.0f)
                curveTo(2.23f, 6.0f, 1.0f, 7.23f, 1.0f, 8.75f)
                verticalLineTo(12.25f)
                curveTo(1.0f, 13.77f, 2.23f, 15.0f, 3.75f, 15.0f)
                horizontalLineTo(5.68f)
                curveTo(6.81f, 17.36f, 9.21f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(17.19f, 17.36f, 18.32f, 15.0f)
                horizontalLineTo(20.25f)
                curveTo(21.77f, 15.0f, 23.0f, 13.77f, 23.0f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(23.0f, 7.23f, 21.77f, 6.0f, 20.25f, 6.0f)
                moveTo(5.0f, 13.5f)
                horizontalLineTo(3.75f)
                curveTo(3.06f, 13.5f, 2.5f, 12.94f, 2.5f, 12.25f)
                verticalLineTo(8.75f)
                curveTo(2.5f, 8.06f, 3.06f, 7.5f, 3.75f, 7.5f)
                reflectiveCurveTo(5.0f, 8.06f, 5.0f, 8.75f)
                verticalLineTo(13.5f)
                moveTo(17.0f, 12.0f)
                curveTo(17.0f, 14.76f, 14.76f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(7.0f, 14.76f, 7.0f, 12.0f)
                lineTo(7.0f, 10.5f)
                lineTo(12.0f, 9.08f)
                horizontalLineTo(12.0f)
                lineTo(17.0f, 10.5f)
                verticalLineTo(12.0f)
                moveTo(21.5f, 12.25f)
                curveTo(21.5f, 12.94f, 20.94f, 13.5f, 20.25f, 13.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.75f)
                curveTo(19.0f, 8.06f, 19.56f, 7.5f, 20.25f, 7.5f)
                reflectiveCurveTo(21.5f, 8.06f, 21.5f, 8.75f)
                verticalLineTo(12.25f)
                close()
            }
        }
        .build()
        return _faceMaskOutline!!
    }

private var _faceMaskOutline: ImageVector? = null
