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

public val LineAwesomeIcons.WalkingSolid: ImageVector
    get() {
        if (_walkingSolid != null) {
            return _walkingSolid!!
        }
        _walkingSolid = Builder(name = "WalkingSolid", defaultWidth = 32.0.dp, defaultHeight =
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
                moveTo(12.813f, 11.25f)
                curveTo(12.297f, 11.293f, 11.816f, 11.539f, 11.469f, 11.938f)
                lineTo(9.656f, 14.031f)
                curveTo(9.418f, 14.305f, 9.25f, 14.641f, 9.188f, 15.0f)
                lineTo(8.5f, 18.875f)
                lineTo(10.469f, 19.219f)
                lineTo(11.156f, 15.344f)
                lineTo(12.969f, 13.25f)
                lineTo(13.0f, 13.25f)
                lineTo(13.781f, 13.406f)
                lineTo(12.594f, 18.781f)
                curveTo(12.473f, 19.34f, 12.602f, 19.914f, 12.938f, 20.375f)
                lineTo(18.469f, 28.0f)
                lineTo(20.938f, 28.0f)
                lineTo(14.563f, 19.188f)
                lineTo(15.75f, 13.781f)
                lineTo(16.219f, 13.875f)
                lineTo(16.969f, 16.5f)
                curveTo(17.145f, 17.102f, 17.598f, 17.59f, 18.188f, 17.813f)
                lineTo(21.719f, 19.156f)
                lineTo(22.406f, 17.281f)
                lineTo(18.906f, 15.938f)
                lineTo(18.125f, 13.313f)
                curveTo(17.918f, 12.59f, 17.332f, 12.047f, 16.594f, 11.906f)
                lineTo(13.344f, 11.281f)
                curveTo(13.172f, 11.25f, 12.984f, 11.234f, 12.813f, 11.25f)
                close()
                moveTo(12.469f, 22.031f)
                lineTo(11.969f, 23.969f)
                lineTo(9.063f, 28.0f)
                lineTo(11.531f, 28.0f)
                lineTo(13.844f, 24.844f)
                lineTo(13.969f, 24.25f)
                close()
            }
        }
        .build()
        return _walkingSolid!!
    }

private var _walkingSolid: ImageVector? = null
