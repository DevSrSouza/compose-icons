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

public val MaterialDesignIcons.HandPointingRight: ImageVector
    get() {
        if (_handPointingRight != null) {
            return _handPointingRight!!
        }
        _handPointingRight = Builder(name = "HandPointingRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 22.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 11.0f)
                horizontalLineTo(16.53f)
                lineTo(16.4f, 12.21f)
                lineTo(14.2f, 17.15f)
                curveTo(14.0f, 17.65f, 13.47f, 18.0f, 12.86f, 18.0f)
                horizontalLineTo(8.5f)
                curveTo(7.7f, 18.0f, 7.0f, 17.27f, 7.0f, 16.5f)
                verticalLineTo(10.0f)
                curveTo(7.0f, 9.61f, 7.16f, 9.26f, 7.43f, 9.0f)
                lineTo(11.63f, 4.1f)
                lineTo(12.4f, 4.84f)
                curveTo(12.6f, 5.03f, 12.72f, 5.29f, 12.72f, 5.58f)
                lineTo(12.69f, 5.8f)
                lineTo(11.0f, 9.0f)
                horizontalLineTo(21.0f)
                moveTo(2.0f, 18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _handPointingRight!!
    }

private var _handPointingRight: ImageVector? = null
