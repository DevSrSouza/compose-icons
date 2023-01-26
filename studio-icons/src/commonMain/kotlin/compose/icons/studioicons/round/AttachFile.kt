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

public val RoundGroup.AttachFile: ImageVector
    get() {
        if (_attachFile != null) {
            return _attachFile!!
        }
        _attachFile = Builder(name = "AttachFile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 6.75f)
                verticalLineToRelative(10.58f)
                curveToRelative(0.0f, 2.09f, -1.53f, 3.95f, -3.61f, 4.15f)
                curveToRelative(-2.39f, 0.23f, -4.39f, -1.64f, -4.39f, -3.98f)
                verticalLineTo(5.14f)
                curveToRelative(0.0f, -1.31f, 0.94f, -2.5f, 2.24f, -2.63f)
                curveToRelative(1.5f, -0.15f, 2.76f, 1.02f, 2.76f, 2.49f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(6.75f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(8.61f)
                curveToRelative(0.0f, 1.31f, 0.94f, 2.5f, 2.24f, 2.63f)
                curveToRelative(1.5f, 0.15f, 2.76f, -1.02f, 2.76f, -2.49f)
                verticalLineTo(5.17f)
                curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f)
                curveTo(9.01f, 0.79f, 7.0f, 2.66f, 7.0f, 5.0f)
                verticalLineToRelative(12.27f)
                curveToRelative(0.0f, 2.87f, 2.1f, 5.44f, 4.96f, 5.71f)
                curveToRelative(3.29f, 0.3f, 6.04f, -2.26f, 6.04f, -5.48f)
                verticalLineTo(6.75f)
                curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f)
                reflectiveCurveToRelative(-0.75f, 0.34f, -0.75f, 0.75f)
                close()
            }
        }
        .build()
        return _attachFile!!
    }

private var _attachFile: ImageVector? = null
