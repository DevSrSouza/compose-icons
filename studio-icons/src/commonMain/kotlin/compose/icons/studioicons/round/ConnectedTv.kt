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

public val RoundGroup.ConnectedTv: ImageVector
    get() {
        if (_connectedTv != null) {
            return _connectedTv!!
        }
        _connectedTv = Builder(name = "ConnectedTv", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f)
                lineTo(22.0f, 5.0f)
                curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f)
                close()
                moveTo(20.0f, 17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(16.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(7.0f, 15.97f)
                curveTo(6.98f, 14.89f, 6.11f, 14.02f, 5.03f, 14.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.97f)
                close()
                moveTo(5.62f, 12.55f)
                curveToRelative(1.44f, 0.26f, 2.58f, 1.4f, 2.83f, 2.84f)
                curveTo(8.51f, 15.75f, 8.82f, 16.0f, 9.18f, 16.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.46f, 0.0f, 0.82f, -0.41f, 0.75f, -0.86f)
                curveToRelative(-0.36f, -2.07f, -1.99f, -3.7f, -4.06f, -4.06f)
                curveTo(5.41f, 11.0f, 5.0f, 11.36f, 5.0f, 11.82f)
                verticalLineToRelative(0.0f)
                curveTo(5.0f, 12.19f, 5.26f, 12.49f, 5.62f, 12.55f)
                close()
                moveTo(5.64f, 9.53f)
                curveToRelative(3.07f, 0.3f, 5.52f, 2.75f, 5.83f, 5.82f)
                curveToRelative(0.04f, 0.37f, 0.37f, 0.65f, 0.74f, 0.65f)
                curveToRelative(0.45f, 0.0f, 0.79f, -0.4f, 0.75f, -0.85f)
                curveToRelative(-0.4f, -3.74f, -3.37f, -6.71f, -7.11f, -7.1f)
                curveTo(5.4f, 8.0f, 5.0f, 8.34f, 5.0f, 8.79f)
                curveTo(5.0f, 9.16f, 5.27f, 9.5f, 5.64f, 9.53f)
                close()
            }
        }
        .build()
        return _connectedTv!!
    }

private var _connectedTv: ImageVector? = null
