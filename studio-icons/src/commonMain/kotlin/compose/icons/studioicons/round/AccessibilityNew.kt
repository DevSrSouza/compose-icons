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

public val RoundGroup.AccessibilityNew: ImageVector
    get() {
        if (_accessibilityNew != null) {
            return _accessibilityNew!!
        }
        _accessibilityNew = Builder(name = "AccessibilityNew", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.75f, 6.99f)
                curveToRelative(-0.14f, -0.55f, -0.69f, -0.87f, -1.24f, -0.75f)
                curveToRelative(-2.38f, 0.53f, -5.03f, 0.76f, -7.51f, 0.76f)
                reflectiveCurveToRelative(-5.13f, -0.23f, -7.51f, -0.76f)
                curveToRelative(-0.55f, -0.12f, -1.1f, 0.2f, -1.24f, 0.75f)
                curveToRelative(-0.14f, 0.56f, 0.2f, 1.13f, 0.75f, 1.26f)
                curveToRelative(1.61f, 0.36f, 3.35f, 0.61f, 5.0f, 0.75f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(9.0f)
                curveToRelative(1.65f, -0.14f, 3.39f, -0.39f, 4.99f, -0.75f)
                curveToRelative(0.56f, -0.13f, 0.9f, -0.7f, 0.76f, -1.26f)
                close()
                moveTo(12.0f, 6.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                close()
            }
        }
        .build()
        return _accessibilityNew!!
    }

private var _accessibilityNew: ImageVector? = null
