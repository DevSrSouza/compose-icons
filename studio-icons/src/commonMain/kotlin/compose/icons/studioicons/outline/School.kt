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

public val OutlineGroup.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(1.0f, 9.0f)
                lineToRelative(4.0f, 2.18f)
                verticalLineToRelative(6.0f)
                lineTo(12.0f, 21.0f)
                lineToRelative(7.0f, -3.82f)
                verticalLineToRelative(-6.0f)
                lineToRelative(2.0f, -1.09f)
                lineTo(21.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                lineTo(23.0f, 9.0f)
                lineTo(12.0f, 3.0f)
                close()
                moveTo(18.82f, 9.0f)
                lineTo(12.0f, 12.72f)
                lineTo(5.18f, 9.0f)
                lineTo(12.0f, 5.28f)
                lineTo(18.82f, 9.0f)
                close()
                moveTo(17.0f, 15.99f)
                lineToRelative(-5.0f, 2.73f)
                lineToRelative(-5.0f, -2.73f)
                verticalLineToRelative(-3.72f)
                lineTo(12.0f, 15.0f)
                lineToRelative(5.0f, -2.73f)
                verticalLineToRelative(3.72f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
