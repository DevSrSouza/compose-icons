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

public val SolidGroup.Eye: ImageVector
    get() {
        if (_eye != null) {
            return _eye!!
        }
        _eye = Builder(name = "Eye", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(572.52f, 241.4f)
                curveTo(518.29f, 135.59f, 410.93f, 64.0f, 288.0f, 64.0f)
                reflectiveCurveTo(57.68f, 135.64f, 3.48f, 241.41f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, 29.19f)
                curveTo(57.71f, 376.41f, 165.07f, 448.0f, 288.0f, 448.0f)
                reflectiveCurveToRelative(230.32f, -71.64f, 284.52f, -177.41f)
                arcToRelative(32.35f, 32.35f, 0.0f, false, false, 0.0f, -29.19f)
                close()
                moveTo(288.0f, 400.0f)
                arcToRelative(144.0f, 144.0f, 0.0f, true, true, 144.0f, -144.0f)
                arcToRelative(143.93f, 143.93f, 0.0f, false, true, -144.0f, 144.0f)
                close()
                moveTo(288.0f, 160.0f)
                arcToRelative(95.31f, 95.31f, 0.0f, false, false, -25.31f, 3.79f)
                arcToRelative(47.85f, 47.85f, 0.0f, false, true, -66.9f, 66.9f)
                arcTo(95.78f, 95.78f, 0.0f, true, false, 288.0f, 160.0f)
                close()
            }
        }
        .build()
        return _eye!!
    }

private var _eye: ImageVector? = null
