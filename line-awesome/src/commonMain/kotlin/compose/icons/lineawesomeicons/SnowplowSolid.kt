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

public val LineAwesomeIcons.SnowplowSolid: ImageVector
    get() {
        if (_snowplowSolid != null) {
            return _snowplowSolid!!
        }
        _snowplowSolid = Builder(name = "SnowplowSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.5f, 6.0f)
                curveTo(9.164f, 6.0f, 7.992f, 6.902f, 7.625f, 8.188f)
                lineTo(6.313f, 12.719f)
                lineTo(4.313f, 12.063f)
                lineTo(3.688f, 13.938f)
                lineTo(5.156f, 14.438f)
                lineTo(4.875f, 14.719f)
                curveTo(4.313f, 15.281f, 4.0f, 16.016f, 4.0f, 16.813f)
                lineTo(4.0f, 19.0f)
                lineTo(3.188f, 19.0f)
                lineTo(3.031f, 19.813f)
                lineTo(2.031f, 24.813f)
                lineTo(1.781f, 26.0f)
                lineTo(30.219f, 26.0f)
                lineTo(29.969f, 24.813f)
                lineTo(28.969f, 19.813f)
                lineTo(28.813f, 19.0f)
                lineTo(28.0f, 19.0f)
                lineTo(28.0f, 16.813f)
                curveTo(28.0f, 16.016f, 27.688f, 15.281f, 27.125f, 14.719f)
                lineTo(26.844f, 14.438f)
                lineTo(28.313f, 13.938f)
                lineTo(27.688f, 12.063f)
                lineTo(25.688f, 12.719f)
                lineTo(24.375f, 8.188f)
                curveTo(24.008f, 6.902f, 22.836f, 6.0f, 21.5f, 6.0f)
                close()
                moveTo(10.5f, 8.0f)
                lineTo(21.5f, 8.0f)
                curveTo(21.949f, 8.0f, 22.313f, 8.285f, 22.438f, 8.719f)
                lineTo(23.656f, 13.0f)
                lineTo(8.344f, 13.0f)
                lineTo(9.563f, 8.719f)
                curveTo(9.688f, 8.285f, 10.051f, 8.0f, 10.5f, 8.0f)
                close()
                moveTo(7.438f, 15.0f)
                lineTo(24.563f, 15.0f)
                lineTo(25.719f, 16.125f)
                curveTo(25.906f, 16.313f, 26.0f, 16.547f, 26.0f, 16.813f)
                lineTo(26.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                lineTo(20.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 16.813f)
                curveTo(6.0f, 16.547f, 6.094f, 16.313f, 6.281f, 16.125f)
                close()
                moveTo(4.813f, 21.0f)
                lineTo(27.188f, 21.0f)
                lineTo(27.781f, 24.0f)
                lineTo(4.219f, 24.0f)
                close()
            }
        }
        .build()
        return _snowplowSolid!!
    }

private var _snowplowSolid: ImageVector? = null
