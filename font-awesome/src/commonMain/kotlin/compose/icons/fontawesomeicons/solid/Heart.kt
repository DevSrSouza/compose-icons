package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Heart: ImageVector
    get() {
        if (_heart != null) {
            return _heart!!
        }
        _heart = Builder(name = "Heart", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.6f, 300.4f)
                lineTo(228.3f, 469.1f)
                curveToRelative(7.5f, 7.0f, 17.4f, 10.9f, 27.7f, 10.9f)
                reflectiveCurveToRelative(20.2f, -3.9f, 27.7f, -10.9f)
                lineTo(464.4f, 300.4f)
                curveToRelative(30.4f, -28.3f, 47.6f, -68.0f, 47.6f, -109.5f)
                verticalLineToRelative(-5.8f)
                curveToRelative(0.0f, -69.9f, -50.5f, -129.5f, -119.4f, -141.0f)
                curveTo(347.0f, 36.5f, 300.6f, 51.4f, 268.0f, 84.0f)
                lineTo(256.0f, 96.0f)
                lineTo(244.0f, 84.0f)
                curveToRelative(-32.6f, -32.6f, -79.0f, -47.5f, -124.6f, -39.9f)
                curveTo(50.5f, 55.6f, 0.0f, 115.2f, 0.0f, 185.1f)
                verticalLineToRelative(5.8f)
                curveToRelative(0.0f, 41.5f, 17.2f, 81.2f, 47.6f, 109.5f)
                close()
            }
        }
        .build()
        return _heart!!
    }

private var _heart: ImageVector? = null
