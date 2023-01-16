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

public val MaterialDesignIcons.CursorPointer: ImageVector
    get() {
        if (_cursorPointer != null) {
            return _cursorPointer!!
        }
        _cursorPointer = Builder(name = "CursorPointer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 10.19f)
                lineTo(14.38f, 10.32f)
                lineTo(18.55f, 12.4f)
                curveTo(19.25f, 12.63f, 19.71f, 13.32f, 19.65f, 14.06f)
                verticalLineTo(14.19f)
                lineTo(19.65f, 14.32f)
                lineTo(18.75f, 20.44f)
                curveTo(18.69f, 20.87f, 18.5f, 21.27f, 18.15f, 21.55f)
                curveTo(17.84f, 21.85f, 17.43f, 22.0f, 17.0f, 22.0f)
                horizontalLineTo(10.12f)
                curveTo(9.63f, 22.0f, 9.18f, 21.82f, 8.85f, 21.47f)
                lineTo(2.86f, 15.5f)
                lineTo(3.76f, 14.5f)
                curveTo(4.0f, 14.25f, 4.38f, 14.11f, 4.74f, 14.13f)
                horizontalLineTo(5.03f)
                lineTo(9.0f, 15.0f)
                verticalLineTo(4.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 2.5f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 4.5f)
                verticalLineTo(10.19f)
                horizontalLineTo(13.75f)
                close()
            }
        }
        .build()
        return _cursorPointer!!
    }

private var _cursorPointer: ImageVector? = null
