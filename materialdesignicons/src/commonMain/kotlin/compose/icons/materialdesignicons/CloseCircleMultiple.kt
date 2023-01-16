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

public val MaterialDesignIcons.CloseCircleMultiple: ImageVector
    get() {
        if (_closeCircleMultiple != null) {
            return _closeCircleMultiple!!
        }
        _closeCircleMultiple = Builder(name = "CloseCircleMultiple", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 9.21f, 3.64f, 6.8f, 6.0f, 5.68f)
                verticalLineTo(3.5f)
                curveTo(2.5f, 4.76f, 0.0f, 8.09f, 0.0f, 12.0f)
                reflectiveCurveTo(2.5f, 19.24f, 6.0f, 20.5f)
                verticalLineTo(18.32f)
                curveTo(3.64f, 17.2f, 2.0f, 14.79f, 2.0f, 12.0f)
                moveTo(15.0f, 3.0f)
                curveTo(10.04f, 3.0f, 6.0f, 7.04f, 6.0f, 12.0f)
                reflectiveCurveTo(10.04f, 21.0f, 15.0f, 21.0f)
                reflectiveCurveTo(24.0f, 16.96f, 24.0f, 12.0f)
                reflectiveCurveTo(19.96f, 3.0f, 15.0f, 3.0f)
                moveTo(20.0f, 15.59f)
                lineTo(18.59f, 17.0f)
                lineTo(15.0f, 13.41f)
                lineTo(11.41f, 17.0f)
                lineTo(10.0f, 15.59f)
                lineTo(13.59f, 12.0f)
                lineTo(10.0f, 8.41f)
                lineTo(11.41f, 7.0f)
                lineTo(15.0f, 10.59f)
                lineTo(18.59f, 7.0f)
                lineTo(20.0f, 8.41f)
                lineTo(16.41f, 12.0f)
                lineTo(20.0f, 15.59f)
                close()
            }
        }
        .build()
        return _closeCircleMultiple!!
    }

private var _closeCircleMultiple: ImageVector? = null
