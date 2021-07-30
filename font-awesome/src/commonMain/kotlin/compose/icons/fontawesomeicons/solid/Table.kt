package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Table: ImageVector
    get() {
        if (_table != null) {
            return _table!!
        }
        _table = Builder(name = "Table", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 32.0f)
                lineTo(48.0f, 32.0f)
                curveTo(21.49f, 32.0f, 0.0f, 53.49f, 0.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(512.0f, 80.0f)
                curveToRelative(0.0f, -26.51f, -21.49f, -48.0f, -48.0f, -48.0f)
                close()
                moveTo(224.0f, 416.0f)
                lineTo(64.0f, 416.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(224.0f, 256.0f)
                lineTo(64.0f, 256.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(448.0f, 416.0f)
                lineTo(288.0f, 416.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(96.0f)
                close()
                moveTo(448.0f, 256.0f)
                lineTo(288.0f, 256.0f)
                verticalLineToRelative(-96.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(96.0f)
                close()
            }
        }
        .build()
        return _table!!
    }

private var _table: ImageVector? = null
