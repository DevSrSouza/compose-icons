package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.Cannabis: ImageVector
    get() {
        if (_cannabis != null) {
            return _cannabis!!
        }
        _cannabis = Builder(name = "Cannabis", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 20.0f)
                reflectiveCurveToRelative(0.0f, -2.0f, 1.0f, -3.5f)
                curveToRelative(-1.5f, 0.0f, -2.0f, -0.5f, -4.0f, -1.5f)
                curveToRelative(0.0f, 0.0f, 1.839f, -1.38f, 5.0f, -1.0f)
                curveToRelative(-1.789f, -0.97f, -3.279f, -2.03f, -5.0f, -6.0f)
                curveToRelative(0.0f, 0.0f, 3.98f, -0.3f, 6.5f, 3.5f)
                curveToRelative(-2.284f, -4.9f, 1.5f, -9.5f, 1.5f, -9.5f)
                curveToRelative(2.734f, 5.47f, 2.389f, 7.5f, 1.5f, 9.5f)
                curveToRelative(2.531f, -3.77f, 6.5f, -3.5f, 6.5f, -3.5f)
                curveToRelative(-1.721f, 3.97f, -3.211f, 5.03f, -5.0f, 6.0f)
                curveToRelative(3.161f, -0.38f, 5.0f, 1.0f, 5.0f, 1.0f)
                curveToRelative(-2.0f, 1.0f, -2.5f, 1.5f, -4.0f, 1.5f)
                curveToRelative(1.0f, 1.5f, 1.0f, 3.5f, 1.0f, 3.5f)
                curveToRelative(-2.0f, 0.0f, -4.438f, -2.22f, -5.0f, -3.0f)
                curveToRelative(-0.563f, 0.78f, -3.0f, 3.0f, -5.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                verticalLineToRelative(-5.0f)
            }
        }
        .build()
        return _cannabis!!
    }

private var _cannabis: ImageVector? = null
