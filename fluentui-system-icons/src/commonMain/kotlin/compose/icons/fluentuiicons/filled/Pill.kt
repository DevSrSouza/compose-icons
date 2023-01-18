package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.3031f, 3.5254f)
                curveTo(15.2836f, 1.5449f, 18.4945f, 1.5449f, 20.4749f, 3.5254f)
                curveTo(22.4553f, 5.5058f, 22.4553f, 8.7167f, 20.4749f, 10.6971f)
                lineTo(10.6971f, 20.4749f)
                curveTo(8.7167f, 22.4553f, 5.5058f, 22.4553f, 3.5254f, 20.4749f)
                curveTo(1.5449f, 18.4945f, 1.5449f, 15.2836f, 3.5254f, 13.3031f)
                lineTo(13.3031f, 3.5254f)
                close()
                moveTo(19.4142f, 4.586f)
                curveTo(18.0196f, 3.1914f, 15.7584f, 3.1914f, 14.3638f, 4.586f)
                lineTo(10.0052f, 8.9446f)
                lineTo(15.0557f, 13.995f)
                lineTo(19.4142f, 9.6365f)
                curveTo(20.8089f, 8.2418f, 20.8089f, 5.9807f, 19.4142f, 4.586f)
                close()
                moveTo(10.8083f, 18.2774f)
                curveTo(11.1012f, 17.9845f, 11.1012f, 17.5096f, 10.8083f, 17.2167f)
                curveTo(10.5154f, 16.9238f, 10.0406f, 16.9238f, 9.7477f, 17.2167f)
                lineTo(8.3067f, 18.6577f)
                curveTo(7.7293f, 19.2351f, 6.7961f, 19.2445f, 6.2071f, 18.679f)
                lineTo(6.1904f, 18.6629f)
                curveTo(5.8916f, 18.376f, 5.4168f, 18.3856f, 5.1299f, 18.6844f)
                curveTo(4.843f, 18.9831f, 4.8527f, 19.4579f, 5.1514f, 19.7448f)
                lineTo(5.1682f, 19.7609f)
                curveTo(6.3462f, 20.8921f, 8.2126f, 20.8731f, 9.3674f, 19.7183f)
                lineTo(10.8083f, 18.2774f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
