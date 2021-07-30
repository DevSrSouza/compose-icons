package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Helpdesk: ImageVector
    get() {
        if (_helpdesk != null) {
            return _helpdesk!!
        }
        _helpdesk = Builder(name = "Helpdesk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.71f)
                lineToRelative(6.12f, -5.31f)
                horizontalLineTo(12.0f)
                curveToRelative(-2.16f, 0.0f, -4.32f, 0.06f, -6.36f, 0.21f)
                curveToRelative(-0.84f, 0.06f, -1.5f, 0.69f, -1.56f, 1.53f)
                curveToRelative(-0.12f, 1.26f, -0.18f, 2.85f, -0.18f, 4.41f)
                verticalLineToRelative(0.87f)
                curveToRelative(0.0f, 1.59f, 0.06f, 3.15f, 0.18f, 4.41f)
                curveToRelative(0.09f, 0.81f, 0.75f, 1.47f, 1.56f, 1.5f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, false, 12.72f, 0.0f)
                curveToRelative(0.81f, -0.03f, 1.5f, -0.69f, 1.56f, -1.5f)
                curveToRelative(0.09f, -1.2f, 0.15f, -2.67f, 0.18f, -4.17f)
                lineTo(24.0f, 9.3f)
                verticalLineTo(12.66f)
                curveToRelative(0.0f, 1.59f, -0.06f, 3.18f, -0.18f, 4.47f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -5.19f, 5.1f)
                curveToRelative(-2.13f, 0.18f, -4.38f, 0.27f, -6.63f, 0.27f)
                reflectiveCurveToRelative(-4.5f, -0.09f, -6.63f, -0.24f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, -5.19f, -5.1f)
                curveTo(0.06f, 15.81f, 0.0f, 14.13f, 0.0f, 12.45f)
                verticalLineToRelative(-0.87f)
                curveTo(0.0f, 9.9f, 0.06f, 8.22f, 0.18f, 6.84f)
                arcToRelative(5.57f, 5.57f, 0.0f, false, true, 5.19f, -5.1f)
                curveTo(7.5f, 1.59f, 9.75f, 1.5f, 12.0f, 1.5f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(3.9f)
                lineTo(12.0f, 15.81f)
                lineToRelative(-5.61f, -4.86f)
                lineTo(9.33f, 8.4f)
                close()
            }
        }
        .build()
        return _helpdesk!!
    }

private var _helpdesk: ImageVector? = null
