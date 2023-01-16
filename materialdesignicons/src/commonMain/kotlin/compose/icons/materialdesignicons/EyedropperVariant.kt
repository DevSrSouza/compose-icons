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

public val MaterialDesignIcons.EyedropperVariant: ImageVector
    get() {
        if (_eyedropperVariant != null) {
            return _eyedropperVariant!!
        }
        _eyedropperVariant = Builder(name = "EyedropperVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.92f, 19.0f)
                lineTo(5.0f, 17.08f)
                lineTo(13.06f, 9.0f)
                lineTo(15.0f, 10.94f)
                moveTo(20.71f, 5.63f)
                lineTo(18.37f, 3.29f)
                curveTo(18.0f, 2.9f, 17.35f, 2.9f, 16.96f, 3.29f)
                lineTo(13.84f, 6.41f)
                lineTo(11.91f, 4.5f)
                lineTo(10.5f, 5.91f)
                lineTo(11.92f, 7.33f)
                lineTo(3.0f, 16.25f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.75f)
                lineTo(16.67f, 12.08f)
                lineTo(18.09f, 13.5f)
                lineTo(19.5f, 12.09f)
                lineTo(17.58f, 10.17f)
                lineTo(20.7f, 7.05f)
                curveTo(21.1f, 6.65f, 21.1f, 6.0f, 20.71f, 5.63f)
                close()
            }
        }
        .build()
        return _eyedropperVariant!!
    }

private var _eyedropperVariant: ImageVector? = null
