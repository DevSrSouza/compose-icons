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

public val MaterialDesignIcons.SilverwareVariant: ImageVector
    get() {
        if (_silverwareVariant != null) {
            return _silverwareVariant!!
        }
        _silverwareVariant = Builder(name = "SilverwareVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.1f, 13.34f)
                lineTo(3.91f, 9.16f)
                curveTo(2.35f, 7.59f, 2.35f, 5.06f, 3.91f, 3.5f)
                lineTo(10.93f, 10.5f)
                lineTo(8.1f, 13.34f)
                moveTo(13.41f, 13.0f)
                lineTo(20.29f, 19.88f)
                lineTo(18.88f, 21.29f)
                lineTo(12.0f, 14.41f)
                lineTo(5.12f, 21.29f)
                lineTo(3.71f, 19.88f)
                lineTo(13.36f, 10.22f)
                lineTo(13.16f, 10.0f)
                curveTo(12.38f, 9.23f, 12.38f, 7.97f, 13.16f, 7.19f)
                lineTo(17.5f, 2.82f)
                lineTo(18.43f, 3.74f)
                lineTo(15.19f, 7.0f)
                lineTo(16.15f, 7.94f)
                lineTo(19.39f, 4.69f)
                lineTo(20.31f, 5.61f)
                lineTo(17.06f, 8.85f)
                lineTo(18.0f, 9.81f)
                lineTo(21.26f, 6.56f)
                lineTo(22.18f, 7.5f)
                lineTo(17.81f, 11.84f)
                curveTo(17.03f, 12.62f, 15.77f, 12.62f, 15.0f, 11.84f)
                lineTo(14.78f, 11.64f)
                lineTo(13.41f, 13.0f)
                close()
            }
        }
        .build()
        return _silverwareVariant!!
    }

private var _silverwareVariant: ImageVector? = null
