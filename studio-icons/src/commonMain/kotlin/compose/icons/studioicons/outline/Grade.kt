package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Grade: ImageVector
    get() {
        if (_grade != null) {
            return _grade!!
        }
        _grade = Builder(name = "Grade", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.13f)
                lineToRelative(0.97f, 2.29f)
                lineToRelative(0.47f, 1.11f)
                lineToRelative(1.2f, 0.1f)
                lineToRelative(2.47f, 0.21f)
                lineToRelative(-1.88f, 1.63f)
                lineToRelative(-0.91f, 0.79f)
                lineToRelative(0.27f, 1.18f)
                lineToRelative(0.56f, 2.41f)
                lineToRelative(-2.12f, -1.28f)
                lineToRelative(-1.03f, -0.64f)
                lineToRelative(-1.03f, 0.62f)
                lineToRelative(-2.12f, 1.28f)
                lineToRelative(0.56f, -2.41f)
                lineToRelative(0.27f, -1.18f)
                lineToRelative(-0.91f, -0.79f)
                lineToRelative(-1.88f, -1.63f)
                lineToRelative(2.47f, -0.21f)
                lineToRelative(1.2f, -0.1f)
                lineToRelative(0.47f, -1.11f)
                lineToRelative(0.97f, -2.27f)
                moveTo(12.0f, 2.0f)
                lineTo(9.19f, 8.63f)
                lineTo(2.0f, 9.24f)
                lineToRelative(5.46f, 4.73f)
                lineTo(5.82f, 21.0f)
                lineTo(12.0f, 17.27f)
                lineTo(18.18f, 21.0f)
                lineToRelative(-1.64f, -7.03f)
                lineTo(22.0f, 9.24f)
                lineToRelative(-7.19f, -0.61f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _grade!!
    }

private var _grade: ImageVector? = null
