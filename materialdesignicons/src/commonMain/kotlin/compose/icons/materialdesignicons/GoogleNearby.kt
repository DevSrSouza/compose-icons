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

public val MaterialDesignIcons.GoogleNearby: ImageVector
    get() {
        if (_googleNearby != null) {
            return _googleNearby!!
        }
        _googleNearby = Builder(name = "GoogleNearby", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.36f, 10.46f)
                lineTo(13.54f, 2.64f)
                curveTo(12.69f, 1.79f, 11.31f, 1.79f, 10.46f, 2.64f)
                lineTo(2.64f, 10.46f)
                curveTo(1.79f, 11.31f, 1.79f, 12.69f, 2.64f, 13.54f)
                lineTo(10.46f, 21.36f)
                curveTo(11.31f, 22.21f, 12.69f, 22.21f, 13.54f, 21.36f)
                lineTo(21.36f, 13.54f)
                curveTo(22.21f, 12.69f, 22.21f, 11.31f, 21.36f, 10.46f)
                moveTo(12.0f, 19.0f)
                lineTo(5.0f, 12.0f)
                lineTo(12.0f, 5.0f)
                lineTo(19.0f, 12.0f)
                lineTo(12.0f, 19.0f)
                moveTo(16.5f, 12.0f)
                lineTo(12.0f, 16.5f)
                lineTo(7.5f, 12.0f)
                lineTo(12.0f, 7.5f)
                lineTo(16.5f, 12.0f)
                close()
            }
        }
        .build()
        return _googleNearby!!
    }

private var _googleNearby: ImageVector? = null
