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

public val MaterialDesignIcons.CheckDecagram: ImageVector
    get() {
        if (_checkDecagram != null) {
            return _checkDecagram!!
        }
        _checkDecagram = Builder(name = "CheckDecagram", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 12.0f)
                lineTo(20.56f, 9.22f)
                lineTo(20.9f, 5.54f)
                lineTo(17.29f, 4.72f)
                lineTo(15.4f, 1.54f)
                lineTo(12.0f, 3.0f)
                lineTo(8.6f, 1.54f)
                lineTo(6.71f, 4.72f)
                lineTo(3.1f, 5.53f)
                lineTo(3.44f, 9.21f)
                lineTo(1.0f, 12.0f)
                lineTo(3.44f, 14.78f)
                lineTo(3.1f, 18.47f)
                lineTo(6.71f, 19.29f)
                lineTo(8.6f, 22.47f)
                lineTo(12.0f, 21.0f)
                lineTo(15.4f, 22.46f)
                lineTo(17.29f, 19.28f)
                lineTo(20.9f, 18.46f)
                lineTo(20.56f, 14.78f)
                lineTo(23.0f, 12.0f)
                moveTo(10.0f, 17.0f)
                lineTo(6.0f, 13.0f)
                lineTo(7.41f, 11.59f)
                lineTo(10.0f, 14.17f)
                lineTo(16.59f, 7.58f)
                lineTo(18.0f, 9.0f)
                lineTo(10.0f, 17.0f)
                close()
            }
        }
        .build()
        return _checkDecagram!!
    }

private var _checkDecagram: ImageVector? = null
