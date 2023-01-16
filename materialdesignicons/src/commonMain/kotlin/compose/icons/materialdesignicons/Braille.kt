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

public val MaterialDesignIcons.Braille: ImageVector
    get() {
        if (_braille != null) {
            return _braille!!
        }
        _braille = Builder(name = "Braille", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 8.0f)
                verticalLineTo(12.47f)
                lineTo(10.21f, 12.6f)
                lineTo(15.15f, 14.79f)
                curveTo(15.67f, 15.03f, 16.0f, 15.56f, 16.0f, 16.14f)
                verticalLineTo(20.5f)
                curveTo(15.97f, 21.32f, 15.32f, 21.97f, 14.5f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(7.62f, 22.0f, 7.26f, 21.85f, 7.0f, 21.57f)
                lineTo(2.1f, 17.37f)
                lineTo(2.84f, 16.6f)
                curveTo(3.03f, 16.39f, 3.3f, 16.28f, 3.58f, 16.28f)
                horizontalLineTo(3.8f)
                lineTo(7.0f, 18.0f)
                verticalLineTo(8.0f)
                moveTo(19.5f, 2.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 2.0f)
                moveTo(19.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 7.0f)
                moveTo(14.5f, 7.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 10.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.0f, 8.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 7.0f)
                moveTo(19.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 19.5f, 12.0f)
                close()
            }
        }
        .build()
        return _braille!!
    }

private var _braille: ImageVector? = null
