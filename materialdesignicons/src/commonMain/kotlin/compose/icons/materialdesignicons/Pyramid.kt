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

public val MaterialDesignIcons.Pyramid: ImageVector
    get() {
        if (_pyramid != null) {
            return _pyramid!!
        }
        _pyramid = Builder(name = "Pyramid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.85f, 16.96f)
                horizontalLineTo(21.85f)
                lineTo(12.85f, 2.47f)
                curveTo(12.65f, 2.16f, 12.33f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(11.35f, 2.16f, 11.15f, 2.47f)
                lineTo(2.15f, 16.96f)
                horizontalLineTo(2.15f)
                curveTo(1.84f, 17.45f, 2.0f, 18.18f, 2.64f, 18.43f)
                lineTo(11.64f, 21.93f)
                curveTo(11.75f, 22.0f, 11.88f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(12.25f, 22.0f, 12.36f, 21.93f)
                lineTo(21.36f, 18.43f)
                curveTo(22.0f, 18.18f, 22.16f, 17.45f, 21.85f, 16.96f)
                moveTo(11.0f, 6.5f)
                verticalLineTo(13.32f)
                lineTo(5.42f, 15.5f)
                lineTo(11.0f, 6.5f)
                moveTo(12.0f, 19.93f)
                lineTo(5.76f, 17.5f)
                lineTo(12.0f, 15.07f)
                lineTo(18.24f, 17.5f)
                lineTo(12.0f, 19.93f)
                moveTo(13.0f, 13.32f)
                verticalLineTo(6.5f)
                lineTo(18.58f, 15.5f)
                lineTo(13.0f, 13.32f)
                close()
            }
        }
        .build()
        return _pyramid!!
    }

private var _pyramid: ImageVector? = null
