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

public val MaterialDesignIcons.SigmaLower: ImageVector
    get() {
        if (_sigmaLower != null) {
            return _sigmaLower!!
        }
        _sigmaLower = Builder(name = "SigmaLower", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 12.0f)
                curveTo(19.0f, 16.42f, 15.64f, 20.0f, 11.5f, 20.0f)
                curveTo(7.36f, 20.0f, 4.0f, 16.42f, 4.0f, 12.0f)
                curveTo(4.0f, 7.58f, 7.36f, 4.0f, 11.5f, 4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(16.46f)
                curveTo(18.0f, 7.47f, 19.0f, 9.61f, 19.0f, 12.0f)
                moveTo(11.5f, 6.0f)
                curveTo(8.46f, 6.0f, 6.0f, 8.69f, 6.0f, 12.0f)
                curveTo(6.0f, 15.31f, 8.46f, 18.0f, 11.5f, 18.0f)
                curveTo(14.54f, 18.0f, 17.0f, 15.31f, 17.0f, 12.0f)
                curveTo(17.0f, 8.69f, 14.54f, 6.0f, 11.5f, 6.0f)
                close()
            }
        }
        .build()
        return _sigmaLower!!
    }

private var _sigmaLower: ImageVector? = null
