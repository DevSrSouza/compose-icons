package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.ChildSolid: ImageVector
    get() {
        if (_childSolid != null) {
            return _childSolid!!
        }
        _childSolid = Builder(name = "ChildSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(13.25f, 3.0f, 11.0f, 5.25f, 11.0f, 8.0f)
                curveTo(11.0f, 9.5703f, 11.7656f, 10.957f, 12.9063f, 11.875f)
                curveTo(11.1758f, 12.9297f, 10.0f, 14.832f, 10.0f, 17.0f)
                lineTo(10.0f, 20.4063f)
                lineTo(10.2813f, 20.7188f)
                lineTo(12.0f, 22.4375f)
                lineTo(12.0f, 29.0f)
                lineTo(14.0f, 29.0f)
                lineTo(14.0f, 24.0f)
                lineTo(18.0f, 24.0f)
                lineTo(18.0f, 29.0f)
                lineTo(20.0f, 29.0f)
                lineTo(20.0f, 22.4375f)
                lineTo(21.7188f, 20.7188f)
                lineTo(22.0f, 20.4063f)
                lineTo(22.0f, 17.0f)
                curveTo(22.0f, 14.832f, 20.8242f, 12.9297f, 19.0938f, 11.875f)
                curveTo(20.2344f, 10.957f, 21.0f, 9.5703f, 21.0f, 8.0f)
                curveTo(21.0f, 5.25f, 18.75f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(17.668f, 5.0f, 19.0f, 6.332f, 19.0f, 8.0f)
                curveTo(19.0f, 9.668f, 17.668f, 11.0f, 16.0f, 11.0f)
                curveTo(14.332f, 11.0f, 13.0f, 9.668f, 13.0f, 8.0f)
                curveTo(13.0f, 6.332f, 14.332f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(18.2188f, 13.0f, 20.0f, 14.7813f, 20.0f, 17.0f)
                lineTo(20.0f, 19.5625f)
                lineTo(19.5625f, 20.0f)
                lineTo(12.4375f, 20.0f)
                lineTo(12.0f, 19.5625f)
                lineTo(12.0f, 17.0f)
                curveTo(12.0f, 14.7813f, 13.7813f, 13.0f, 16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _childSolid!!
    }

private var _childSolid: ImageVector? = null
