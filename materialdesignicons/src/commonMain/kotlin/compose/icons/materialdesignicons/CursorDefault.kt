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

public val MaterialDesignIcons.CursorDefault: ImageVector
    get() {
        if (_cursorDefault != null) {
            return _cursorDefault!!
        }
        _cursorDefault = Builder(name = "CursorDefault", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.64f, 21.97f)
                curveTo(13.14f, 22.21f, 12.54f, 22.0f, 12.31f, 21.5f)
                lineTo(10.13f, 16.76f)
                lineTo(7.62f, 18.78f)
                curveTo(7.45f, 18.92f, 7.24f, 19.0f, 7.0f, 19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 18.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 2.0f)
                curveTo(7.24f, 2.0f, 7.47f, 2.09f, 7.64f, 2.23f)
                lineTo(7.65f, 2.22f)
                lineTo(19.14f, 11.86f)
                curveTo(19.57f, 12.22f, 19.62f, 12.85f, 19.27f, 13.27f)
                curveTo(19.12f, 13.45f, 18.91f, 13.57f, 18.7f, 13.61f)
                lineTo(15.54f, 14.23f)
                lineTo(17.74f, 18.96f)
                curveTo(18.0f, 19.46f, 17.76f, 20.05f, 17.26f, 20.28f)
                lineTo(13.64f, 21.97f)
                close()
            }
        }
        .build()
        return _cursorDefault!!
    }

private var _cursorDefault: ImageVector? = null
