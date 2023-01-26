package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 18.31f)
                lineToRelative(3.0f, -1.16f)
                lineTo(8.0f, 5.45f)
                lineTo(5.0f, 6.46f)
                close()
                moveTo(16.0f, 18.55f)
                lineToRelative(3.0f, -1.01f)
                lineTo(19.0f, 5.69f)
                lineToRelative(-3.0f, 1.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 3.0f)
                lineToRelative(-0.16f, 0.03f)
                lineTo(15.0f, 5.1f)
                lineTo(9.0f, 3.0f)
                lineTo(3.36f, 4.9f)
                curveToRelative(-0.21f, 0.07f, -0.36f, 0.25f, -0.36f, 0.48f)
                lineTo(3.0f, 20.5f)
                curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                lineToRelative(0.16f, -0.03f)
                lineTo(9.0f, 18.9f)
                lineToRelative(6.0f, 2.1f)
                lineToRelative(5.64f, -1.9f)
                curveToRelative(0.21f, -0.07f, 0.36f, -0.25f, 0.36f, -0.48f)
                lineTo(21.0f, 3.5f)
                curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(8.0f, 17.15f)
                lineToRelative(-3.0f, 1.16f)
                lineTo(5.0f, 6.46f)
                lineToRelative(3.0f, -1.01f)
                verticalLineToRelative(11.7f)
                close()
                moveTo(14.0f, 18.53f)
                lineToRelative(-4.0f, -1.4f)
                lineTo(10.0f, 5.47f)
                lineToRelative(4.0f, 1.4f)
                verticalLineToRelative(11.66f)
                close()
                moveTo(19.0f, 17.54f)
                lineToRelative(-3.0f, 1.01f)
                lineTo(16.0f, 6.86f)
                lineToRelative(3.0f, -1.16f)
                verticalLineToRelative(11.84f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
