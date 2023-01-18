package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.FlaskSharp: ImageVector
    get() {
        if (_flaskSharp != null) {
            return _flaskSharp!!
        }
        _flaskSharp = Builder(name = "FlaskSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(469.11f, 382.76f)
                lineTo(325.0f, 153.92f)
                verticalLineTo(74.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(32.0f)
                horizontalLineTo(155.0f)
                verticalLineTo(74.0f)
                horizontalLineToRelative(32.0f)
                verticalLineToRelative(79.92f)
                lineTo(42.89f, 382.76f)
                curveToRelative(-13.0f, 20.64f, -14.78f, 43.73f, -3.0f, 65.1f)
                reflectiveCurveTo(71.59f, 480.0f, 96.0f, 480.0f)
                horizontalLineTo(416.0f)
                curveToRelative(24.41f, 0.0f, 44.32f, -10.76f, 56.1f, -32.14f)
                reflectiveCurveTo(482.14f, 403.4f, 469.11f, 382.76f)
                close()
                moveTo(224.39f, 173.39f)
                arcToRelative(29.76f, 29.76f, 0.0f, false, false, 4.62f, -16.0f)
                verticalLineTo(74.0f)
                horizontalLineToRelative(54.0f)
                verticalLineToRelative(84.59f)
                arcToRelative(25.85f, 25.85f, 0.0f, false, false, 4.0f, 13.82f)
                lineTo(356.82f, 283.0f)
                horizontalLineTo(155.18f)
                close()
            }
        }
        .build()
        return _flaskSharp!!
    }

private var _flaskSharp: ImageVector? = null
