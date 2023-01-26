package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TableBar: ImageVector
    get() {
        if (_tableBar != null) {
            return _tableBar!!
        }
        _tableBar = Builder(name = "TableBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.5f)
                curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f)
                curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                lineToRelative(-2.0f, 5.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.2f, -3.0f)
                horizontalLineToRelative(5.6f)
                lineToRelative(1.2f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-2.0f, -5.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-4.02f)
                curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f)
                close()
            }
        }
        .build()
        return _tableBar!!
    }

private var _tableBar: ImageVector? = null