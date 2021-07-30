package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.NorthStar24: ImageVector
    get() {
        if (_northStar24 != null) {
            return _northStar24!!
        }
        _northStar24 = Builder(name = "NorthStar24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(8.69f)
                lineTo(6.447f, 5.385f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.061f, 1.06f)
                lineTo(9.94f, 11.0f)
                horizontalLineTo(1.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, 1.5f)
                horizontalLineToRelative(8.69f)
                lineToRelative(-4.554f, 4.553f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 1.061f)
                lineTo(11.0f, 13.561f)
                verticalLineToRelative(8.689f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-8.69f)
                lineToRelative(4.553f, 4.554f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.061f, -1.06f)
                lineTo(13.561f, 12.5f)
                horizontalLineToRelative(8.689f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -1.5f)
                horizontalLineToRelative(-8.69f)
                lineToRelative(4.554f, -4.553f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -1.06f, -1.061f)
                lineTo(12.5f, 9.939f)
                verticalLineTo(1.25f)
                close()
            }
        }
        .build()
        return _northStar24!!
    }

private var _northStar24: ImageVector? = null
