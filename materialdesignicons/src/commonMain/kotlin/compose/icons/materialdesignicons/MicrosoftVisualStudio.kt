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

public val MaterialDesignIcons.MicrosoftVisualStudio: ImageVector
    get() {
        if (_microsoftVisualStudio != null) {
            return _microsoftVisualStudio!!
        }
        _microsoftVisualStudio = Builder(name = "MicrosoftVisualStudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 8.5f)
                lineTo(12.25f, 12.32f)
                lineTo(17.0f, 16.0f)
                verticalLineTo(8.5f)
                moveTo(4.7f, 18.4f)
                lineTo(2.0f, 16.7f)
                verticalLineTo(7.7f)
                lineTo(5.0f, 6.7f)
                lineTo(9.3f, 10.03f)
                lineTo(18.0f, 2.0f)
                lineTo(22.0f, 4.5f)
                verticalLineTo(20.0f)
                lineTo(17.0f, 22.0f)
                lineTo(9.34f, 14.66f)
                lineTo(4.7f, 18.4f)
                moveTo(5.0f, 14.0f)
                lineTo(6.86f, 12.28f)
                lineTo(5.0f, 10.5f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _microsoftVisualStudio!!
    }

private var _microsoftVisualStudio: ImageVector? = null
