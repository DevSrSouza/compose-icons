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

public val MaterialDesignIcons.MicrosoftDynamics365: ImageVector
    get() {
        if (_microsoftDynamics365 != null) {
            return _microsoftDynamics365!!
        }
        _microsoftDynamics365 = Builder(name = "MicrosoftDynamics365", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 2.0f)
                lineTo(17.25f, 8.5f)
                lineTo(13.5f, 11.5f)
                lineTo(6.0f, 8.0f)
                verticalLineTo(2.0f)
                moveTo(6.0f, 9.0f)
                lineTo(9.5f, 11.25f)
                lineTo(6.0f, 22.0f)
                lineTo(18.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(6.0f, 22.0f)
                verticalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _microsoftDynamics365!!
    }

private var _microsoftDynamics365: ImageVector? = null
