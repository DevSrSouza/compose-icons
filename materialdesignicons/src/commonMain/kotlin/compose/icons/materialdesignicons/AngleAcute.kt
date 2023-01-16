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

public val MaterialDesignIcons.AngleAcute: ImageVector
    get() {
        if (_angleAcute != null) {
            return _angleAcute!!
        }
        _angleAcute = Builder(name = "AngleAcute", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 19.0f)
                horizontalLineTo(4.09f)
                lineTo(14.18f, 4.43f)
                lineTo(15.82f, 5.57f)
                lineTo(11.28f, 12.13f)
                curveTo(12.89f, 12.96f, 14.0f, 14.62f, 14.0f, 16.54f)
                curveTo(14.0f, 16.7f, 14.0f, 16.85f, 13.97f, 17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(19.0f)
                moveTo(7.91f, 17.0f)
                horizontalLineTo(11.96f)
                curveTo(12.0f, 16.85f, 12.0f, 16.7f, 12.0f, 16.54f)
                curveTo(12.0f, 15.28f, 11.24f, 14.22f, 10.14f, 13.78f)
                lineTo(7.91f, 17.0f)
                close()
            }
        }
        .build()
        return _angleAcute!!
    }

private var _angleAcute: ImageVector? = null
