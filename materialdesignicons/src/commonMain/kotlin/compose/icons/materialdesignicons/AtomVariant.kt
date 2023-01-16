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

public val MaterialDesignIcons.AtomVariant: ImageVector
    get() {
        if (_atomVariant != null) {
            return _atomVariant!!
        }
        _atomVariant = Builder(name = "AtomVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.36f, 2.64f)
                curveTo(20.0f, 2.64f, 21.36f, 4.0f, 21.36f, 5.64f)
                curveTo(21.36f, 7.29f, 20.0f, 8.64f, 18.36f, 8.64f)
                curveTo(16.71f, 8.64f, 15.36f, 7.29f, 15.36f, 5.64f)
                curveTo(15.36f, 5.34f, 15.41f, 5.06f, 15.5f, 4.8f)
                curveTo(14.43f, 4.29f, 13.25f, 4.0f, 12.0f, 4.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 4.0f, 12.0f)
                lineTo(4.04f, 12.84f)
                lineTo(2.05f, 13.05f)
                lineTo(2.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 2.0f)
                curveTo(13.69f, 2.0f, 15.28f, 2.42f, 16.67f, 3.16f)
                curveTo(17.16f, 2.83f, 17.74f, 2.64f, 18.36f, 2.64f)
                moveTo(18.36f, 4.64f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.36f, 5.64f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.36f, 6.64f)
                curveTo(18.92f, 6.64f, 19.36f, 6.19f, 19.36f, 5.64f)
                curveTo(19.36f, 5.08f, 18.92f, 4.64f, 18.36f, 4.64f)
                moveTo(5.64f, 15.36f)
                curveTo(7.29f, 15.36f, 8.64f, 16.71f, 8.64f, 18.36f)
                curveTo(8.64f, 18.66f, 8.59f, 18.94f, 8.5f, 19.2f)
                curveTo(9.57f, 19.71f, 10.75f, 20.0f, 12.0f, 20.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 20.0f, 12.0f)
                lineTo(19.96f, 11.16f)
                lineTo(21.95f, 10.95f)
                lineTo(22.0f, 12.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(10.31f, 22.0f, 8.72f, 21.58f, 7.33f, 20.84f)
                curveTo(6.84f, 21.17f, 6.26f, 21.36f, 5.64f, 21.36f)
                curveTo(4.0f, 21.36f, 2.64f, 20.0f, 2.64f, 18.36f)
                curveTo(2.64f, 16.71f, 4.0f, 15.36f, 5.64f, 15.36f)
                moveTo(5.64f, 17.36f)
                curveTo(5.08f, 17.36f, 4.64f, 17.81f, 4.64f, 18.36f)
                curveTo(4.64f, 18.92f, 5.08f, 19.36f, 5.64f, 19.36f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.64f, 18.36f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.64f, 17.36f)
                moveTo(12.0f, 8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 16.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 16.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _atomVariant!!
    }

private var _atomVariant: ImageVector? = null
