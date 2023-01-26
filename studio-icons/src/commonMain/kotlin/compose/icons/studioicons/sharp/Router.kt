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

public val SharpGroup.Router: ImageVector
    get() {
        if (_router != null) {
            return _router!!
        }
        _router = Builder(name = "Router", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2f, 5.9f)
                lineToRelative(0.8f, -0.8f)
                curveTo(19.6f, 3.7f, 17.8f, 3.0f, 16.0f, 3.0f)
                reflectiveCurveToRelative(-3.6f, 0.7f, -5.0f, 2.1f)
                lineToRelative(0.8f, 0.8f)
                curveTo(13.0f, 4.8f, 14.5f, 4.2f, 16.0f, 4.2f)
                reflectiveCurveToRelative(3.0f, 0.6f, 4.2f, 1.7f)
                close()
                moveTo(19.3f, 6.7f)
                curveToRelative(-0.9f, -0.9f, -2.1f, -1.4f, -3.3f, -1.4f)
                reflectiveCurveToRelative(-2.4f, 0.5f, -3.3f, 1.4f)
                lineToRelative(0.8f, 0.8f)
                curveToRelative(0.7f, -0.7f, 1.6f, -1.0f, 2.5f, -1.0f)
                reflectiveCurveToRelative(1.8f, 0.3f, 2.5f, 1.0f)
                lineToRelative(0.8f, -0.8f)
                close()
                moveTo(21.0f, 13.0f)
                horizontalLineToRelative(-4.0f)
                lineTo(17.0f, 9.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                lineTo(3.0f, 13.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(-8.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(11.5f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
                moveTo(15.0f, 18.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _router!!
    }

private var _router: ImageVector? = null
