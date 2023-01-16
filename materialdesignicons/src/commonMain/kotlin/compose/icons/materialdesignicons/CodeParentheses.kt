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

public val MaterialDesignIcons.CodeParentheses: ImageVector
    get() {
        if (_codeParentheses != null) {
            return _codeParentheses!!
        }
        _codeParentheses = Builder(name = "CodeParentheses", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.62f, 3.0f)
                curveTo(19.13f, 5.27f, 20.0f, 8.55f, 20.0f, 12.0f)
                curveTo(20.0f, 15.44f, 19.13f, 18.72f, 17.62f, 21.0f)
                lineTo(16.0f, 19.96f)
                curveTo(17.26f, 18.07f, 18.0f, 15.13f, 18.0f, 12.0f)
                curveTo(18.0f, 8.87f, 17.26f, 5.92f, 16.0f, 4.03f)
                lineTo(17.62f, 3.0f)
                moveTo(6.38f, 3.0f)
                lineTo(8.0f, 4.04f)
                curveTo(6.74f, 5.92f, 6.0f, 8.87f, 6.0f, 12.0f)
                curveTo(6.0f, 15.13f, 6.74f, 18.08f, 8.0f, 19.96f)
                lineTo(6.38f, 21.0f)
                curveTo(4.87f, 18.73f, 4.0f, 15.45f, 4.0f, 12.0f)
                curveTo(4.0f, 8.55f, 4.87f, 5.27f, 6.38f, 3.0f)
                close()
            }
        }
        .build()
        return _codeParentheses!!
    }

private var _codeParentheses: ImageVector? = null
