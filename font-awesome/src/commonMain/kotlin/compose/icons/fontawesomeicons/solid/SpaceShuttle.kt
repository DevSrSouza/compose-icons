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

public val SolidGroup.SpaceShuttle: ImageVector
    get() {
        if (_spaceShuttle != null) {
            return _spaceShuttle!!
        }
        _spaceShuttle = Builder(name = "SpaceShuttle", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(592.6f, 208.24f)
                curveTo(559.73f, 192.84f, 515.78f, 184.0f, 472.0f, 184.0f)
                horizontalLineTo(186.33f)
                curveToRelative(-4.95f, -6.55f, -10.59f, -11.98f, -16.72f, -16.0f)
                horizontalLineTo(376.0f)
                curveTo(229.16f, 137.75f, 219.4f, 32.0f, 96.0f, 32.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(32.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 28.65f, -48.0f, 64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-23.2f, 0.0f, -32.0f, 10.03f, -32.0f, 24.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.98f, 8.82f, 24.0f, 32.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(-23.2f, 0.0f, -32.0f, 10.03f, -32.0f, 24.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.98f, 8.82f, 24.0f, 32.0f, 24.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.35f, 21.49f, 64.0f, 48.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(123.4f, 0.0f, 133.15f, -105.75f, 280.0f, -136.0f)
                horizontalLineTo(169.61f)
                curveToRelative(6.14f, -4.02f, 11.77f, -9.44f, 16.72f, -16.0f)
                horizontalLineTo(472.0f)
                curveToRelative(43.78f, 0.0f, 87.74f, -8.84f, 120.6f, -24.24f)
                curveTo(622.28f, 289.85f, 640.0f, 271.99f, 640.0f, 256.0f)
                reflectiveCurveToRelative(-17.72f, -33.85f, -47.4f, -47.76f)
                close()
                moveTo(488.0f, 296.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                curveToRelative(31.91f, 0.0f, 31.94f, 80.0f, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
