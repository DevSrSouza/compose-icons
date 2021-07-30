package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Erlang: ImageVector
    get() {
        if (_erlang != null) {
            return _erlang!!
        }
        _erlang = Builder(name = "Erlang", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.2f, 53.5f)
                lineTo(0.0f, 53.5f)
                verticalLineToRelative(405.0f)
                horizontalLineToRelative(100.4f)
                curveToRelative(-49.7f, -52.6f, -78.8f, -125.3f, -78.7f, -212.1f)
                curveToRelative(-0.1f, -76.7f, 24.0f, -142.7f, 65.5f, -192.9f)
                close()
                moveTo(325.4f, 63.2f)
                curveToRelative(-45.9f, 0.1f, -85.1f, 33.5f, -89.2f, 83.2f)
                horizontalLineToRelative(169.9f)
                curveToRelative(-1.1f, -49.7f, -34.5f, -83.1f, -80.7f, -83.2f)
                close()
                moveTo(556.1f, 53.6f)
                horizontalLineToRelative(0.3f)
                lineToRelative(-0.1f, -0.1f)
                close()
                moveTo(556.4f, 53.6f)
                curveToRelative(31.4f, 42.7f, 48.7f, 97.5f, 46.2f, 162.7f)
                curveToRelative(0.5f, 6.0f, 0.5f, 11.7f, 0.0f, 24.1f)
                lineTo(230.2f, 240.4f)
                curveToRelative(-0.2f, 109.7f, 38.9f, 194.9f, 138.6f, 195.3f)
                curveToRelative(68.5f, -0.3f, 118.0f, -51.0f, 151.9f, -106.1f)
                lineToRelative(96.4f, 48.2f)
                curveToRelative(-17.4f, 30.9f, -36.5f, 57.8f, -57.9f, 80.8f)
                lineTo(640.0f, 458.6f)
                verticalLineToRelative(-405.0f)
                close()
            }
        }
        .build()
        return _erlang!!
    }

private var _erlang: ImageVector? = null
