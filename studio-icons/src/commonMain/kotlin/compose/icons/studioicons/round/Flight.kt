package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Flight: ImageVector
    get() {
        if (_flight != null) {
            return _flight!!
        }
        _flight = Builder(name = "Flight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 14.58f)
                curveToRelative(0.0f, -0.36f, -0.19f, -0.69f, -0.49f, -0.89f)
                lineTo(13.0f, 9.0f)
                verticalLineTo(3.5f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveTo(10.0f, 2.67f, 10.0f, 3.5f)
                verticalLineTo(9.0f)
                lineToRelative(-7.51f, 4.69f)
                curveToRelative(-0.3f, 0.19f, -0.49f, 0.53f, -0.49f, 0.89f)
                curveToRelative(0.0f, 0.7f, 0.68f, 1.21f, 1.36f, 1.0f)
                lineTo(10.0f, 13.5f)
                verticalLineTo(19.0f)
                lineToRelative(-1.8f, 1.35f)
                curveToRelative(-0.13f, 0.09f, -0.2f, 0.24f, -0.2f, 0.4f)
                verticalLineToRelative(0.59f)
                curveToRelative(0.0f, 0.33f, 0.32f, 0.57f, 0.64f, 0.48f)
                lineTo(11.5f, 21.0f)
                lineToRelative(2.86f, 0.82f)
                curveToRelative(0.32f, 0.09f, 0.64f, -0.15f, 0.64f, -0.48f)
                verticalLineToRelative(-0.59f)
                curveToRelative(0.0f, -0.16f, -0.07f, -0.31f, -0.2f, -0.4f)
                lineTo(13.0f, 19.0f)
                verticalLineToRelative(-5.5f)
                lineToRelative(6.64f, 2.08f)
                curveToRelative(0.68f, 0.21f, 1.36f, -0.3f, 1.36f, -1.0f)
                close()
            }
        }
        .build()
        return _flight!!
    }

private var _flight: ImageVector? = null
