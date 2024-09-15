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

public val LineAwesomeIcons.BellSlashSolid: ImageVector
    get() {
        if (_bellSlashSolid != null) {
            return _bellSlashSolid!!
        }
        _bellSlashSolid = Builder(name = "BellSlashSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.719f, 2.281f)
                lineTo(2.281f, 3.719f)
                lineTo(28.281f, 29.719f)
                lineTo(29.719f, 28.281f)
                lineTo(26.0f, 24.563f)
                lineTo(26.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                curveTo(24.449f, 23.0f, 24.0f, 22.551f, 24.0f, 22.0f)
                lineTo(24.0f, 13.281f)
                curveTo(24.0f, 9.453f, 21.418f, 6.203f, 17.969f, 5.281f)
                curveTo(17.98f, 5.188f, 18.0f, 5.098f, 18.0f, 5.0f)
                curveTo(18.0f, 3.895f, 17.105f, 3.0f, 16.0f, 3.0f)
                curveTo(14.895f, 3.0f, 14.0f, 3.895f, 14.0f, 5.0f)
                curveTo(14.0f, 5.086f, 14.02f, 5.168f, 14.031f, 5.25f)
                curveTo(12.691f, 5.59f, 11.457f, 6.262f, 10.438f, 7.25f)
                curveTo(10.137f, 7.539f, 9.871f, 7.863f, 9.625f, 8.188f)
                close()
                moveTo(15.563f, 7.0f)
                curveTo(15.766f, 6.984f, 15.984f, 6.992f, 16.188f, 7.0f)
                curveTo(19.395f, 7.098f, 22.0f, 9.91f, 22.0f, 13.281f)
                lineTo(22.0f, 20.563f)
                lineTo(11.063f, 9.625f)
                curveTo(11.285f, 9.297f, 11.52f, 8.969f, 11.813f, 8.688f)
                curveTo(12.84f, 7.688f, 14.152f, 7.098f, 15.563f, 7.0f)
                close()
                moveTo(8.031f, 12.25f)
                curveTo(8.008f, 12.504f, 8.0f, 12.742f, 8.0f, 13.0f)
                lineTo(8.0f, 22.0f)
                curveTo(8.0f, 22.551f, 7.551f, 23.0f, 7.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 25.0f)
                lineTo(13.188f, 25.0f)
                curveTo(13.074f, 25.316f, 13.0f, 25.648f, 13.0f, 26.0f)
                curveTo(13.0f, 27.645f, 14.355f, 29.0f, 16.0f, 29.0f)
                curveTo(17.645f, 29.0f, 19.0f, 27.645f, 19.0f, 26.0f)
                curveTo(19.0f, 25.648f, 18.926f, 25.316f, 18.813f, 25.0f)
                lineTo(20.813f, 25.0f)
                lineTo(18.813f, 23.0f)
                lineTo(9.813f, 23.0f)
                curveTo(9.926f, 22.688f, 10.0f, 22.352f, 10.0f, 22.0f)
                lineTo(10.0f, 14.188f)
                close()
                moveTo(16.0f, 25.0f)
                curveTo(16.563f, 25.0f, 17.0f, 25.438f, 17.0f, 26.0f)
                curveTo(17.0f, 26.563f, 16.563f, 27.0f, 16.0f, 27.0f)
                curveTo(15.438f, 27.0f, 15.0f, 26.563f, 15.0f, 26.0f)
                curveTo(15.0f, 25.438f, 15.438f, 25.0f, 16.0f, 25.0f)
                close()
            }
        }
        .build()
        return _bellSlashSolid!!
    }

private var _bellSlashSolid: ImageVector? = null
