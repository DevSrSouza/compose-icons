package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5306f, 15.4697f)
                curveTo(10.8235f, 15.7626f, 10.8235f, 16.2374f, 10.5306f, 16.5303f)
                lineTo(8.5306f, 18.5303f)
                curveTo(7.6877f, 19.3733f, 6.3224f, 19.3755f, 5.4767f, 18.537f)
                curveTo(5.337f, 18.4008f, 5.2502f, 18.2105f, 5.2502f, 18.0f)
                curveTo(5.2502f, 17.5858f, 5.586f, 17.25f, 6.0002f, 17.25f)
                curveTo(6.2074f, 17.25f, 6.3949f, 17.334f, 6.5306f, 17.4697f)
                curveTo(6.79f, 17.7291f, 7.2106f, 17.7291f, 7.47f, 17.4697f)
                lineTo(9.47f, 15.4697f)
                curveTo(9.7629f, 15.1768f, 10.2377f, 15.1768f, 10.5306f, 15.4697f)
                close()
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
                moveTo(13.995f, 15.0557f)
                lineTo(8.9446f, 10.0052f)
                lineTo(4.586f, 14.3638f)
                curveTo(3.1914f, 15.7584f, 3.1914f, 18.0196f, 4.586f, 19.4142f)
                curveTo(5.9807f, 20.8089f, 8.2418f, 20.8089f, 9.6365f, 19.4142f)
                lineTo(13.995f, 15.0557f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
