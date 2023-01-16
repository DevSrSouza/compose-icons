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

public val MaterialDesignIcons.BellCheck: ImageVector
    get() {
        if (_bellCheck != null) {
            return _bellCheck!!
        }
        _bellCheck = Builder(name = "BellCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.75f, 21.16f)
                lineTo(15.0f, 18.16f)
                lineTo(16.16f, 17.0f)
                lineTo(17.75f, 18.59f)
                lineTo(21.34f, 15.0f)
                lineTo(22.5f, 16.41f)
                lineTo(17.75f, 21.16f)
                moveTo(3.0f, 20.0f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 17.0f)
                verticalLineTo(11.0f)
                curveTo(5.0f, 7.9f, 7.03f, 5.18f, 10.0f, 4.29f)
                verticalLineTo(4.0f)
                curveTo(10.0f, 2.9f, 10.9f, 2.0f, 12.0f, 2.0f)
                curveTo(13.11f, 2.0f, 14.0f, 2.9f, 14.0f, 4.0f)
                verticalLineTo(4.29f)
                curveTo(16.97f, 5.18f, 19.0f, 7.9f, 19.0f, 11.0f)
                verticalLineTo(12.08f)
                lineTo(18.0f, 12.0f)
                curveTo(14.69f, 12.0f, 12.0f, 14.69f, 12.0f, 18.0f)
                curveTo(12.0f, 18.7f, 12.12f, 19.37f, 12.34f, 20.0f)
                horizontalLineTo(3.0f)
                moveTo(12.0f, 23.0f)
                curveTo(10.9f, 23.0f, 10.0f, 22.11f, 10.0f, 21.0f)
                horizontalLineTo(12.8f)
                curveTo(13.04f, 21.41f, 13.33f, 21.79f, 13.65f, 22.13f)
                curveTo(13.29f, 22.66f, 12.69f, 23.0f, 12.0f, 23.0f)
                close()
            }
        }
        .build()
        return _bellCheck!!
    }

private var _bellCheck: ImageVector? = null
