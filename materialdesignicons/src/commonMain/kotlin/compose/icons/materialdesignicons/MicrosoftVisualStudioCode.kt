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

public val MaterialDesignIcons.MicrosoftVisualStudioCode: ImageVector
    get() {
        if (_microsoftVisualStudioCode != null) {
            return _microsoftVisualStudioCode!!
        }
        _microsoftVisualStudioCode = Builder(name = "MicrosoftVisualStudioCode", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 16.47f)
                verticalLineTo(7.39f)
                lineTo(11.0f, 11.93f)
                moveTo(2.22f, 9.19f)
                curveTo(1.92f, 8.87f, 1.91f, 8.37f, 2.2f, 8.04f)
                lineTo(3.4f, 6.93f)
                curveTo(3.6f, 6.75f, 4.09f, 6.67f, 4.45f, 6.93f)
                lineTo(7.87f, 9.54f)
                lineTo(15.8f, 2.29f)
                curveTo(16.12f, 1.97f, 16.67f, 1.84f, 17.3f, 2.17f)
                lineTo(21.3f, 4.08f)
                curveTo(21.66f, 4.29f, 22.0f, 4.62f, 22.0f, 5.23f)
                verticalLineTo(18.73f)
                curveTo(22.0f, 19.13f, 21.71f, 19.56f, 21.4f, 19.73f)
                lineTo(17.0f, 21.83f)
                curveTo(16.68f, 21.96f, 16.08f, 21.84f, 15.87f, 21.63f)
                lineTo(7.85f, 14.33f)
                lineTo(4.45f, 16.93f)
                curveTo(4.07f, 17.19f, 3.6f, 17.12f, 3.4f, 16.93f)
                lineTo(2.2f, 15.83f)
                curveTo(1.88f, 15.5f, 1.92f, 14.96f, 2.25f, 14.63f)
                lineTo(5.25f, 11.93f)
            }
        }
        .build()
        return _microsoftVisualStudioCode!!
    }

private var _microsoftVisualStudioCode: ImageVector? = null
