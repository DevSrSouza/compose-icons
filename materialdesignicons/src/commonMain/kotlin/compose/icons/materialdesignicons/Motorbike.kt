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

public val MaterialDesignIcons.Motorbike: ImageVector
    get() {
        if (_motorbike != null) {
            return _motorbike!!
        }
        _motorbike = Builder(name = "Motorbike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.42f, 10.0f)
                lineTo(13.41f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(12.59f)
                lineTo(14.59f, 10.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0f, 10.0f, 2.0f, 12.0f, 2.0f, 14.5f)
                curveTo(2.0f, 17.0f, 4.0f, 19.0f, 6.5f, 19.0f)
                curveTo(8.72f, 19.0f, 10.56f, 17.38f, 10.92f, 15.27f)
                lineTo(13.04f, 14.0f)
                curveTo(13.0f, 14.17f, 13.0f, 14.33f, 13.0f, 14.5f)
                curveTo(13.0f, 17.0f, 15.0f, 19.0f, 17.5f, 19.0f)
                curveTo(20.0f, 19.0f, 22.0f, 17.0f, 22.0f, 14.5f)
                curveTo(22.0f, 12.0f, 20.0f, 10.0f, 17.5f, 10.0f)
                moveTo(8.84f, 15.26f)
                curveTo(8.5f, 16.27f, 7.58f, 17.0f, 6.47f, 17.0f)
                curveTo(5.09f, 17.0f, 3.97f, 15.88f, 3.97f, 14.5f)
                curveTo(3.97f, 13.12f, 5.09f, 12.0f, 6.47f, 12.0f)
                curveTo(7.59f, 12.0f, 8.5f, 12.74f, 8.84f, 13.75f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.25f)
                lineTo(8.84f, 15.26f)
                moveTo(17.47f, 17.0f)
                curveTo(16.09f, 17.0f, 14.97f, 15.88f, 14.97f, 14.5f)
                curveTo(14.97f, 13.12f, 16.09f, 12.0f, 17.47f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 19.97f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 17.47f, 17.0f)
                close()
            }
        }
        .build()
        return _motorbike!!
    }

private var _motorbike: ImageVector? = null
