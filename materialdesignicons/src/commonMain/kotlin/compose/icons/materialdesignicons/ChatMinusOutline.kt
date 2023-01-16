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

public val MaterialDesignIcons.ChatMinusOutline: ImageVector
    get() {
        if (_chatMinusOutline != null) {
            return _chatMinusOutline!!
        }
        _chatMinusOutline = Builder(name = "ChatMinusOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(17.5f, 3.0f, 22.0f, 6.58f, 22.0f, 11.0f)
                curveTo(22.0f, 11.58f, 21.92f, 12.14f, 21.78f, 12.68f)
                curveTo(21.19f, 12.38f, 20.55f, 12.16f, 19.88f, 12.06f)
                curveTo(19.96f, 11.72f, 20.0f, 11.36f, 20.0f, 11.0f)
                curveTo(20.0f, 7.69f, 16.42f, 5.0f, 12.0f, 5.0f)
                reflectiveCurveTo(4.0f, 7.69f, 4.0f, 11.0f)
                reflectiveCurveTo(7.58f, 17.0f, 12.0f, 17.0f)
                lineTo(13.09f, 16.95f)
                lineTo(13.0f, 18.0f)
                lineTo(13.08f, 18.95f)
                lineTo(12.0f, 19.0f)
                curveTo(10.81f, 19.0f, 9.62f, 18.83f, 8.47f, 18.5f)
                curveTo(6.64f, 20.0f, 4.37f, 20.89f, 2.0f, 21.0f)
                curveTo(4.33f, 18.67f, 4.75f, 17.1f, 4.75f, 16.5f)
                curveTo(3.06f, 15.17f, 2.05f, 13.15f, 2.0f, 11.0f)
                curveTo(2.0f, 6.58f, 6.5f, 3.0f, 12.0f, 3.0f)
                moveTo(23.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _chatMinusOutline!!
    }

private var _chatMinusOutline: ImageVector? = null
