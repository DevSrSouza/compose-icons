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

public val MaterialDesignIcons.SemanticWeb: ImageVector
    get() {
        if (_semanticWeb != null) {
            return _semanticWeb!!
        }
        _semanticWeb = Builder(name = "SemanticWeb", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.9f, 4.22f)
                curveTo(18.73f, 6.84f, 20.0f, 2.0f, 20.0f, 2.0f)
                reflectiveCurveTo(18.89f, 8.07f, 13.79f, 10.55f)
                curveTo(12.75f, 11.06f, 12.1f, 11.33f, 12.1f, 11.33f)
                lineTo(3.73f, 7.25f)
                lineTo(12.1f, 3.82f)
                curveTo(12.1f, 3.82f, 11.9f, 3.76f, 12.9f, 4.22f)
                moveTo(11.12f, 22.0f)
                lineTo(3.33f, 17.78f)
                verticalLineTo(9.07f)
                lineTo(11.12f, 13.04f)
                verticalLineTo(22.0f)
                moveTo(12.88f, 22.0f)
                lineTo(20.68f, 17.78f)
                verticalLineTo(9.07f)
                lineTo(12.88f, 13.04f)
                verticalLineTo(22.0f)
                close()
            }
        }
        .build()
        return _semanticWeb!!
    }

private var _semanticWeb: ImageVector? = null
