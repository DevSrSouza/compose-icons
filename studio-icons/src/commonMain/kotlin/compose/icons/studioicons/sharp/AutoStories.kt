package compose.icons.studioicons.sharp

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
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AutoStories: ImageVector
    get() {
        if (_autoStories != null) {
            return _autoStories!!
        }
        _autoStories = Builder(name = "AutoStories", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 4.6f)
                verticalLineToRelative(2.12f)
                verticalLineToRelative(7.24f)
                verticalLineToRelative(2.66f)
                curveTo(19.86f, 16.21f, 18.69f, 16.0f, 17.5f, 16.0f)
                curveToRelative(-1.9f, 0.0f, -3.78f, 0.54f, -5.5f, 1.58f)
                verticalLineToRelative(-3.62f)
                verticalLineTo(7.79f)
                verticalLineTo(5.48f)
                curveTo(10.38f, 4.55f, 8.51f, 4.0f, 6.5f, 4.0f)
                reflectiveCurveTo(2.62f, 4.55f, 1.0f, 5.48f)
                verticalLineTo(20.0f)
                curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f)
                reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2.0f)
                curveToRelative(1.52f, -1.18f, 3.43f, -2.0f, 5.5f, -2.0f)
                reflectiveCurveToRelative(3.98f, 0.82f, 5.5f, 2.0f)
                verticalLineTo(5.48f)
                curveTo(22.37f, 5.12f, 21.7f, 4.84f, 21.0f, 4.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 0.5f)
                lineToRelative(-5.0f, 5.0f)
                lineToRelative(0.0f, 9.5f)
                lineToRelative(5.0f, -4.5f)
                close()
            }
        }
        .build()
        return _autoStories!!
    }

private var _autoStories: ImageVector? = null
