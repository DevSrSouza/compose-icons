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

public val LineAwesomeIcons.SadTearSolid: ImageVector
    get() {
        if (_sadTearSolid != null) {
            return _sadTearSolid!!
        }
        _sadTearSolid = Builder(name = "SadTearSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(12.0f, 10.0f)
                curveTo(10.762f, 10.0f, 9.82f, 10.691f, 9.188f, 11.281f)
                curveTo(8.555f, 11.871f, 8.156f, 12.438f, 8.156f, 12.438f)
                lineTo(9.844f, 13.563f)
                curveTo(9.844f, 13.563f, 10.09f, 13.129f, 10.531f, 12.719f)
                curveTo(10.973f, 12.309f, 11.547f, 12.0f, 12.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 10.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.453f, 12.0f, 21.027f, 12.309f, 21.469f, 12.719f)
                curveTo(21.91f, 13.129f, 22.156f, 13.563f, 22.156f, 13.563f)
                lineTo(23.844f, 12.438f)
                curveTo(23.844f, 12.438f, 23.445f, 11.871f, 22.813f, 11.281f)
                curveTo(22.18f, 10.691f, 21.238f, 10.0f, 20.0f, 10.0f)
                close()
                moveTo(8.5f, 14.0f)
                curveTo(8.5f, 14.0f, 7.0f, 16.672f, 7.0f, 17.5f)
                curveTo(7.0f, 18.328f, 7.672f, 19.0f, 8.5f, 19.0f)
                curveTo(9.328f, 19.0f, 10.0f, 18.328f, 10.0f, 17.5f)
                curveTo(10.0f, 16.672f, 8.5f, 14.0f, 8.5f, 14.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(13.664f, 16.0f, 12.066f, 17.234f, 11.188f, 18.406f)
                curveTo(10.309f, 19.578f, 10.031f, 20.75f, 10.031f, 20.75f)
                lineTo(9.719f, 22.0f)
                lineTo(22.281f, 22.0f)
                lineTo(21.969f, 20.75f)
                curveTo(21.969f, 20.75f, 21.691f, 19.578f, 20.813f, 18.406f)
                curveTo(19.934f, 17.234f, 18.336f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(17.672f, 18.0f, 18.566f, 18.766f, 19.188f, 19.594f)
                curveTo(19.34f, 19.801f, 19.301f, 19.809f, 19.406f, 20.0f)
                lineTo(12.594f, 20.0f)
                curveTo(12.699f, 19.809f, 12.66f, 19.801f, 12.813f, 19.594f)
                curveTo(13.434f, 18.766f, 14.328f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sadTearSolid!!
    }

private var _sadTearSolid: ImageVector? = null
