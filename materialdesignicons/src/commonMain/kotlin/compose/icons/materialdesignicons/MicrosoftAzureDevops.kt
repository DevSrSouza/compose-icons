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

public val MaterialDesignIcons.MicrosoftAzureDevops: ImageVector
    get() {
        if (_microsoftAzureDevops != null) {
            return _microsoftAzureDevops!!
        }
        _microsoftAzureDevops = Builder(name = "MicrosoftAzureDevops", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                lineTo(17.0f, 22.0f)
                lineTo(9.0f, 19.0f)
                verticalLineTo(22.0f)
                lineTo(4.81f, 16.25f)
                lineTo(17.72f, 17.3f)
                verticalLineTo(6.34f)
                lineTo(22.0f, 5.65f)
                verticalLineTo(18.0f)
                moveTo(4.81f, 16.25f)
                verticalLineTo(8.96f)
                lineTo(17.72f, 6.34f)
                lineTo(10.6f, 2.0f)
                verticalLineTo(4.84f)
                lineTo(3.97f, 6.76f)
                lineTo(2.0f, 9.38f)
                verticalLineTo(15.07f)
                lineTo(4.81f, 16.25f)
                close()
            }
        }
        .build()
        return _microsoftAzureDevops!!
    }

private var _microsoftAzureDevops: ImageVector? = null
