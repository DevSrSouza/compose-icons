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

public val LineAwesomeIcons.Sourcetree: ImageVector
    get() {
        if (_sourcetree != null) {
            return _sourcetree!!
        }
        _sourcetree = Builder(name = "Sourcetree", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(10.486f, 4.0f, 6.0f, 8.486f, 6.0f, 14.0f)
                curveTo(6.0f, 17.983f, 8.383f, 21.5772f, 12.0f, 23.1563f)
                lineTo(12.0f, 28.0f)
                lineTo(20.0f, 28.0f)
                lineTo(20.0f, 23.1563f)
                curveTo(23.617f, 21.5772f, 26.0f, 17.983f, 26.0f, 14.0f)
                curveTo(26.0f, 8.486f, 21.514f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(20.411f, 6.0f, 24.0f, 9.589f, 24.0f, 14.0f)
                curveTo(24.0f, 17.377f, 21.856f, 20.4042f, 18.666f, 21.5352f)
                lineTo(18.0f, 21.7695f)
                lineTo(18.0f, 26.0f)
                lineTo(14.0f, 26.0f)
                lineTo(14.0f, 21.7695f)
                lineTo(13.334f, 21.5332f)
                curveTo(10.144f, 20.4032f, 8.0f, 17.377f, 8.0f, 14.0f)
                curveTo(8.0f, 9.589f, 11.589f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.794f, 10.0f, 12.0f, 11.794f, 12.0f, 14.0f)
                curveTo(12.0f, 16.206f, 13.794f, 18.0f, 16.0f, 18.0f)
                curveTo(18.206f, 18.0f, 20.0f, 16.206f, 20.0f, 14.0f)
                curveTo(20.0f, 11.794f, 18.206f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.103f, 12.0f, 18.0f, 12.897f, 18.0f, 14.0f)
                curveTo(18.0f, 15.103f, 17.103f, 16.0f, 16.0f, 16.0f)
                curveTo(14.897f, 16.0f, 14.0f, 15.103f, 14.0f, 14.0f)
                curveTo(14.0f, 12.897f, 14.897f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _sourcetree!!
    }

private var _sourcetree: ImageVector? = null
