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

public val SimpleIcons.Fujitsu: ImageVector
    get() {
        if (_fujitsu != null) {
            return _fujitsu!!
        }
        _fujitsu = Builder(name = "Fujitsu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.56f, 3.0f)
                curveTo(14.15f, 3.0f, 12.04f, 4.24f, 10.68f, 5.97f)
                lineTo(10.68f, 9.76f)
                curveTo(12.5f, 4.71f, 16.56f, 5.08f, 16.56f, 5.08f)
                curveTo(19.5f, 5.08f, 21.84f, 7.38f, 21.84f, 10.2f)
                curveTo(21.84f, 13.04f, 19.5f, 15.33f, 16.56f, 15.33f)
                arcTo(5.32f, 5.32f, 0.0f, false, true, 12.84f, 13.83f)
                lineTo(10.28f, 11.03f)
                arcTo(6.06f, 6.06f, 0.0f, false, false, 6.03f, 9.32f)
                curveTo(2.7f, 9.32f, 0.0f, 11.93f, 0.0f, 15.16f)
                curveTo(0.0f, 18.4f, 2.7f, 21.0f, 6.03f, 21.0f)
                curveTo(7.9f, 21.0f, 9.58f, 20.19f, 10.68f, 18.89f)
                lineTo(10.68f, 15.86f)
                curveTo(8.88f, 19.29f, 6.03f, 18.92f, 6.03f, 18.92f)
                curveTo(3.9f, 18.92f, 2.17f, 17.24f, 2.17f, 15.16f)
                curveTo(2.17f, 13.1f, 3.9f, 11.42f, 6.03f, 11.42f)
                curveTo(7.09f, 11.42f, 8.05f, 11.84f, 8.75f, 12.5f)
                lineTo(11.31f, 15.31f)
                arcTo(7.5f, 7.5f, 0.0f, false, false, 16.56f, 17.43f)
                curveTo(20.67f, 17.43f, 24.0f, 14.19f, 24.0f, 10.2f)
                curveTo(24.0f, 6.21f, 20.67f, 3.0f, 16.56f, 3.0f)
                close()
            }
        }
        .build()
        return _fujitsu!!
    }

private var _fujitsu: ImageVector? = null
