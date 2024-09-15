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

public val LineAwesomeIcons.SyncSolid: ImageVector
    get() {
        if (_syncSolid != null) {
            return _syncSolid!!
        }
        _syncSolid = Builder(name = "SyncSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.887f, 4.0f, 6.617f, 7.16f, 4.875f, 11.625f)
                lineTo(6.719f, 12.375f)
                curveTo(8.176f, 8.641f, 11.711f, 6.0f, 16.0f, 6.0f)
                curveTo(19.242f, 6.0f, 22.133f, 7.59f, 23.938f, 10.0f)
                lineTo(20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(27.0f, 12.0f)
                lineTo(27.0f, 5.0f)
                lineTo(25.0f, 5.0f)
                lineTo(25.0f, 8.094f)
                curveTo(22.809f, 5.582f, 19.57f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(25.281f, 19.625f)
                curveTo(23.824f, 23.359f, 20.289f, 26.0f, 16.0f, 26.0f)
                curveTo(12.723f, 26.0f, 9.844f, 24.387f, 8.031f, 22.0f)
                lineTo(12.0f, 22.0f)
                lineTo(12.0f, 20.0f)
                lineTo(5.0f, 20.0f)
                lineTo(5.0f, 27.0f)
                lineTo(7.0f, 27.0f)
                lineTo(7.0f, 23.906f)
                curveTo(9.188f, 26.387f, 12.395f, 28.0f, 16.0f, 28.0f)
                curveTo(21.113f, 28.0f, 25.383f, 24.84f, 27.125f, 20.375f)
                close()
            }
        }
        .build()
        return _syncSolid!!
    }

private var _syncSolid: ImageVector? = null
