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

public val RoundGroup.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.18f)
                verticalLineToRelative(2.81f)
                curveToRelative(0.0f, 0.73f, 0.4f, 1.41f, 1.04f, 1.76f)
                lineToRelative(5.0f, 2.73f)
                curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f)
                lineToRelative(5.0f, -2.73f)
                curveToRelative(0.64f, -0.35f, 1.04f, -1.03f, 1.04f, -1.76f)
                verticalLineToRelative(-2.81f)
                lineToRelative(-6.04f, 3.3f)
                curveToRelative(-0.6f, 0.33f, -1.32f, 0.33f, -1.92f, 0.0f)
                lineTo(5.0f, 13.18f)
                close()
                moveTo(11.04f, 3.52f)
                lineToRelative(-8.43f, 4.6f)
                curveToRelative(-0.69f, 0.38f, -0.69f, 1.38f, 0.0f, 1.76f)
                lineToRelative(8.43f, 4.6f)
                curveToRelative(0.6f, 0.33f, 1.32f, 0.33f, 1.92f, 0.0f)
                lineTo(21.0f, 10.09f)
                lineTo(21.0f, 16.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                lineTo(23.0f, 9.59f)
                curveToRelative(0.0f, -0.37f, -0.2f, -0.7f, -0.52f, -0.88f)
                lineToRelative(-9.52f, -5.19f)
                curveToRelative(-0.6f, -0.32f, -1.32f, -0.32f, -1.92f, 0.0f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
