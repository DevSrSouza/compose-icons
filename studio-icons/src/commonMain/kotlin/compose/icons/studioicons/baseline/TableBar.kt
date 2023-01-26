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

public val BaselineGroup.TableBar: ImageVector
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
                horizontalLineTo(9.35f)
                curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f)
                lineTo(6.0f, 20.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(1.2f, -3.0f)
                horizontalLineToRelative(5.6f)
                lineToRelative(1.2f, 3.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-1.5f, -3.74f)
                curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-4.02f)
                curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f)
                close()
            }
        }
        .build()
        return _tableBar!!
    }

private var _tableBar: ImageVector? = null
