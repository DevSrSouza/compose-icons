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

public val MaterialDesignIcons.Qqchat: ImageVector
    get() {
        if (_qqchat != null) {
            return _qqchat!!
        }
        _qqchat = Builder(name = "Qqchat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.18f, 13.54f)
                curveTo(3.76f, 12.16f, 4.57f, 11.14f, 5.17f, 10.92f)
                curveTo(5.16f, 10.12f, 5.31f, 9.62f, 5.56f, 9.22f)
                curveTo(5.56f, 9.19f, 5.5f, 8.86f, 5.72f, 8.45f)
                curveTo(5.87f, 4.85f, 8.21f, 2.0f, 12.0f, 2.0f)
                curveTo(15.79f, 2.0f, 18.13f, 4.85f, 18.28f, 8.45f)
                curveTo(18.5f, 8.86f, 18.44f, 9.19f, 18.44f, 9.22f)
                curveTo(18.69f, 9.62f, 18.84f, 10.12f, 18.83f, 10.92f)
                curveTo(19.43f, 11.14f, 20.24f, 12.16f, 20.82f, 13.55f)
                curveTo(21.57f, 15.31f, 21.69f, 17.0f, 21.09f, 17.3f)
                curveTo(20.68f, 17.5f, 20.03f, 17.0f, 19.42f, 16.12f)
                curveTo(19.18f, 17.1f, 18.58f, 18.0f, 17.73f, 18.71f)
                curveTo(18.63f, 19.04f, 19.21f, 19.58f, 19.21f, 20.19f)
                curveTo(19.21f, 21.19f, 17.63f, 22.0f, 15.69f, 22.0f)
                curveTo(13.93f, 22.0f, 12.5f, 21.34f, 12.21f, 20.5f)
                horizontalLineTo(11.79f)
                curveTo(11.5f, 21.34f, 10.07f, 22.0f, 8.31f, 22.0f)
                curveTo(6.37f, 22.0f, 4.79f, 21.19f, 4.79f, 20.19f)
                curveTo(4.79f, 19.58f, 5.37f, 19.04f, 6.27f, 18.71f)
                curveTo(5.42f, 18.0f, 4.82f, 17.1f, 4.58f, 16.12f)
                curveTo(3.97f, 17.0f, 3.32f, 17.5f, 2.91f, 17.3f)
                curveTo(2.31f, 17.0f, 2.43f, 15.31f, 3.18f, 13.54f)
                close()
            }
        }
        .build()
        return _qqchat!!
    }

private var _qqchat: ImageVector? = null
