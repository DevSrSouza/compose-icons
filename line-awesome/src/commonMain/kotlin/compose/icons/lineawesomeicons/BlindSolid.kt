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

public val LineAwesomeIcons.BlindSolid: ImageVector
    get() {
        if (_blindSolid != null) {
            return _blindSolid!!
        }
        _blindSolid = Builder(name = "BlindSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 3.0f)
                curveTo(12.578f, 3.0f, 11.0f, 4.578f, 11.0f, 6.5f)
                curveTo(11.0f, 8.422f, 12.578f, 10.0f, 14.5f, 10.0f)
                curveTo(16.422f, 10.0f, 18.0f, 8.422f, 18.0f, 6.5f)
                curveTo(18.0f, 4.578f, 16.422f, 3.0f, 14.5f, 3.0f)
                close()
                moveTo(14.5f, 5.0f)
                curveTo(15.34f, 5.0f, 16.0f, 5.66f, 16.0f, 6.5f)
                curveTo(16.0f, 7.34f, 15.34f, 8.0f, 14.5f, 8.0f)
                curveTo(13.66f, 8.0f, 13.0f, 7.34f, 13.0f, 6.5f)
                curveTo(13.0f, 5.66f, 13.66f, 5.0f, 14.5f, 5.0f)
                close()
                moveTo(10.813f, 10.25f)
                curveTo(10.297f, 10.293f, 9.816f, 10.539f, 9.469f, 10.938f)
                lineTo(7.656f, 13.031f)
                curveTo(7.418f, 13.305f, 7.25f, 13.641f, 7.188f, 14.0f)
                lineTo(6.5f, 17.875f)
                lineTo(8.469f, 18.219f)
                lineTo(9.156f, 14.344f)
                lineTo(10.969f, 12.25f)
                lineTo(11.0f, 12.25f)
                lineTo(11.781f, 12.406f)
                lineTo(10.594f, 17.781f)
                curveTo(10.473f, 18.34f, 10.602f, 18.914f, 10.938f, 19.375f)
                lineTo(16.469f, 27.0f)
                lineTo(18.938f, 27.0f)
                lineTo(12.563f, 18.188f)
                lineTo(13.75f, 12.781f)
                lineTo(14.219f, 12.875f)
                lineTo(14.969f, 15.5f)
                curveTo(15.145f, 16.102f, 15.598f, 16.59f, 16.188f, 16.813f)
                lineTo(19.156f, 17.938f)
                lineTo(23.031f, 26.688f)
                lineTo(23.969f, 26.313f)
                lineTo(20.0f, 17.375f)
                lineTo(20.406f, 16.281f)
                lineTo(16.906f, 14.938f)
                lineTo(16.125f, 12.313f)
                curveTo(15.918f, 11.59f, 15.332f, 11.047f, 14.594f, 10.906f)
                lineTo(11.344f, 10.281f)
                curveTo(11.172f, 10.25f, 10.984f, 10.234f, 10.813f, 10.25f)
                close()
                moveTo(10.469f, 21.031f)
                lineTo(9.969f, 22.969f)
                lineTo(7.063f, 27.0f)
                lineTo(9.531f, 27.0f)
                lineTo(11.844f, 23.844f)
                lineTo(11.969f, 23.25f)
                close()
            }
        }
        .build()
        return _blindSolid!!
    }

private var _blindSolid: ImageVector? = null
