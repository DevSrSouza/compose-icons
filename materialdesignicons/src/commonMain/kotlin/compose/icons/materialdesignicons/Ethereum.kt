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

public val MaterialDesignIcons.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.75f)
                lineTo(5.75f, 12.25f)
                lineTo(12.0f, 16.0f)
                lineTo(18.25f, 12.25f)
                lineTo(12.0f, 1.75f)
                moveTo(5.75f, 13.5f)
                lineTo(12.0f, 22.25f)
                lineTo(18.25f, 13.5f)
                lineTo(12.0f, 17.25f)
                lineTo(5.75f, 13.5f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
