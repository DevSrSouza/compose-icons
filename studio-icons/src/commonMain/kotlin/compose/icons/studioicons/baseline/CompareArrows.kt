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

public val BaselineGroup.CompareArrows: ImageVector
    get() {
        if (_compareArrows != null) {
            return _compareArrows!!
        }
        _compareArrows = Builder(name = "CompareArrows", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.01f, 14.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.01f)
                verticalLineToRelative(3.0f)
                lineTo(13.0f, 15.0f)
                lineToRelative(-3.99f, -4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(14.99f, 13.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(-7.01f)
                verticalLineTo(5.0f)
                lineTo(11.0f, 9.0f)
                lineTo(14.99f, 13.0f)
                close()
            }
        }
        .build()
        return _compareArrows!!
    }

private var _compareArrows: ImageVector? = null
