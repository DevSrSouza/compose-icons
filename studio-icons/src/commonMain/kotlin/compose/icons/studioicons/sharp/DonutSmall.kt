package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.DonutSmall: ImageVector
    get() {
        if (_donutSmall != null) {
            return _donutSmall!!
        }
        _donutSmall = Builder(name = "DonutSmall", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.18f)
                curveToRelative(0.85f, 0.3f, 1.51f, 0.97f, 1.82f, 1.82f)
                horizontalLineToRelative(7.13f)
                curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f)
                verticalLineToRelative(7.13f)
                close()
                moveTo(11.0f, 14.82f)
                curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f)
                curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f)
                lineTo(11.0f, 2.05f)
                curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f)
                curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f)
                verticalLineToRelative(-7.13f)
                close()
                moveTo(14.82f, 13.0f)
                curveToRelative(-0.3f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f)
                verticalLineToRelative(7.13f)
                curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f)
                horizontalLineToRelative(-7.13f)
                close()
            }
        }
        .build()
        return _donutSmall!!
    }

private var _donutSmall: ImageVector? = null
