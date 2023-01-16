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

public val MaterialDesignIcons.FormatRotate90: ImageVector
    get() {
        if (_formatRotate90 != null) {
            return _formatRotate90!!
        }
        _formatRotate90 = Builder(name = "FormatRotate90", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.34f, 6.41f)
                lineTo(0.86f, 12.9f)
                lineTo(7.35f, 19.38f)
                lineTo(13.84f, 12.9f)
                lineTo(7.34f, 6.41f)
                moveTo(3.69f, 12.9f)
                lineTo(7.35f, 9.24f)
                lineTo(11.0f, 12.9f)
                lineTo(7.34f, 16.56f)
                lineTo(3.69f, 12.9f)
                moveTo(19.36f, 6.64f)
                curveTo(17.61f, 4.88f, 15.3f, 4.0f, 13.0f, 4.0f)
                verticalLineTo(0.76f)
                lineTo(8.76f, 5.0f)
                lineTo(13.0f, 9.24f)
                verticalLineTo(6.0f)
                curveTo(14.79f, 6.0f, 16.58f, 6.68f, 17.95f, 8.05f)
                curveTo(20.68f, 10.78f, 20.68f, 15.22f, 17.95f, 17.95f)
                curveTo(16.58f, 19.32f, 14.79f, 20.0f, 13.0f, 20.0f)
                curveTo(12.03f, 20.0f, 11.06f, 19.79f, 10.16f, 19.39f)
                lineTo(8.67f, 20.88f)
                curveTo(10.0f, 21.62f, 11.5f, 22.0f, 13.0f, 22.0f)
                curveTo(15.3f, 22.0f, 17.61f, 21.12f, 19.36f, 19.36f)
                curveTo(22.88f, 15.85f, 22.88f, 10.15f, 19.36f, 6.64f)
                close()
            }
        }
        .build()
        return _formatRotate90!!
    }

private var _formatRotate90: ImageVector? = null
