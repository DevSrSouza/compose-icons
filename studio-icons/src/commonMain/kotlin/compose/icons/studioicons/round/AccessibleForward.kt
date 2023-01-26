package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.AccessibleForward: ImageVector
    get() {
        if (_accessibleForward != null) {
            return _accessibleForward!!
        }
        _accessibleForward = Builder(name = "AccessibleForward", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.54f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f)
                verticalLineToRelative(-2.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f)
                reflectiveCurveToRelative(2.24f, 5.0f, 5.0f, 5.0f)
                reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f)
                close()
                moveTo(18.0f, 13.5f)
                horizontalLineToRelative(-1.86f)
                lineToRelative(1.67f, -3.67f)
                curveTo(18.42f, 8.5f, 17.44f, 7.0f, 15.96f, 7.0f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-0.81f, 0.0f, -1.54f, 0.47f, -1.87f, 1.2f)
                lineToRelative(-0.28f, 0.76f)
                curveToRelative(-0.21f, 0.56f, 0.11f, 1.17f, 0.68f, 1.33f)
                curveToRelative(0.49f, 0.14f, 1.0f, -0.11f, 1.2f, -0.58f)
                lineToRelative(0.3f, -0.71f)
                lineTo(13.0f, 9.0f)
                lineToRelative(-1.83f, 4.1f)
                curveToRelative(-0.6f, 1.33f, 0.39f, 2.9f, 1.85f, 2.9f)
                lineTo(18.0f, 16.0f)
                verticalLineToRelative(4.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
            }
        }
        .build()
        return _accessibleForward!!
    }

private var _accessibleForward: ImageVector? = null
