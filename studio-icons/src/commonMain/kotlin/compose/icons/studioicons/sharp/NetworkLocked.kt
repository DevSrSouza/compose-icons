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

public val SharpGroup.NetworkLocked: ImageVector
    get() {
        if (_networkLocked != null) {
            return _networkLocked!!
        }
        _networkLocked = Builder(name = "NetworkLocked", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 16.0f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0.0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(7.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(-1.0f)
                close()
                moveTo(21.0f, 16.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveTo(19.5f, 11.0f)
                curveToRelative(0.15f, 0.0f, 0.3f, 0.01f, 0.46f, 0.02f)
                curveToRelative(0.01f, 0.0f, 0.03f, 0.01f, 0.04f, 0.01f)
                lineTo(20.0f, 1.0f)
                lineTo(1.0f, 20.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.22f, -0.63f, 0.58f, -1.2f, 1.06f, -1.68f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f)
                close()
            }
        }
        .build()
        return _networkLocked!!
    }

private var _networkLocked: ImageVector? = null
