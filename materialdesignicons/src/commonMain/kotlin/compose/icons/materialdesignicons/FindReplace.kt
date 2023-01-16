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

public val MaterialDesignIcons.FindReplace: ImageVector
    get() {
        if (_findReplace != null) {
            return _findReplace!!
        }
        _findReplace = Builder(name = "FindReplace", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                curveTo(12.38f, 6.0f, 13.63f, 6.56f, 14.54f, 7.46f)
                lineTo(12.0f, 10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                lineTo(15.95f, 6.05f)
                curveTo(14.68f, 4.78f, 12.93f, 4.0f, 11.0f, 4.0f)
                curveTo(7.47f, 4.0f, 4.57f, 6.61f, 4.08f, 10.0f)
                horizontalLineTo(6.1f)
                curveTo(6.56f, 7.72f, 8.58f, 6.0f, 11.0f, 6.0f)
                moveTo(16.64f, 15.14f)
                curveTo(17.3f, 14.24f, 17.76f, 13.17f, 17.92f, 12.0f)
                horizontalLineTo(15.9f)
                curveTo(15.44f, 14.28f, 13.42f, 16.0f, 11.0f, 16.0f)
                curveTo(9.62f, 16.0f, 8.37f, 15.44f, 7.46f, 14.54f)
                lineTo(10.0f, 12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(18.0f)
                lineTo(6.05f, 15.95f)
                curveTo(7.32f, 17.22f, 9.07f, 18.0f, 11.0f, 18.0f)
                curveTo(12.55f, 18.0f, 14.0f, 17.5f, 15.14f, 16.64f)
                lineTo(20.0f, 21.5f)
                lineTo(21.5f, 20.0f)
                lineTo(16.64f, 15.14f)
                close()
            }
        }
        .build()
        return _findReplace!!
    }

private var _findReplace: ImageVector? = null
