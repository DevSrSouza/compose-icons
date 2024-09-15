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

public val LineAwesomeIcons.HikingSolid: ImageVector
    get() {
        if (_hikingSolid != null) {
            return _hikingSolid!!
        }
        _hikingSolid = Builder(name = "HikingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.0f)
                curveTo(14.578f, 4.0f, 13.0f, 5.578f, 13.0f, 7.5f)
                curveTo(13.0f, 9.422f, 14.578f, 11.0f, 16.5f, 11.0f)
                curveTo(18.422f, 11.0f, 20.0f, 9.422f, 20.0f, 7.5f)
                curveTo(20.0f, 5.578f, 18.422f, 4.0f, 16.5f, 4.0f)
                close()
                moveTo(16.5f, 6.0f)
                curveTo(17.34f, 6.0f, 18.0f, 6.66f, 18.0f, 7.5f)
                curveTo(18.0f, 8.34f, 17.34f, 9.0f, 16.5f, 9.0f)
                curveTo(15.66f, 9.0f, 15.0f, 8.34f, 15.0f, 7.5f)
                curveTo(15.0f, 6.66f, 15.66f, 6.0f, 16.5f, 6.0f)
                close()
                moveTo(11.094f, 10.5f)
                curveTo(10.836f, 10.488f, 10.57f, 10.488f, 10.313f, 10.531f)
                curveTo(9.793f, 10.617f, 9.281f, 10.848f, 8.844f, 11.219f)
                curveTo(7.969f, 11.961f, 7.461f, 13.141f, 7.094f, 14.875f)
                curveTo(6.977f, 15.434f, 7.012f, 16.012f, 7.281f, 16.469f)
                curveTo(7.551f, 16.926f, 7.973f, 17.203f, 8.344f, 17.375f)
                curveTo(9.09f, 17.719f, 9.82f, 17.785f, 10.219f, 17.875f)
                lineTo(10.688f, 15.938f)
                curveTo(10.086f, 15.801f, 9.469f, 15.691f, 9.188f, 15.563f)
                curveTo(9.047f, 15.496f, 9.027f, 15.457f, 9.031f, 15.469f)
                curveTo(9.023f, 15.445f, 9.012f, 15.383f, 9.031f, 15.281f)
                curveTo(9.352f, 13.766f, 9.816f, 13.035f, 10.156f, 12.75f)
                curveTo(10.496f, 12.465f, 10.777f, 12.418f, 11.406f, 12.563f)
                lineTo(11.844f, 10.594f)
                curveTo(11.598f, 10.539f, 11.352f, 10.512f, 11.094f, 10.5f)
                close()
                moveTo(12.844f, 10.813f)
                lineTo(11.375f, 17.5f)
                curveTo(11.211f, 18.25f, 11.52f, 19.063f, 12.125f, 19.531f)
                lineTo(15.656f, 22.281f)
                lineTo(16.531f, 28.0f)
                lineTo(18.563f, 28.0f)
                lineTo(17.625f, 21.969f)
                curveTo(17.547f, 21.461f, 17.281f, 21.004f, 16.875f, 20.688f)
                lineTo(13.344f, 17.938f)
                lineTo(14.375f, 13.281f)
                lineTo(15.406f, 13.563f)
                lineTo(17.188f, 15.281f)
                curveTo(17.766f, 15.84f, 18.637f, 15.973f, 19.375f, 15.656f)
                lineTo(21.0f, 14.969f)
                lineTo(21.0f, 28.0f)
                lineTo(23.0f, 28.0f)
                lineTo(23.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 12.813f)
                lineTo(18.594f, 13.844f)
                lineTo(16.813f, 12.125f)
                curveTo(16.566f, 11.887f, 16.266f, 11.711f, 15.938f, 11.625f)
                close()
                moveTo(11.531f, 20.625f)
                lineTo(10.688f, 23.156f)
                lineTo(8.188f, 28.0f)
                lineTo(10.438f, 28.0f)
                lineTo(12.469f, 24.094f)
                curveTo(12.52f, 23.996f, 12.563f, 23.883f, 12.594f, 23.781f)
                lineTo(13.219f, 21.938f)
                close()
            }
        }
        .build()
        return _hikingSolid!!
    }

private var _hikingSolid: ImageVector? = null
