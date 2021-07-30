package compose.icons.lineaicons.software

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.lineaicons.SoftwareGroup

public val SoftwareGroup.SelectionRoundedrectangle: ImageVector
    get() {
        if (_selectionRoundedrectangle != null) {
            return _selectionRoundedrectangle!!
        }
        _selectionRoundedrectangle = Builder(name = "SelectionRoundedrectangle", defaultWidth =
                64.0.dp, defaultHeight = 64.0.dp, viewportWidth = 64.0f, viewportHeight =
                64.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(63.0f, 40.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                horizontalLineTo(13.0f)
                curveTo(6.373f, 52.0f, 1.0f, 46.627f, 1.0f, 40.0f)
                verticalLineTo(24.0f)
                curveToRelative(0.0f, -6.627f, 5.373f, -12.0f, 12.0f, -12.0f)
                horizontalLineToRelative(38.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                verticalLineTo(40.0f)
                close()
            }
        }
        .build()
        return _selectionRoundedrectangle!!
    }

private var _selectionRoundedrectangle: ImageVector? = null
