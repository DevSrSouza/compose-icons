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

public val LineAwesomeIcons.GitAlt: ImageVector
    get() {
        if (_gitAlt != null) {
            return _gitAlt!!
        }
        _gitAlt = Builder(name = "GitAlt", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(15.496f, 2.0f, 15.004f, 2.184f, 14.625f, 2.563f)
                lineTo(11.813f, 5.406f)
                curveTo(11.66f, 5.488f, 11.531f, 5.605f, 11.438f, 5.75f)
                lineTo(2.563f, 14.625f)
                curveTo(1.805f, 15.379f, 1.805f, 16.617f, 2.563f, 17.375f)
                lineTo(14.625f, 29.438f)
                curveTo(15.383f, 30.191f, 16.617f, 30.191f, 17.375f, 29.438f)
                lineTo(29.438f, 17.375f)
                curveTo(30.195f, 16.621f, 30.195f, 15.383f, 29.438f, 14.625f)
                lineTo(17.375f, 2.563f)
                curveTo(16.996f, 2.184f, 16.504f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.031f)
                lineTo(27.969f, 16.0f)
                lineTo(16.0f, 27.969f)
                lineTo(4.031f, 16.0f)
                lineTo(12.313f, 7.719f)
                lineTo(14.063f, 9.469f)
                curveTo(14.016f, 9.637f, 14.0f, 9.816f, 14.0f, 10.0f)
                curveTo(14.0f, 10.738f, 14.402f, 11.371f, 15.0f, 11.719f)
                lineTo(15.0f, 20.281f)
                curveTo(14.402f, 20.629f, 14.0f, 21.262f, 14.0f, 22.0f)
                curveTo(14.0f, 23.105f, 14.895f, 24.0f, 16.0f, 24.0f)
                curveTo(17.105f, 24.0f, 18.0f, 23.105f, 18.0f, 22.0f)
                curveTo(18.0f, 21.262f, 17.598f, 20.629f, 17.0f, 20.281f)
                lineTo(17.0f, 12.438f)
                lineTo(20.063f, 15.5f)
                curveTo(20.02f, 15.66f, 20.0f, 15.828f, 20.0f, 16.0f)
                curveTo(20.0f, 17.105f, 20.895f, 18.0f, 22.0f, 18.0f)
                curveTo(23.105f, 18.0f, 24.0f, 17.105f, 24.0f, 16.0f)
                curveTo(24.0f, 14.895f, 23.105f, 14.0f, 22.0f, 14.0f)
                curveTo(21.828f, 14.0f, 21.66f, 14.02f, 21.5f, 14.063f)
                lineTo(17.938f, 10.5f)
                curveTo(17.98f, 10.34f, 18.0f, 10.172f, 18.0f, 10.0f)
                curveTo(18.0f, 8.895f, 17.105f, 8.0f, 16.0f, 8.0f)
                curveTo(15.816f, 8.0f, 15.637f, 8.016f, 15.469f, 8.063f)
                lineTo(13.719f, 6.313f)
                close()
            }
        }
        .build()
        return _gitAlt!!
    }

private var _gitAlt: ImageVector? = null
