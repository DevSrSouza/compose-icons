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

public val MaterialDesignIcons.MicrosoftAzure: ImageVector
    get() {
        if (_microsoftAzure != null) {
            return _microsoftAzure!!
        }
        _microsoftAzure = Builder(name = "MicrosoftAzure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.05f, 4.24f)
                lineTo(6.56f, 18.05f)
                lineTo(2.0f, 18.0f)
                lineTo(7.09f, 9.24f)
                lineTo(13.05f, 4.24f)
                moveTo(13.75f, 5.33f)
                lineTo(22.0f, 19.76f)
                horizontalLineTo(6.74f)
                lineTo(16.04f, 18.1f)
                lineTo(11.17f, 12.31f)
                lineTo(13.75f, 5.33f)
                close()
            }
        }
        .build()
        return _microsoftAzure!!
    }

private var _microsoftAzure: ImageVector? = null
