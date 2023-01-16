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

public val MaterialDesignIcons.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.71f, 1.22f)
                lineTo(12.88f, 4.05f)
                curveTo(12.1f, 4.83f, 12.1f, 6.09f, 12.88f, 6.87f)
                lineTo(14.3f, 8.29f)
                lineTo(10.06f, 12.53f)
                lineTo(7.58f, 10.06f)
                lineTo(1.22f, 16.42f)
                lineTo(7.58f, 22.78f)
                lineTo(13.94f, 16.42f)
                lineTo(11.47f, 13.94f)
                lineTo(15.71f, 9.7f)
                lineTo(17.13f, 11.12f)
                curveTo(17.91f, 11.9f, 19.17f, 11.9f, 19.95f, 11.12f)
                lineTo(22.78f, 8.29f)
                lineTo(15.71f, 1.22f)
                moveTo(15.71f, 4.05f)
                lineTo(19.95f, 8.29f)
                lineTo(18.54f, 9.7f)
                lineTo(14.3f, 5.46f)
                lineTo(15.71f, 4.05f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
