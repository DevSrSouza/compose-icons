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

public val MaterialDesignIcons.Kettle: ImageVector
    get() {
        if (_kettle != null) {
            return _kettle!!
        }
        _kettle = Builder(name = "Kettle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 3.0f)
                curveTo(7.81f, 3.0f, 4.0f, 5.69f, 4.0f, 9.0f)
                verticalLineTo(9.0f)
                curveTo(4.0f, 10.19f, 4.5f, 11.34f, 5.44f, 12.33f)
                curveTo(4.53f, 13.5f, 4.0f, 14.96f, 4.0f, 16.5f)
                curveTo(4.0f, 17.64f, 4.0f, 18.83f, 4.0f, 20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 22.0f, 21.0f, 21.11f, 21.0f, 20.0f)
                curveTo(21.0f, 18.85f, 21.0f, 17.61f, 21.0f, 16.5f)
                curveTo(21.0f, 15.28f, 20.66f, 14.07f, 20.0f, 13.0f)
                lineTo(22.0f, 11.0f)
                lineTo(19.0f, 8.0f)
                lineTo(16.9f, 10.1f)
                curveTo(15.58f, 9.38f, 14.05f, 9.0f, 12.5f, 9.0f)
                curveTo(10.65f, 9.0f, 8.95f, 9.53f, 7.55f, 10.41f)
                curveTo(7.19f, 9.97f, 7.0f, 9.5f, 7.0f, 9.0f)
                curveTo(7.0f, 7.21f, 9.46f, 5.75f, 12.5f, 5.75f)
                verticalLineTo(5.75f)
                curveTo(13.93f, 5.75f, 15.3f, 6.08f, 16.33f, 6.67f)
                lineTo(18.35f, 4.65f)
                curveTo(16.77f, 3.59f, 14.68f, 3.0f, 12.5f, 3.0f)
                moveTo(12.5f, 11.0f)
                curveTo(12.84f, 11.0f, 13.17f, 11.04f, 13.5f, 11.09f)
                curveTo(10.39f, 11.57f, 8.0f, 14.25f, 8.0f, 17.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 12.5f, 11.0f)
                close()
            }
        }
        .build()
        return _kettle!!
    }

private var _kettle: ImageVector? = null
