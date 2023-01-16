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

public val MaterialDesignIcons.MapCheckOutline: ImageVector
    get() {
        if (_mapCheckOutline != null) {
            return _mapCheckOutline!!
        }
        _mapCheckOutline = Builder(name = "MapCheckOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 22.0f)
                lineTo(15.5f, 19.0f)
                lineTo(16.66f, 17.82f)
                lineTo(18.25f, 19.41f)
                lineTo(21.84f, 15.82f)
                lineTo(23.0f, 17.23f)
                lineTo(18.25f, 22.0f)
                moveTo(20.5f, 3.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 21.0f, 3.5f)
                verticalLineTo(13.34f)
                curveTo(20.37f, 13.12f, 19.7f, 13.0f, 19.0f, 13.0f)
                verticalLineTo(5.7f)
                lineTo(16.0f, 6.86f)
                verticalLineTo(13.8f)
                curveTo(15.2f, 14.27f, 14.5f, 14.91f, 14.0f, 15.68f)
                verticalLineTo(6.87f)
                lineTo(10.0f, 5.47f)
                verticalLineTo(17.13f)
                lineTo(13.05f, 18.2f)
                lineTo(13.0f, 19.0f)
                curveTo(13.0f, 19.46f, 13.05f, 19.92f, 13.15f, 20.35f)
                lineTo(9.0f, 18.9f)
                lineTo(3.66f, 20.97f)
                lineTo(3.5f, 21.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 3.0f, 20.5f)
                verticalLineTo(5.38f)
                curveTo(3.0f, 5.15f, 3.15f, 4.97f, 3.36f, 4.9f)
                lineTo(9.0f, 3.0f)
                lineTo(15.0f, 5.1f)
                lineTo(20.34f, 3.03f)
                lineTo(20.5f, 3.0f)
                moveTo(5.0f, 6.46f)
                verticalLineTo(18.31f)
                lineTo(8.0f, 17.15f)
                verticalLineTo(5.45f)
                lineTo(5.0f, 6.46f)
                close()
            }
        }
        .build()
        return _mapCheckOutline!!
    }

private var _mapCheckOutline: ImageVector? = null
