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

public val MaterialDesignIcons.Terraform: ImageVector
    get() {
        if (_terraform != null) {
            return _terraform!!
        }
        _terraform = Builder(name = "Terraform", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 5.4f)
                verticalLineTo(11.8f)
                lineTo(15.4f, 15.0f)
                verticalLineTo(8.7f)
                lineTo(21.0f, 5.4f)
                moveTo(14.8f, 8.7f)
                verticalLineTo(15.0f)
                lineTo(9.2f, 11.8f)
                verticalLineTo(5.4f)
                lineTo(14.8f, 8.7f)
                moveTo(14.8f, 15.7f)
                verticalLineTo(22.1f)
                lineTo(9.2f, 18.9f)
                verticalLineTo(12.5f)
                lineTo(14.8f, 15.7f)
                moveTo(8.6f, 5.1f)
                verticalLineTo(11.5f)
                lineTo(3.0f, 8.3f)
                verticalLineTo(1.9f)
                lineTo(8.6f, 5.1f)
                close()
            }
        }
        .build()
        return _terraform!!
    }

private var _terraform: ImageVector? = null
