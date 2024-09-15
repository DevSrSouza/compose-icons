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

public val LineAwesomeIcons.DollySolid: ImageVector
    get() {
        if (_dollySolid != null) {
            return _dollySolid!!
        }
        _dollySolid = Builder(name = "DollySolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.594f, 1.656f)
                lineTo(17.656f, 2.0f)
                lineTo(12.125f, 4.031f)
                lineTo(11.188f, 4.375f)
                lineTo(11.531f, 5.313f)
                lineTo(13.219f, 9.875f)
                lineTo(13.563f, 10.813f)
                lineTo(14.5f, 10.469f)
                lineTo(20.031f, 8.438f)
                lineTo(20.969f, 8.094f)
                lineTo(20.625f, 7.156f)
                lineTo(18.938f, 2.594f)
                close()
                moveTo(8.594f, 3.0f)
                lineTo(7.656f, 3.344f)
                lineTo(5.0f, 4.313f)
                lineTo(5.656f, 6.188f)
                lineTo(7.406f, 5.563f)
                lineTo(14.063f, 23.344f)
                lineTo(14.406f, 24.281f)
                lineTo(15.344f, 23.938f)
                lineTo(25.969f, 19.938f)
                lineTo(25.281f, 18.063f)
                lineTo(15.594f, 21.719f)
                lineTo(8.938f, 3.938f)
                close()
                moveTo(17.406f, 4.219f)
                lineTo(18.406f, 6.906f)
                lineTo(14.75f, 8.25f)
                lineTo(13.75f, 5.563f)
                close()
                moveTo(21.781f, 9.906f)
                lineTo(20.844f, 10.25f)
                lineTo(15.313f, 12.281f)
                lineTo(14.375f, 12.625f)
                lineTo(14.719f, 13.563f)
                lineTo(16.406f, 18.125f)
                lineTo(16.75f, 19.063f)
                lineTo(17.688f, 18.719f)
                lineTo(23.219f, 16.688f)
                lineTo(24.156f, 16.344f)
                lineTo(23.813f, 15.375f)
                lineTo(22.125f, 10.844f)
                close()
                moveTo(20.594f, 12.469f)
                lineTo(21.594f, 15.156f)
                lineTo(17.938f, 16.5f)
                lineTo(16.938f, 13.813f)
                close()
                moveTo(11.0f, 21.0f)
                curveTo(9.355f, 21.0f, 8.0f, 22.355f, 8.0f, 24.0f)
                curveTo(8.0f, 25.645f, 9.355f, 27.0f, 11.0f, 27.0f)
                curveTo(12.645f, 27.0f, 14.0f, 25.645f, 14.0f, 24.0f)
                curveTo(14.0f, 22.355f, 12.645f, 21.0f, 11.0f, 21.0f)
                close()
                moveTo(11.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                lineTo(5.0f, 29.0f)
                lineTo(27.0f, 29.0f)
                lineTo(27.0f, 27.0f)
                close()
                moveTo(11.0f, 23.0f)
                curveTo(11.563f, 23.0f, 12.0f, 23.438f, 12.0f, 24.0f)
                curveTo(12.0f, 24.563f, 11.563f, 25.0f, 11.0f, 25.0f)
                curveTo(10.438f, 25.0f, 10.0f, 24.563f, 10.0f, 24.0f)
                curveTo(10.0f, 23.438f, 10.438f, 23.0f, 11.0f, 23.0f)
                close()
            }
        }
        .build()
        return _dollySolid!!
    }

private var _dollySolid: ImageVector? = null
