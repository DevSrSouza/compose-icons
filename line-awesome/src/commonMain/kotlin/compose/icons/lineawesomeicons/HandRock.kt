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

public val LineAwesomeIcons.HandRock: ImageVector
    get() {
        if (_handRock != null) {
            return _handRock!!
        }
        _handRock = Builder(name = "HandRock", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 6.0f)
                curveTo(13.938f, 6.0f, 13.004f, 6.563f, 12.469f, 7.406f)
                curveTo(12.031f, 7.156f, 11.535f, 7.0f, 11.0f, 7.0f)
                curveTo(9.355f, 7.0f, 8.0f, 8.355f, 8.0f, 10.0f)
                lineTo(8.0f, 13.656f)
                lineTo(5.906f, 16.344f)
                curveTo(4.629f, 17.996f, 4.715f, 20.367f, 6.094f, 21.938f)
                lineTo(8.469f, 24.625f)
                curveTo(9.797f, 26.137f, 11.707f, 27.0f, 13.719f, 27.0f)
                lineTo(19.0f, 27.0f)
                curveTo(22.855f, 27.0f, 26.0f, 23.855f, 26.0f, 20.0f)
                lineTo(26.0f, 11.0f)
                curveTo(26.0f, 9.355f, 24.645f, 8.0f, 23.0f, 8.0f)
                curveTo(22.465f, 8.0f, 21.969f, 8.156f, 21.531f, 8.406f)
                curveTo(20.996f, 7.563f, 20.063f, 7.0f, 19.0f, 7.0f)
                curveTo(18.465f, 7.0f, 17.969f, 7.156f, 17.531f, 7.406f)
                curveTo(16.996f, 6.563f, 16.063f, 6.0f, 15.0f, 6.0f)
                close()
                moveTo(15.0f, 8.0f)
                curveTo(15.566f, 8.0f, 16.0f, 8.434f, 16.0f, 9.0f)
                lineTo(16.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 10.0f)
                curveTo(18.0f, 9.434f, 18.434f, 9.0f, 19.0f, 9.0f)
                curveTo(19.566f, 9.0f, 20.0f, 9.434f, 20.0f, 10.0f)
                lineTo(20.0f, 12.0f)
                lineTo(22.0f, 12.0f)
                lineTo(22.0f, 11.0f)
                curveTo(22.0f, 10.434f, 22.434f, 10.0f, 23.0f, 10.0f)
                curveTo(23.566f, 10.0f, 24.0f, 10.434f, 24.0f, 11.0f)
                lineTo(24.0f, 20.0f)
                curveTo(24.0f, 22.773f, 21.773f, 25.0f, 19.0f, 25.0f)
                lineTo(13.719f, 25.0f)
                curveTo(12.281f, 25.0f, 10.918f, 24.395f, 9.969f, 23.313f)
                lineTo(7.594f, 20.594f)
                curveTo(6.84f, 19.734f, 6.801f, 18.5f, 7.5f, 17.594f)
                lineTo(8.0f, 16.938f)
                lineTo(8.0f, 18.0f)
                lineTo(10.0f, 18.0f)
                lineTo(10.0f, 10.0f)
                curveTo(10.0f, 9.434f, 10.434f, 9.0f, 11.0f, 9.0f)
                curveTo(11.566f, 9.0f, 12.0f, 9.434f, 12.0f, 10.0f)
                lineTo(12.0f, 12.0f)
                lineTo(14.0f, 12.0f)
                lineTo(14.0f, 9.0f)
                curveTo(14.0f, 8.434f, 14.434f, 8.0f, 15.0f, 8.0f)
                close()
            }
        }
        .build()
        return _handRock!!
    }

private var _handRock: ImageVector? = null
