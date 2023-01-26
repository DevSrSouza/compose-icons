package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.School: ImageVector
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
                verticalLineToRelative(4.0f)
                lineTo(12.0f, 21.0f)
                lineToRelative(7.0f, -3.82f)
                verticalLineToRelative(-4.0f)
                lineTo(12.0f, 17.0f)
                lineToRelative(-7.0f, -3.82f)
                close()
                moveTo(12.0f, 3.0f)
                lineTo(1.0f, 9.0f)
                lineToRelative(11.0f, 6.0f)
                lineToRelative(9.0f, -4.91f)
                verticalLineTo(17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                lineTo(12.0f, 3.0f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
