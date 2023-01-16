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

public val MaterialDesignIcons.HandPointingLeft: ImageVector
    get() {
        if (_handPointingLeft != null) {
            return _handPointingLeft!!
        }
        _handPointingLeft = Builder(name = "HandPointingLeft", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.0f)
                horizontalLineTo(13.0f)
                lineTo(11.31f, 5.8f)
                lineTo(11.28f, 5.58f)
                curveTo(11.28f, 5.29f, 11.4f, 5.03f, 11.6f, 4.84f)
                lineTo(12.37f, 4.1f)
                lineTo(16.57f, 9.0f)
                curveTo(16.84f, 9.26f, 17.0f, 9.61f, 17.0f, 10.0f)
                verticalLineTo(16.5f)
                curveTo(17.0f, 17.27f, 16.3f, 18.0f, 15.5f, 18.0f)
                horizontalLineTo(11.14f)
                curveTo(10.53f, 18.0f, 10.0f, 17.65f, 9.8f, 17.15f)
                lineTo(7.6f, 12.21f)
                lineTo(7.47f, 11.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 2.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 9.0f)
                moveTo(19.0f, 18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _handPointingLeft!!
    }

private var _handPointingLeft: ImageVector? = null
