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

public val MaterialDesignIcons.HandPointingUp: ImageVector
    get() {
        if (_handPointingUp != null) {
            return _handPointingUp!!
        }
        _handPointingUp = Builder(name = "HandPointingUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                verticalLineTo(13.0f)
                lineTo(17.2f, 11.31f)
                lineTo(17.42f, 11.28f)
                curveTo(17.71f, 11.28f, 17.97f, 11.4f, 18.16f, 11.6f)
                lineTo(18.9f, 12.37f)
                lineTo(14.0f, 16.57f)
                curveTo(13.74f, 16.84f, 13.39f, 17.0f, 13.0f, 17.0f)
                horizontalLineTo(6.5f)
                curveTo(5.73f, 17.0f, 5.0f, 16.3f, 5.0f, 15.5f)
                verticalLineTo(11.14f)
                curveTo(5.0f, 10.53f, 5.35f, 10.0f, 5.85f, 9.8f)
                lineTo(10.79f, 7.6f)
                lineTo(12.0f, 7.47f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 3.0f)
                moveTo(5.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _handPointingUp!!
    }

private var _handPointingUp: ImageVector? = null
