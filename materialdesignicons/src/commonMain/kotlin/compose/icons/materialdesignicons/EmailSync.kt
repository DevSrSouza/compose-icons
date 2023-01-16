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

public val MaterialDesignIcons.EmailSync: ImageVector
    get() {
        if (_emailSync != null) {
            return _emailSync!!
        }
        _emailSync = Builder(name = "EmailSync", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 4.0f)
                curveTo(1.89f, 4.0f, 1.0f, 4.89f, 1.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(1.0f, 19.11f, 1.9f, 20.0f, 3.0f, 20.0f)
                horizontalLineTo(13.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 13.0f, 17.5f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 19.5f, 11.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, true, 21.0f, 11.18f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.89f, 20.1f, 4.0f, 19.0f, 4.0f)
                horizontalLineTo(3.0f)
                moveTo(3.0f, 6.0f)
                lineTo(11.0f, 11.0f)
                lineTo(19.0f, 6.0f)
                verticalLineTo(8.0f)
                lineTo(11.0f, 13.0f)
                lineTo(3.0f, 8.0f)
                verticalLineTo(6.0f)
                moveTo(19.0f, 12.0f)
                lineTo(16.75f, 14.25f)
                lineTo(19.0f, 16.5f)
                verticalLineTo(15.0f)
                curveTo(20.38f, 15.0f, 21.5f, 16.12f, 21.5f, 17.5f)
                curveTo(21.5f, 17.9f, 21.41f, 18.28f, 21.24f, 18.62f)
                lineTo(22.33f, 19.71f)
                curveTo(22.75f, 19.08f, 23.0f, 18.32f, 23.0f, 17.5f)
                curveTo(23.0f, 15.29f, 21.21f, 13.5f, 19.0f, 13.5f)
                verticalLineTo(12.0f)
                moveTo(15.67f, 15.29f)
                curveTo(15.25f, 15.92f, 15.0f, 16.68f, 15.0f, 17.5f)
                curveTo(15.0f, 19.71f, 16.79f, 21.5f, 19.0f, 21.5f)
                verticalLineTo(23.0f)
                lineTo(21.25f, 20.75f)
                lineTo(19.0f, 18.5f)
                verticalLineTo(20.0f)
                curveTo(17.62f, 20.0f, 16.5f, 18.88f, 16.5f, 17.5f)
                curveTo(16.5f, 17.1f, 16.59f, 16.72f, 16.76f, 16.38f)
                lineTo(15.67f, 15.29f)
                close()
            }
        }
        .build()
        return _emailSync!!
    }

private var _emailSync: ImageVector? = null
