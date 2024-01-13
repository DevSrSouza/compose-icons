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

public val SolidGroup.TableColumns: ImageVector
    get() {
        if (_tableColumns != null) {
            return _tableColumns!!
        }
        _tableColumns = Builder(name = "TableColumns", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 96.0f)
                curveTo(0.0f, 60.7f, 28.7f, 32.0f, 64.0f, 32.0f)
                lineTo(448.0f, 32.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(512.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 480.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                lineTo(0.0f, 96.0f)
                close()
                moveTo(64.0f, 160.0f)
                lineTo(64.0f, 416.0f)
                lineTo(224.0f, 416.0f)
                lineTo(224.0f, 160.0f)
                lineTo(64.0f, 160.0f)
                close()
                moveTo(448.0f, 160.0f)
                lineTo(288.0f, 160.0f)
                lineTo(288.0f, 416.0f)
                lineTo(448.0f, 416.0f)
                lineTo(448.0f, 160.0f)
                close()
            }
        }
        .build()
        return _tableColumns!!
    }

private var _tableColumns: ImageVector? = null
