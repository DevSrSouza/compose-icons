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

public val LineAwesomeIcons.CampgroundSolid: ImageVector
    get() {
        if (_campgroundSolid != null) {
            return _campgroundSolid!!
        }
        _campgroundSolid = Builder(name = "CampgroundSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.531f, 4.875f)
                lineTo(10.156f, 5.469f)
                curveTo(10.156f, 5.469f, 8.895f, 7.41f, 7.281f, 9.625f)
                curveTo(5.668f, 11.84f, 3.633f, 14.348f, 2.438f, 15.188f)
                lineTo(1.938f, 15.531f)
                lineTo(2.0f, 16.125f)
                lineTo(3.0f, 25.125f)
                lineTo(3.094f, 26.0f)
                lineTo(4.0f, 26.0f)
                curveTo(5.484f, 26.0f, 7.215f, 26.078f, 8.938f, 26.188f)
                lineTo(10.0f, 26.25f)
                lineTo(10.0f, 18.0f)
                lineTo(12.0f, 18.0f)
                lineTo(12.0f, 26.406f)
                lineTo(12.906f, 26.5f)
                curveTo(15.734f, 26.75f, 17.875f, 27.0f, 17.875f, 27.0f)
                lineTo(18.031f, 27.0f)
                lineTo(28.969f, 24.813f)
                lineTo(29.0f, 24.031f)
                curveTo(29.0f, 24.031f, 29.09f, 22.363f, 29.25f, 20.406f)
                curveTo(29.41f, 18.449f, 29.672f, 16.148f, 29.938f, 15.313f)
                lineTo(30.156f, 14.625f)
                lineTo(29.625f, 14.219f)
                curveTo(26.176f, 11.547f, 22.875f, 5.531f, 22.875f, 5.531f)
                lineTo(22.563f, 4.906f)
                lineTo(21.844f, 5.0f)
                curveTo(21.844f, 5.0f, 15.418f, 5.887f, 11.188f, 5.031f)
                close()
                moveTo(21.469f, 7.063f)
                curveTo(21.879f, 7.824f, 23.902f, 11.441f, 26.813f, 14.313f)
                lineTo(19.281f, 15.5f)
                curveTo(16.816f, 13.133f, 14.305f, 9.391f, 12.938f, 7.219f)
                curveTo(16.809f, 7.617f, 20.629f, 7.176f, 21.469f, 7.063f)
                close()
                moveTo(10.938f, 7.875f)
                curveTo(12.25f, 9.988f, 15.004f, 14.137f, 17.906f, 16.906f)
                curveTo(17.25f, 19.582f, 17.051f, 23.148f, 17.0f, 24.906f)
                curveTo(16.332f, 24.836f, 15.527f, 24.738f, 14.0f, 24.594f)
                lineTo(14.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 24.156f)
                curveTo(6.934f, 24.098f, 5.898f, 24.047f, 4.906f, 24.031f)
                lineTo(4.063f, 16.344f)
                curveTo(5.676f, 15.031f, 7.402f, 12.875f, 8.906f, 10.813f)
                curveTo(9.883f, 9.469f, 10.492f, 8.551f, 10.938f, 7.875f)
                close()
                moveTo(27.781f, 16.219f)
                curveTo(27.547f, 17.41f, 27.367f, 18.816f, 27.25f, 20.219f)
                curveTo(27.121f, 21.801f, 27.09f, 22.668f, 27.063f, 23.188f)
                lineTo(19.031f, 24.813f)
                curveTo(19.082f, 23.051f, 19.266f, 19.719f, 19.781f, 17.469f)
                close()
            }
        }
        .build()
        return _campgroundSolid!!
    }

private var _campgroundSolid: ImageVector? = null
