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

public val LineAwesomeIcons.BabyCarriageSolid: ImageVector
    get() {
        if (_babyCarriageSolid != null) {
            return _babyCarriageSolid!!
        }
        _babyCarriageSolid = Builder(name = "BabyCarriageSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                lineTo(18.0f, 13.0f)
                lineTo(9.688f, 13.0f)
                curveTo(9.457f, 12.457f, 9.09f, 11.73f, 8.469f, 10.906f)
                curveTo(7.414f, 9.504f, 5.605f, 8.0f, 3.0f, 8.0f)
                lineTo(3.0f, 10.0f)
                curveTo(4.855f, 10.0f, 6.047f, 10.996f, 6.875f, 12.094f)
                curveTo(7.664f, 13.141f, 7.969f, 14.125f, 8.0f, 14.219f)
                curveTo(8.082f, 17.609f, 10.082f, 20.539f, 12.938f, 22.0f)
                curveTo(11.32f, 22.035f, 10.0f, 23.375f, 10.0f, 25.0f)
                curveTo(10.0f, 26.645f, 11.355f, 28.0f, 13.0f, 28.0f)
                curveTo(14.645f, 28.0f, 16.0f, 26.645f, 16.0f, 25.0f)
                curveTo(16.0f, 24.113f, 15.617f, 23.301f, 15.0f, 22.75f)
                curveTo(15.645f, 22.898f, 16.313f, 23.0f, 17.0f, 23.0f)
                lineTo(20.0f, 23.0f)
                curveTo(20.688f, 23.0f, 21.355f, 22.898f, 22.0f, 22.75f)
                curveTo(21.383f, 23.301f, 21.0f, 24.113f, 21.0f, 25.0f)
                curveTo(21.0f, 26.645f, 22.355f, 28.0f, 24.0f, 28.0f)
                curveTo(25.645f, 28.0f, 27.0f, 26.645f, 27.0f, 25.0f)
                curveTo(27.0f, 23.375f, 25.68f, 22.035f, 24.063f, 22.0f)
                curveTo(26.695f, 20.652f, 28.59f, 18.055f, 28.938f, 15.0f)
                curveTo(28.969f, 14.711f, 28.996f, 14.422f, 29.0f, 14.125f)
                curveTo(29.0f, 14.105f, 29.0f, 14.082f, 29.0f, 14.063f)
                curveTo(29.0f, 14.063f, 29.008f, 13.898f, 29.0f, 13.625f)
                lineTo(29.0f, 13.0f)
                lineTo(28.938f, 13.0f)
                curveTo(28.863f, 12.043f, 28.664f, 10.594f, 27.938f, 9.063f)
                curveTo(26.746f, 6.555f, 24.047f, 4.0f, 19.0f, 4.0f)
                close()
                moveTo(20.0f, 6.125f)
                curveTo(23.613f, 6.422f, 25.293f, 8.121f, 26.156f, 9.938f)
                curveTo(26.746f, 11.184f, 26.879f, 12.23f, 26.938f, 13.0f)
                lineTo(20.0f, 13.0f)
                close()
                moveTo(10.219f, 15.0f)
                lineTo(26.781f, 15.0f)
                curveTo(26.273f, 18.363f, 23.5f, 21.0f, 20.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                curveTo(13.5f, 21.0f, 10.727f, 18.363f, 10.219f, 15.0f)
                close()
                moveTo(13.0f, 24.0f)
                curveTo(13.563f, 24.0f, 14.0f, 24.438f, 14.0f, 25.0f)
                curveTo(14.0f, 25.563f, 13.563f, 26.0f, 13.0f, 26.0f)
                curveTo(12.438f, 26.0f, 12.0f, 25.563f, 12.0f, 25.0f)
                curveTo(12.0f, 24.438f, 12.438f, 24.0f, 13.0f, 24.0f)
                close()
                moveTo(24.0f, 24.0f)
                curveTo(24.563f, 24.0f, 25.0f, 24.438f, 25.0f, 25.0f)
                curveTo(25.0f, 25.563f, 24.563f, 26.0f, 24.0f, 26.0f)
                curveTo(23.438f, 26.0f, 23.0f, 25.563f, 23.0f, 25.0f)
                curveTo(23.0f, 24.438f, 23.438f, 24.0f, 24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _babyCarriageSolid!!
    }

private var _babyCarriageSolid: ImageVector? = null
