package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                moveTo(592.604f, 208.244f)
                curveTo(559.735f, 192.836f, 515.777f, 184.0f, 472.0f, 184.0f)
                horizontalLineTo(186.327f)
                curveToRelative(-4.952f, -6.555f, -10.585f, -11.978f, -16.72f, -16.0f)
                horizontalLineTo(376.0f)
                curveTo(229.157f, 137.747f, 219.403f, 32.0f, 96.003f, 32.0f)
                horizontalLineTo(96.0f)
                verticalLineToRelative(128.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(32.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 28.654f, -48.0f, 64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-23.197f, 0.0f, -32.0f, 10.032f, -32.0f, 24.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.983f, 8.819f, 24.0f, 32.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(-23.197f, 0.0f, -32.0f, 10.032f, -32.0f, 24.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 13.983f, 8.819f, 24.0f, 32.0f, 24.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.346f, 21.49f, 64.0f, 48.0f, 64.0f)
                verticalLineTo(352.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(128.0f)
                horizontalLineToRelative(0.003f)
                curveToRelative(123.4f, 0.0f, 133.154f, -105.747f, 279.997f, -136.0f)
                horizontalLineTo(169.606f)
                curveToRelative(6.135f, -4.022f, 11.768f, -9.445f, 16.72f, -16.0f)
                horizontalLineTo(472.0f)
                curveToRelative(43.777f, 0.0f, 87.735f, -8.836f, 120.604f, -24.244f)
                curveTo(622.282f, 289.845f, 640.0f, 271.992f, 640.0f, 256.0f)
                reflectiveCurveToRelative(-17.718f, -33.845f, -47.396f, -47.756f)
                close()
                moveTo(488.0f, 296.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                curveToRelative(31.909f, 0.0f, 31.942f, 80.0f, 0.0f, 80.0f)
                close()
            }
        }
        .build()
        return _spaceShuttle!!
    }

private var _spaceShuttle: ImageVector? = null
