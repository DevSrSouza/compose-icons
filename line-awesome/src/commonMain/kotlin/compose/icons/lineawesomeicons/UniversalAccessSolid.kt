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

public val LineAwesomeIcons.UniversalAccessSolid: ImageVector
    get() {
        if (_universalAccessSolid != null) {
            return _universalAccessSolid!!
        }
        _universalAccessSolid = Builder(name = "UniversalAccessSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(16.0f, 8.0f)
                curveTo(14.895f, 8.0f, 14.0f, 8.895f, 14.0f, 10.0f)
                curveTo(14.0f, 11.105f, 14.895f, 12.0f, 16.0f, 12.0f)
                curveTo(17.105f, 12.0f, 18.0f, 11.105f, 18.0f, 10.0f)
                curveTo(18.0f, 8.895f, 17.105f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(10.219f, 12.031f)
                lineTo(9.781f, 13.969f)
                lineTo(14.0f, 14.906f)
                lineTo(14.0f, 19.0f)
                lineTo(13.031f, 23.813f)
                lineTo(14.969f, 24.188f)
                lineTo(15.969f, 19.188f)
                lineTo(16.0f, 19.094f)
                lineTo(16.031f, 19.188f)
                lineTo(17.031f, 24.188f)
                lineTo(18.969f, 23.813f)
                lineTo(18.0f, 19.0f)
                lineTo(18.0f, 14.906f)
                lineTo(22.219f, 13.969f)
                lineTo(21.781f, 12.031f)
                lineTo(17.5f, 13.0f)
                lineTo(14.5f, 13.0f)
                close()
            }
        }
        .build()
        return _universalAccessSolid!!
    }

private var _universalAccessSolid: ImageVector? = null
