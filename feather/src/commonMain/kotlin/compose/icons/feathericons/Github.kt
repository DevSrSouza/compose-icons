package compose.icons.feathericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.FeatherIcons

public val FeatherIcons.Github: ImageVector
    get() {
        if (_github != null) {
            return _github!!
        }
        _github = Builder(name = "Github", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 19.0f)
                curveToRelative(-5.0f, 1.5f, -5.0f, -2.5f, -7.0f, -3.0f)
                moveToRelative(14.0f, 6.0f)
                verticalLineToRelative(-3.87f)
                arcToRelative(3.37f, 3.37f, 0.0f, false, false, -0.94f, -2.61f)
                curveToRelative(3.14f, -0.35f, 6.44f, -1.54f, 6.44f, -7.0f)
                arcTo(5.44f, 5.44f, 0.0f, false, false, 20.0f, 4.77f)
                arcTo(5.07f, 5.07f, 0.0f, false, false, 19.91f, 1.0f)
                reflectiveCurveTo(18.73f, 0.65f, 16.0f, 2.48f)
                arcToRelative(13.38f, 13.38f, 0.0f, false, false, -7.0f, 0.0f)
                curveTo(6.27f, 0.65f, 5.09f, 1.0f, 5.09f, 1.0f)
                arcTo(5.07f, 5.07f, 0.0f, false, false, 5.0f, 4.77f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -1.5f, 3.78f)
                curveToRelative(0.0f, 5.42f, 3.3f, 6.61f, 6.44f, 7.0f)
                arcTo(3.37f, 3.37f, 0.0f, false, false, 9.0f, 18.13f)
                verticalLineTo(22.0f)
            }
        }
        .build()
        return _github!!
    }

private var _github: ImageVector? = null
