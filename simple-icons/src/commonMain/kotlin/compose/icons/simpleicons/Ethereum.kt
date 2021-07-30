package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Ethereum: ImageVector
    get() {
        if (_ethereum != null) {
            return _ethereum!!
        }
        _ethereum = Builder(name = "Ethereum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.944f, 17.97f)
                lineTo(4.58f, 13.62f)
                lineTo(11.943f, 24.0f)
                lineToRelative(7.37f, -10.38f)
                lineToRelative(-7.372f, 4.35f)
                horizontalLineToRelative(0.003f)
                close()
                moveTo(12.056f, 0.0f)
                lineTo(4.69f, 12.223f)
                lineToRelative(7.365f, 4.354f)
                lineToRelative(7.365f, -4.35f)
                lineTo(12.056f, 0.0f)
                close()
            }
        }
        .build()
        return _ethereum!!
    }

private var _ethereum: ImageVector? = null
