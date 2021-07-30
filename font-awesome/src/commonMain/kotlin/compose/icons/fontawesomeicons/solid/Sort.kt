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

public val SolidGroup.Sort: ImageVector
    get() {
        if (_sort != null) {
            return _sort!!
        }
        _sort = Builder(name = "Sort", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(41.0f, 288.0f)
                horizontalLineToRelative(238.0f)
                curveToRelative(21.4f, 0.0f, 32.1f, 25.9f, 17.0f, 41.0f)
                lineTo(177.0f, 448.0f)
                curveToRelative(-9.4f, 9.4f, -24.6f, 9.4f, -33.9f, 0.0f)
                lineTo(24.0f, 329.0f)
                curveToRelative(-15.1f, -15.1f, -4.4f, -41.0f, 17.0f, -41.0f)
                close()
                moveTo(296.0f, 183.0f)
                lineTo(177.0f, 64.0f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineTo(24.0f, 183.0f)
                curveToRelative(-15.1f, 15.1f, -4.4f, 41.0f, 17.0f, 41.0f)
                horizontalLineToRelative(238.0f)
                curveToRelative(21.4f, 0.0f, 32.1f, -25.9f, 17.0f, -41.0f)
                close()
            }
        }
        .build()
        return _sort!!
    }

private var _sort: ImageVector? = null
