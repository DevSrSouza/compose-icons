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

public val LineAwesomeIcons.PrayingHandsSolid: ImageVector
    get() {
        if (_prayingHandsSolid != null) {
            return _prayingHandsSolid!!
        }
        _prayingHandsSolid = Builder(name = "PrayingHandsSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                curveTo(13.355f, 3.0f, 12.0f, 4.355f, 12.0f, 6.0f)
                lineTo(12.016f, 5.836f)
                lineTo(11.031f, 11.746f)
                lineTo(9.141f, 16.918f)
                curveTo(9.105f, 16.965f, 9.063f, 17.0f, 9.0f, 17.0f)
                lineTo(8.0f, 17.0f)
                lineTo(8.0f, 16.0f)
                lineTo(3.0f, 16.0f)
                lineTo(3.0f, 29.0f)
                lineTo(8.0f, 29.0f)
                lineTo(8.0f, 26.0f)
                lineTo(11.926f, 26.0f)
                curveTo(13.57f, 26.0f, 15.051f, 25.203f, 16.0f, 23.965f)
                curveTo(16.949f, 25.203f, 18.43f, 26.0f, 20.074f, 26.0f)
                lineTo(24.0f, 26.0f)
                lineTo(24.0f, 29.0f)
                lineTo(29.0f, 29.0f)
                lineTo(29.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 17.0f)
                lineTo(23.0f, 17.0f)
                curveTo(22.938f, 17.0f, 22.895f, 16.965f, 22.859f, 16.918f)
                lineTo(20.969f, 11.746f)
                lineTo(19.984f, 5.836f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 4.355f, 18.645f, 3.0f, 17.0f, 3.0f)
                curveTo(16.66f, 3.0f, 16.313f, 3.066f, 16.0f, 3.227f)
                curveTo(15.688f, 3.066f, 15.34f, 3.0f, 15.0f, 3.0f)
                close()
                moveTo(14.965f, 5.016f)
                curveTo(14.984f, 5.16f, 15.0f, 5.488f, 15.0f, 6.0f)
                lineTo(15.0f, 21.438f)
                curveTo(14.723f, 22.922f, 13.445f, 24.0f, 11.926f, 24.0f)
                lineTo(8.0f, 24.0f)
                lineTo(8.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                curveTo(9.785f, 19.0f, 10.516f, 18.574f, 10.902f, 17.891f)
                lineTo(10.941f, 17.816f)
                lineTo(12.969f, 12.254f)
                lineTo(14.0f, 6.082f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 5.449f, 14.422f, 5.035f, 14.965f, 5.016f)
                close()
                moveTo(17.035f, 5.016f)
                curveTo(17.578f, 5.035f, 18.0f, 5.449f, 18.0f, 6.0f)
                lineTo(18.0f, 6.082f)
                lineTo(19.031f, 12.254f)
                lineTo(21.059f, 17.816f)
                lineTo(21.098f, 17.891f)
                curveTo(21.484f, 18.574f, 22.215f, 19.0f, 23.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 24.0f)
                lineTo(20.074f, 24.0f)
                curveTo(18.555f, 24.0f, 17.277f, 22.922f, 17.0f, 21.438f)
                lineTo(17.0f, 6.0f)
                curveTo(17.0f, 5.488f, 17.016f, 5.16f, 17.035f, 5.016f)
                close()
                moveTo(5.0f, 18.0f)
                lineTo(6.0f, 18.0f)
                lineTo(6.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                close()
                moveTo(26.0f, 18.0f)
                lineTo(27.0f, 18.0f)
                lineTo(27.0f, 27.0f)
                lineTo(26.0f, 27.0f)
                close()
            }
        }
        .build()
        return _prayingHandsSolid!!
    }

private var _prayingHandsSolid: ImageVector? = null
