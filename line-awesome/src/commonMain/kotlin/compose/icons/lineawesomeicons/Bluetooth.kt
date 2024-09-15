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

public val LineAwesomeIcons.Bluetooth: ImageVector
    get() {
        if (_bluetooth != null) {
            return _bluetooth!!
        }
        _bluetooth = Builder(name = "Bluetooth", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(12.887f, 2.0f, 10.031f, 2.742f, 8.031f, 4.969f)
                curveTo(6.031f, 7.195f, 5.0f, 10.715f, 5.0f, 16.0f)
                curveTo(5.0f, 21.285f, 6.031f, 24.805f, 8.031f, 27.031f)
                curveTo(10.031f, 29.258f, 12.887f, 30.0f, 16.0f, 30.0f)
                curveTo(19.113f, 30.0f, 21.973f, 29.258f, 23.969f, 27.031f)
                curveTo(25.965f, 24.805f, 27.0f, 21.285f, 27.0f, 16.0f)
                curveTo(27.0f, 10.715f, 25.965f, 7.195f, 23.969f, 4.969f)
                curveTo(21.973f, 2.742f, 19.113f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(18.809f, 4.0f, 20.945f, 4.617f, 22.469f, 6.313f)
                curveTo(23.992f, 8.008f, 25.0f, 10.98f, 25.0f, 16.0f)
                curveTo(25.0f, 21.02f, 23.992f, 23.992f, 22.469f, 25.688f)
                curveTo(20.945f, 27.383f, 18.809f, 28.0f, 16.0f, 28.0f)
                curveTo(13.191f, 28.0f, 11.055f, 27.383f, 9.531f, 25.688f)
                curveTo(8.008f, 23.992f, 7.0f, 21.02f, 7.0f, 16.0f)
                curveTo(7.0f, 10.98f, 8.008f, 8.008f, 9.531f, 6.313f)
                curveTo(11.055f, 4.617f, 13.191f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(15.0f, 7.0f)
                lineTo(15.0f, 13.563f)
                lineTo(12.719f, 11.281f)
                lineTo(11.281f, 12.719f)
                lineTo(14.563f, 16.0f)
                lineTo(11.281f, 19.281f)
                lineTo(12.719f, 20.719f)
                lineTo(15.0f, 18.438f)
                lineTo(15.0f, 25.0f)
                lineTo(16.594f, 23.813f)
                lineTo(20.594f, 20.813f)
                lineTo(21.531f, 20.094f)
                lineTo(17.438f, 16.0f)
                lineTo(21.531f, 11.906f)
                lineTo(20.594f, 11.188f)
                lineTo(16.594f, 8.188f)
                close()
                moveTo(17.0f, 11.0f)
                lineTo(18.469f, 12.094f)
                lineTo(17.0f, 13.563f)
                close()
                moveTo(17.0f, 18.438f)
                lineTo(18.469f, 19.906f)
                lineTo(17.0f, 21.0f)
                close()
            }
        }
        .build()
        return _bluetooth!!
    }

private var _bluetooth: ImageVector? = null
