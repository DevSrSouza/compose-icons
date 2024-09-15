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

public val LineAwesomeIcons.CompactDiscSolid: ImageVector
    get() {
        if (_compactDiscSolid != null) {
            return _compactDiscSolid!!
        }
        _compactDiscSolid = Builder(name = "CompactDiscSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.383f, 4.0f, 4.0f, 9.383f, 4.0f, 16.0f)
                curveTo(4.0f, 22.617f, 9.383f, 28.0f, 16.0f, 28.0f)
                curveTo(22.617f, 28.0f, 28.0f, 22.617f, 28.0f, 16.0f)
                curveTo(28.0f, 9.383f, 22.617f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.535f, 6.0f, 26.0f, 10.465f, 26.0f, 16.0f)
                curveTo(26.0f, 21.535f, 21.535f, 26.0f, 16.0f, 26.0f)
                curveTo(10.465f, 26.0f, 6.0f, 21.535f, 6.0f, 16.0f)
                curveTo(6.0f, 10.465f, 10.465f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.219f, 8.5f)
                curveTo(11.043f, 9.309f, 9.309f, 11.043f, 8.5f, 13.219f)
                lineTo(10.375f, 13.906f)
                curveTo(10.98f, 12.277f, 12.277f, 10.98f, 13.906f, 10.375f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(14.355f, 13.0f, 13.0f, 14.355f, 13.0f, 16.0f)
                curveTo(13.0f, 17.645f, 14.355f, 19.0f, 16.0f, 19.0f)
                curveTo(17.645f, 19.0f, 19.0f, 17.645f, 19.0f, 16.0f)
                curveTo(19.0f, 14.355f, 17.645f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(16.563f, 15.0f, 17.0f, 15.438f, 17.0f, 16.0f)
                curveTo(17.0f, 16.563f, 16.563f, 17.0f, 16.0f, 17.0f)
                curveTo(15.438f, 17.0f, 15.0f, 16.563f, 15.0f, 16.0f)
                curveTo(15.0f, 15.438f, 15.438f, 15.0f, 16.0f, 15.0f)
                close()
                moveTo(21.625f, 18.094f)
                curveTo(21.02f, 19.723f, 19.723f, 21.02f, 18.094f, 21.625f)
                lineTo(18.781f, 23.5f)
                curveTo(20.957f, 22.691f, 22.691f, 20.957f, 23.5f, 18.781f)
                close()
            }
        }
        .build()
        return _compactDiscSolid!!
    }

private var _compactDiscSolid: ImageVector? = null
