package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(311.9f, 260.8f)
                lineTo(160.0f, 353.6f)
                lineTo(8.0f, 260.8f)
                lineTo(160.0f, 0.0f)
                lineToRelative(151.9f, 260.8f)
                close()
                moveTo(160.0f, 383.4f)
                lineTo(8.0f, 290.6f)
                lineTo(160.0f, 512.0f)
                lineToRelative(152.0f, -221.4f)
                lineToRelative(-152.0f, 92.8f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
