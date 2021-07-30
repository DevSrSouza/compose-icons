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

public val SolidGroup.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 117.66f)
                verticalLineToRelative(346.32f)
                curveToRelative(0.0f, 11.32f, 11.43f, 19.06f, 21.94f, 14.86f)
                lineTo(160.0f, 416.0f)
                verticalLineTo(32.0f)
                lineTo(20.12f, 87.95f)
                arcTo(32.006f, 32.006f, 0.0f, false, false, 0.0f, 117.66f)
                close()
                moveTo(192.0f, 416.0f)
                lineToRelative(192.0f, 64.0f)
                verticalLineTo(96.0f)
                lineTo(192.0f, 32.0f)
                verticalLineToRelative(384.0f)
                close()
                moveTo(554.06f, 33.16f)
                lineTo(416.0f, 96.0f)
                verticalLineToRelative(384.0f)
                lineToRelative(139.88f, -55.95f)
                arcTo(31.996f, 31.996f, 0.0f, false, false, 576.0f, 394.34f)
                verticalLineTo(48.02f)
                curveToRelative(0.0f, -11.32f, -11.43f, -19.06f, -21.94f, -14.86f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
