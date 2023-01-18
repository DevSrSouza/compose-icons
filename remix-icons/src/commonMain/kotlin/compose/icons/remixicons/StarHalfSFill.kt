package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.StarHalfSFill: ImageVector
    get() {
        if (_starHalfSFill != null) {
            return _starHalfSFill!!
        }
        _starHalfSFill = Builder(name = "StarHalfSFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 14.656f)
                lineToRelative(2.817f, 1.72f)
                lineToRelative(-0.766f, -3.21f)
                lineToRelative(2.507f, -2.147f)
                lineToRelative(-3.29f, -0.264f)
                lineTo(12.0f, 7.708f)
                verticalLineToRelative(6.948f)
                close()
                moveTo(12.0f, 17.0f)
                lineToRelative(-5.878f, 3.59f)
                lineToRelative(1.598f, -6.7f)
                lineToRelative(-5.23f, -4.48f)
                lineToRelative(6.865f, -0.55f)
                lineTo(12.0f, 2.5f)
                lineToRelative(2.645f, 6.36f)
                lineToRelative(6.866f, 0.55f)
                lineToRelative(-5.231f, 4.48f)
                lineToRelative(1.598f, 6.7f)
                lineTo(12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _starHalfSFill!!
    }

private var _starHalfSFill: ImageVector? = null
